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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author modhv
 */
public class contact_servlet extends HttpServlet {

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
    HttpSession session=null;

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet contact_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet contact_servlet at " + request.getContextPath() + "</h1>");
            
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String message=request.getParameter("message");
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ONB", "root", "");
            
            session=request.getSession();
            st=(Statement) con.createStatement();
            rs=st.executeQuery("select Count(*) from contact");
            rs.next();
            int id=rs.getInt(1)+1;
            
            ps=con.prepareStatement("INSERT INTO `contact`(`id`, `name`, `email`, `message`, `student_id`) VALUES (?,?,?,?,?)");
            ps.setInt(1,id);
            ps.setString(2, request.getParameter("name"));
            ps.setString(3, request.getParameter("email"));
            ps.setString(4, request.getParameter("message"));
            ps.setString(5,(String) session.getAttribute("student_id"));
            int affected_records=ps.executeUpdate();
            if(affected_records >= 1)
            {
                out.println("inside if");
                session.setAttribute("contact_message_done","true");
                response.sendRedirect("template/student/contact.jsp");
            } else {
                session.setAttribute("ERROR_IN_CONTACT","true");
                response.sendRedirect("template/student/contact.jsp");
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(contact_servlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(contact_servlet.class.getName()).log(Level.SEVERE, null, ex);
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
