/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static main.OOM.*;

import javax.swing.JOptionPane;

/**
 *
 * @author harsh
 */
public class ModifyVertex extends javax.swing.JFrame {

    /**
     * Creates new form ModifyVertex
     */
    public ModifyVertex() {
        initComponents();
        String[] A = new String[OOM.G.getV().size()];
        for (int i = 0; i < OOM.G.getV().size(); i++) {
            A[i] = OOM.G.getV().get(i).getName();
        }

        Name.setModel(new javax.swing.DefaultComboBoxModel<>(A));

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
        VertexName = new javax.swing.JLabel();
        xcor = new javax.swing.JTextField();
        ycor = new javax.swing.JTextField();
        ModifyVertex = new javax.swing.JButton();
        XCOR = new javax.swing.JLabel();
        YCOR = new javax.swing.JLabel();
        Name = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modify  Vertex");

        VertexName.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        VertexName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VertexName.setText("Vertex Name");

        xcor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        xcor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        xcor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xcorActionPerformed(evt);
            }
        });

        ycor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        ycor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ycor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ycorActionPerformed(evt);
            }
        });

        ModifyVertex.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        ModifyVertex.setText("ModifyVertex");
        ModifyVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyVertexActionPerformed(evt);
            }
        });

        XCOR.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        XCOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XCOR.setText("New X Coordinate");

        YCOR.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        YCOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YCOR.setText("New Y Coordinate");

        Name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(XCOR, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(xcor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VertexName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(YCOR, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ycor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(ModifyVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VertexName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XCOR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xcor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YCOR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ycor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ModifyVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xcorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xcorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xcorActionPerformed

    private void ycorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ycorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ycorActionPerformed

    void checkVertex() throws Invalid {
        if (xcor.getText().isEmpty() || ycor.getText().isEmpty()) {
            throw new Invalid("Error");

        }
    }
    private void ModifyVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyVertexActionPerformed
        // TODO add your handling code here:
        String name;
        name = (String) Name.getSelectedItem();
        try {
            this.checkVertex();
            try {
                Vertex V = G.searchVertex(name);
                try {
                    V.setX(Integer.parseInt(xcor.getText()));
                    V.setY(Integer.parseInt(ycor.getText()));
                    JOptionPane.showMessageDialog(null, "Success");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Coordinates");
                } finally {
                    this.dispose();
                }
            } catch (Invalid e) {
                JOptionPane.showMessageDialog(null, "Please Select Valid Vertex");
            }
        } catch (Invalid e) {
            JOptionPane.showMessageDialog(null, "Please Enter All Fields");
        }


    }//GEN-LAST:event_ModifyVertexActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NameActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyVertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyVertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyVertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyVertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyVertex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModifyVertex;
    private javax.swing.JComboBox<String> Name;
    private javax.swing.JLabel VertexName;
    private javax.swing.JLabel XCOR;
    private javax.swing.JLabel YCOR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField xcor;
    private javax.swing.JTextField ycor;
    // End of variables declaration//GEN-END:variables
}
