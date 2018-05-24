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
    
    
    
     public DefaultTableModel tumIzinIstekleriniGetir() //hiç bir filtre olmadan tüm izinleri tabloya çekme
    {
        DefaultTableModel donecekModel=new DefaultTableModel();
        donecekModel.setColumnIdentifiers(new String[]{"İstek No","TC","İzin Başlangıç","İzin Bitiş","Kullanılan İzin","Kalan İzin","İstek Durumu"});
        try {
            
            veritabani_baglanti vb=new veritabani_baglanti();
            vb.baglan();
            String sorgu="select * from izin_istek_tablo";
            ps=vb.con.prepareCall(sorgu);
           
            rs=ps.executeQuery();
           
            while(rs.next())
            {
                if(rs.getString("istek_durumu").equalsIgnoreCase("Cevap Bekleniyor"))
                {
                donecekModel.addRow(new String[]{String.valueOf(rs.getString("istek_no")),rs.getString("tc_no"),rs.getString("izin_baslangic"),
                    rs.getString("izin_bitis"),String.valueOf(rs.getString("kullanilan_izin")),
                    String.valueOf(rs.getString("kalan_izin")),rs.getString("istek_durumu")});
                }
            }
            
            
        } catch (Exception e) {
        }
        
        
        
        return donecekModel;
    }
     
     
     
     public boolean istegiOnayla(String onaylanacakIstekNo)
     {
         try {
             veritabani_baglanti vb=new veritabani_baglanti();
             vb.baglan();
             
            
           String sorgu="Update izin_istek_tablo SET istek_durumu=? where istek_no=?";
        
          ps=vb.con.prepareStatement(sorgu);
          ps.setString(1, "Onay");
          ps.setString(2, onaylanacakIstekNo);
          ps.execute();
             
             
          
          onaylananIsteginBilgileriniAktar(onaylanacakIstekNo);
          //istek onaylanınca artık eski izinler tablosuna düşmesi gerekiyor.
          //istek nesnesinin bilgilerini toplamak için select sorgulu metoda istek noyu attım. 1 nolu işlem.
             
             
             
             
         } catch (Exception e) {
             return false;
         }
         
         
         
         return true;
     }
     
     
     public void onaylananIsteginBilgileriniAktar(String onaylananIstekNo)
     {
         //aldıgım istek noya göre nesnenin bilgilerini toplayıp nesneyi başka bir ekleme metoduna attım. 2 nolu işlem.
         IzinIstek izinIstek=new IzinIstek();
         
         try {
            
        veritabani_baglanti vb=new veritabani_baglanti();
        vb.baglan();
        
        String sorgu="select * from izin_istek_tablo where istek_no=?";
        
        ps=vb.con.prepareCall(sorgu);
        ps.setString(1, onaylananIstekNo);
        
        rs=ps.executeQuery();
        
        while(rs.next())
        {
            izinIstek.setIzin_sure(Integer.valueOf(rs.getShort("izin_sure")));
            int sure=izinIstek.getIzin_sure();
            izinIstek.setTc_no(rs.getString("tc_no"));
            izinIstek.setIzin_baslangic(rs.getString("izin_baslangic"));
            izinIstek.setIzin_bitis(rs.getString("izin_bitis"));
            izinIstek.setKullanilan_izin(Integer.valueOf(rs.getString("kullanilan_izin"))+sure);
            izinIstek.setKalan_izin(Integer.valueOf(rs.getString("kalan_izin"))-sure);
            izinIstek.setIstek_durumu(rs.getString("istek_durumu"));
            
            
        }
        
       onaylananReddedilenIstegiIzinlereEkle(izinIstek);
       nesneyiGuncelle(izinIstek); //izin gününü kullanıcı tablosundaki kullanıcının kalan izin gününden düşmesi için..
        
        
        
        } catch (Exception e) {
        }
     }
     
     
     
     public void onaylananReddedilenIstegiIzinlereEkle(IzinIstek izinIstek)
     {
         
         //aldıgım nesnenin bilgilerine göre eski izinler tablosuna istek listesindeki bilgileri ekledim. 3 nolu işlem.
         try {
             veritabani_baglanti vb=new veritabani_baglanti();
             vb.baglan();
             
             String sorgu="insert into izin_tablo(tc_no,izin_baslangic,izin_bitis,kullanilan_izin,kalan_izin,izin_durumu)"
                     + "VALUES(?,?,?,?,?,?)";
             
             ps=vb.con.prepareCall(sorgu);
             ps.setString(1, izinIstek.getTc_no());
              ps.setString(2, izinIstek.getIzin_baslangic());
               ps.setString(3, izinIstek.getIzin_bitis());
                ps.setString(4, String.valueOf(izinIstek.getKullanilan_izin()));
                 ps.setString(5, String.valueOf(izinIstek.getKalan_izin()));
                  ps.setString(6, izinIstek.getIstek_durumu());
            
                  
            ps.execute();
                 
                     
             
         } catch (Exception e) {
         }
     }
     
     
     public void nesneyiGuncelle(IzinIstek izinIstek)
     {
         String tc=izinIstek.getTc_no();
         int yeniKalanIzin=izinIstek.getKalan_izin();
         try {
             
             veritabani_baglanti vb=new veritabani_baglanti();
             vb.baglan();
             
             String sorgu="update kullanici_tablo SET kalan_izin=? where tc_no=?";
             
             ps=vb.con.prepareCall(sorgu);
             ps.setString(1, String.valueOf(yeniKalanIzin));
             ps.setString(2, tc);
             
             ps.execute();
             
             
             
             
         } catch (Exception e) {
         }
     }
     
     public boolean istegiReddet(String reddedilecekIstekNo )
     {
          try {
             veritabani_baglanti vb=new veritabani_baglanti();
             vb.baglan();
             
            
           String sorgu="Update izin_istek_tablo SET istek_durumu=? where istek_no=?";
        
          ps=vb.con.prepareStatement(sorgu);
          ps.setString(1, "Red");
          ps.setString(2, reddedilecekIstekNo);
          ps.execute();
             
             
          
          redDEdilenIsteginBilgileriniAktar(reddedilecekIstekNo);
          //istek onaylanınca artık eski izinler tablosuna düşmesi gerekiyor.
          //istek nesnesinin bilgilerini toplamak için select sorgulu metoda istek noyu attım. 1 nolu işlem.
             
             
             
             
         } catch (Exception e) {
             return false;
         }
         
         
         
         return true;
     }

    public void redDEdilenIsteginBilgileriniAktar(String reddedilecekIstekNo) {
        //aldıgım istek noya göre nesnenin bilgilerini toplayıp nesneyi başka bir ekleme metoduna attım. 2 nolu işlem.
         IzinIstek izinIstek=new IzinIstek();
         
         try {
            
        veritabani_baglanti vb=new veritabani_baglanti();
        vb.baglan();
        
        String sorgu="select * from izin_istek_tablo where istek_no=?";
        
        ps=vb.con.prepareCall(sorgu);
        ps.setString(1, reddedilecekIstekNo);
        
        rs=ps.executeQuery();
        
        while(rs.next())
        {
            izinIstek.setIzin_sure(Integer.valueOf(rs.getShort("izin_sure")));
           
            izinIstek.setTc_no(rs.getString("tc_no"));
            izinIstek.setIzin_baslangic(rs.getString("izin_baslangic"));
            izinIstek.setIzin_bitis(rs.getString("izin_bitis"));
            izinIstek.setKullanilan_izin(Integer.valueOf(rs.getString("kullanilan_izin")));
            izinIstek.setKalan_izin(Integer.valueOf(rs.getString("kalan_izin")));
            izinIstek.setIstek_durumu(rs.getString("istek_durumu"));
            
            
        }
        
       onaylananReddedilenIstegiIzinlereEkle(izinIstek);
       nesneyiGuncelle(izinIstek); //izin gününü kullanıcı tablosundaki kullanıcının kalan izin gününden düşmesi için..
        
        
        
        } catch (Exception e) {
        }
    }
    
    
   
    
    
   
    
}
