import Project.InsertUpdateDelete;
import Project.Select;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABEL
 */
public class ForgotPass extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPass
     */
    public ForgotPass() {
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

        Username = new javax.swing.JTextField();
        answerQuestion = new javax.swing.JTextField();
        BackToSignUp = new javax.swing.JLabel();
        BackToLogin = new javax.swing.JLabel();
        NewPass = new javax.swing.JPasswordField();
        SaveButton = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setBackground(new java.awt.Color(242, 218, 218));
        Username.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Username.setBorder(null);
        Username.setPreferredSize(new java.awt.Dimension(59, 21));
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 372, 450, 30));

        answerQuestion.setBackground(new java.awt.Color(242, 218, 218));
        answerQuestion.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        answerQuestion.setBorder(null);
        answerQuestion.setPreferredSize(new java.awt.Dimension(59, 21));
        answerQuestion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                answerQuestionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                answerQuestionFocusLost(evt);
            }
        });
        answerQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(answerQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 452, 450, 30));

        BackToSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Back to Sign Up Forgot Password.png"))); // NOI18N
        BackToSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackToSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackToSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackToSignUpMouseExited(evt);
            }
        });
        getContentPane().add(BackToSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 700, 120, 20));

        BackToLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Back to Login.png"))); // NOI18N
        BackToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackToLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackToLoginMouseExited(evt);
            }
        });
        getContentPane().add(BackToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 700, 120, 20));

        NewPass.setBackground(new java.awt.Color(242, 218, 218));
        NewPass.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        NewPass.setBorder(null);
        NewPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NewPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NewPassFocusLost(evt);
            }
        });
        getContentPane().add(NewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 535, 450, 30));

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Save Button.png"))); // NOI18N
        SaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveButtonMouseExited(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 610, 130, 40));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Back Button.png"))); // NOI18N
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Forgot Password Background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        // TODO add your handling code here:
        String UsernameValue = Username.getText();

        if(UsernameValue.trim().toLowerCase().equals(("username"))){
            Username.setText("");
            Username.setForeground(Color.black);
        }
    }//GEN-LAST:event_UsernameFocusGained

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        // TODO add your handling code here:
        String UsernameValue = Username.getText();

        if(UsernameValue.trim().toLowerCase().equals(("Username"))||UsernameValue.trim().toLowerCase().equals("")){
            Username.setText("Username");
            Username.setForeground(new Color(153,153,153));
        }
        Username.setBorder(null);
    }//GEN-LAST:event_UsernameFocusLost

    private void answerQuestionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerQuestionFocusGained
        // TODO add your handling code here:
        String answer = answerQuestion.getText();

        if(answer.trim().toLowerCase().equals(("answer"))){
            answerQuestion.setText("");
            answerQuestion.setForeground(Color.black);
        }
    }//GEN-LAST:event_answerQuestionFocusGained

    private void answerQuestionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerQuestionFocusLost
        // TODO add your handling code here:
        String answer = answerQuestion.getText();

        if(answer.trim().toLowerCase().equals(("Answer"))||answer.trim().toLowerCase().equals("")){
            answerQuestion.setText("Answer");
            answerQuestion.setForeground(new Color(153,153,153));
        }
        answerQuestion.setBorder(null);
    }//GEN-LAST:event_answerQuestionFocusLost

    private void answerQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerQuestionActionPerformed

    private void BackToSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToSignUpMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(219,123,93));
        BackToSignUp.setBorder(IconBorder);
        BackToSignUp.setForeground(new Color(219,123,93));
    }//GEN-LAST:event_BackToSignUpMouseEntered

    private void BackToSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToSignUpMouseClicked
        // TODO add your handling code here:
        dispose();
        SignUp Signup = new SignUp();
        Signup.setLocationRelativeTo(null);
        Signup.setVisible(true);
    }//GEN-LAST:event_BackToSignUpMouseClicked

    private void BackToSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToSignUpMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        BackToSignUp.setBorder(IconBorder);
        BackToSignUp.setForeground(Color.white);
    }//GEN-LAST:event_BackToSignUpMouseExited

    private void BackToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToLoginMouseClicked
        // TODO add your handling code here:
        dispose();
        LoginPage Login = new LoginPage();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
    }//GEN-LAST:event_BackToLoginMouseClicked

    private void BackToLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToLoginMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(219,123,93));
        BackToLogin.setBorder(IconBorder);
        BackToLogin.setForeground(new Color(219,123,93));
    }//GEN-LAST:event_BackToLoginMouseEntered

    private void BackToLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToLoginMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        BackToLogin.setBorder(IconBorder);
        BackToLogin.setForeground(Color.white);
    }//GEN-LAST:event_BackToLoginMouseExited

    private void NewPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewPassFocusGained
        // TODO add your handling code here:
        String passwordValue = String.valueOf(NewPass.getPassword());

        if(passwordValue.trim().toLowerCase().equals(("password"))){
            NewPass.setText("");
            NewPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_NewPassFocusGained

    private void NewPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewPassFocusLost
        // TODO add your handling code here:
        String passwordValue = String.valueOf(NewPass.getPassword());

        if(passwordValue.trim().toLowerCase().equals(("password"))||passwordValue.trim().toLowerCase().equals("")){
            NewPass.setText("Password");
            NewPass.setForeground(new Color(153,153,153));
        }
        NewPass.setBorder(null);
    }//GEN-LAST:event_NewPassFocusLost

    private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked
        // TODO add your handling code here:
        int check=0;
        String username = Username.getText();
        String answer = answerQuestion.getText();
        String newpassword = String.valueOf(NewPass.getPassword());
        if(username.isEmpty()||answer.isEmpty()||newpassword.isEmpty()){
            check=1;
            JOptionPane.showMessageDialog(null, "All Field is Required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            ResultSet rs = Select.getData("select *from admin where username ='"+username+"' and answer ='"+answer+"';");
            try
            {
                if(rs.next())
                {
                    check=1;
                    InsertUpdateDelete.setData("update admin set password='"+newpassword+"' where username='"+username+"'", "Password Set Successfully");
                    setVisible(false);
                    new ForgotPass().setVisible(true);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(check==0)
            JOptionPane.showMessageDialog(null, "Incorrect Username or Email or Answer");
    }//GEN-LAST:event_SaveButtonMouseClicked

    private void SaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(3,3,3,3, new Color(219,123,93));
        SaveButton.setBorder(IconBorder);
        SaveButton.setForeground(new Color(219,123,93));
    }//GEN-LAST:event_SaveButtonMouseEntered

    private void SaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        SaveButton.setBorder(IconBorder);
        SaveButton.setForeground(Color.white);
    }//GEN-LAST:event_SaveButtonMouseExited

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        dispose();
        LandingPage Land = new LandingPage();
        // Digunakan untuk meletakkan form register ditengah
        Land.setLocationRelativeTo(null);
        Land.setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(255, 225, 255));
        Back.setBorder(IconBorder);
        Back.setForeground(new Color(255, 225, 255));
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        Back.setBorder(IconBorder);
        Back.setForeground(Color.white);
    }//GEN-LAST:event_BackMouseExited

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
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel BackToLogin;
    private javax.swing.JLabel BackToSignUp;
    private javax.swing.JPasswordField NewPass;
    private javax.swing.JLabel SaveButton;
    private javax.swing.JTextField Username;
    private javax.swing.JTextField answerQuestion;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
