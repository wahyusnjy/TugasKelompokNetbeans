package tampilan;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

public class DataLokasi extends javax.swing.JPanel {
    private Connection conn;
    private DefaultTableModel tabmode;

    public DataLokasi() {
        initComponents();
        conn = new koneksi().connect();
        datatable();
    }

private void kosong() {
        txtkdLok.setText("");
        txtnmLok.setText("");
        txtdesk.setText("");

    }

    private void datatable() {
        Object[] Baris = {"Kode Lokasi", "Nama Lokasi", "Deskripsi"};
        tabmode = new DefaultTableModel(null, Baris);
        tbllok.setModel(tabmode);

        String sql = "SELECT * FROM lokasi";
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("kode_lokasi");
                String b = hasil.getString("nama_lokasi");
                String c = hasil.getString("deskripsi");

                String[] data = {a, b, c};
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
        lkdLok = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtkdLok = new javax.swing.JTextField();
        txtnmLok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbllok = new javax.swing.JTable();
        lnmLok = new javax.swing.JLabel();
        lbldesk = new javax.swing.JLabel();
        txtdesk = new javax.swing.JTextField();
        bcreate = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();

        lkdLok.setText("Kode Lokasi");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data Lokasi");

        tbllok.setModel(new javax.swing.table.DefaultTableModel(
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
        tbllok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbllokMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbllok);

        lnmLok.setText("Nama Lokasi");

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
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(209, 209, 209))
            .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelKatBrngLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelKatBrngLayout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(bupdate)
                    .addGap(32, 32, 32)
                    .addComponent(bcreate))
                .addGroup(PanelKatBrngLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lkdLok, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lnmLok)
                        .addComponent(lbldesk))
                    .addGap(46, 46, 46)
                    .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtdesk, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txtkdLok)
                        .addComponent(txtnmLok))))
        );
        PanelKatBrngLayout.setVerticalGroup(
            PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKatBrngLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lkdLok)
                    .addComponent(txtkdLok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnmLok)
                    .addComponent(txtnmLok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldesk)
                    .addComponent(txtdesk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelKatBrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelKatBrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbllokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllokMouseClicked
        int bar = tbllok.getSelectedRow();
        if (bar != -1) {
            txtkdLok.setText(tabmode.getValueAt(bar, 0).toString());
            txtnmLok.setText(tabmode.getValueAt(bar, 1).toString());
            txtdesk.setText(tabmode.getValueAt(bar, 2).toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_tbllokMouseClicked

    private void bcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcreateActionPerformed
        if (txtkdLok.getText().isEmpty() || txtnmLok.getText().isEmpty() || txtnmLok.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kode Lokasi, Nama Lokasi harus diisi!");
            return;
        }

        String sql = "INSERT INTO lokasi (kode_lokasi, nama_lokasi, deskripsi) VALUES (?, ?, ?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtkdLok.getText());
            stat.setString(2, txtnmLok.getText());
            stat.setString(3, txtdesk.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            txtkdLok.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan: " + e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bcreateActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        if (txtkdLok.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan diupdate terlebih dahulu!");
            return;
        }

        String sql = "UPDATE lokasi SET  nama_lokasi = ?, deskripsi = ? WHERE kode_lokasi = ?";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnmLok.getText());
            stat.setString(2, txtdesk.getText());
            stat.setString(3,txtkdLok.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
            kosong();
            txtkdLok.requestFocus();
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
    private javax.swing.JLabel lbldesk;
    private javax.swing.JLabel lkdLok;
    private javax.swing.JLabel lnmLok;
    private javax.swing.JTable tbllok;
    private javax.swing.JTextField txtdesk;
    private javax.swing.JTextField txtkdLok;
    private javax.swing.JTextField txtnmLok;
    // End of variables declaration//GEN-END:variables
}
