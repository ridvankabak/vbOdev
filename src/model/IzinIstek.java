/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ridvan
 */
public class IzinIstek {
    
    
    PreparedStatement ps;
    private ResultSet rs=null;
    
    
    private String tc_no;
    private String izin_baslangic;
    private String izin_bitis;
    private int kullanilan_izin;
    private int kalan_izin;
    private String istek_durumu; //default

    public String getIzin_baslangic() {
        return izin_baslangic;
    }

    public void setIzin_baslangic(String izin_baslangic) {
        this.izin_baslangic = izin_baslangic;
    }

    public String getIzin_bitis() {
        return izin_bitis;
    }

    public void setIzin_bitis(String izin_bitis) {
        this.izin_bitis = izin_bitis;
    }

    

    public String getTc_no() {
        return tc_no;
    }

    public void setTc_no(String tc_no) {
        this.tc_no = tc_no;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

   

 

    public int getKullanilan_izin() {
        return kullanilan_izin;
    }

    public void setKullanilan_izin(int kullanilan_izin) {
        this.kullanilan_izin = kullanilan_izin;
    }

    public int getKalan_izin() {
        return kalan_izin;
    }

    public void setKalan_izin(int kalan_izin) {
        this.kalan_izin = kalan_izin;
    }

    public String getIstek_durumu() {
        return istek_durumu;
    }

    public void setIstek_durumu(String istek_durumu) {
        this.istek_durumu = istek_durumu;
    }
    
    public boolean izinIstegiOlustur(IzinIstek izinIstek)
    {
        
        try {
            
            
            veritabani_baglanti vb=new veritabani_baglanti();
            vb.baglan();
            
            String sorgu="insert into izin_istek_tablo (tc_no,izin_baslangic,izin_bitis,kullanilan_izin,kalan_izin)"
                    + "VALUES(?,?,?,?,?)";
            
            
            ps=vb.con.prepareStatement(sorgu);
            
            ps.setString(1, izinIstek.getTc_no());
            ps.setString(2, String.valueOf(izinIstek.getIzin_baslangic()));
            ps.setString(3, String.valueOf(izinIstek.getIzin_bitis()));
            ps.setString(4, String.valueOf(izinIstek.kullanilan_izin));
            ps.setString(5, String.valueOf(izinIstek.kalan_izin));
            
            ps.execute();
            
        } catch (Exception e) {
            
            System.out.println(e);
            return false;
        }
        
        return true;
    }
    
    
   
    
    
   
    
}
