// import java.sql.Connection;//connection class
// import java.sql.DriverManager;
import java.sql.*;

public class jbdc{
    public static void main(String[] args) {
        /*DriverManager = gatekeeper / manager (connection banata hai)
        Connection = actual connection / pipe (jisse data flow hota hai)
        👉 DriverManager se connection milta hai
        👉 Connection se kaam hota hai
        */
        String url="jdbc:mysql://localhost:3306/menu_driven";
        String user="root";
        String password="";
    }
    try{
        Connection connect=DriverManager.getConnection(url,user,password);//yeh ek method DriverManager.getConnection,connection ko store karta hai
        System.out.println("Successfully connected!");
        Statement state =connect.createStatement();
        connect.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
} 