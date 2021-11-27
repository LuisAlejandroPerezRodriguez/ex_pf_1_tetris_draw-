
package ex_pf_1_tetris_draw;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;    

public class Ejemplo4modi extends javax.swing.JFrame {

   public static final Color LINE_COLOR = Color.BLACK;
   private double radio=23.0;
   private double diametro;
   
    public Ejemplo4modi() {
        initComponents();
        
        //parametros del frame 
        this.setBounds(0, 0, 400, 140);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.CYAN);
        
      //parametros del nuevo panel
      canvas = new DrawCanvas();
      canvas.setPreferredSize(new Dimension(400, 140));

      // Set up a panel for the buttons
      JPanel btnPanel = new JPanel(new FlowLayout());
      JButton btnLeft = new JButton("Move Left ");
      btnPanel.add(btnLeft);
      btnLeft.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            x1 -= 10;
            x2 -= 10;
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });
      JButton btnRight = new JButton("Move Right");
      btnPanel.add(btnRight);
      btnRight.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            x1 += 10;
            x2 += 10;
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });
      JButton btnUp = new JButton("Move Up");
      btnPanel.add(btnUp);
      btnUp.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            y1 -= 10;
            y2 -= 10;
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });
      JButton btnDown = new JButton("Move Down");
      btnPanel.add(btnDown);
      btnDown.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            y1 += 10;
            y2 += 10;
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });
      
      //agregando el nuevo panel
      Container cp = getContentPane();
      cp.setLayout(new BorderLayout());
      cp.add(canvas, BorderLayout.CENTER);
      cp.add(btnPanel, BorderLayout.SOUTH);
   
    }
    
    
   private int x1 = 400 / 2;
   private int y1 = 140 / 8;
   private int x2 = x1;
   private int y2 = 140 / 8 * 7;
   
   private DrawCanvas canvas;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch(evt.getKeyCode()) {
               case KeyEvent.VK_LEFT:
                  x1 -= 10;
                  x2 -= 10;
                  repaint();
                  break;
               case KeyEvent.VK_RIGHT:
                  x1 += 10;
                  x2 += 10;
                  repaint();
                  break;
               case KeyEvent.VK_UP:
               y1-=10;
               y2 -= 10;
               repaint();
               break;
               case KeyEvent.VK_DOWN:
               y1+=10;
               y2 += 10;
               repaint();
               break;
                  
            }
         
    }//GEN-LAST:event_formKeyPressed
 
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
            java.util.logging.Logger.getLogger(Ejemplo4modi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejemplo4modi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejemplo4modi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejemplo4modi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo4modi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

  class DrawCanvas extends JPanel {
      @Override
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         setBackground(Color.CYAN);
         Graphics2D circulo=(Graphics2D)g;
         circulo.setStroke(new BasicStroke(10.f));
         circulo.setPaint(Color.RED);
         diametro=(radio*2);
         circulo.fillOval(x1, y1, (int) diametro,(int)diametro);

      }
   }

 

}
