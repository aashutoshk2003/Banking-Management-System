package bank.management.system;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class admincontrol extends javax.swing.JFrame {
    
    String nm,bd;
    
    public admincontrol(String nm,String bd) {
        initComponents();
        this.nm = nm;
        this.bd = bd;
        try {
            dis();
            dis1();
        } catch (SQLException ex) {
            Logger.getLogger(admincontrol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    Connection con;
    Statement st;
    ResultSet rs;
    
    String formno;
    public void dis() throws SQLException
    {
        Object[] row;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","");
            st = con.createStatement();
            String query = "select Form_no , Name , Date_of_Birh from signup where name = '"+nm+"' and Date_of_Birh = '"+bd+"' ";
            
            rs = st.executeQuery(query);
            
            DefaultTableModel model = (DefaultTableModel)tblData.getModel();
            while(rs.next())
            {
                formno=rs.getString(1);
                row = new Object[] {rs.getString(1),rs.getString(2),rs.getString(3)};
                model.addRow(row);
            }
            tblData.setModel(model);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public void dis1() throws SQLException
    {
        Object[] row;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","");
            st = con.createStatement();
            String query = "select  cardnumber , pinnumber from login where formno = '"+formno+"' ";
            
            rs = st.executeQuery(query);
            
            DefaultTableModel model = (DefaultTableModel)tblData2.getModel();
            while(rs.next())
            {
                row = new Object[] {rs.getString(1),rs.getString(2)};
                model.addRow(row);
            }
            tblData2.setModel(model);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblData2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 20));

        tblData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Form No.", "Name", "Birth Date"
            }
        ));
        tblData.setRowHeight(24);
        jScrollPane2.setViewportView(tblData);

        tblData2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblData2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Card Number", "PIN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData2.setRowHeight(24);
        jScrollPane4.setViewportView(tblData2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(admincontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admincontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admincontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admincontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admincontrol("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblData2;
    // End of variables declaration//GEN-END:variables
}
