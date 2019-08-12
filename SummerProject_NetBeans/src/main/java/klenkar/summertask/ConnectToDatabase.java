/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klenkar.summertask;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jelena
 */
public class ConnectToDatabase {
    public static Connection getConnection(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mariadb://localhost/human_resources","jelena","jelena");
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
