/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.auth;

import ui.student.StudentApp;
import ui.teacher.TeacherApp;
import core.entity.AccountEntity;
import javax.swing.JOptionPane;

/**
 *
 * @author JByNine
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form AuthForm
     */
    public SignIn() {
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

        Logo = new javax.swing.JPanel();
        LogoImg = new javax.swing.JLabel();
        LogoName = new javax.swing.JLabel();
        SignInForm = new javax.swing.JPanel();
        labelSignIn = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        requestSignUp = new javax.swing.JLabel();
        signUp = new javax.swing.JLabel();
        usernamePane = new javax.swing.JPanel();
        usernameIcon = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        passwordPane = new javax.swing.JPanel();
        tfPassword = new javax.swing.JPasswordField();
        passwordIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JCM Sign In");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName("signInFrame"); // NOI18N
        setResizable(false);

        Logo.setBackground(new java.awt.Color(46, 81, 133));
        Logo.setMaximumSize(new java.awt.Dimension(600, 600));
        Logo.setMinimumSize(new java.awt.Dimension(600, 600));

        LogoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/auth/assets/online-course.png"))); // NOI18N

        LogoName.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        LogoName.setForeground(new java.awt.Color(255, 255, 255));
        LogoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoName.setText("JCM - Courses Management System");

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(LogoImg))
            .addComponent(LogoName, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogoImg)
            .addGroup(LogoLayout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(LogoName))
        );

        SignInForm.setBackground(new java.awt.Color(191, 217, 255));
        SignInForm.setMaximumSize(new java.awt.Dimension(400, 600));
        SignInForm.setMinimumSize(new java.awt.Dimension(400, 600));
        SignInForm.setPreferredSize(new java.awt.Dimension(400, 600));

        labelSignIn.setFont(labelSignIn.getFont().deriveFont(labelSignIn.getFont().getStyle() | java.awt.Font.BOLD, 31));
        labelSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSignIn.setText("SIGN IN");

        labelUsername.setFont(labelUsername.getFont().deriveFont((float)18));
        labelUsername.setLabelFor(tfUsername);
        labelUsername.setText("Username");

        labelPassword.setFont(labelPassword.getFont().deriveFont((float)18));
        labelPassword.setLabelFor(tfPassword);
        labelPassword.setText("Password");

        btnSignIn.setBackground(new java.awt.Color(147, 186, 243));
        btnSignIn.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnSignIn.setForeground(java.awt.Color.white);
        btnSignIn.setText("Sign in");
        btnSignIn.setBorder(null);
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignInMouseExited(evt);
            }
        });
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        requestSignUp.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        requestSignUp.setText("Don't have a JCM account?");

        signUp.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        signUp.setForeground(java.awt.Color.blue);
        signUp.setText("Sign up");
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpMouseExited(evt);
            }
        });

        usernamePane.setBackground(new java.awt.Color(191, 217, 255));
        usernamePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernamePaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernamePaneMouseExited(evt);
            }
        });

        usernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/auth/assets/user.png"))); // NOI18N
        usernameIcon.setToolTipText("");
        usernameIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameIconMouseExited(evt);
            }
        });

        tfUsername.setBackground(new java.awt.Color(191, 217, 255));
        tfUsername.setFont(tfUsername.getFont().deriveFont((float)18));
        tfUsername.setText("giaovien");
        tfUsername.setToolTipText("");
        tfUsername.setBorder(null);
        tfUsername.setName("tfUsername"); // NOI18N
        tfUsername.setSelectionColor(new java.awt.Color(46, 81, 133));
        tfUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUsernameFocusLost(evt);
            }
        });
        tfUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfUsernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfUsernameMouseExited(evt);
            }
        });
        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usernamePaneLayout = new javax.swing.GroupLayout(usernamePane);
        usernamePane.setLayout(usernamePaneLayout);
        usernamePaneLayout.setHorizontalGroup(
            usernamePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePaneLayout.createSequentialGroup()
                .addComponent(usernameIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        usernamePaneLayout.setVerticalGroup(
            usernamePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePaneLayout.createSequentialGroup()
                .addGroup(usernamePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameIcon))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        passwordPane.setBackground(new java.awt.Color(191, 217, 255));
        passwordPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordPaneMouseExited(evt);
            }
        });

        tfPassword.setBackground(new java.awt.Color(191, 217, 255));
        tfPassword.setFont(tfPassword.getFont().deriveFont((float)18));
        tfPassword.setText("admin");
        tfPassword.setBorder(null);
        tfPassword.setName("tfPassword"); // NOI18N
        tfPassword.setSelectionColor(new java.awt.Color(46, 81, 133));
        tfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPasswordFocusLost(evt);
            }
        });
        tfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfPasswordMouseExited(evt);
            }
        });

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/auth/assets/padlock.png"))); // NOI18N
        passwordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout passwordPaneLayout = new javax.swing.GroupLayout(passwordPane);
        passwordPane.setLayout(passwordPaneLayout);
        passwordPaneLayout.setHorizontalGroup(
            passwordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPaneLayout.createSequentialGroup()
                .addComponent(passwordIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
        passwordPaneLayout.setVerticalGroup(
            passwordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPaneLayout.createSequentialGroup()
                .addGroup(passwordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordIcon)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SignInFormLayout = new javax.swing.GroupLayout(SignInForm);
        SignInForm.setLayout(SignInFormLayout);
        SignInFormLayout.setHorizontalGroup(
            SignInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInFormLayout.createSequentialGroup()
                .addGroup(SignInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignInFormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelUsername))
                    .addGroup(SignInFormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(usernamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SignInFormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelPassword))
                    .addGroup(SignInFormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(passwordPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SignInFormLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(SignInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUp)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(labelSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SignInFormLayout.setVerticalGroup(
            SignInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInFormLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelUsername)
                .addGap(8, 8, 8)
                .addComponent(usernamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labelPassword)
                .addGap(8, 8, 8)
                .addComponent(passwordPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SignInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestSignUp)
                    .addComponent(signUp))
                .addGap(175, 175, 175))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignInForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SignInForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignInActionPerformed

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new SignUp().setVisible(true);
    }//GEN-LAST:event_signUpMouseClicked

    private void usernamePaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernamePaneMouseEntered
        // TODO add your handling code here:
        usernamePane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_usernamePaneMouseEntered

    private void usernamePaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernamePaneMouseExited
        // TODO add your handling code here:
        usernamePane.setBorder(null);
    }//GEN-LAST:event_usernamePaneMouseExited

    private void usernameIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameIconMouseEntered
        // TODO add your handling code here:
        usernamePane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_usernameIconMouseEntered

    private void usernameIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameIconMouseExited
        // TODO add your handling code here:
        usernamePane.setBorder(null);
    }//GEN-LAST:event_usernameIconMouseExited

    private void tfUsernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsernameMouseEntered
        // TODO add your handling code here:
        usernamePane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_tfUsernameMouseEntered

    private void tfUsernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsernameMouseExited
        // TODO add your handling code here:
        usernamePane.setBorder(null);
    }//GEN-LAST:event_tfUsernameMouseExited

    private void tfUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsernameFocusGained
        // TODO add your handling code here:
        usernamePane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_tfUsernameFocusGained

    private void tfUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsernameFocusLost
        // TODO add your handling code here:
        usernamePane.setBorder(null);
    }//GEN-LAST:event_tfUsernameFocusLost

    private void tfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusGained
        // TODO add your handling code here:
        passwordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_tfPasswordFocusGained

    private void tfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusLost
        // TODO add your handling code here:
        passwordPane.setBorder(null);
    }//GEN-LAST:event_tfPasswordFocusLost

    private void tfPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPasswordMouseEntered
        // TODO add your handling code here:
        passwordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_tfPasswordMouseEntered

    private void tfPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPasswordMouseExited
        // TODO add your handling code here:
        passwordPane.setBorder(null);
    }//GEN-LAST:event_tfPasswordMouseExited

    private void passwordIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordIconMouseEntered
        // TODO add your handling code here:
        passwordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_passwordIconMouseEntered

    private void passwordIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordIconMouseExited
        // TODO add your handling code here:
        passwordPane.setBorder(null);
    }//GEN-LAST:event_passwordIconMouseExited

    private void passwordPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordPaneMouseEntered
        // TODO add your handling code here:
        passwordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_passwordPaneMouseEntered

    private void passwordPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordPaneMouseExited
        // TODO add your handling code here:
        passwordPane.setBorder(null);
    }//GEN-LAST:event_passwordPaneMouseExited

    private void btnSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseEntered
        // TODO add your handling code here:
        btnSignIn.setBackground(new java.awt.Color(46, 81, 133));
    }//GEN-LAST:event_btnSignInMouseEntered
                          
        // TODO add your handling code here:
    private void btnSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseExited
        // TODO add your handling code here:
        btnSignIn.setBackground(new java.awt.Color(147, 186, 243));
    }//GEN-LAST:event_btnSignInMouseExited

    private void signUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseEntered
        // TODO add your handling code here:
        signUp.setFont(new java.awt.Font("Ubuntu", 1, 18));
    }//GEN-LAST:event_signUpMouseEntered

    private void signUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseExited
        // TODO add your handling code here:
        signUp.setFont(new java.awt.Font("Ubuntu", 0, 18));
    }//GEN-LAST:event_signUpMouseExited

    private void btnSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseClicked
        // TODO add your handling code here:

//        if (isTeacher.isSelected()) {
//            new TeacherApp().setVisible(true);
//        } else {
//TODO: snowdence
        String _username = this.tfUsername.getText();
        String _password = this.tfPassword.getText();
        AccountEntity accountEntity = new AccountEntity();
        int status_login = accountEntity.login(_username, _password);
        switch (status_login) {
            case -1:
                setAlwaysOnTop(false);
                JOptionPane.showMessageDialog(this, "User not existed","Login Message",  JOptionPane.ERROR_MESSAGE);
                setAlwaysOnTop(true);

                break;
            case -2:
                setAlwaysOnTop(false);

                setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(this, "Password incorrect", "Login Message",  JOptionPane.ERROR_MESSAGE);

                break;
            case 0:
                this.setVisible(false);
                //JOptionPane.showMessageDialog(this , "Success login"  +  accountEntity.getUserModel().getFullName() );
                if (accountEntity.isStudent()) {
                    new StudentApp(accountEntity).setVisible(true);
                } else {
                    new TeacherApp(accountEntity).setVisible(true);
                }
                break;
        }

//        }
    }//GEN-LAST:event_btnSignInMouseClicked

    public void run() {
        this.setVisible(true);
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
                if ("Windowns".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Logo;
    private javax.swing.JLabel LogoImg;
    private javax.swing.JLabel LogoName;
    private javax.swing.JPanel SignInForm;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSignIn;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JPanel passwordPane;
    private javax.swing.JLabel requestSignUp;
    private javax.swing.JLabel signUp;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JLabel usernameIcon;
    private javax.swing.JPanel usernamePane;
    // End of variables declaration//GEN-END:variables
}
