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
import java.util.Date;
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
public class Register_faculty extends HttpServlet {

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
            out.println("<title>Servlet register_user</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet register_faculty at " + request.getContextPath() + "</h1>");
            
            //for the faculty
            
            int year=1900 + d.getYear();
         //   String F_first_name=request.getParameter("F_first_name");
         //   String F_middle_name=request.getParameter("F_middle_name");
         //   String F_last_name=request.getParameter("F_last_name");
         //   String F_gender=request.getParameter("F_gender");
         //  String F_dob=request.getParameter("F_dob");
            String F_department=request.getParameter("F_department");
         //   String F_mobile_no=request.getParameter("F_mobile_no");
         //  String F_email=request.getParameter("F_email");
         //   String F_address=request.getParameter("F_address");
            
            //database configuration
            
            try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ONB", "root", "");
            st=con.createStatement();
            rs=st.executeQuery("select Count(*) from faculty");
            rs.next();
            int record_counnt=rs.getInt(1) + 1;
                    
            String faculty_id= year + F_department + 0 + record_counnt ;
            
            ps=con.prepareStatement("INSERT INTO `faculty`(`faculty_id`, `first_name`, `middle_name`, `last_name`, `gender`, `dob`, `department`, `mobile_no`, `email`, `address`) VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,faculty_id);
            ps.setString(2,request.getParameter("F_first_name"));
            ps.setString(3,request.getParameter("F_middle_name"));
            ps.setString(4,request.getParameter("F_last_name"));
            ps.setString(5,request.getParameter("F_gender"));
            ps.setString(6,request.getParameter("F_dob"));
            ps.setString(7,request.getParameter("F_department"));
            ps.setString(8,request.getParameter("F_mobile_no"));
            ps.setString(9,request.getParameter("F_email"));
            ps.setString(10,request.getParameter("F_address"));
            
            int rowsaffected = ps.executeUpdate();
            
            HttpSession session=request.getSession();
            session.setAttribute("faculty_id", faculty_id);
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
             
        } 
        catch (SQLException e)
        {
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
            Logger.getLogger(Register_faculty.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Register_faculty.class.getName()).log(Level.SEVERE, null, ex);
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
