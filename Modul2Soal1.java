/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Modul2Soal1 extends javax.swing.JFrame {

    public Modul2Soal1() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_hitung = new javax.swing.JButton();
        in_nama = new javax.swing.JTextField();
        in_jam = new javax.swing.JTextField();
        in_tarif = new javax.swing.JTextField();
        in_pajak = new javax.swing.JTextField();
        btn_selesai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 153, 255));
        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PERHITUNGAN GAJI KARYAWAN");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 10, 270, 50);

        Nama.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        Nama.setText("Nama");
        getContentPane().add(Nama);
        Nama.setBounds(37, 82, 130, 35);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel1.setText("Jam Kerja / Seminggu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(37, 123, 130, 35);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel3.setText("Tarif Perjam");
        jLabel3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(37, 164, 125, 35);
        jLabel3.getAccessibleContext().setAccessibleName("");

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel4.setText("Pajak");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(37, 205, 125, 35);

        btn_hitung.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btn_hitung.setText("HITUNG");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hitung);
        btn_hitung.setBounds(340, 250, 120, 30);

        in_nama.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        getContentPane().add(in_nama);
        in_nama.setBounds(190, 80, 150, 35);

        in_jam.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        in_jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_jamActionPerformed(evt);
            }
        });
        getContentPane().add(in_jam);
        in_jam.setBounds(190, 120, 150, 35);

        in_tarif.setEditable(false);
        in_tarif.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        in_tarif.setText("10.000");
        getContentPane().add(in_tarif);
        in_tarif.setBounds(190, 160, 150, 35);

        in_pajak.setEditable(false);
        in_pajak.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        in_pajak.setText("10%");
        getContentPane().add(in_pajak);
        in_pajak.setBounds(190, 200, 150, 35);

        btn_selesai.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btn_selesai.setText("SELESAI");
        btn_selesai.setAutoscrolls(true);
        btn_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesaiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_selesai);
        btn_selesai.setBounds(340, 460, 120, 30);

        Output.setEditable(false);
        Output.setColumns(20);
        Output.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        Output.setRows(5);
        jScrollPane1.setViewportView(Output);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 300, 436, 139);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul2.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 510, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        try{
            int jamkerja = Integer.parseInt(in_jam.getText());
            int tarifperjam = 10000;
            double gajibruto;
            
            if (jamkerja > 40){
                gajibruto = (40 * tarifperjam) + ((jamkerja - 40) * 1.5 * tarifperjam);
            }else{
                gajibruto = jamkerja * tarifperjam;
            }
            
            double pajak = 0.10 * gajibruto;
            double gajibersih = gajibruto - pajak;
            
            Output.setText(" Yth \t\t = "+in_nama.getText()
            +"\n Gaji Anda adalah "
            +"\n Gaji bruto / kotor \t = "+gajibruto
            +"\n Gaji Bersih \t\t = "+gajibersih
            +"\n Dengan "
            +"\n Tarif Perjam \t\t = "+in_tarif.getText()
            +"\n Pajak \t\t = "+in_pajak.getText());
        }catch (NumberFormatException e){
            Output.setText("Masukkan Jumlah Jam Kerja yang Benar");
        }
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void in_jamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_jamActionPerformed

    }//GEN-LAST:event_in_jamActionPerformed

    private void btn_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesaiActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btn_selesaiActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul2Soal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nama;
    private javax.swing.JTextArea Output;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_selesai;
    private javax.swing.JTextField in_jam;
    private javax.swing.JTextField in_nama;
    private javax.swing.JTextField in_pajak;
    private javax.swing.JTextField in_tarif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
