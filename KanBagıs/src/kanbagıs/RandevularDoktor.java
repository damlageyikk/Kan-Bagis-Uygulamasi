/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanbagıs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author damla
 */
public class RandevularDoktor implements StateUI{
    
    @Override
    public void randevuIslemleri() {
        ResultSet rs;
        Statement st;
        int sutunSayisi;
        try {
            st = KanBagis.getConnection().createStatement();
            rs = st.executeQuery("Select * from randevu ");
            sutunSayisi = rs.getMetaData().getColumnCount();
            DefaultTableModel table = new DefaultTableModel();

            for (int i = 1; i <= sutunSayisi; i++) {
                table.addColumn(rs.getMetaData().getColumnName(i));
            }
            while (rs.next()) {
                Object[] satır = new Object[sutunSayisi];
                for (int i = 1; i <= sutunSayisi; i++) {
                    satır[i - 1] = rs.getObject(i);
                }
                table.addRow(satır);
            }

        } catch (SQLException ex) {

        }
}
    }
   