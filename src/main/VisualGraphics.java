/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harsh
 */
class visual extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gg = (Graphics2D) g;
        for (Vertex A : OOM.G.getV()) {
            g.setColor(Color.black);
            g.fillOval(A.getX() - 12, A.getY() - 12, 24, 24);
        }
        for (Vertex A : OOM.G.getV()) {
            int x = A.getX();
            int y = A.getY();
            for (String B : OOM.G.getEdges().get(A.getName())) {
                int x1 = OOM.G.getVert().get(B).getX();
                int y1 = OOM.G.getVert().get(B).getY();
                g.setColor(Color.red);
//                if(OOM.G.getEdges().get(B).contains(A.getName()))
                g.drawLine(x, y, x1, y1);

//                int dx = x1 - x, dy = y1 - y;
//                double d = 6.5;
//                double h=6.5;
//                int a=(x+x1)/2;
//                int b=(y+y1)/2;
//                double D = Math.sqrt(dx * dx + dy * dy);
//                double xm = D - d, xn = xm, ym = h, yn = -h, xx;
//                double sin = dy / D, cos = dx / D;
//
//                xx = xm * cos - ym * sin + x;
//                ym = xm * sin + ym * cos + y;
//                xm = xx;
//
//                xx = xn * cos - yn * sin + x;
//                yn = xn * sin + yn * cos + y;
//                xn = xx;
//
//                int[] xpoints = {a, (int) xm, (int) xn};
//                int[] ypoints = {b, (int) ym, (int) yn};
//                g.setColor(Color.green);
//                g.fillPolygon(xpoints, ypoints, 3);
            }
        }
        g.setColor(Color.red);
        if (VisualGraphics.From != null) {
            if (VisualGraphics.choice == 1) {
                g.drawOval(VisualGraphics.From.getX() - 15, VisualGraphics.From.getY() - 15, 30, 30);
            }
            if (VisualGraphics.choice == 2) {
                g.setColor(Color.BLUE);
                g.drawOval(VisualGraphics.From.getX() - 15, VisualGraphics.From.getY() - 15, 30, 30);
            }
        }
    }
}

public class VisualGraphics extends javax.swing.JFrame {

    /**
     * Creates new form VisualGraphics
     */
    static int choice = 1;
    static Vertex From = null;
    static Vertex To = null;

    public VisualGraphics() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visual GraphPanel;
        GraphPanel = new visual();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        GraphPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GraphPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                GraphPanelMouseDragged(evt);
            }
        });
        GraphPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GraphPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GraphPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GraphPanelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout GraphPanelLayout = new javax.swing.GroupLayout(GraphPanel);
        GraphPanel.setLayout(GraphPanelLayout);
        GraphPanelLayout.setHorizontalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        GraphPanelLayout.setVerticalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GraphPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphPanelMouseClicked
        // TODO add your handling code here:
        if (choice == 0) { //AddVertex
            int x = evt.getX();

            int y = evt.getY();
            String s = "V" + Integer.toString(OOM.G.getV().size());

            Vertex V1 = new Vertex(s, x, y);
            try {
                OOM.G.searchVertex(V1);
                OOM.G.addVertex(V1);
                repaint();
            } catch (Invalid ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        } else if (choice == 1) { //AddEdge
            System.out.println("IN Add Edge");
            Vertex V1 = new Vertex("X", evt.getX(), evt.getY());
            try {
                V1 = OOM.G.searchVertex(V1.getX(), V1.getY());
                if (From != null) {
                    int h = From.getX() - V1.getX() * From.getX() - V1.getX();
                    h = h + From.getY() - V1.getY() * From.getY() - V1.getY();
                    OOM.G.checkEdge(From.getName(), V1.getName());

                    String f = JOptionPane.showInputDialog("Please Provide The Weight for this edge");
                    try {
                        double w = Double.parseDouble(f);
                        OOM.G.addEdge(From.getName(), V1.getName(), w);
                        From = null;
                    } catch (Exception e) {

                    }

                } else {
                    From = V1;
                }
                System.out.println(From + " " + V1);
                repaint();
            } catch (Invalid e) {
                From = null;
                repaint();

            }
        }

    }//GEN-LAST:event_GraphPanelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        repaint();
    }//GEN-LAST:event_formWindowOpened

    private void GraphPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphPanelMouseDragged
        // TODO add your handling code here:
        if (choice == 2) {
            Vertex V1 = new Vertex("X", evt.getX(), evt.getY());
            try {
                OOM.G.searchVertex(V1.getX(), V1.getY());
                From = null;
            } catch (Invalid e) {
                From = V1;
                if (To == null) {
                    From = null;
                }
            }

            repaint();
        }
    }//GEN-LAST:event_GraphPanelMouseDragged

    private void GraphPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphPanelMouseReleased
        // TODO add your handling code here:
        if (choice == 2) {
            Vertex V1 = new Vertex("X", evt.getX(), evt.getY());
            try {
                OOM.G.searchVertex(V1.getX(), V1.getY());
                repaint();
            } catch (Invalid e) {
                if (To == null) {
                    From = null;
                    repaint();
                } else {
                    OOM.G.getVert().get(To.getName()).setX(V1.getX());
                    OOM.G.getVert().get(To.getName()).setY(V1.getY());
                    From = null;
                    repaint();
                }
            }
        }
    }//GEN-LAST:event_GraphPanelMouseReleased

    private void GraphPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphPanelMousePressed
        // TODO add your handling code here:
        if (choice == 2) {
            Vertex V1 = new Vertex("X", evt.getX(), evt.getY());
            try {
                V1 = OOM.G.searchVertex(V1.getX(), V1.getY());
                To = V1;
            } catch (Invalid e) {
                To = null;
            }
        }
    }//GEN-LAST:event_GraphPanelMousePressed

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
            java.util.logging.Logger.getLogger(VisualGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualGraphics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
