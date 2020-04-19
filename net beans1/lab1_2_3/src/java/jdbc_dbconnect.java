
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author modhv
 */
public class jdbc_dbconnect {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        try {
            Connection con;
            Statement st;
            ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sem4", "root", "");
            
/*
            String query = "create database sem4";
            if(st.executeUpdate(query)==1) {
                System.out.println("db craeted");
            } else {
                System.out.println("db craeted");
            }
            
            String query = "insert into student values('chetan','maher','ce','ce1','ce1')";
            query = "insert into student values('sandip','patel','civil','civil1','civil1')";
            
           st.executeUpdate("insert into student values('smit','patel','ce','ce2','ce2')");
           st.executeUpdate("insert into student values('gautam','nayak','ce','ce3','ce3')");
           st.executeUpdate("insert into student values('kashyap','parmar','ce','ce4','ce4')");
           st.executeUpdate("insert into student values('Dhir','patel','ce','ce5','ce5')");   
            
            
            while(rs.next())
            {
                System.out.println(rs.getString(1)+"  "+ rs.getString(2) +" " + rs.getString(3) +" " + rs.getString(4) +" "+rs.getString(5));
            }
                        
*/
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String query1="select * from student";
         //   st.executeUpdate("insert into student values('gautam','nayak','ce','ce3','ce3')");
            rs = st.executeQuery(query1);

     // rs.afterLast();
     //   rs.previous();
      //  rs.last();
      //rs.first();
      //rs.relative(3);
     // rs.next();
      
        System.out.println("Name: "+rs.getString("firstname")+", ");
        System.out.println("Age: "+rs.getString("lastname")+", ");
        System.out.println("Salary: "+rs.getString("branch")+", ");
        System.out.println("Country: "+rs.getString("username")+", ");
        System.out.println("Address: "+rs.getString("password"));
        System.out.println();
       Boolean b= rs.isLast();
       System.out.println(b);
     /*       
            
        rs.absolute(5);
        rs.next();
        System.out.println("Name: "+rs.getString("firstname")+", ");
        System.out.println("Age: "+rs.getString("lastname")+", ");
        System.out.println("Salary: "+rs.getString("branch")+", ");
        System.out.println("Country: "+rs.getString("username")+", ");
        System.out.println("Address: "+rs.getString("password"));
        System.out.println();
       
*/
     while(rs.next())
            {
                System.out.println(rs.getString(1)+"  "+ rs.getString(2) +" " + rs.getString(3) +" " + rs.getString(4) +" "+rs.getString(5));
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
    }
}
