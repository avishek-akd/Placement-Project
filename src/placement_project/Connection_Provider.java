/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Avishek
 */
public class Connection_Provider {

    public static Connection getOracleConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Placement_Project", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
