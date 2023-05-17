/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login_Form;

import com.chessgame.Frame.Frame;
import com.chessgame.Frame.LabelTimer;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author ahmed
 */
public class SetUp extends javax.swing.JFrame {
    public static Player player1;
    public static Player player2;
    String soundEffect = "MenuSoundEffect.wav";
    Music music = new Music();
    /**
     * Creates new form SetUp
     */
    public SetUp() {
        initComponents();
        setIconImage();
        addPlaceHolder(Player1Name_textfield);
        addPlaceHolder(Player2Name_textfield);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Player1Name_textfield = new javax.swing.JTextField();
        Player2Name_textfield = new javax.swing.JTextField();
        minutes_textfield = new javax.swing.JTextField();
        seconds_textfield = new javax.swing.JTextField();
        EnterGame_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multiverse Of Chess");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Player1Name_textfield.setFont(new java.awt.Font("Papyrus", 2, 36)); // NOI18N
        Player1Name_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Player1Name_textfield.setText("Player1_Name");
        Player1Name_textfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Player1Name_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Player1Name_textfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Player1Name_textfieldFocusLost(evt);
            }
        });
        getContentPane().add(Player1Name_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 340, 150));

        Player2Name_textfield.setBackground(new java.awt.Color(0, 0, 0));
        Player2Name_textfield.setFont(new java.awt.Font("Papyrus", 2, 36)); // NOI18N
        Player2Name_textfield.setForeground(new java.awt.Color(255, 255, 255));
        Player2Name_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Player2Name_textfield.setText("Player2_Name");
        Player2Name_textfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Player2Name_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Player2Name_textfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Player2Name_textfieldFocusLost(evt);
            }
        });
        Player2Name_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player2Name_textfieldActionPerformed(evt);
            }
        });
        getContentPane().add(Player2Name_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 340, 150));

        minutes_textfield.setFont(new java.awt.Font("Papyrus", 2, 24)); // NOI18N
        minutes_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minutes_textfield.setText("Minutes");
        minutes_textfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        minutes_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutes_textfieldActionPerformed(evt);
            }
        });
        minutes_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minutes_textfieldKeyTyped(evt);
            }
        });
        minutes_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                minutes_textfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                minutes_textfieldFocusLost(evt);
            }
        });
        getContentPane().add(minutes_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 160, 80));

        seconds_textfield.setFont(new java.awt.Font("Papyrus", 2, 24)); // NOI18N
        seconds_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seconds_textfield.setText("Seconds");
        seconds_textfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        seconds_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                seconds_textfieldKeyTyped(evt);
            }
        });
        seconds_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                seconds_textfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                seconds_textfieldFocusLost(evt);
            }
        });
        getContentPane().add(seconds_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 160, 80));

        EnterGame_button.setBackground(new java.awt.Color(0, 0, 0));
        EnterGame_button.setFont(new java.awt.Font("Papyrus", 2, 36)); // NOI18N
        EnterGame_button.setForeground(new java.awt.Color(255, 255, 255));
        EnterGame_button.setText("Enter");
        EnterGame_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        EnterGame_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterGame_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(EnterGame_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 340, 90));

        jLabel4.setFont(new java.awt.Font("Papyrus", 2, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Your Name ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 77)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Multiverse Of Chess");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 770, 110));

        jLabel3.setFont(new java.awt.Font("Papyrus", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Set Timer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 390, 100));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Papyrus", 2, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 140, 60));
        if (Login.theme)
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Form/theme/Monkey Playing Chess.jpg"))); // NOI18N
        else
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Form/PlayerMenuuu (1).jpg"))); // NOI18N

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(1460, 810));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1210, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minutes_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutes_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutes_textfieldActionPerformed

    private void Player2Name_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player2Name_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Player2Name_textfieldActionPerformed

    private void EnterGame_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterGame_buttonActionPerformed
                player1 = new Player(Player1Name_textfield.getText(), minutes_textfield.getText(), seconds_textfield.getText());
        player2 = new Player(Player2Name_textfield.getText(), minutes_textfield.getText(), seconds_textfield.getText());

        String CurrentContinueFilePath = String.format("Continue/%s.txt", Login.usernamex);
        File file1 = new File(CurrentContinueFilePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file1))) {
            writer.write("");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        String DeadPiecesFilePath = String.format("DeadPieces/%s.txt", Login.usernamex);
        File file2 = new File(DeadPiecesFilePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            writer.write("");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        Frame.label1 = new LabelTimer(Player.minute,Player.second);
        Frame.label2 = new LabelTimer(Player.minute,Player.second);
        this.dispose();
        Frame frame = new Frame();
    }//GEN-LAST:event_EnterGame_buttonActionPerformed

    private void minutes_textfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minutes_textfieldKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }     
    }//GEN-LAST:event_minutes_textfieldKeyTyped

    private void seconds_textfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seconds_textfieldKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_seconds_textfieldKeyTyped

    public static void addPlaceHolder (JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    public static void removePlaceHolder (JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.red);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        music.PlaySoundEffect(soundEffect);
        this.dispose();
        MainMenu mainmenu = new MainMenu();
        mainmenu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void Player1Name_textfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Player1Name_textfieldFocusGained
        if(Player1Name_textfield.getText().equals("Player1_Name")){
            Player1Name_textfield.setText(null);
            Player1Name_textfield.requestFocus();
            removePlaceHolder(Player1Name_textfield);
        }
    }//GEN-LAST:event_Player1Name_textfieldFocusGained

    private void Player2Name_textfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Player2Name_textfieldFocusGained
        if(Player2Name_textfield.getText().equals("Player2_Name")){
            Player2Name_textfield.setText(null);
            Player2Name_textfield.requestFocus();
            removePlaceHolder(Player2Name_textfield);
        }
    }//GEN-LAST:event_Player2Name_textfieldFocusGained

    private void Player1Name_textfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Player1Name_textfieldFocusLost
        if(Player1Name_textfield.getText().length()==0){
            addPlaceHolder(Player1Name_textfield);
            Player1Name_textfield.setText("Player1_Name");
        }
    }//GEN-LAST:event_Player1Name_textfieldFocusLost
    private void minutes_textfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Player2Name_textfieldFocusGained
        if(minutes_textfield.getText().equals("Minutes")){
            minutes_textfield.setText(null);
            minutes_textfield.requestFocus();
            removePlaceHolder(minutes_textfield);
        }
    }//GEN-LAST:event_Player2Name_textfieldFocusGained

    private void minutes_textfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Player1Name_textfieldFocusLost
        if(minutes_textfield.getText().length()==0){
            addPlaceHolder(minutes_textfield);
            minutes_textfield.setText("Minutes");
        }
    }//GEN-LAST:even
    private void seconds_textfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Player2Name_textfieldFocusGained
        if(seconds_textfield.getText().equals("Seconds")){
            seconds_textfield.setText(null);
            seconds_textfield.requestFocus();
            removePlaceHolder(seconds_textfield);
        }
    }//GEN-LAST:event_Player2Name_textfieldFocusGained

    private void seconds_textfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Player1Name_textfieldFocusLost
        if(seconds_textfield.getText().length()==0){
            addPlaceHolder(seconds_textfield);
            seconds_textfield.setText("Seconds");
        }
    }//GEN-LAST:e

    private void Player2Name_textfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Player2Name_textfieldFocusLost

        if(Player2Name_textfield.getText().length()==0){
            addPlaceHolder(Player2Name_textfield);
            Player2Name_textfield.setText("Player2_Name");

        }
    }
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
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnterGame_button;
    private javax.swing.JTextField Player1Name_textfield;
    private javax.swing.JTextField Player2Name_textfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField minutes_textfield;
    private javax.swing.JTextField seconds_textfield;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8-chess-64 (1).png")));
    }
}
