/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author HackerRıdvan
 */
public class veritabani_baglanti {
    
    public Connection con;
    private String url="jdbc:mysql://localhost:3306/";
    private String driver="com.mysql.jdbc.Driver";
    private String dbname="izin_takip";
    private String userName="root";
    private String password="root";
    private String properties= "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    
   
    
    public void baglan()
    {
        try {
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(url+dbname+properties,userName,password);
            System.out.println("Baglanti basarili...");
        } catch (Exception ex) {
            System.out.println("Baglanti başarısız..."+ex);
        }
    }
    
 
    
}
