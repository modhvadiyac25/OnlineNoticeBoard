/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chetan;

import static jdk.nashorn.internal.runtime.Debug.id;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author user1
 */
public class Firsthibernet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        insertRecord(new Question(1,"question1","chetan"));
        insertRecord(new Question(2,"question2","gautam"));
        showRecord(1);
        int id=1;
        String qname="question3";
        
        //updateRecord(id,qname);
        showRecord(id);
        int i=4;
        showRecord(i);
        //deleteRecord(i);
      HibernateUtil.closeSessionFactory();
        
        
    }

    private static void insertRecord(Question question) {
       SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
       Session session=sessionFactory.openSession();
       session.beginTransaction();
       session.save(question);
    }

    private static void showRecord(int id) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction =null;
        try
        {
            transaction=session.beginTransaction();
            Object get = session.get(Question.class,id);
            Question temp=(Question)get;
            if(temp==null)
            {
                System.out.println("record is not found");
            }
            else{
                System.out.println(temp);
            }
        }
        catch(HibernateException e)
        {
            if(transaction!=null)
            {
                transaction.rollback();
            }
            System.out.println("Error : " + e);
        }
        finally{
            session.close();
        }
        
    }

    private static void updateRecord(int id, String qname) {
     Session session = HibernateUtil.getSessionFactory().openSession();
     Transaction transaction = null;

     
    }

    private static void deleteRecord(int i) {
         }

}
