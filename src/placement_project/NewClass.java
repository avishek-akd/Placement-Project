/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import static placement_project.Login.con;
import static placement_project.Login.pst;

/**
 *
 * @author Avishek
 */
public class NewClass 
{
    static Connection con = null;
    static PreparedStatement pst = null;
    public static void main(String[] args) 
    {
        
        con = Connection_Provider.getOracleConnection();
        String sql = "select dob from placement where regd_no=?";
         try {
            pst = con.prepareStatement(sql);
            pst.setString(1,"123");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Date  date1 = rs.getDate(1);
                 Calendar cal = Calendar.getInstance();
                 cal.setTime(date1);
                 int year = cal.get(Calendar.YEAR);
                 System.out.println(year);
                 
                 Date date2 = new Date();
                 Calendar cal1 = Calendar.getInstance();
                 cal.setTime(date2);
                 int year1 = cal1.get(Calendar.YEAR);
                 System.out.println(year1);
                 
                 int f = year1-year ;
                 if(f>=20)
                 {
                     System.out.println("yes");
                 }
                 else
                     System.out.println("no");
            }
    }
         catch(Exception e)
         {
             
         }
}
}