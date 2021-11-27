
package ex_pf_1_tetris_draw;

import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo6_1 extends javax.swing.JFrame {

    private static final int UPDATE_PERIOD = 50; // milliseconds
    
    public Ejemplo6_1() {
        
      initComponents();
      this.setBounds(0, 0, 640, 480);
      this.setLocationRelativeTo(null);
      canvas = new DrawCanvas();
      canvas.setPreferredSize(new Dimension(640, 480));
      this.setContentPane(canvas);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.pack();
      this.setTitle("Bouncing Ball");
      this.setVisible(true);
        // Allocate a Timer to run updateTask's actionPerformed() after every delay msec
      new Timer(UPDATE_PERIOD, updateTask).start();
    }
    
   private DrawCanvas canvas;
   
   private int x = 100, y = 100;  // top-left (x, y)
   private int size = 250;        // width and height
   private int xSpeed = 3, ySpeed = 5; // displacement per step in x, y

       ActionListener updateTask = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            update();   // update the (x, y) position
            repaint();  // Refresh the JFrame, callback paintComponent()
         }
      };
    

   public void update() {
      x += xSpeed;
      y += ySpeed;
      if (x > 640 - size || x < 0) {
         xSpeed = -xSpeed;
      }
      if (y > 480 - size || y < 0) {
         ySpeed = -ySpeed;
      }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ejemplo6_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejemplo6_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejemplo6_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejemplo6_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo6_1().setVisible(true);
            }
        });
    }

     private class DrawCanvas extends JPanel {
      @Override
      public void paintComponent(Graphics g) {
         super.paintComponent(g);  // paint parent's background
         setBackground(Color.BLACK);
         g.setColor(Color.BLUE);
         g.fillOval(x, y, size, size);  // draw a circle
      }
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
