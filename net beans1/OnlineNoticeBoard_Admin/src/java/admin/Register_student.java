/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import javax.servlet.http.HttpSession;

/**
 *
 * @author modhv
 */
public class Register_student extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    Connection con;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs;
    Date d=new Date();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register_student</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Register_student at " + request.getContextPath() + "</h1>");
            
            
            //for the student
            
            int year=1900 + d.getYear();
            //String first_name=request.getParameter("first_name");
            //String middle_name=request.getParameter("middle_name");
            //out.println(middle_name);
            //String last_name=request.getParameter("last_name");
            //out.println(last_name);
            //String gender=request.getParameter("gender");
            //out.println(gender);
           // String dob=request.getParameter("dob");
           //out.println(dob);
           // String division=request.getParameter("division");
           // out.println(division);
            //int semester=Integer.valueOf(request.getParameter("semester"));
           // out.println(semester);
            String department=request.getParameter("department");
           // String mobile=request.getParameter("mobile_no");
           // out.println(mobile);
           // String email=request.getParameter("email");
           // out.println(email);
           // String address=request.getParameter("address");
            //out.println(address);
            
            try {
            
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ONB", "root", "");
            st=con.createStatement();
            rs=st.executeQuery("select Count(*) from student");
            rs.next();
            int record_counnt=rs.getInt(1) + 1;
            String student_id= year + department + 0 + record_counnt ;
            ps=con.prepareStatement("INSERT INTO `student`(`student_id`, `first_name`, `middle_name`, `last_name`, `gender`, `dob`, `division`, `semester`, `department`, `mobile_no`, `email`, `address`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
          
            ps.setString(1,student_id);
            ps.setString(2,request.getParameter("first_name"));
            ps.setString(3,request.getParameter("middle_name"));
            ps.setString(4,request.getParameter("last_name"));
            ps.setString(5,request.getParameter("gender"));
            ps.setString(6,request.getParameter("dob"));
            ps.setString(7,request.getParameter("division"));
            ps.setInt(8,Integer.valueOf(request.getParameter("semester")));
            ps.setString(9,request.getParameter("department"));
            ps.setString(10,request.getParameter("mobile_no"));
            ps.setString(11,request.getParameter("email"));
            ps.setString(12,request.getParameter("address"));
            int rowsaffected=ps.executeUpdate();
            
            
            HttpSession session=request.getSession();
            session.setAttribute("student_id", student_id);
            
            if(session.isNew())
            {
                response.sendRedirect("template/Admin/pages/examples/login.html");
            }
            else
            {
                response.sendRedirect("template/Admin/pages/forms/general.jsp");
            }
            
            
            ps.close();
            con.close();
                
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register_student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register_student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
