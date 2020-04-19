/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author modhv
 */
public class download_notice extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            /*
            PrintWriter out=response.getWriter(); TODO output your page here. You may use following sample code. out.println("filename" + filename ); */
        try 
        {
            response.setContentType("text/html;charset=UTF-8");
            ServletContext context;
            context = this.getServletContext();
            
            String filename =request.getParameter("filename");
            String path="resources/" + filename;
            String mimeType=context.getMimeType(path);
            response.setContentType(mimeType);
            response.setHeader("Content-Disposition","attachment;filename=\n"+ filename +"\n");
            ServletOutputStream sos=response.getOutputStream();
            try (InputStream is = context.getResourceAsStream(path)) {
                BufferedInputStream bis;
                bis = new BufferedInputStream(is);
                byte b[]=new byte[1024];
                int end=0;
                while((end=bis.read(b)) != -1 )
                {
                    sos.write(b,0,end);
                }
                bis.close();
            }
            
        }
        catch(IOException e)
        {
            System.out.println(e);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
