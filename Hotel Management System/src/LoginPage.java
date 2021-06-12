import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import Project.Select;
import java.sql.ResultSet;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABEL
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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

        Back = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        PasswordLogin = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JLabel();
        LoginUsernameOrEmail = new javax.swing.JTextField();
        BackToSignUp = new javax.swing.JLabel();
        ForgotPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 30, 30));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Exit Button.png"))); // NOI18N
        Close.setText(" ");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 30, 30));

        PasswordLogin.setBackground(new java.awt.Color(242, 218, 218));
        PasswordLogin.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        PasswordLogin.setBorder(null);
        PasswordLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordLoginFocusLost(evt);
            }
        });
        getContentPane().add(PasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 492, 440, 30));

        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Login Button.png"))); // NOI18N
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 570, 170, 60));

        LoginUsernameOrEmail.setBackground(new java.awt.Color(242, 218, 218));
        LoginUsernameOrEmail.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        LoginUsernameOrEmail.setBorder(null);
        LoginUsernameOrEmail.setPreferredSize(new java.awt.Dimension(59, 21));
        LoginUsernameOrEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginUsernameOrEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginUsernameOrEmailFocusLost(evt);
            }
        });
        LoginUsernameOrEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUsernameOrEmailActionPerformed(evt);
            }
        });
        getContentPane().add(LoginUsernameOrEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 440, 40));

        BackToSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Back to Sign Up Button.png"))); // NOI18N
        BackToSignUp.setText(" ");
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
        getContentPane().add(BackToSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1165, 695, 100, -1));

        ForgotPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Forgot Password_.png"))); // NOI18N
        ForgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseExited(evt);
            }
        });
        getContentPane().add(ForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 695, 120, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Login Form.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        int out=JOptionPane.showConfirmDialog(null, "Do you really want to close this application?", "Select", JOptionPane.YES_NO_CANCEL_OPTION);
        if(out==0)
            System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void LoginUsernameOrEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUsernameOrEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginUsernameOrEmailActionPerformed

    private void LoginUsernameOrEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginUsernameOrEmailFocusGained
        // TODO add your handling code here:
        String UsernameorEmailValue = LoginUsernameOrEmail.getText();
        
        if(UsernameorEmailValue.trim().toLowerCase().equals(("username or email"))){
            LoginUsernameOrEmail.setText("");
            LoginUsernameOrEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_LoginUsernameOrEmailFocusGained

    private void LoginUsernameOrEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginUsernameOrEmailFocusLost
        // TODO add your handling code here:
        String UsernameorEmailValue = LoginUsernameOrEmail.getText();

        if(UsernameorEmailValue.trim().toLowerCase().equals(("Username or Email"))||UsernameorEmailValue.trim().toLowerCase().equals("")){
            LoginUsernameOrEmail.setText("Username or Email");
            LoginUsernameOrEmail.setForeground(new Color(153,153,153));
        }
        LoginUsernameOrEmail.setBorder(null);
    }//GEN-LAST:event_LoginUsernameOrEmailFocusLost

    private void PasswordLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordLoginFocusGained
        // TODO add your handling code here:
        String passwordValue = String.valueOf(PasswordLogin.getPassword());

        if(passwordValue.trim().toLowerCase().equals(("password"))){
            PasswordLogin.setText("");
            PasswordLogin.setForeground(Color.black);
        }
    }//GEN-LAST:event_PasswordLoginFocusGained

    private void PasswordLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordLoginFocusLost
        // TODO add your handling code here:
        String passwordValue = String.valueOf(PasswordLogin.getPassword());

        if(passwordValue.trim().toLowerCase().equals(("password"))||passwordValue.trim().toLowerCase().equals("")){
            PasswordLogin.setText("Password");
            PasswordLogin.setForeground(new Color(153,153,153));
        }
        PasswordLogin.setBorder(null);
    }//GEN-LAST:event_PasswordLoginFocusLost

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(255, 225, 255));
        Close.setBorder(IconBorder);
        Close.setForeground(new Color(255, 225, 255));
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        Close.setBorder(IconBorder);
        Close.setForeground(Color.white);
    }//GEN-LAST:event_CloseMouseExited

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

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:
        int check=0;
        String username = LoginUsernameOrEmail.getText();
        String email = LoginUsernameOrEmail.getText();
        String password = String.valueOf(PasswordLogin.getPassword());
        if(username.isEmpty()||password.isEmpty()){
            check=1;
            JOptionPane.showMessageDialog(null, "All Field is Required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(username.equals("admin") && password.equals("admin")){
            check=1;
            setVisible(true);
            JOptionPane.showMessageDialog(null, "Login Success", "Information", JOptionPane.INFORMATION_MESSAGE);
                new Menu().setVisible(true);
        }
        else{
            ResultSet rs = Select.getData("select *from admin where password ='"+password+"' and (username = '"+username+"' or email='"+email+"');");
            try
            {
                if(rs.next())
                {
                    check=1;
                    if(rs.getString(7).equals("true"))
                    {}
                    else
                    JOptionPane.showMessageDialog(null, "Login Success", "Information", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                        new Menu().setVisible(true);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(check==0)
            JOptionPane.showMessageDialog(null, "Incorrect Email or Username or Password");
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(3,3,3,3, new Color(219,123,93));
        LoginButton.setBorder(IconBorder);
        LoginButton.setForeground(new Color(219,123,93));
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        LoginButton.setBorder(IconBorder);
        LoginButton.setForeground(Color.white);
    }//GEN-LAST:event_LoginButtonMouseExited

    private void BackToSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToSignUpMouseClicked
        // TODO add your handling code here:
        dispose();
        SignUp Signup = new SignUp();
        Signup.setLocationRelativeTo(null);
        Signup.setVisible(true);
    }//GEN-LAST:event_BackToSignUpMouseClicked

    private void BackToSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToSignUpMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(219,123,93));
        BackToSignUp.setBorder(IconBorder);
        BackToSignUp.setForeground(new Color(219,123,93));
    }//GEN-LAST:event_BackToSignUpMouseEntered

    private void BackToSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToSignUpMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        BackToSignUp.setBorder(IconBorder);
        BackToSignUp.setForeground(Color.white);
    }//GEN-LAST:event_BackToSignUpMouseExited

    private void ForgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseEntered
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(1,1,1,1, new Color(219,123,93));
        ForgotPassword.setBorder(IconBorder);
        ForgotPassword.setForeground(new Color(219,123,93));
    }//GEN-LAST:event_ForgotPasswordMouseEntered

    private void ForgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseExited
        // TODO add your handling code here:
        Border IconBorder = BorderFactory.createMatteBorder(0,0,0,0, Color.white);
        ForgotPassword.setBorder(IconBorder);
        ForgotPassword.setForeground(Color.white);
    }//GEN-LAST:event_ForgotPasswordMouseExited

    private void ForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseClicked
        // TODO add your handling code here:
        dispose();
        ForgotPass forgot = new ForgotPass();
        forgot.setLocationRelativeTo(null);
        forgot.setVisible(true);
    }//GEN-LAST:event_ForgotPasswordMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel BackToSignUp;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel ForgotPassword;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JTextField LoginUsernameOrEmail;
    private javax.swing.JPasswordField PasswordLogin;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}