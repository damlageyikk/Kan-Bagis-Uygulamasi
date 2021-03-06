/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanbagıs;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author damla
 */
public class DoktorGirisJ extends javax.swing.JFrame {

    /**
     * Creates new form DoktorGriris
     */
    public DoktorGirisJ() {
        initComponents();
        baglan();
        this.setLocationRelativeTo(null); 
    }
    void baglan(){
    ResultSet rs;
    Statement st;
    int sutunSayisi;  
        try {
            st = KanBagis.getConnection().createStatement();
            rs = st.executeQuery("Select * from doktor ");
            sutunSayisi = rs.getMetaData().getColumnCount();
            DefaultTableModel table = new DefaultTableModel();
            
              for (int i = 1; i <= sutunSayisi; i++)
            table.addColumn(rs.getMetaData().getColumnName(i));
            while (rs.next()) {
            Object[] satır = new Object[sutunSayisi];
             for(int i=1;i<=sutunSayisi;i++)
              satır[i-1]=rs.getObject(i);
             table.addRow(satır);  
        }
             tablo.setModel(table);
        } catch (SQLException ex) {
           
        }
}

    ArrayList<Doktor> getDoktor() throws SQLException {
        ArrayList<Doktor> doktor_listesi = new ArrayList<>();
      PreparedStatement st;
        ResultSet rs;
        String sorgu = "SELECT * FROM doktor ";
            try {
                st = KanBagis.getConnection().prepareStatement(sorgu);
                Doktor d= new Doktor();
               
                rs = st.executeQuery();
                while (rs.next()) {
                     st.setString(1, d.getAd());
                st.setString(2, d.getSoyad());
                st.setString(2, d.getNöbet_tarihi());
                } 
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(KanBagisUygulamasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            return doktor_listesi;
    }
    
    void liste(int index){
       try{
           ArrayList<Doktor>list=getDoktor();
           DefaultTableModel model = (DefaultTableModel)tablo.getModel();
           model.setRowCount(0);
           
           Object [] satir = new Object[3];
           for(int i=0; i<list.size(); i++){
               satir[0]= list.get(i).getAd();
               satir[1]= list.get(i).getSoyad();
               satir[2]= list.get(i).getNöbet_tarihi();
               model.addRow(satir);
           }
       } catch(SQLException e){
           e.printStackTrace();
       }
    }
    
/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        randevu = new javax.swing.JButton();
        geriDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 0, 0), null, null));
        jPanel1.setForeground(new java.awt.Color(102, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        tablo.setBackground(new java.awt.Color(102, 0, 0));
        tablo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        tablo.setForeground(new java.awt.Color(255, 255, 255));
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ad", "Soyad", "Nöbet Tarihi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        randevu.setBackground(new java.awt.Color(255, 255, 255));
        randevu.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        randevu.setForeground(new java.awt.Color(102, 0, 0));
        randevu.setText("RANDEVULAR");
        randevu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randevuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                randevuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                randevuMouseExited(evt);
            }
        });
        randevu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randevuActionPerformed(evt);
            }
        });

        geriDon.setBackground(new java.awt.Color(255, 255, 255));
        geriDon.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        geriDon.setForeground(new java.awt.Color(102, 0, 0));
        geriDon.setText("Geri Dön");
        geriDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                geriDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                geriDonMouseExited(evt);
            }
        });
        geriDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(randevu, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(geriDon)))
                .addGap(65, 65, 65)
                .addComponent(randevu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
       int index = tablo.getSelectedRow();
       liste(index);
       
    }//GEN-LAST:event_tabloMouseClicked

    private void randevuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randevuMouseEntered
     randevu.setBackground(new Color(0, 100, 200));
    }//GEN-LAST:event_randevuMouseEntered

    private void randevuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randevuMouseExited
       randevu.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_randevuMouseExited

    private void randevuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randevuActionPerformed
       
    }//GEN-LAST:event_randevuActionPerformed

    private void randevuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randevuMouseClicked
     DoktorRandevuListesi randevuListele = new DoktorRandevuListesi();
      setVisible(false);
      randevuListele.setVisible(true);
    }//GEN-LAST:event_randevuMouseClicked

    private void geriDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriDonMouseClicked
       KanBagisUygulamasi kbu = new KanBagisUygulamasi();
      setVisible(false);
      kbu.setVisible(true);
    }//GEN-LAST:event_geriDonMouseClicked

    private void geriDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriDonMouseEntered
        geriDon.setBackground(new Color(0, 100, 200));
    }//GEN-LAST:event_geriDonMouseEntered

    private void geriDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriDonMouseExited
        geriDon.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_geriDonMouseExited

    private void geriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDonActionPerformed
      KanBagisUygulamasi kbu = new KanBagisUygulamasi();
      setVisible(false);
      kbu.setVisible(true);
    }//GEN-LAST:event_geriDonActionPerformed

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
            java.util.logging.Logger.getLogger(DoktorGirisJ.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoktorGirisJ.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoktorGirisJ.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoktorGirisJ.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorGirisJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geriDon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton randevu;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables

}
