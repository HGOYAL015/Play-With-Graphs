/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author harsh
 */
public class PrintPath extends javax.swing.JFrame {

    /**
     * Creates new form PrintPath
     */
    public PrintPath() {
        initComponents();
        String[] A = new String[OOM.G.getV().size()];
        for (int i = 0; i < OOM.G.getV().size(); i++) {
            A[i] = OOM.G.getV().get(i).getName();
        }
        fromVertex.setModel(new javax.swing.DefaultComboBoxModel<>(A));
        toVertex.setModel(new javax.swing.DefaultComboBoxModel<>(A));;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        VertexNameF = new javax.swing.JLabel();
        VertexNameT = new javax.swing.JLabel();
        fromVertex = new javax.swing.JComboBox<>();
        toVertex = new javax.swing.JComboBox<>();
        SearchEdge = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Path = new javax.swing.JTextArea();
        checkshort = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose Starting Vertex and Destination Vertex");

        VertexNameF.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        VertexNameF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VertexNameF.setText("FromVertex");

        VertexNameT.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        VertexNameT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VertexNameT.setText("ToVertex");

        fromVertex.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        fromVertex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FromVertex" }));

        toVertex.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        toVertex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "toVertex" }));

        SearchEdge.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        SearchEdge.setText("Print Path");
        SearchEdge.setToolTipText("");
        SearchEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEdgeActionPerformed(evt);
            }
        });

        Path.setColumns(20);
        Path.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        Path.setRows(5);
        jScrollPane1.setViewportView(Path);

        checkshort.setText("Only Shortest Path");
        checkshort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkshortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VertexNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(toVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VertexNameF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fromVertex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(SearchEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkshort)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VertexNameF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VertexNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkshort))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEdgeActionPerformed
        String from = (String) fromVertex.getSelectedItem();
        String to = (String) toVertex.getSelectedItem();

        try {
            if (checkshort.isSelected()) {
                OOM.G.printPath(from, to, 1);

            } else {
                OOM.G.printPath(from, to, 0);
            }
            File file = new File("/home/harsh/NetBeansProjects/OOM/src/main/Path");
            try {
                Scanner scan = new Scanner(file);
                String s = "";
                while (scan.hasNextLine()) {
                    s += scan.nextLine() + "\n";
                }
                Path.setText(s);
                Path.setEditable(false);

            } catch (FileNotFoundException ex) {
                System.out.println("Some Error Occured File Not Found");
                exit(0);
            }
        } catch (Invalid e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintPath.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchEdgeActionPerformed

    private void checkshortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkshortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkshortActionPerformed

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
            java.util.logging.Logger.getLogger(PrintPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintPath().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Path;
    private javax.swing.JButton SearchEdge;
    private javax.swing.JLabel VertexNameF;
    private javax.swing.JLabel VertexNameT;
    private javax.swing.JRadioButton checkshort;
    private javax.swing.JComboBox<String> fromVertex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> toVertex;
    // End of variables declaration//GEN-END:variables
}