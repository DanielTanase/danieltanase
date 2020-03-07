/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author JAMAL
 */
public class SchimbareParolaFrame extends javax.swing.JFrame {
    int xMouse, yMouse;
    
    Connection conn = null;
    PreparedStatement pst = null;
    
    /**
     * Creates new form SchimbareParolaFrame
     */
    
    //afisare date utilizator logat din bara de sus
    public SchimbareParolaFrame() {
        initComponents();
        
        try {
            mesajUser.setText(LoginFrame.getInfo().getString("Nume")+ " " + LoginFrame.getInfo().getString("Prenume"));
        } catch (SQLException ex) {
            Logger.getLogger(MenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        settings3 = new javax.swing.JLabel();
        logOut3 = new javax.swing.JLabel();
        back3 = new javax.swing.JLabel();
        home3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();
        mesajUser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        parolaNoua2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        parolaVeche = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        parolaNoua = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        settings3.setIcon(new javax.swing.ImageIcon("C:\\Users\\JAMAL\\Downloads\\icons8-user-settings-50.png")); // NOI18N
        settings3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settings3MouseClicked(evt);
            }
        });

        logOut3.setIcon(new javax.swing.ImageIcon("C:\\Users\\JAMAL\\Downloads\\Change User-50-50px\\icons8-change-user-50-2.png")); // NOI18N
        logOut3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOut3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOut3MouseClicked(evt);
            }
        });

        back3.setIcon(new javax.swing.ImageIcon("C:\\Users\\JAMAL\\Downloads\\Back-24-50px\\icons8-back-50.png")); // NOI18N
        back3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back3MouseClicked(evt);
            }
        });

        home3.setIcon(new javax.swing.ImageIcon("C:\\Users\\JAMAL\\Downloads\\icons8-home-50.png")); // NOI18N
        home3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settings3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(home3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(logOut3)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home3)
                .addGap(18, 18, 18)
                .addComponent(back3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(settings3)
                .addGap(79, 79, 79))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(332, Short.MAX_VALUE)
                    .addComponent(logOut3)
                    .addGap(21, 21, 21)))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Setari cont");

        Minimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Minimize.setText("-");
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\JAMAL\\Downloads\\icons8-user-30.png")); // NOI18N
        Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconMouseClicked(evt);
            }
        });

        mesajUser.setText("User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(Icon)
                .addGap(2, 2, 2)
                .addComponent(mesajUser, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Minimize)
                .addGap(18, 18, 18)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mesajUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Icon)))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );

        parolaNoua2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        parolaNoua2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        parolaNoua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parolaNoua2ActionPerformed(evt);
            }
        });
        parolaNoua2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                parolaNoua2KeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Parola veche");

        parolaVeche.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        parolaVeche.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        parolaVeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parolaVecheActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Parola noua");

        parolaNoua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        parolaNoua.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        parolaNoua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parolaNouaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Rescrie parola noua");

        jButton1.setText("Schimbare parola");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parolaVeche, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parolaNoua, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parolaNoua2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parolaVeche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parolaNoua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parolaNoua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(86, 86, 86)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settings3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settings3MouseClicked
        UserFrame uf = new UserFrame();
        uf.setVisible(true);
        uf.pack();
        uf.setLocationRelativeTo(null);
        uf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_settings3MouseClicked

    private void logOut3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut3MouseClicked
        LoginFrame lgf = new LoginFrame();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logOut3MouseClicked

    private void back3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back3MouseClicked
        UserFrame uf = new UserFrame();
        uf.setVisible(true);
        uf.pack();
        uf.setLocationRelativeTo(null);
        uf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_back3MouseClicked

    private void home3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home3MouseClicked
        MenuFrame mf = new MenuFrame();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_home3MouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMouseClicked

    }//GEN-LAST:event_IconMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void parolaNoua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parolaNoua2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parolaNoua2ActionPerformed

    private void parolaVecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parolaVecheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parolaVecheActionPerformed

    private void parolaNouaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parolaNouaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parolaNouaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //verificare conditii campuri, iar daca totul este ok
        //schimbarea parolei
        if( !parolaNoua.getText().equals(parolaNoua2.getText()) ){
            JOptionPane.showMessageDialog(null, "Parola noua trebuie sa fie aceeasi in ambele campuri");
        }
        else if( parolaVeche.getText().length() == 0 || parolaNoua.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Completati toate campurile");
        }
        if( parolaNoua.getText().equals(parolaNoua2.getText()) && parolaVeche.getText().length() != 0  && parolaNoua.getText().length() != 0){
        conn = MySqlConnect.ConnectDB();
        String Sql = "Update utilizator Set `Parola` = ? Where `Utilizator ID` = ? and `Parola` = ?;";
        try{
            pst = conn.prepareStatement(Sql);
            pst.setString(1,parolaNoua.getText());
            pst.setString(2,LoginFrame.getInfo().getString("Utilizator ID"));
            pst.setString(3,parolaVeche.getText());
            int i = pst.executeUpdate();
            if(i != 0){
                JOptionPane.showMessageDialog(null,"Schimabre reusita");
            }
            else{
                JOptionPane.showMessageDialog(null, "Schimbare nereusita", "Access Denied", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Parola veche nu a fost introdusa corect");
        }
    }
    }//GEN-LAST:event_jButton1MouseClicked

    private void parolaNoua2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parolaNoua2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            jButton1.doClick();
    }//GEN-LAST:event_parolaNoua2KeyPressed

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
            java.util.logging.Logger.getLogger(SchimbareParolaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchimbareParolaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchimbareParolaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchimbareParolaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchimbareParolaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel back3;
    private javax.swing.JLabel home3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logOut3;
    private javax.swing.JLabel mesajUser;
    private javax.swing.JTextField parolaNoua;
    private javax.swing.JTextField parolaNoua2;
    private javax.swing.JTextField parolaVeche;
    private javax.swing.JLabel settings3;
    // End of variables declaration//GEN-END:variables
}
