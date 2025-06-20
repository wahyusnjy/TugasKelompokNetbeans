package tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table. DefaultTableModel;
import koneksi.koneksi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.*; 

public class Kategori extends javax.swing.JPanel {
private Connection conn= new koneksi().connect();
private DefaultTableModel tabmode;

public Kategori() {
        initComponents();
        conn = new koneksi().connect();
        datatable();
    }  
    
    private void kosong() {
        txtID.setText("");
        txtkdKategori.setText("");
        txtnmKategori.setText("");
        txtdesk.setText("");
    }

    private void datatable() {
        Object[] Baris = {"ID Kategori", "Kode Kategori", "Nama Kategori", "Deskripsi"};
        tabmode = new DefaultTableModel(null, Baris);
        tblkat.setModel(tabmode);

        String sql = "SELECT * FROM kategori";
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("id");
                String b = hasil.getString("kode_kategori");
                String c = hasil.getString("nama_kategori");
                String d = hasil.getString("deskripsi");

                String[] data = {a, b, c, d};
                tabmode.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Tampil Data: " + e.getMessage());
        }
    }

    private void ubahMode(Component komponen, boolean modeMalam) {
        if (komponen instanceof JPanel || komponen instanceof JTabbedPane) {
            komponen.setBackground(modeMalam ? Color.DARK_GRAY : Color.WHITE);
        }

        if (komponen instanceof JLabel ||
            komponen instanceof JButton ||
            komponen instanceof JToggleButton ||
            komponen instanceof JCheckBox ||
            komponen instanceof JRadioButton) {
            komponen.setForeground(modeMalam ? Color.WHITE : Color.BLACK);
            komponen.setBackground(modeMalam ? Color.DARK_GRAY : null);
        }

        if (komponen instanceof Container) {
            for (Component child : ((Container) komponen).getComponents()) {
                ubahMode(child, modeMalam);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelKatBrng = new javax.swing.JPanel();
        ldlid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblnmKategori = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtkdKategori = new javax.swing.JTextField();
        txtnmKategori = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkat = new javax.swing.JTable();
        lblkdKategori = new javax.swing.JLabel();
        lbldesk = new javax.swing.JLabel();
        txtdesk = new javax.swing.JTextField();
        bcreate = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();

        ldlid.setText("ID Kategori");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kategori Barang");

        lblnmKategori.setText("Nama Kategori");

        tblkat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Kategori", "Kode Kategori", "Nama Kategori", "Deskripsi"
            }
        ));
        tblkat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkat);

        lblkdKategori.setText("Kode Kategori");

        lbldesk.setText("Deskripsi");

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
                            .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblkdKategori)
                                .addComponent(ldlid, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblnmKategori)
                            .addComponent(lbldesk))
                        .addGap(33, 33, 33)
                        .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdesk, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txtkdKategori, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnmKategori, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(PanelKatBrngLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelKatBrngLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(bupdate)
                        .addGap(32, 32, 32)
                        .addComponent(bcreate)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PanelKatBrngLayout.setVerticalGroup(
            PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKatBrngLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ldlid)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkdKategori)
                    .addComponent(txtkdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnmKategori)
                    .addComponent(txtnmKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldesk)
                    .addComponent(txtdesk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bupdate)
                    .addComponent(bcreate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKatBrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelKatBrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcreateActionPerformed
        if (txtID.getText().isEmpty() || txtkdKategori.getText().isEmpty() || txtnmKategori.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID, Kode Kategori, dan Nama Kategori harus diisi!");
            return;
        }

        String sql = "INSERT INTO kategori (id, kode_kategori, nama_kategori, deskripsi) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtID.getText());
            stat.setString(2, txtkdKategori.getText());
            stat.setString(3, txtnmKategori.getText());
            stat.setString(4, txtdesk.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            txtID.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan: " + e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bcreateActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan diupdate terlebih dahulu!");
            return;
        }

        String sql = "UPDATE kategori SET kode_kategori = ?, nama_kategori = ?, deskripsi = ? WHERE id = ?";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtkdKategori.getText());
            stat.setString(2, txtnmKategori.getText());
            stat.setString(3, txtdesk.getText());
            stat.setString(4, txtID.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
            kosong();
            txtID.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diupdate: " + e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_bupdateActionPerformed

    private void tblkatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkatMouseClicked
        int bar = tblkat.getSelectedRow();
        if (bar != -1) {
            txtID.setText(tabmode.getValueAt(bar, 0).toString());
            txtkdKategori.setText(tabmode.getValueAt(bar, 1).toString());
            txtnmKategori.setText(tabmode.getValueAt(bar, 2).toString());
            txtdesk.setText(tabmode.getValueAt(bar, 3).toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_tblkatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelKatBrng;
    private javax.swing.JButton bcreate;
    private javax.swing.JButton bupdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldesk;
    private javax.swing.JLabel lblkdKategori;
    private javax.swing.JLabel lblnmKategori;
    private javax.swing.JLabel ldlid;
    private javax.swing.JTable tblkat;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtdesk;
    private javax.swing.JTextField txtkdKategori;
    private javax.swing.JTextField txtnmKategori;
    // End of variables declaration//GEN-END:variables

}
