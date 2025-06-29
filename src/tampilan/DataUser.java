package tampilan;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

public class DataUser extends javax.swing.JPanel {
    private Connection conn;
    private DefaultTableModel tabmode;

    public DataUser() {
        initComponents();
        conn = new koneksi().connect();
        datatable();
        isiComboBox(trole, "role", "users", "-- Pilih Role --");
    }

    private void kosong() {
        tnama.setText("");
        tuser.setText("");
        tpass.setText("");
        trole.setSelectedIndex(0);
        
    }

    private void isiComboBox(JComboBox<String> combo, String kolom, String tabel, String labelAwal) {
    try {
        String sql = "SELECT DISTINCT " + kolom + " FROM " + tabel;
        PreparedStatement stat = conn.prepareStatement(sql);
        ResultSet rs = stat.executeQuery();

        combo.removeAllItems(); // Kosongkan isi combobox dulu
        combo.addItem(labelAwal); // Tambahkan label awal seperti "-- Pilih Kode Barang --"

        while (rs.next()) {
            combo.addItem(rs.getString(kolom));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal ambil data dari " + kolom + ": " + e.getMessage());
        }
    }

    private void datatable() {
        Object[] Baris = {"ID", "Nama", "Nama User", "Password", "Role"};
        tabmode = new DefaultTableModel(null, Baris);
        tbluser.setModel(tabmode);

        String sql = "SELECT * FROM users";
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("id_user");
                String b = hasil.getString("nama");
                String c = hasil.getString("username");
                String d = hasil.getString("password");
                String e = hasil.getString("role");

                String[] data = {a, b, c, d, e};
                tabmode.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Tampil Data: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelKatBrng = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        tuser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbluser = new javax.swing.JTable();
        lblnm = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        tpass = new javax.swing.JTextField();
        bcreate = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        lblrole = new javax.swing.JLabel();
        trole = new javax.swing.JComboBox<>();

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data User");

        lbluser.setText("Nama User");

        tbluser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Nama User", "Password", "Role"
            }
        ));
        tbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbluserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbluser);

        lblnm.setText("Nama");

        lblpass.setText("Password");

        bcreate.setText("Create Data");
        bcreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcreateActionPerformed(evt);
            }
        });

        bupdate.setText("Update Data");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        lblrole.setText("Role");

        trole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PanelKatBrngLayout = new javax.swing.GroupLayout(PanelKatBrng);
        PanelKatBrng.setLayout(PanelKatBrngLayout);
        PanelKatBrngLayout.setHorizontalGroup(
            PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKatBrngLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(209, 209, 209))
            .addGroup(PanelKatBrngLayout.createSequentialGroup()
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelKatBrngLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbluser)
                                .addComponent(lblpass)
                                .addComponent(lblnm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblrole))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tpass, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(tnama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tuser, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(trole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelKatBrngLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(bupdate)
                        .addGap(31, 31, 31)
                        .addComponent(bcreate)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKatBrngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelKatBrngLayout.setVerticalGroup(
            PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKatBrngLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnm)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbluser)
                    .addComponent(tuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpass)
                    .addComponent(tpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrole))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKatBrngLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKatBrngLayout.createSequentialGroup()
                        .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bupdate)
                            .addComponent(bcreate))
                        .addGap(202, 202, 202))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKatBrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKatBrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbluserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbluserMouseClicked
        int bar = tbluser.getSelectedRow();
        if (bar != -1) {
            
            tnama.setText(tabmode.getValueAt(bar, 1).toString());
            tuser.setText(tabmode.getValueAt(bar, 2).toString());
            tpass.setText(tabmode.getValueAt(bar, 3).toString());
            trole.setSelectedItem(tabmode.getValueAt(bar, 4).toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_tbluserMouseClicked

    private void bcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcreateActionPerformed
        if (tnama.getText().isEmpty() || tuser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama, Nama User, Password harus diisi!");
            return;
        }

        String sql = "INSERT INTO users (nama, username, password, role) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            
            stat.setString(1, tnama.getText());
            stat.setString(2, tuser.getText());
            stat.setString(3, tpass.getText());
            stat.setString(4, trole.getSelectedItem().toString());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            tuser.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan: " + e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bcreateActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        if (tuser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan diupdate terlebih dahulu!");
            return;
        }

        String sql = "UPDATE users SET nama = ?, password = ?, role = ? WHERE username = ?";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tnama.getText());           
            stat.setString(2, tpass.getText());
            stat.setString(3, trole.getSelectedItem().toString());
            stat.setString(4, tuser.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
            kosong();
            tuser.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diupdate: " + e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_bupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelKatBrng;
    private javax.swing.JButton bcreate;
    private javax.swing.JButton bupdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblnm;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblrole;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTable tbluser;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tpass;
    private javax.swing.JComboBox<String> trole;
    private javax.swing.JTextField tuser;
    // End of variables declaration//GEN-END:variables
}
