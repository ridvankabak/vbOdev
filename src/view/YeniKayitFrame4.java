/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.Kullanici;

/**
 *
 * @author Ridvan
 */
public class YeniKayitFrame4 extends javax.swing.JFrame {

    /**
     * Creates new form YeniKayitFrame4
     */
    public YeniKayitFrame4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        yenikayitTcNotxt = new javax.swing.JTextField();
        yenikayitAdtxt = new javax.swing.JTextField();
        yenikayitSoyadtxt = new javax.swing.JTextField();
        yenikayitSehirtxt = new javax.swing.JTextField();
        yenikayitBirimGiriscmb = new javax.swing.JComboBox<>();
        yenikayitDogumTarihiGiriscmb = new javax.swing.JComboBox<>();
        yenikayitCinsiyetErkekRadio = new javax.swing.JRadioButton();
        yenikayitCinsiyetKadinRadio = new javax.swing.JRadioButton();
        yenikayitKullaniciAditxt = new javax.swing.JTextField();
        yenikayitSifretxt = new javax.swing.JTextField();
        yenikayitSifreTekrartxt = new javax.swing.JTextField();
        yenikayitKayitOlButon = new javax.swing.JButton();
        yeniKayitGeriButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TC No ");

        jLabel2.setText("Ad");

        jLabel3.setText("Soyad");

        jLabel4.setText("Kullanıcı Adı");

        jLabel5.setText("Şifre");

        jLabel6.setText("Şehir");

        jLabel7.setText("Birim");

        jLabel8.setText("Doğum Tarihi");

        jLabel9.setText("Şifre Tekrar");

        jLabel10.setText("Cinsiyet");

        yenikayitBirimGiriscmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yazılım", "Muhasebe", "İnsan Kaynakları", "Ar-Ge", "IT", " " }));

        yenikayitDogumTarihiGiriscmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997" }));

        yenikayitCinsiyetErkekRadio.setText("Erkek");
        yenikayitCinsiyetErkekRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yenikayitCinsiyetErkekRadioActionPerformed(evt);
            }
        });

        yenikayitCinsiyetKadinRadio.setText("Kadın");
        yenikayitCinsiyetKadinRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yenikayitCinsiyetKadinRadioActionPerformed(evt);
            }
        });

        yenikayitKayitOlButon.setText("Kayıt Ol");
        yenikayitKayitOlButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yenikayitKayitOlButonActionPerformed(evt);
            }
        });

        yeniKayitGeriButton.setText("Geri");
        yeniKayitGeriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniKayitGeriButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yenikayitBirimGiriscmb, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yenikayitSoyadtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(yenikayitSehirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yenikayitAdtxt)
                            .addComponent(yenikayitTcNotxt))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(yenikayitSifreTekrartxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yenikayitCinsiyetErkekRadio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(yenikayitCinsiyetKadinRadio))
                                    .addComponent(yenikayitDogumTarihiGiriscmb, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yenikayitKullaniciAditxt)
                                    .addComponent(yenikayitSifretxt))))
                        .addContainerGap(159, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(yenikayitKayitOlButon))
                    .addComponent(yeniKayitGeriButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(yeniKayitGeriButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(yenikayitTcNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yenikayitAdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yenikayitSoyadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(yenikayitSehirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(yenikayitBirimGiriscmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(yenikayitDogumTarihiGiriscmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(yenikayitCinsiyetErkekRadio)
                    .addComponent(yenikayitCinsiyetKadinRadio))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(yenikayitKullaniciAditxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(yenikayitSifretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(yenikayitSifreTekrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(yenikayitKayitOlButon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yeniKayitGeriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniKayitGeriButtonActionPerformed
        AcilisFrame1 aa=new AcilisFrame1();
        aa.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_yeniKayitGeriButtonActionPerformed

    private void yenikayitKayitOlButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yenikayitKayitOlButonActionPerformed
       boolean durum=false;
        try {
            
            
       Kullanici kullaniciyiEkle=new Kullanici();
       
       kullaniciyiEkle.setTc_no(yenikayitTcNotxt.getText());
       kullaniciyiEkle.setAd(yenikayitAdtxt.getText());
       kullaniciyiEkle.setSoyad(yenikayitSoyadtxt.getText());
       kullaniciyiEkle.setK_adi(yenikayitKullaniciAditxt.getText());
       
       if(yenikayitSifreTekrartxt.getText().equals(yenikayitSifretxt.getText())) //Şifre confirm kontrol..
       {
           kullaniciyiEkle.setSifre(yenikayitSifretxt.getText());
           
           
           
           kullaniciyiEkle.setSehir(yenikayitSifretxt.getText());
       kullaniciyiEkle.setBirim(yenikayitBirimGiriscmb.getSelectedItem().toString());
       kullaniciyiEkle.setDogum_tarihi(yenikayitDogumTarihiGiriscmb.getSelectedItem().toString());
       if(yenikayitCinsiyetErkekRadio.isSelected())
       {
           kullaniciyiEkle.setCinsiyet(yenikayitCinsiyetErkekRadio.getText());
       }
       else if(yenikayitCinsiyetKadinRadio.isSelected())
       {
           kullaniciyiEkle.setCinsiyet(yenikayitCinsiyetKadinRadio.getText());
       }
       
       durum=kullaniciyiEkle.kullaniciYeniKayitOlustur(kullaniciyiEkle);
       
       if(durum)
       {
           JOptionPane.showMessageDialog(rootPane, "Kayıt başarılı, Anasayfaya yönlendiriliyorsunuz...");
           
           AcilisFrame1 aa=new AcilisFrame1();
           aa.setVisible(true);
           setVisible(false);
           
       }
       else
       {
           JOptionPane.showMessageDialog(rootPane, "Kayıt işlemi başarısız, lütfen bilgilerinizi kontrol edin.");
       }
       
           
           
       }
       else 
           JOptionPane.showMessageDialog(rootPane, "Şifreler eşleşmiyor, tekrar deneyin..");
       
       
       
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, "Kayıt işlemi başarısız, lütfen bilgilerinizi kontrol edin.");
        }
       
    }//GEN-LAST:event_yenikayitKayitOlButonActionPerformed

    private void yenikayitCinsiyetKadinRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yenikayitCinsiyetKadinRadioActionPerformed
        if(yenikayitCinsiyetErkekRadio.isSelected())
        {
            yenikayitCinsiyetErkekRadio.setSelected(false);
        }
    }//GEN-LAST:event_yenikayitCinsiyetKadinRadioActionPerformed

    private void yenikayitCinsiyetErkekRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yenikayitCinsiyetErkekRadioActionPerformed
       if(yenikayitCinsiyetKadinRadio.isSelected())
        {
            yenikayitCinsiyetKadinRadio.setSelected(false);
        }
    }//GEN-LAST:event_yenikayitCinsiyetErkekRadioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YeniKayitFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YeniKayitFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YeniKayitFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YeniKayitFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YeniKayitFrame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton yeniKayitGeriButton;
    private javax.swing.JTextField yenikayitAdtxt;
    private javax.swing.JComboBox<String> yenikayitBirimGiriscmb;
    private javax.swing.JRadioButton yenikayitCinsiyetErkekRadio;
    private javax.swing.JRadioButton yenikayitCinsiyetKadinRadio;
    private javax.swing.JComboBox<String> yenikayitDogumTarihiGiriscmb;
    private javax.swing.JButton yenikayitKayitOlButon;
    private javax.swing.JTextField yenikayitKullaniciAditxt;
    private javax.swing.JTextField yenikayitSehirtxt;
    private javax.swing.JTextField yenikayitSifreTekrartxt;
    private javax.swing.JTextField yenikayitSifretxt;
    private javax.swing.JTextField yenikayitSoyadtxt;
    private javax.swing.JTextField yenikayitTcNotxt;
    // End of variables declaration//GEN-END:variables
}
