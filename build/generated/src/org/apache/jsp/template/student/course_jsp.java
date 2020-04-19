package org.apache.jsp.template.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;

public final class course_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"login.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("    <!-- Title -->\n");
      out.write("    <title>Online Notice Board</title>\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"icon\" href=\"img/core-img/favicon.ico\">\n");
      out.write("\n");
      out.write("    <!-- Core Stylesheet -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");

        if(session.getAttribute("firstname") == null){
            response.sendRedirect("login.jsp");
        }
//db connection     
    
            Connection con;
            Statement st=null;
            PreparedStatement ps=null;
            ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ONB", "root", "");
    
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- ##### Preloader ##### -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <i class=\"circle-preloader\"></i>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- ##### Header Area Start ##### -->\n");
      out.write("    <header class=\"header-area\">\n");
      out.write("\n");
      out.write("        <!-- Top Header Area -->\n");
      out.write("        <div class=\"top-header\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <div class=\"row h-100\">\n");
      out.write("                    <div class=\"col-12 h-100\">\n");
      out.write("                        <div class=\"header-content h-100 d-flex align-items-center justify-content-between\">\n");
      out.write("                            <div class=\"academy-logo\">\n");
      out.write("                              <!--  <a href=\"index.html\"><img src=\"img/core-img/logo.png\" alt=\"\"></a> -->\n");
      out.write("                              <a href=\"index.html\"><h3>Online Notice Board</h3></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"login-content\">\n");
      out.write("                                 ");
 
                                 //   session.invalidate();
                                    if(session.getAttribute("firstname") == null )
                                    {
                                        response.sendRedirect("login.jsp"); 
                                       //out.println("<a href='login.html'>Login</a>");
                                    }
                                    else
                                    {           
                                       out.println("<h4>Welcome "+session.getAttribute("firstname")+"</h4>");
                                       out.println("<li><a href='logout.jsp'>Logout</a></li>");
                                    }
                                
      out.write("\n");
      out.write("                             <!--   <a href=\"login.html\">Login</a>-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Navbar Area -->\n");
      out.write("        <div class=\"academy-main-menu\">\n");
      out.write("            <div class=\"classy-nav-container breakpoint-off\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Menu -->\n");
      out.write("                    <nav class=\"classy-navbar justify-content-between\" id=\"academyNav\">\n");
      out.write("\n");
      out.write("                        <!-- Navbar Toggler -->\n");
      out.write("                        <div class=\"classy-navbar-toggler\">\n");
      out.write("                            <span class=\"navbarToggler\"><span></span><span></span><span></span></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Menu -->\n");
      out.write("                        <div class=\"classy-menu\">\n");
      out.write("\n");
      out.write("                            <!-- close btn -->\n");
      out.write("                            <div class=\"classycloseIcon\">\n");
      out.write("                                <div class=\"cross-wrap\"><span class=\"top\"></span><span class=\"bottom\"></span></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Nav Start -->\n");
      out.write("                            <div class=\"classynav\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                                    <li><a href=\"#\">Pages</a>\n");
      out.write("                                        <ul class=\"dropdown\">\n");
      out.write("                                            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                            <li><a href=\"about-us.jsp\">About Us</a></li>\n");
      out.write("                                            <li><a href=\"course.jsp\">Notice</a></li>\n");
      out.write("                                            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                                           <!-- <li><a href=\"elements.html\">Elements</a></li>\n");
      out.write("                                            <li><a href=\"blog.html\">Blog</a></li>-->\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                               <!--\t     <li><a href=\"#\">Mega Menu</a>\n");
      out.write("                                        <div class=\"megamenu\">\n");
      out.write("                                            <ul class=\"single-mega cn-col-4\">\n");
      out.write("                                                <li><a href=\"#\">Home</a></li>\n");
      out.write("                                                <li><a href=\"#\">Services &amp; Features</a></li>\n");
      out.write("                                                <li><a href=\"#\">Accordions and tabs</a></li>\n");
      out.write("                                                <li><a href=\"#\">Menu ideas</a></li>\n");
      out.write("                                                <li><a href=\"#\">Students Gallery</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                            <ul class=\"single-mega cn-col-4\">\n");
      out.write("                                                <li><a href=\"#\">Home</a></li>\n");
      out.write("                                                <li><a href=\"#\">Services &amp; Features</a></li>\n");
      out.write("                                                <li><a href=\"#\">Accordions and tabs</a></li>\n");
      out.write("                                                <li><a href=\"#\">Menu ideas</a></li>\n");
      out.write("                                                <li><a href=\"#\">Students Gallery</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                            <ul class=\"single-mega cn-col-4\">\n");
      out.write("                                                <li><a href=\"#\">Home</a></li>\n");
      out.write("                                                <li><a href=\"#\">Services &amp; Features</a></li>\n");
      out.write("                                                <li><a href=\"#\">Accordions and tabs</a></li>\n");
      out.write("                                                <li><a href=\"#\">Menu ideas</a></li>\n");
      out.write("                                                <li><a href=\"#\">Students Gallery</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                            <div class=\"single-mega cn-col-4\">\n");
      out.write("                                                <img src=\"img/bg-img/bg-1.jpg\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                -->\n");
      out.write("                                    <li><a href=\"about-us.jsp\">About Us</a></li>\n");
      out.write("                                    <li><a href=\"course.jsp\">Notice</a></li>\n");
      out.write("                                    <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Nav End -->\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Calling Info -->\n");
      out.write("                        <div class=\"calling-info\">\n");
      out.write("                            <div class=\"call-center\">\n");
      out.write("                           <!--     <a href=\"tel:+654563325568889\"><i class=\"icon-telephone-2\"></i> <span>(+65) 456 332 5568 889</span></a>\n");
      out.write("                           --> \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- ##### Header Area End ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### Breadcumb Area Start ##### -->\n");
      out.write("    <div class=\"breadcumb-area bg-img\" style=\"background-image: url(img/bg-img/breadcumb.jpg);\">\n");
      out.write("        <div class=\"bradcumbContent\">\n");
      out.write("            <h2>Your Notices</h2>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ##### Breadcumb Area End ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### Top Popular Courses Area Start ##### -->\n");
      out.write("    <div class=\"top-popular-courses-area mt-50 section-padding-100-70\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <!--    <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <div class=\"section-heading text-center mx-auto wow fadeInUp\" data-wow-delay=\"300ms\">\n");
      out.write("                        <span>The Best</span>\n");
      out.write("                        <h3>Top Popular Courses</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"row\"> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            //st=(Statement) con.createStatement();\n");
      out.write("           // rs=st.executeQuery(\"select Count(*) from notice\");\n");
      out.write("            //rs.next();\n");
      out.write("            \n");
      out.write("          //  int record_counnt=rs.getInt(1) + 1;\n");
      out.write("        // int a=(int) session.getAttribute(\"semester\");\n");
      out.write("         //out.println(\"semester is : \" + a);\n");
      out.write("        \n");
      out.write("        -->\n");
      out.write("\n");
      out.write("        ");

            try{
          ps=con.prepareStatement("select title,first_name,last_name,date,description,file from notice n left join faculty f on n.faculty_id =f.faculty_id where (n.department=? and semester=?) ORDER BY date DESC");
          ps.setString(1,(String) session.getAttribute("department"));
          ps.setInt(2,(int) session.getAttribute("semester"));
            
            }
            catch(Exception e)
            {
                response.sendRedirect("login.jsp");
            }
          rs=ps.executeQuery();
          String title,first_name,last_name,description,file;
          while(rs.next())
            {
                title=  rs.getString(1); 
                first_name=rs.getString(2);
                last_name=  rs.getString(3);
                description= rs.getString(5);
                file= rs.getString(6);

                out.println("    <center>  "
                        + "    <div class='single-top-popular-course d-flex align-items-center flex-wrap mb-30 wow fadeInUp' data-wow-delay='400ms'>"
                        + "<div class='popular-course-content'style='text-align: left;'> "
                        + "");
                 out.println("<h5>"+ title +"</h5>");
                 out.println("<span>By "+first_name + " " + last_name + "  | " + rs.getDate(4) +"</span> ");
                 out.println("<p style='text-align: left'> "+ description +"  </p> "
                 + "</div>"
                 );  
        
      out.write("       \n");
      out.write("                <a href='http://localhost:8080/OnlineNoticeBoard/download_notice?filename=");
      out.print(file);
      out.write("' >");
      out.print(file);
      out.write("</a>\n");
      out.write("                </div>  \n");
      out.write("                </center> \n");
      out.write("        ");
       
               }    
        
      out.write("               \n");
      out.write("                <!-- Single Top Popular Course --\n");
      out.write("           <center>     \n");
      out.write("      <!--  <div class=\"col-12 col-lg-6\"> --\n");
      out.write("                <div class=\"single-top-popular-course d-flex align-items-center flex-wrap mb-30 wow fadeInUp\" data-wow-delay=\"400ms\">\n");
      out.write("                    <div class=\"popular-course-content\" style=\"text-align: left;\"> \n");
      out.write("       \n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        <h5>prof.Chetan modhavadiya</h5>\n");
      out.write("                        <span>By Simon Smith   |  March 18, 2018</span>  \n");
      out.write("                        <!--<a href=\"#\" class=\"btn academy-btn btn-sm\">See More</a> --\n");
      out.write("                        <p style=\"text-align: left\">hey i am neha dupia  your friend its her chpice hahahahahhahha hiiiihihihihi let her  </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("          <!--     </div>--\n");
      out.write("           </center>\n");
      out.write("                \n");
      out.write("                <!-- Single Top Popular Course --\n");
      out.write("               <div class=\"col-12 col-lg-6\">\n");
      out.write("                    <div class=\"single-top-popular-course d-flex align-items-center flex-wrap mb-30 wow fadeInUp\" data-wow-delay=\"400ms\">\n");
      out.write("                        <div class=\"popular-course-content\">\n");
      out.write("                            <h5>Business for begginers</h5>\n");
      out.write("                            <span>By Simon Smith   |  March 18, 2018</span>\n");
      out.write("                           <div class=\"course-ratings\">\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\n");
      out.write("                            </div>  \n");
      out.write("                            <p>Cras vitae turpis lacinia, lacinia lacus non, fermentum nisi. Donec et sollicitudin est, in euismod.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn academy-btn btn-sm\">See More</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"popular-course-thumb bg-img\" style=\"background-image: url(img/bg-img/pc-1.jpg);\"></div>\n");
      out.write("                    </div>\n");
      out.write("               </div>\n");
      out.write(" \n");
      out.write("              <div class=\"col-12 col-lg-6\"> \n");
      out.write("                    <div class=\"single-top-popular-course d-flex align-items-center flex-wrap mb-30 wow fadeInUp\" data-wow-delay=\"900ms\">\n");
      out.write("                        <div class=\"popular-course-content\">\n");
      out.write("                            <h5>Business for begginers</h5>\n");
      out.write("                            <span>By Simon Smith   |  March 18, 2018</span>\n");
      out.write("                            <div class=\"course-ratings\">\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\n");
      out.write("                                <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <p>Cras vitae turpis lacinia, lacinia lacus non, fermentum nisi. Donec et sollicitudin est, in euismod.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn academy-btn btn-sm\">See More</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"popular-course-thumb bg-img\" style=\"background-image: url(img/bg-img/pc-6.jpg);\"></div>\n");
      out.write("                    </div>\n");
      out.write("               </div> \n");
      out.write("        <!--    </div> -->\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- ##### CTA Area Start ##### --\n");
      out.write("    <div class=\"call-to-action-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\"> \n");
      out.write("               <div class=\"col-12\">\n");
      out.write("                    <div class=\"cta-content d-flex align-items-center justify-content-between flex-wrap\">\n");
      out.write("                        <h3>Do you want to enrole at our Academy? Get in touch!</h3>\n");
      out.write("                        <a href=\"#\" class=\"btn academy-btn\">See More</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"row\"> \n");
      out.write("               <div class=\"col-12\">\n");
      out.write("                    <div class=\"cta-content d-flex align-items-center justify-content-between flex-wrap\">\n");
      out.write("                        <h3>Do you want to enrole at our Academy? Get in touch!</h3>\n");
      out.write("                        <a href=\"#\" class=\"btn academy-btn\">See More</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ##### CTA Area End ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### Footer Area Start ##### -->\n");
      out.write("    <footer class=\"footer-area\">\n");
      out.write("        <div class=\"main-footer-area section-padding-100-0\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Footer Widget Area -->\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-3\">\n");
      out.write("                        <div class=\"footer-widget mb-100\">\n");
      out.write("                            <div class=\"widget-title\">\n");
      out.write("                                <a href=\"index.html\" style=\"color: white;font-size: 20px;\"><!--<img src=\"img/core-img/logo2.png\" alt=\"\">-->Online Notice Board</a>\n");
      out.write("                            </div>\n");
      out.write("                            <p>Cras vitae turpis lacinia, lacinia lacus non, fermentum nisi. Donec et sollicitudin est, in euismod erat. Ut at erat et arcu pulvinar cursus a eget.</p>\n");
      out.write("                            <div class=\"footer-social-info\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-behance\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Footer Widget Area -->\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-3\">\n");
      out.write("                        <div class=\"footer-widget mb-100\">\n");
      out.write("                            <div class=\"widget-title\">\n");
      out.write("                                <h6>Usefull Links</h6>\n");
      out.write("                            </div>\n");
      out.write("                            <nav>\n");
      out.write("                                <ul class=\"useful-links\">\n");
      out.write("                                    <li><a href=\"#\">Home</a></li>\n");
      out.write("                                    <li><a href=\"#\">Services &amp; Features</a></li>\n");
      out.write("                                    <li><a href=\"#\">Accordions and tabs</a></li>\n");
      out.write("                                    <li><a href=\"#\">Menu ideas</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Footer Widget Area -->\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-3\">\n");
      out.write("                        <div class=\"footer-widget mb-100\">\n");
      out.write("                            <div class=\"widget-title\">\n");
      out.write("                                <h6>Gallery</h6>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"gallery-list d-flex justify-content-between flex-wrap\">\n");
      out.write("                                <a href=\"img/bg-img/gallery1.jpg\" class=\"gallery-img\" title=\"Gallery Image 1\"><img src=\"img/bg-img/gallery1.jpg\" alt=\"\"></a>\n");
      out.write("                                <a href=\"img/bg-img/gallery2.jpg\" class=\"gallery-img\" title=\"Gallery Image 2\"><img src=\"img/bg-img/gallery2.jpg\" alt=\"\"></a>\n");
      out.write("                                <a href=\"img/bg-img/gallery3.jpg\" class=\"gallery-img\" title=\"Gallery Image 3\"><img src=\"img/bg-img/gallery3.jpg\" alt=\"\"></a>\n");
      out.write("                                <a href=\"img/bg-img/gallery4.jpg\" class=\"gallery-img\" title=\"Gallery Image 4\"><img src=\"img/bg-img/gallery4.jpg\" alt=\"\"></a>\n");
      out.write("                                <a href=\"img/bg-img/gallery5.jpg\" class=\"gallery-img\" title=\"Gallery Image 5\"><img src=\"img/bg-img/gallery5.jpg\" alt=\"\"></a>\n");
      out.write("                                <a href=\"img/bg-img/gallery6.jpg\" class=\"gallery-img\" title=\"Gallery Image 6\"><img src=\"img/bg-img/gallery6.jpg\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Footer Widget Area -->\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-3\">\n");
      out.write("                        <div class=\"footer-widget mb-100\">\n");
      out.write("                            <div class=\"widget-title\">\n");
      out.write("                                <h6>Contact</h6>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-contact d-flex mb-30\">\n");
      out.write("                                <i class=\"icon-placeholder\"></i>\n");
      out.write("                                <p>Dharmsinh Desai Univercity, Collage Road, Nadiad, Gujrat, India. </p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-contact d-flex mb-30\">\n");
      out.write("                                <i class=\"icon-telephone-1\"></i>\n");
      out.write("                                <p>Main: 9974806891</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-contact d-flex\">\n");
      out.write("                                <i class=\"icon-contract\"></i>\n");
      out.write("                                <p>onlinenotice@gmail.com</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom-footer-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <p>\n");
      out.write("                        \t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- ##### Footer Area Start ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### All Javascript Script ##### -->\n");
      out.write("    <!-- jQuery-2.2.4 js -->\n");
      out.write("    <script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\n");
      out.write("    <!-- Popper js -->\n");
      out.write("    <script src=\"js/bootstrap/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    <!-- All Plugins js -->\n");
      out.write("    <script src=\"js/plugins/plugins.js\"></script>\n");
      out.write("    <!-- Active js -->\n");
      out.write("    <script src=\"js/active.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
