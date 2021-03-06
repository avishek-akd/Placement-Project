/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_project;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static placement_project.Add_Student_Details.con;
import static placement_project.Login.pst;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Avishek
 */
public class Student_Details extends javax.swing.JFrame {

    /**
     * Creates new form Student_Details
     */
    static Connection con = null;
    static PreparedStatement pst = null;
    ImageIcon img = new ImageIcon("/Debian/PROJECTS/NETBEANS/placement_project/src/placement_project/1.jpg");

    public Student_Details() {
        initComponents();
        con = Connection_Provider.getOracleConnection();
        getContentPane().setBackground(Color.PINK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Student");
        setIconImage(img.getImage());
        setLocation(new java.awt.Point(480, 220));
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("BRANCH :-");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "branch", "CSE", "ME", "EE", "CIVIL", "IT", "I&E", "FT" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addGap(62, 62, 62)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("BRANCH WISE", jPanel1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("REGD. NO :-");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton2)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("STUDENT WISE", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String selected_branch = jComboBox1.getSelectedItem().toString();
        String[] columnNames = {"REGD_NO", "NAME", "GENDER", "BATCH", "BRANCH", "DOB", "10th %", "12th %", "CGPA", "BACKLOGS", "EMAIL", "MOB"};

        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setTitle("Student Details Of:-"+"\t"+selected_branch+"-:Branch");
        frame1.setIconImage(img.getImage());

        JButton button = new JButton("SAVE AS PDF");
        button.setFont(new Font("Tahoma", Font.BOLD, 14));
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.GREEN);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        JTable table = new JTable() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        table.setForeground(Color.red);
        //table.setSelectionBackground(Color.green);

        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        int regd;
        String name = "";
        String gender = "";
        int batch;
        String branch = "";
        String dob = "";
        float ten ;
        float twelve ;
        float cgpa;
        int back ;
        String email = "";
        Long mob ;

        try {
            pst = con.prepareStatement("select * from placement where branch=?");
            pst.setString(1, selected_branch);
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) {
                regd = rs.getInt(1);
                name = rs.getString(2);
                gender = rs.getString(3);
                batch = rs.getInt(4);
                branch = rs.getString(5);
                Format formatter = new SimpleDateFormat("dd-MM-yyyy");
                String s = formatter.format(rs.getDate(6)); 
                dob = s;
                ten = rs.getFloat(7);
                twelve = rs.getFloat(8);
                cgpa = rs.getFloat(9);
                back = rs.getInt(10);
                email = rs.getString(11);
                mob = rs.getLong(12);

                model.addRow(new Object[]{regd, name, gender, batch, branch, dob, ten, twelve, cgpa, back, email, mob});
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Student Details", JOptionPane.ERROR_MESSAGE);

            } else {
                ActionListener printAction = new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            int count=table.getRowCount();
                            Document document=new Document();
                            PdfWriter.getInstance(document,new FileOutputStream("/Debian/PROJECTS/NETBEANS/placement_project/pdf/Branch_Wise/data.pdf"));
                            document.open();
                            PdfPTable tab=new PdfPTable(12);
                            tab.addCell("REGD_NO");
                            tab.addCell("NAME");
                            tab.addCell("GENDER");
                            tab.addCell("BATCH");
                            tab.addCell("BRANCH");
                            tab.addCell("DOB");
                            tab.addCell("10th");
                            tab.addCell("12th");
                            tab.addCell("CGPA");
                            tab.addCell("BACKLOGS");
                            tab.addCell("EMAIL");
                            tab.addCell("MOB");   
                            System.out.println("");
                            for(int i=0;i<count;i++){
                            Object obj1 = GetData(table, i, 0);
                            Object obj2 = GetData(table, i, 1);
                            Object obj3 = GetData(table, i, 2);
                            Object obj4 = GetData(table, i, 3);
                            Object obj5 = GetData(table, i, 4);
                            Object obj6 = GetData(table, i, 5);
                            Object obj7 = GetData(table, i, 6);
                            Object obj8 = GetData(table, i, 7);
                            Object obj9 = GetData(table, i, 8);
                            Object obj10 = GetData(table, i, 9);
                            Object obj11 = GetData(table, i, 10);
                            Object obj12 = GetData(table, i, 11);
                            
                            String value1=obj1.toString();
                            String value2=obj2.toString();
                            String value3=obj3.toString();
                            String value4=obj4.toString();
                            String value5=obj5.toString();
                            String value6=obj6.toString();
                            String value7=obj7.toString();
                            String value8=obj8.toString();
                            String value9=obj9.toString();
                            String value10=obj10.toString();
                            String value11=obj11.toString();
                            String value12=obj12.toString();

                            tab.addCell(value1);
                            tab.addCell(value2);
                            tab.addCell(value3);
                            tab.addCell(value4);
                            tab.addCell(value5);
                            tab.addCell(value6);
                            tab.addCell(value7);
                            tab.addCell(value8);
                            tab.addCell(value9);
                            tab.addCell(value10);
                            tab.addCell(value11);
                            tab.addCell(value12);
        
                            }
                            document.add(tab);
                            
                            document.close();
                            JOptionPane.showMessageDialog(rootPane, "Saved As Pdf", "Student_Details", JOptionPane.INFORMATION_MESSAGE);
                        
                        } catch (Exception pe) {
                            System.err.println("Error printing: " + pe.getMessage());
                        }
                    }
                };
                button.addActionListener(printAction);

                frame1.setIconImage(img.getImage());
                frame1.add(scroll, BorderLayout.CENTER);
                frame1.add(button, BorderLayout.NORTH);
                // frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame1.setSize(1280, 750);
                frame1.setResizable(false);
                frame1.setVisible(true);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public Object GetData(JTable table, int row_index, int col_index){
return table.getModel().getValueAt(row_index, col_index);
}
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String selected_regd = jTextField1.getText();
        
        int count = 0;
        String sql = "select * from placement where regd_no=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, selected_regd);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                count++;
            }
            
            if (count == 0) {
                JOptionPane.showMessageDialog(rootPane, "Enter Valid Regd No...", "Student Details", JOptionPane.ERROR_MESSAGE);
            }
            else {
            Student_Wise_Details swd = new Student_Wise_Details(selected_regd);
            swd.setVisible(true);
        }
            
        }
        catch(Exception e)
        {
            
        }

        
        
        
        
        
        
        
        
        
        
        


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char vChar = evt.getKeyChar(); 
        if (!(Character.isDigit(vChar) 
                || (vChar == KeyEvent.VK_BACK_SPACE) 
                || (vChar == KeyEvent.VK_DELETE))) 
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
