heyy i am chetan

import java.io.*;

public class file
{
	public static void main(String args[])
	{
		int i;
		FileInputStream fin=null;

		if(args.length != 1)
		{
			System.out.println("Usage: ShowFile filename");
			return;
		}

		try{
			fin= new FileInputStream(args[0]);

		}catch(FileNotFoundException fnfe)
		{
			System.out.println("ERROR : file can not be open :" + fnfe.getMessage());
		}

		try{

			
			do{
			i=fin.read();
			if(i != -1)
			{
				System.out.print((char) i);
			}

			}while(i != -1);
			
		}catch(IOException ioe){
			System.out.println("error in reading file :" + ioe.getMessage());
		}

		

	}
}



//code of upload_servlet

 try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet upload_notice</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet upload_notice at " + request.getContextPath() + "</h1>");
            


			DateTimeFormatter dfn=DateTimeFormatter.ofPattern("YYYY/MM/dd");
            LocalDateTime now= LocalDateTime.now();
            
            HttpSession session=request.getSession();
            String date=dfn.format(now);
            String title=request.getParameter("notice_title");
            out.println("hello" + title);   
            String department=request.getParameter("notice_department");
            int semester=Integer.parseInt(request.getParameter("notice_semester"));
            String description=request.getParameter("notice_description");
            String file_name=request.getParameter("notice_file");
            
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ONB", "root", "");
            st=(Statement) con.createStatement();
            rs=st.executeQuery("select Count(*) from notice");
            rs.next();
            int record_counnt=rs.getInt(1) + 1;
            
            String notice_id= date + department + semester + 0 + record_counnt ;
            
            ps=(PreparedStatement) con.prepareStatement("INSERT INTO `notice`(`notice_id`, `title`, `department`, `semester`, `faculty_id`, `description`, `file`, `date`) VALUES (?,?,?,?,?,?,?,?)");
            
            ps.setString(1,notice_id);
            // out.println("notice_id " + notice_id + " ");
            ps.setString(2,title);
            // out.println("title is : " + title);
            ps.setString(3,department);
            ps.setInt(4,semester);
            ps.setString(5, (String) session.getAttribute("faculty_id"));
            //out.println((String) session.getAttribute("faculty_id"));
            ps.setString(6,description);
            //out.println(description);
            ps.setString(7,file_name);
            //out.println(file_name);
            ps.setString(8,date);
            //out.println(date);
            int rowsaffected = 0;
           
            
            
            
            
            rowsaffected=ps.executeUpdate();
            out.print("hello" + rowsaffected);
          
            out.println("file uploaded succesfully !! ");
            out.println(" rowsaffected : " + rowsaffected);  
            out.println("</body>");
            out.println("</html>");


