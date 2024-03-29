/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final_programacion1_gabrielsussman;

import javax.swing.DefaultButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author Gabriel
 */
public class TicTacToe extends javax.swing.JFrame {
    
    int turno = 2;
    int botonUsado[] = {0, 0, 0, 0, 0, 0, 0, 0, 0,};

    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
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

        Bot1 = new javax.swing.JToggleButton();
        Bot2 = new javax.swing.JToggleButton();
        Bot4 = new javax.swing.JToggleButton();
        Bot3 = new javax.swing.JToggleButton();
        Bot5 = new javax.swing.JToggleButton();
        Bot6 = new javax.swing.JToggleButton();
        Bot7 = new javax.swing.JToggleButton();
        Bot8 = new javax.swing.JToggleButton();
        Bot9 = new javax.swing.JToggleButton();
        reiniciarJuego = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bot1.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        Bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot1ActionPerformed(evt);
            }
        });

        Bot2.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        Bot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot2ActionPerformed(evt);
            }
        });

        Bot4.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        Bot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot4ActionPerformed(evt);
            }
        });

        Bot3.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        Bot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot3ActionPerformed(evt);
            }
        });

        Bot5.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        Bot5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot5ActionPerformed(evt);
            }
        });

        Bot6.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        Bot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot6ActionPerformed(evt);
            }
        });

        Bot7.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        Bot7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot7ActionPerformed(evt);
            }
        });

        Bot8.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        Bot8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot8ActionPerformed(evt);
            }
        });

        Bot9.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        Bot9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot9ActionPerformed(evt);
            }
        });

        reiniciarJuego.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        reiniciarJuego.setText("JUGAR DENUEVO");
        reiniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bot1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bot2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bot3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bot6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reiniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Bot7, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bot8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bot9, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bot1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bot2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bot3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bot6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bot9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bot7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bot8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(reiniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean verificarVictoria() {

        //for (int i = 0; i < 3; i++) {
        if (Bot1.getText().equals(Bot2.getText()) && Bot2.getText().equals(Bot3.getText()) && !Bot1.getText().equals("")) {
            return true;
        }
        if (Bot4.getText().equals(Bot5.getText()) && Bot5.getText().equals(Bot6.getText()) && !Bot4.getText().equals("")) {
            return true;
        }
        if (Bot7.getText().equals(Bot8.getText()) && Bot8.getText().equals(Bot9.getText()) && !Bot7.getText().equals("")) {
            return true;
        }
        //contBotones += (Bot1.getText().length() > 0) ? 1 : 0;

        if (Bot1.getText().equals(Bot4.getText()) && Bot4.getText().equals(Bot7.getText()) && !Bot1.getText().equals("")) {
            return true;
        }
        if (Bot2.getText().equals(Bot5.getText()) && Bot5.getText().equals(Bot8.getText()) && !Bot2.getText().equals("")) {
            return true;
        }
        if (Bot3.getText().equals(Bot6.getText()) && Bot6.getText().equals(Bot9.getText()) && !Bot3.getText().equals("")) {
            return true;
        }
        //contBotones += (Bot3.getText().length() > 0) ? 1 : 0;
        //}

        if (Bot1.getText().equals(Bot5.getText()) && Bot5.getText().equals(Bot9.getText()) && !Bot1.getText().equals("")) {
            return true;
        }
        if (Bot3.getText().equals(Bot5.getText()) && Bot5.getText().equals(Bot7.getText()) && !Bot3.getText().equals("")) {
            return true;            
        }        
        
        return (false);
    }
    
    private boolean verificarEmpate() {
        int contBotones = 0;
        
        contBotones += (Bot1.getText().length() > 0) ? 1 : 0;
        contBotones += (Bot2.getText().length() > 0) ? 1 : 0;
        contBotones += (Bot3.getText().length() > 0) ? 1 : 0;
        contBotones += (Bot4.getText().length() > 0) ? 1 : 0;
        contBotones += (Bot5.getText().length() > 0) ? 1 : 0;
        contBotones += (Bot6.getText().length() > 0) ? 1 : 0;
        contBotones += (Bot7.getText().length() > 0) ? 1 : 0;
        contBotones += (Bot8.getText().length() > 0) ? 1 : 0;
        contBotones += (Bot9.getText().length() > 0) ? 1 : 0;
        
        return (contBotones == 9);
    }

    private void Bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot1ActionPerformed
        // TODO add your handling code here:
        if (botonUsado[0] == 0) {
            if (turno % 2 == 0) {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("X");
                botonUsado[0] = 1;
            } else {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("0");
                botonUsado[0] = 1;
            }
            
            if (verificarVictoria()) {
                JOptionPane.showMessageDialog(rootPane, "Jugador " + (turno % 2 + 1) + " gana!");
            } else if (verificarEmpate()) {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un empate!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ESA POSICION YA ESTA TOMADA ");
        }
        

    }//GEN-LAST:event_Bot1ActionPerformed

    private void Bot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot2ActionPerformed
        // TODO add your handling code here:
        if (botonUsado[1] == 0) {
            if (turno % 2 == 0) {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("X");
                botonUsado[1] = 1;
            } else {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("0");
                botonUsado[1] = 1;
            }
            
            if (verificarVictoria()) {
                JOptionPane.showMessageDialog(rootPane, "Jugador " + (turno % 2 + 1) + " gana!");
            } else if (verificarEmpate()) {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un empate!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ESA POSICION YA ESTA TOMADA ");
        }

    }//GEN-LAST:event_Bot2ActionPerformed

    private void Bot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot3ActionPerformed
        // TODO add your handling code here:
        if (botonUsado[2] == 0) {
            if (turno % 2 == 0) {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("X");
                botonUsado[2] = 1;
            } else {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("0");
                botonUsado[2] = 1;
            }
            
            if (verificarVictoria()) {
                JOptionPane.showMessageDialog(rootPane, "Jugador " + (turno % 2 + 1) + " gana!");
            } else if (verificarEmpate()) {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un empate!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ESA POSICION YA ESTA TOMADA ");
        }

    }//GEN-LAST:event_Bot3ActionPerformed

    private void Bot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot4ActionPerformed
        // TODO add your handling code here:
        if (botonUsado[3] == 0) {
            if (turno % 2 == 0) {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("X");
                botonUsado[3] = 1;
            } else {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("0");
                botonUsado[3] = 1;
            }
            
            if (verificarVictoria()) {
                JOptionPane.showMessageDialog(rootPane, "Jugador " + (turno % 2 + 1) + " gana!");
            } else if (verificarEmpate()) {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un empate!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ESA POSICION YA ESTA TOMADA ");
        }

    }//GEN-LAST:event_Bot4ActionPerformed

    private void Bot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot5ActionPerformed
        // TODO add your handling code here:
        if (botonUsado[4] == 0) {
            if (turno % 2 == 0) {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("X");
                botonUsado[4] = 1;
            } else {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("0");
                botonUsado[4] = 1;
            }
            
            if (verificarVictoria()) {
                JOptionPane.showMessageDialog(rootPane, "Jugador " + (turno % 2 + 1) + " gana!");
            } else if (verificarEmpate()) {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un empate!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ESA POSICION YA ESTA TOMADA ");
        }

    }//GEN-LAST:event_Bot5ActionPerformed

    private void Bot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot6ActionPerformed
        // TODO add your handling code here:
        if (botonUsado[5] == 0) {
            if (turno % 2 == 0) {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("X");
                botonUsado[5] = 1;
            } else {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("0");
                botonUsado[5] = 1;
            }
            
            if (verificarVictoria()) {
                JOptionPane.showMessageDialog(rootPane, "Jugador " + (turno % 2 + 1) + " gana!");
            } else if (verificarEmpate()) {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un empate!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ESA POSICION YA ESTA TOMADA ");
        }

    }//GEN-LAST:event_Bot6ActionPerformed

    private void Bot7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot7ActionPerformed
        // TODO add your handling code here:
        if (botonUsado[6] == 0) {
            if (turno % 2 == 0) {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("X");
                botonUsado[6] = 1;
            } else {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("0");
                botonUsado[6] = 1;
            }
            
            if (verificarVictoria()) {
                JOptionPane.showMessageDialog(rootPane, "Jugador " + (turno % 2 + 1) + " gana!");
            } else if (verificarEmpate()) {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un empate!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ESA POSICION YA ESTA TOMADA ");
        }

    }//GEN-LAST:event_Bot7ActionPerformed

    private void Bot8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot8ActionPerformed
        // TODO add your handling code here:
        if (botonUsado[7] == 0) {
            if (turno % 2 == 0) {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("X");
                botonUsado[7] = 1;
            } else {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("0");
                botonUsado[7] = 1;
            }
            
            if (verificarVictoria()) {
                JOptionPane.showMessageDialog(rootPane, "Jugador " + (turno % 2 + 1) + " gana!");
            } else if (verificarEmpate()) {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un empate!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ESA POSICION YA ESTA TOMADA ");
        }

    }//GEN-LAST:event_Bot8ActionPerformed

    private void Bot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot9ActionPerformed
        // TODO add your handling code here:
        if (botonUsado[8] == 0) {
            if (turno % 2 == 0) {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("X");
                botonUsado[8] = 1;
            } else {
                turno++;
                ((JToggleButton) (evt.getSource())).setText("0");
                botonUsado[8] = 1;
            }
            
            if (verificarVictoria()) {
                JOptionPane.showMessageDialog(rootPane, "Jugador " + (turno % 2 + 1) + " gana!");
            } else if (verificarEmpate()) {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un empate!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ESA POSICION YA ESTA TOMADA ");
        }

    }//GEN-LAST:event_Bot9ActionPerformed

    private void reiniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarJuegoActionPerformed
        // TODO add your handling code here:
        Bot1.setText("");
        Bot2.setText("");
        Bot3.setText("");
        Bot4.setText("");
        Bot5.setText("");
        Bot6.setText("");
        Bot7.setText("");
        Bot8.setText("");
        Bot9.setText("");
        
        Bot1.setSelected(false);
        Bot2.setSelected(false);
        Bot3.setSelected(false);
        Bot4.setSelected(false);
        Bot5.setSelected(false);
        Bot6.setSelected(false);
        Bot7.setSelected(false);
        Bot8.setSelected(false);
        Bot9.setSelected(false);
        
        for (int i = 0; i < botonUsado.length; i++) {
            botonUsado[i] = 0;
        }
        
        turno = 2;
        
        reiniciarJuego.setSelected(false);
    }//GEN-LAST:event_reiniciarJuegoActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Bot1;
    private javax.swing.JToggleButton Bot2;
    private javax.swing.JToggleButton Bot3;
    private javax.swing.JToggleButton Bot4;
    private javax.swing.JToggleButton Bot5;
    private javax.swing.JToggleButton Bot6;
    private javax.swing.JToggleButton Bot7;
    private javax.swing.JToggleButton Bot8;
    private javax.swing.JToggleButton Bot9;
    private javax.swing.JToggleButton reiniciarJuego;
    // End of variables declaration//GEN-END:variables
}
