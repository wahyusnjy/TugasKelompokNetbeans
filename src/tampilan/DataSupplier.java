package tampilan;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;


public class DataSupplier extends javax.swing.JPanel {
private Connection conn;
private DefaultTableModel tabmode;

    public DataSupplier() {
        initComponents();
        conn = new koneksi().connect();
        datatable();
    }
private void kosong() {
        txtkdSupplier.setText("");
        txtnmSupplier.setText("");
        txtalamat.setText("");
        txttelp.setText("");
    }

    private void datatable() {
        Object[] Baris = {"ID","Kode Supplier", "Nama Supplier", "Alamat", "No telepon"};
        tabmode = new DefaultTableModel(null, Baris);
        tblsup.setModel(tabmode);

        String sql = "SELECT * FROM supplier";
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("id");
                String b = hasil.getString("kode_supplier");
                String c = hasil.getString("nama_supplier");
                String d = hasil.getString("alamat");
                String e = hasil.getString("telepon");
                
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
        lblnmSupplier = new javax.swing.JLabel();
        txtkdSupplier = new javax.swing.JTextField();
        txtnmSupplier = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsup = new javax.swing.JTable();
        lblkdSupplier = new javax.swing.JLabel();
        lblalamat = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        bcreate = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        lbltelp = new javax.swing.JLabel();
        txttelp = new javax.swing.JTextField();

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data Supplier");

        lblnmSupplier.setText("Nama Supplier");

        tblsup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Kode Supplier", "Nama Supplier", "Alamat", "No Telepon"
            }
        ));
        tblsup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsupMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsup);

        lblkdSupplier.setText("Kode Supplier");

        lblalamat.setText("Alamat");

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

        lbltelp.setText("No Telepon");

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
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelKatBrngLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(bupdate)
                        .addGap(48, 48, 48)
                        .addComponent(bcreate))
                    .addGroup(PanelKatBrngLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnmSupplier)
                            .addComponent(lblkdSupplier)
                            .addComponent(lblalamat)
                            .addComponent(lbltelp))
                        .addGap(23, 23, 23)
                        .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtalamat, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(txtkdSupplier, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnmSupplier, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttelp))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PanelKatBrngLayout.setVerticalGroup(
            PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKatBrngLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkdSupplier)
                    .addComponent(txtkdSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnmSupplier)
                    .addComponent(txtnmSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblalamat)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelp)
                    .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(PanelKatBrngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bupdate)
                    .addComponent(bcreate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelKatBrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelKatBrng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblsupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsupMouseClicked
        int bar = tblsup.getSelectedRow();
        if (bar != -1) {
            
            txtkdSupplier.setText(tabmode.getValueAt(bar, 1).toString());
            txtnmSupplier.setText(tabmode.getValueAt(bar, 2).toString());
            txtalamat.setText(tabmode.getValueAt(bar, 3).toString());
            txttelp.setText(tabmode.getValueAt(bar, 4).toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_tblsupMouseClicked

    private void bcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcreateActionPerformed
        if (txtkdSupplier.getText().isEmpty() || txtnmSupplier.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID, Kode Kategori, dan Nama Kategori harus diisi!");
            return;
        }

        String sql = "INSERT INTO supplier (kode_supplier, nama_supplier, alamat, telepon) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtkdSupplier.getText());
            stat.setString(2, txtnmSupplier.getText());
            stat.setString(3, txtalamat.getText());
            stat.setString(4, txttelp.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            txtkdSupplier.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan: " + e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bcreateActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        if (txtkdSupplier.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan diupdate terlebih dahulu!");
            return;
        }

        String sql = "UPDATE supplier SET nama_supplier = ?, alamat = ?, telepon = ? WHERE  kode_supplier = ?";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            
            stat.setString(1, txtnmSupplier.getText());
            stat.setString(2, txtalamat.getText());
            stat.setString(3, txttelp.getText());
            stat.setString(4, txtkdSupplier.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
            kosong();
            txtkdSupplier.requestFocus();
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
    private javax.swing.JLabel lblalamat;
    private javax.swing.JLabel lblkdSupplier;
    private javax.swing.JLabel lblnmSupplier;
    private javax.swing.JLabel lbltelp;
    private javax.swing.JTable tblsup;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtkdSupplier;
    private javax.swing.JTextField txtnmSupplier;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables
}
