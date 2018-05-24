/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ridvan
 */
public class Kullanici {
    
    private String tc_no;
    private String ad;
    private String soyad;
    private String k_adi;
    private String sifre;
    private String sehir;
    private String birim;
    private String dogum_tarihi;
    private String cinsiyet;
    private int kalan_izin;
    
    
   private ResultSet rs=null;
   PreparedStatement ps;
   
   
    public String getTc_no() {
        return tc_no;
    }

    public void setTc_no(String tc_no) {
        this.tc_no = tc_no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getK_adi() {
        return k_adi;
    }

    public void setK_adi(String k_adi) {
        this.k_adi = k_adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getDogum_tarihi() {
        return dogum_tarihi;
    }

    public void setDogum_tarihi(String dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getKalan_izin() {
        return kalan_izin;
    }

    public void setKalan_izin(int kalan_izin) {
        this.kalan_izin = kalan_izin;
    }
    
    public boolean kullaniciGirisYap(String gelenK_adi,String gelen_sifre) throws SQLException
    {
        veritabani_baglanti vb=new veritabani_baglanti();
        vb.baglan();
        
        String sorgu="select sifre from kullanici_tablo where k_adi=?";
        ps=vb.con.prepareCall(sorgu);
        ps.setString(1, gelenK_adi);
        rs=ps.executeQuery();
        while(rs.next())
        {
            String pw=rs.getString("sifre");
            if(pw.equals(gelen_sifre))
            {
                return true;
            }
            else
                return false;
        }
        
        return false;
        
      
    }
    
    public boolean kullaniciYeniKayitOlustur(Kullanici kullanicim)
    {
        
        try
        {
            veritabani_baglanti vb=new veritabani_baglanti();
            vb.baglan();
            
            
            String sorgu="insert into kullanici_tablo (tc_no,ad,soyad,k_adi,sifre,sehir,birim,dogum_tarihi,cinsiyet)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)";
        
        ps=vb.con.prepareStatement(sorgu);
        
        ps.setString(1, kullanicim.getTc_no());
        ps.setString(2, kullanicim.getAd());
        ps.setString(3, kullanicim.getSoyad());
        ps.setString(4, kullanicim.getK_adi());
        ps.setString(5, kullanicim.getSifre());
        ps.setString(6, kullanicim.getSehir());
        ps.setString(7, kullanicim.getBirim());
        ps.setString(8, kullanicim.getDogum_tarihi());
        ps.setString(9, kullanicim.getCinsiyet());
        
        ps.execute();
        
        
        }catch(Exception e)
        {
            return false;
        }
        
        return true;
    }
    
    
    public boolean kullaniciGuncelle(Kullanici kullanicim,String guncellenecekKisiK_adi)
    {
         try
        {
            veritabani_baglanti vb=new veritabani_baglanti();
            vb.baglan();
            
             
            //UPDATE uyeler SET yas = 40, email = "ali@yenimail.com" WHERE id = "1";
            String sorgu=("update kullanici_tablo SET ad=?,soyad=?,k_adi=?,sifre=?,sehir=?,birim=?,dogum_tarihi=?,cinsiyet=?"
                    + "where k_adi=?");
        
        ps=vb.con.prepareStatement(sorgu);
        
        
        ps.setString(1, kullanicim.getAd());
        ps.setString(2, kullanicim.getSoyad());
        ps.setString(3, kullanicim.getK_adi());
        ps.setString(4, kullanicim.getSifre());
        ps.setString(5, kullanicim.getSehir());
        ps.setString(6, kullanicim.getBirim());
        ps.setString(7, kullanicim.getDogum_tarihi());
        ps.setString(8, kullanicim.getCinsiyet());
        ps.setString(9, guncellenecekKisiK_adi);
        
        ps.execute();
        
        
        }catch(Exception e)
        {
            return false;
        }
        
        return true;
    }
    
    
    public Kullanici sistemdekiKullaniciyiGetir(String kullaniciAdi)
    {
        Kullanici donecekKullanici=new Kullanici();
        
        try {
            
        veritabani_baglanti vb=new veritabani_baglanti();
        vb.baglan();
        
        String sorgu="select * from kullanici_tablo where k_adi=?";
        
        ps=vb.con.prepareCall(sorgu);
        ps.setString(1, kullaniciAdi);
        
        rs=ps.executeQuery();
        
        while(rs.next())
        {
            
            donecekKullanici.setTc_no(rs.getString("tc_no"));
            donecekKullanici.setAd(rs.getString("ad"));
            donecekKullanici.setSoyad(rs.getString("soyad"));
            donecekKullanici.setSifre(rs.getString("sifre"));
            donecekKullanici.setK_adi(rs.getString("k_adi"));
            donecekKullanici.setSehir(rs.getString("sehir"));
            donecekKullanici.setBirim(rs.getString("birim"));
            donecekKullanici.setDogum_tarihi(rs.getString("dogum_tarihi"));
            donecekKullanici.setCinsiyet(rs.getString("cinsiyet"));
            donecekKullanici.setKalan_izin(Integer.valueOf(rs.getString("kalan_izin")));
            
        }
        
        
        
        } catch (Exception e) {
        }
        
        return donecekKullanici;
    }
    
    
    
}
