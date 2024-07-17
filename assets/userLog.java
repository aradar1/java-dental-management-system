
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zeezy
 */
public class userLog {
    public static String ase;
    public static int numOfTeeth;
     public static String getCurrentDateTimeMS() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
        String datetime = ft.format(dNow);
        return datetime;
        } 
     public static String getCurrentDate(){
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yy");
        String datetime = ft.format(dNow);
        return datetime;
     }
      public static String getCurrentDateTimePat() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmss");
        String datetime = ft.format(dNow);
        return datetime;
        } 

    /*  public static String incPatID(){
          try{
              Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           String drive = "jdbc:ucanaccess://Clinic Database.mdb;";
           Connection con = DriverManager.getConnection(drive, "", "");
           Statement stmt = con.createStatement();
           
           String query = "select count(pID) as NumberofPatients from patientinfo";
           ResultSet driverselect = stmt.executeQuery(query);
           
           
          }
          catch(Exception e)
          {
              
          }
      }*/
}

