/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import static java.lang.System.exit;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static main.Interactive.choice;
import static main.Interactive.k;
import static main.Interactive.m;
import static main.Interactive.x;
import static main.Interactive.y;

/**
 *
 * @author harsh
 */
class p {

    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    p(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class vis extends JPanel {

    public void paintComponent(Graphics g) {
//        System.out.println("I have Been Called");
        super.paintComponent(g);
        Graphics2D gg = (Graphics2D) g;
        if (Interactive.k.size() >= 2) {
            gg.drawLine((int) k.get(0).getX(), (int) k.get(0).getY(), (int) k.get(1).getX(), (int) k.get(1).getY());
        }

        gg.setStroke(new BasicStroke(3));
        if (Interactive.choice == 1 && Interactive.k.size() >= 2) {
//            System.out.println("lets have fun");
            int xx = Interactive.x;
            int yy = Interactive.y;
            gg.setColor(Color.green);
            gg.fillOval(xx - 8, yy - 8, 16, 16);

        }

    }

//        repaint();
}

public class Interactive extends javax.swing.JFrame implements Runnable {

    static ArrayList<p> k = new ArrayList<p>();
    static int choice = 0;
    static int x, y;
    static double m;
    static double angle;
    int length = 1;
    static ArrayList<p> hg = new ArrayList<p>();

    /**
     * Creates new form Interactive
     */
    @Override
    public void run() {
        initComponents();
//        System.out.println("I am running");
        int a = k.get(1).x;
        int b = k.get(1).y;
        int c = k.get(0).x;
        int d = k.get(0).y;
//        vis jPanel1;

        if (true) {
            choice = 1;

            for (p A : hg) {

//                System.out.println("I amin " + x + "  ; " + y);
//                System.out.println(this);
                repaint();

                length += 1;

                x = A.getX();
                y = A.getY();
                System.out.println("I amin " + x + "  ; " + y);

                try {
                    sleep((long) 80);
                } catch (InterruptedException ex) {
                    System.out.print("Fuckoff");
                    
                    return ;
                    
                }
            }
        }
    }

    /**
     *
     */
    /**
     *
     */
    public Interactive() {
        super();

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

        vis jPanel1;
        jPanel1 = new vis();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        p j;
        if (k.size() < 2) {
            j = new p(evt.getX(), evt.getY());
            System.out.println(j.getX() + " " + j.getY());
            k.add(j);
        }
        repaint();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1KeyReleased
    public Thread h = null;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        if (k.size() < 2) {
            return;
        }
        int a = k.get(1).x;
        int b = k.get(1).y;
        x = k.get(0).x;
        y = k.get(0).y;
        System.out.println("hii");
//        m = ((a - x) / (b - y));
//        angle = Math.atan(m);
//        length = 1;
        hg.add(new p(x, y));
        int dis = (a - x) * (a - x) + (b - y) * (b - y);
        dis = (int) Math.sqrt(dis);
        for (int i = 1; i < dis; i++) {
            int xa = ((dis - i) * x + (i) * a) / dis;
            int ya = ((dis - i) * y + (i) * b) / dis;
            hg.add(new p(xa, ya));
        }
        hg.add(new p(a, b));
        for(p A:hg)
            System.out.println(A.getX()+" "+A.getY());
//        length = (int) Math.round(Math.sqrt(x * x + y * y));
        h = new Thread(this);
//        h.join();
        System.out.println(jPanel1);

        h.start();

//        repaint();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
        if (h != null) {
            h.interrupt();
        }
        if (k.size() >= 2) {
            System.out.println("bye" + x + "   " + y + k.get(1).getX() + "   " + k.get(1).getY());
        }
//        h.interrupt();
        choice = 0;
        repaint();
    }//GEN-LAST:event_jPanel1MouseReleased

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
            java.util.logging.Logger.getLogger(Interactive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interactive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interactive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interactive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interactive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
