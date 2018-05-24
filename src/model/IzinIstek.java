/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

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
    private int izin_sure;
    private String istek_durumu; //default

    public int getIzin_sure() {
        return izin_sure;
    }

    public void setIzin_sure(int izin_sure) {
        this.izin_sure = izin_sure;
    }

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
            
            String sorgu="insert into izin_istek_tablo (tc_no,izin_baslangic,izin_bitis,kullanilan_izin,kalan_izin,izin_sure)"
                    + "VALUES(?,?,?,?,?,?)";
            
            
            ps=vb.con.prepareStatement(sorgu);
            
            ps.setString(1, izinIstek.getTc_no());
            ps.setString(2, String.valueOf(izinIstek.getIzin_baslangic()));
            ps.setString(3, String.valueOf(izinIstek.getIzin_bitis()));
            ps.setString(4, String.valueOf(izinIstek.getKullanilan_izin()));
            ps.setString(5, String.valueOf(izinIstek.getKalan_izin()));
            ps.setString(6, String.valueOf(izinIstek.getIzin_sure()));
            
            ps.execute();
            
        } catch (Exception e) {
            
            System.out.println(e);
            return false;
        }
        
        return true;
    }
    
    public DefaultTableModel izinIstekTablosunuDoldur(String gelenTc)
    {
        DefaultTableModel donecekModel=new DefaultTableModel();
        donecekModel.setColumnIdentifiers(new String[] {"TC","İzin Başvurusu","Durumu"}); //tabloyu burda doldurup göndereceğim.
        
        try {
            
            veritabani_baglanti vb=new veritabani_baglanti();
            vb.baglan();
            
            String sorgu="Select * from izin_istek_tablo where tc_no=?";
            ps=vb.con.prepareCall(sorgu);
            
            ps.setString(1, gelenTc);
             rs=ps.executeQuery();
            while(rs.next())
            {
                String tc=rs.getString("tc_no");
                String izinBasvurusu=rs.getString("izin_baslangic")+" -->"+rs.getString("izin_bitis");
                String durumu=rs.getString("istek_durumu");
               // donecekModel.addRow(new String[]{rs.getString("tc_no").toString(),(rs.getString("izin_baslangic")+"-"+rs.getString("izin_bitis")).toString(),rs.getString("istek_durumu").toString()});
            
                System.out.println(tc+" "+izinBasvurusu+" "+durumu);
                
                donecekModel.addRow(new String[] {tc,izinBasvurusu,durumu});
            }
            
           
            
            
            
        } catch (Exception e) {
        }
        
        
        
        return donecekModel;
        
    }
    
    
   
    
    
   
    
}
