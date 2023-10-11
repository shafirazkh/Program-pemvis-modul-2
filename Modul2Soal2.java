
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Modul2Soal2 extends javax.swing.JFrame {

    public Modul2Soal2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_payment = new javax.swing.ButtonGroup();
        btn_menu = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        in_costumer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        menu_1 = new javax.swing.JRadioButton();
        pay_cash = new javax.swing.JRadioButton();
        pay_card = new javax.swing.JRadioButton();
        pay_dana1 = new javax.swing.JRadioButton();
        menu_2 = new javax.swing.JRadioButton();
        menu_3 = new javax.swing.JRadioButton();
        menu_5 = new javax.swing.JRadioButton();
        menu_6 = new javax.swing.JRadioButton();
        menu_7 = new javax.swing.JRadioButton();
        menu_8 = new javax.swing.JRadioButton();
        menu_9 = new javax.swing.JRadioButton();
        menu_4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        btn_minus = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_pesan = new javax.swing.JButton();
        txtjumlahpesanan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul2.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PIZZA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 210, 50);

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("\"Thanks for Your Preference\"");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 0, 330, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 50);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ORDER HERE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 50, 160, 30);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel4.setText("Costumer");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 80, 120, 35);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel5.setText("Menu");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 190, 120, 35);

        in_costumer.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        getContentPane().add(in_costumer);
        in_costumer.setBounds(150, 80, 120, 35);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel6.setText("Payment Method");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 120, 120, 35);

        btn_menu.add(menu_1);
        menu_1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        menu_1.setText("Pizza Chilena");
        menu_1.setActionCommand("");
        getContentPane().add(menu_1);
        menu_1.setBounds(20, 220, 130, 21);

        btn_payment.add(pay_cash);
        pay_cash.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        pay_cash.setText("Cash");
        pay_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_cashActionPerformed(evt);
            }
        });
        getContentPane().add(pay_cash);
        pay_cash.setBounds(150, 130, 120, 21);

        btn_payment.add(pay_card);
        pay_card.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        pay_card.setText("Card");
        getContentPane().add(pay_card);
        pay_card.setBounds(150, 150, 120, 21);

        btn_payment.add(pay_dana1);
        pay_dana1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        pay_dana1.setText("Dana");
        getContentPane().add(pay_dana1);
        pay_dana1.setBounds(150, 170, 120, 21);

        btn_menu.add(menu_2);
        menu_2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        menu_2.setText("Pizza Margarita");
        getContentPane().add(menu_2);
        menu_2.setBounds(20, 240, 130, 21);

        btn_menu.add(menu_3);
        menu_3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        menu_3.setText("Pizza Quattro");
        getContentPane().add(menu_3);
        menu_3.setBounds(20, 260, 130, 21);

        btn_menu.add(menu_5);
        menu_5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        menu_5.setText("Pizza Salmon");
        getContentPane().add(menu_5);
        menu_5.setBounds(150, 240, 140, 21);

        btn_menu.add(menu_6);
        menu_6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        menu_6.setText("Pizza Campestre");
        getContentPane().add(menu_6);
        menu_6.setBounds(150, 260, 140, 21);

        btn_menu.add(menu_7);
        menu_7.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        menu_7.setText("Pizza Salami");
        getContentPane().add(menu_7);
        menu_7.setBounds(80, 290, 130, 21);

        btn_menu.add(menu_8);
        menu_8.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        menu_8.setText("Pizza Hawaiana");
        menu_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_8ActionPerformed(evt);
            }
        });
        getContentPane().add(menu_8);
        menu_8.setBounds(80, 310, 130, 21);

        btn_menu.add(menu_9);
        menu_9.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        menu_9.setText("Pizza Pepperoni");
        getContentPane().add(menu_9);
        menu_9.setBounds(80, 330, 130, 21);

        btn_menu.add(menu_4);
        menu_4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        menu_4.setText("Pizza Tres");
        getContentPane().add(menu_4);
        menu_4.setBounds(150, 220, 140, 21);

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel7.setText("Jumlah Pesanan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 370, 120, 35);

        btn_minus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_minus.setText("-");
        btn_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_minus);
        btn_minus.setBounds(20, 400, 40, 22);

        btn_plus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_plus.setText("+");
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_plus);
        btn_plus.setBounds(110, 400, 40, 22);

        btn_hapus.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus);
        btn_hapus.setBounds(190, 460, 100, 25);

        btn_pesan.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        btn_pesan.setText("Pesan");
        btn_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pesan);
        btn_pesan.setBounds(20, 460, 100, 25);

        txtjumlahpesanan.setEditable(false);
        txtjumlahpesanan.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        txtjumlahpesanan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtjumlahpesanan.setText("0");
        getContentPane().add(txtjumlahpesanan);
        txtjumlahpesanan.setBounds(70, 400, 30, 20);

        Output.setEditable(false);
        Output.setColumns(20);
        Output.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        Output.setRows(5);
        jScrollPane1.setViewportView(Output);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 70, 300, 410);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul2a.jpeg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 50, 620, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int jumlahpesanan = 0;
    
    private void menu_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_8ActionPerformed

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusActionPerformed
        jumlahpesanan++;
        updatejumlahpesan();
    }//GEN-LAST:event_btn_plusActionPerformed

    private void btn_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minusActionPerformed
        if(jumlahpesanan > 0){
            jumlahpesanan--;
            updatejumlahpesan();
        }
    }//GEN-LAST:event_btn_minusActionPerformed

    private void btn_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesanActionPerformed
        String jenis_menu = null;
        double harga_menu = 0.0;
        int jumlahpesanan = Integer.parseInt(txtjumlahpesanan.getText());
        
        if(jumlahpesanan > 0 ){
            if(menu_1.isSelected()){
                jenis_menu = "Pizza Chilena";
                harga_menu = 25000.0;
            }else if(menu_2.isSelected()){
                jenis_menu = "Pizza Margarita";
                harga_menu = 28000.0;
            }else if(menu_3.isSelected()){
                jenis_menu = "Pizza Quattro";
                harga_menu = 30000.0;
            }else if(menu_4.isSelected()){
                jenis_menu = "Pizza Tres";
                harga_menu = 32000.0;
            }else if(menu_5.isSelected()){
                jenis_menu = "Pizza Salmon";
                harga_menu = 34000.0;
            }else if(menu_6.isSelected()){
                jenis_menu = "Pizza Campestre";
                harga_menu = 36000.0;
            }else if(menu_7.isSelected()){
                jenis_menu = "Pizza Salami";
                harga_menu = 38000.0;
            }else if(menu_8.isSelected()){
                jenis_menu = "Pizza Hawaiana";
                harga_menu = 40000.0;
            }else if(menu_9.isSelected()){
                jenis_menu = "Pizza Pepperoni";
                harga_menu = 42000.0;
            }
        
            double harga_total = harga_menu * jumlahpesanan;
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

            Output.setText(" Yth \t\t = "+in_costumer.getText()
                +"\n Pesanan Anda adalah "
                +"\n Jenis Pizza \t\t = "+jenis_menu
                +"\n Harga \t\t = "+formatRupiah.format(harga_menu)
                +"\n Jumlah pembelian \t = "+jumlahpesanan
                +"\n Total Harga \t = "+formatRupiah.format(harga_total));
        }else{
            JOptionPane.showMessageDialog(this, "Anda harus membeli setidaknya 1 makanan sebelum melakukan pemesanan.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_pesanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        in_costumer.setText("");
        btn_payment.clearSelection();
        btn_menu.clearSelection();
        txtjumlahpesanan.setText("");
        Output.setText("");
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void pay_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pay_cashActionPerformed

    private void updatejumlahpesan(){
        txtjumlahpesanan.setText(Integer.toString(jumlahpesanan));
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul2Soal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Output;
    private javax.swing.JButton btn_hapus;
    private javax.swing.ButtonGroup btn_menu;
    private javax.swing.JButton btn_minus;
    private javax.swing.ButtonGroup btn_payment;
    private javax.swing.JButton btn_pesan;
    private javax.swing.JButton btn_plus;
    private javax.swing.JTextField in_costumer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton menu_1;
    private javax.swing.JRadioButton menu_2;
    private javax.swing.JRadioButton menu_3;
    private javax.swing.JRadioButton menu_4;
    private javax.swing.JRadioButton menu_5;
    private javax.swing.JRadioButton menu_6;
    private javax.swing.JRadioButton menu_7;
    private javax.swing.JRadioButton menu_8;
    private javax.swing.JRadioButton menu_9;
    private javax.swing.JRadioButton pay_card;
    private javax.swing.JRadioButton pay_cash;
    private javax.swing.JRadioButton pay_dana1;
    private javax.swing.JTextField txtjumlahpesanan;
    // End of variables declaration//GEN-END:variables
}
