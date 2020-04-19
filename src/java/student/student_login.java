/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author modhv
 */
public class student_login extends HttpServlet {
    
            Connection con;
            Statement st=null;
            PreparedStatement ps=null;
            ResultSet rs;
            HttpSession session=null;
            
            String username=null;
            String password=null;
            String firstname=null;
            int semester=0;
            String department=null;
            String student_id=null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet student_login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet student_login at " + request.getContextPath() + "</h1>");
           session=request.getSession();
            try {
            
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ONB", "root", "");
            
            ps=con.prepareStatement("select * from student where student_id=? and dob=?");
            ps.setString(1,request.getParameter("username"));
            ps.setString(2, request.getParameter("password"));
            rs=ps.executeQuery();
            
            while(rs.next())
            {
              username=rs.getString("student_id");
              password=rs.getString("dob");
              firstname=rs.getString("first_name");
              semester=rs.getInt("semester");
              department=rs.getString("department");
              student_id=rs.getString("student_id");
            }
                
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
         
            if(request.getParameter("username").equals(username) && request.getParameter("password").equals(password))
            {
                out.println("u and p are currect");
                HttpSession s = request.getSession();
                s.setAttribute("student_id", student_id);
                s.setAttribute("firstname",firstname);
                s.setAttribute("student_id",username);
                s.setAttribute("semester", semester);
                s.setAttribute("department", department);
                response.sendRedirect("template/student/index.jsp");
            }
            else
            {
                out.println("connection not ok ");
                 session.setAttribute("ERROR_LOGIN","true");
                 response.sendRedirect("template/student/login.jsp");
          //      out.println("alert('username or password my incorrect')");
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
            Logger.getLogger(student_login.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(student_login.class.getName()).log(Level.SEVERE, null, ex);
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
