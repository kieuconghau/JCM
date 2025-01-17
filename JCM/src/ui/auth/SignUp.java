/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.auth;

/**
 *
 * @author JByNine
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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
        SignUpForm = new javax.swing.JPanel();
        labelSignUp = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelConfirmPassword = new javax.swing.JLabel();
        rbIsTeacher = new javax.swing.JRadioButton();
        requestSignIn = new javax.swing.JLabel();
        usernamePane = new javax.swing.JPanel();
        usernameIcon = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        confirmPasswordPane = new javax.swing.JPanel();
        pfConfirmPassword = new javax.swing.JPasswordField();
        passwordIcon = new javax.swing.JLabel();
        passwordPane = new javax.swing.JPanel();
        pfPassword = new javax.swing.JPasswordField();
        confirmPasswordIcon = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        signIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JCM Sign Up");
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName("signUpFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        Logo.setBackground(new java.awt.Color(46, 81, 133));
        Logo.setPreferredSize(new java.awt.Dimension(600, 600));

        LogoImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/auth/assets/online-course.png"))); // NOI18N
        LogoImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LogoName.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        LogoName.setForeground(new java.awt.Color(255, 255, 255));
        LogoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoName.setText("JCM - Courses Management System");
        LogoName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        SignUpForm.setBackground(new java.awt.Color(191, 220, 255));
        SignUpForm.setPreferredSize(new java.awt.Dimension(400, 600));

        labelSignUp.setFont(labelSignUp.getFont().deriveFont(labelSignUp.getFont().getStyle() | java.awt.Font.BOLD, 31));
        labelSignUp.setText("SIGN UP");

        labelUsername.setFont(labelUsername.getFont().deriveFont((float)18));
        labelUsername.setLabelFor(tfUsername);
        labelUsername.setText("Username");

        labelPassword.setFont(labelPassword.getFont().deriveFont((float)18));
        labelPassword.setLabelFor(pfConfirmPassword);
        labelPassword.setText("Password");

        labelConfirmPassword.setFont(labelConfirmPassword.getFont().deriveFont((float)18));
        labelConfirmPassword.setLabelFor(pfPassword);
        labelConfirmPassword.setText("Confirm password");

        rbIsTeacher.setBackground(new java.awt.Color(191, 220, 255));
        rbIsTeacher.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        rbIsTeacher.setText("Teacher");

        requestSignIn.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        requestSignIn.setText("Already have a JCM account?");

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
                .addGap(0, 0, 0)
                .addComponent(usernameIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        usernamePaneLayout.setVerticalGroup(
            usernamePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePaneLayout.createSequentialGroup()
                .addGroup(usernamePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameIcon))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        confirmPasswordPane.setBackground(new java.awt.Color(191, 217, 255));
        confirmPasswordPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmPasswordPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmPasswordPaneMouseExited(evt);
            }
        });

        pfConfirmPassword.setBackground(new java.awt.Color(191, 217, 255));
        pfConfirmPassword.setFont(pfConfirmPassword.getFont().deriveFont((float)18));
        pfConfirmPassword.setBorder(null);
        pfConfirmPassword.setName("pfConfirmPassword"); // NOI18N
        pfConfirmPassword.setSelectionColor(new java.awt.Color(46, 81, 133));
        pfConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfConfirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfConfirmPasswordFocusLost(evt);
            }
        });
        pfConfirmPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pfConfirmPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pfConfirmPasswordMouseExited(evt);
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

        javax.swing.GroupLayout confirmPasswordPaneLayout = new javax.swing.GroupLayout(confirmPasswordPane);
        confirmPasswordPane.setLayout(confirmPasswordPaneLayout);
        confirmPasswordPaneLayout.setHorizontalGroup(
            confirmPasswordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmPasswordPaneLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(passwordIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        confirmPasswordPaneLayout.setVerticalGroup(
            confirmPasswordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPasswordPaneLayout.createSequentialGroup()
                .addGroup(confirmPasswordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordIcon)
                    .addComponent(pfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        passwordPane.setBackground(new java.awt.Color(191, 217, 255));
        passwordPane.setPreferredSize(new java.awt.Dimension(348, 60));
        passwordPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordPaneMouseExited(evt);
            }
        });

        pfPassword.setBackground(new java.awt.Color(191, 217, 255));
        pfPassword.setFont(pfPassword.getFont().deriveFont((float)18));
        pfPassword.setBorder(null);
        pfPassword.setName("pfPassword"); // NOI18N
        pfPassword.setSelectionColor(new java.awt.Color(46, 81, 133));
        pfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfPasswordFocusLost(evt);
            }
        });
        pfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pfPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pfPasswordMouseExited(evt);
            }
        });

        confirmPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/auth/assets/padlock.png"))); // NOI18N
        confirmPasswordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmPasswordIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmPasswordIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout passwordPaneLayout = new javax.swing.GroupLayout(passwordPane);
        passwordPane.setLayout(passwordPaneLayout);
        passwordPaneLayout.setHorizontalGroup(
            passwordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPaneLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(confirmPasswordIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
        );
        passwordPaneLayout.setVerticalGroup(
            passwordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPaneLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(passwordPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordIcon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSignUp.setBackground(new java.awt.Color(46, 81, 133));
        btnSignUp.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnSignUp.setForeground(java.awt.Color.white);
        btnSignUp.setText("Sign up");
        btnSignUp.setBorder(null);
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpMouseExited(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        signIn.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        signIn.setForeground(java.awt.Color.blue);
        signIn.setText("Sign in");
        signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SignUpFormLayout = new javax.swing.GroupLayout(SignUpForm);
        SignUpForm.setLayout(SignUpFormLayout);
        SignUpFormLayout.setHorizontalGroup(
            SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpFormLayout.createSequentialGroup()
                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpFormLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(labelSignUp))
                    .addGroup(SignUpFormLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SignUpFormLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(requestSignIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signIn))
                    .addGroup(SignUpFormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordPane, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword)))
                    .addGroup(SignUpFormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsername)))
                    .addGroup(SignUpFormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbIsTeacher)
                            .addComponent(labelConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        SignUpFormLayout.setVerticalGroup(
            SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpFormLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelUsername)
                .addGap(8, 8, 8)
                .addComponent(usernamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(labelConfirmPassword)
                .addGap(8, 8, 8)
                .addComponent(confirmPasswordPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rbIsTeacher)
                .addGap(7, 7, 7)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestSignIn)
                    .addComponent(signIn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(SignUpForm, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SignUpForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameIconMouseEntered
        // TODO add your handling code here:
        usernamePane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_usernameIconMouseEntered

    private void usernameIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameIconMouseExited
        // TODO add your handling code here:
        usernamePane.setBorder(null);
    }//GEN-LAST:event_usernameIconMouseExited

    private void tfUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsernameFocusGained
        // TODO add your handling code here:
        usernamePane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_tfUsernameFocusGained

    private void tfUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsernameFocusLost
        // TODO add your handling code here:
        usernamePane.setBorder(null);
    }//GEN-LAST:event_tfUsernameFocusLost

    private void tfUsernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsernameMouseEntered
        // TODO add your handling code here:
        usernamePane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_tfUsernameMouseEntered

    private void tfUsernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsernameMouseExited
        // TODO add your handling code here:
        usernamePane.setBorder(null);
    }//GEN-LAST:event_tfUsernameMouseExited

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void usernamePaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernamePaneMouseEntered
        // TODO add your handling code here:
        usernamePane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_usernamePaneMouseEntered

    private void usernamePaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernamePaneMouseExited
        // TODO add your handling code here:
        usernamePane.setBorder(null);
    }//GEN-LAST:event_usernamePaneMouseExited

    private void pfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPasswordFocusGained
        // TODO add your handling code here:
        passwordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_pfPasswordFocusGained

    private void pfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPasswordFocusLost
        // TODO add your handling code here:
        passwordPane.setBorder(null);
    }//GEN-LAST:event_pfPasswordFocusLost

    private void pfPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfPasswordMouseEntered
        // TODO add your handling code here:
        passwordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_pfPasswordMouseEntered

    private void pfPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfPasswordMouseExited
        // TODO add your handling code here:
        passwordPane.setBorder(null);
    }//GEN-LAST:event_pfPasswordMouseExited

    private void confirmPasswordIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPasswordIconMouseEntered
        // TODO add your handling code here:
        confirmPasswordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_confirmPasswordIconMouseEntered

    private void confirmPasswordIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPasswordIconMouseExited
        // TODO add your handling code here:
        confirmPasswordPane.setBorder(null);
    }//GEN-LAST:event_confirmPasswordIconMouseExited

    private void passwordPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordPaneMouseEntered
        // TODO add your handling code here:
        passwordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_passwordPaneMouseEntered

    private void passwordPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordPaneMouseExited
        // TODO add your handling code here:
        passwordPane.setBorder(null);
    }//GEN-LAST:event_passwordPaneMouseExited

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        // Data
        String username = tfUsername.getText();
        String password = String.valueOf(pfPassword.getPassword());
        String confirmedPassword = String.valueOf(pfConfirmPassword.getPassword());
        int role = rbIsTeacher.isSelected() ? 1 : 2;

        // Core
        if (username.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill out the field Username!", "SignUp Message",  javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill out the field Password!", "SignUp Message",  javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (confirmedPassword.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill out the field Confirm Password!", "SignUp Message",  javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            core.entity.AccountEntity account = new core.entity.AccountEntity();
            switch (account.register(username, password, confirmedPassword, username, role)) {
                case -1:    // pass != confirmed-pass
                    javax.swing.JOptionPane.showMessageDialog(this, "Fail! The confirmed password is not correct.", "SignUp Message",  javax.swing.JOptionPane.ERROR_MESSAGE);
                    break;
                case -2:    // user_existed
                    javax.swing.JOptionPane.showMessageDialog(this, "Failed! The username is taken already. Please choose another one.", "SignUp Message",  javax.swing.JOptionPane.ERROR_MESSAGE);
                    break;
                case -3:    // unexpected error
                    javax.swing.JOptionPane.showMessageDialog(this, "Unexpected Error!", "SignUp Message",  javax.swing.JOptionPane.ERROR_MESSAGE);
                    break;
                default:    // success
                    javax.swing.JOptionPane.showMessageDialog(this, "Register an account successfully!");
                    this.setVisible(false);
                    new SignIn().setVisible(true);
            }
        }
    }//GEN-LAST:event_btnSignUpMouseClicked

    private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
        // TODO add your handling code here:
        btnSignUp.setBackground(new java.awt.Color(46, 81, 133));
    }//GEN-LAST:event_btnSignUpMouseEntered

    private void btnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseExited
        // TODO add your handling code here:
        btnSignUp.setBackground(new java.awt.Color(147, 186, 243));
    }//GEN-LAST:event_btnSignUpMouseExited

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new SignIn().setVisible(true);
    }//GEN-LAST:event_signInMouseClicked

    private void signInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseEntered
        // TODO add your handling code here:
        signIn.setFont(new java.awt.Font("Ubuntu", 1, 18));
    }//GEN-LAST:event_signInMouseEntered

    private void signInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseExited
        // TODO add your handling code here:
        signIn.setFont(new java.awt.Font("Ubuntu", 0, 18));
    }//GEN-LAST:event_signInMouseExited

    private void confirmPasswordPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPasswordPaneMouseExited
        // TODO add your handling code here:
        confirmPasswordPane.setBorder(null);
    }//GEN-LAST:event_confirmPasswordPaneMouseExited

    private void confirmPasswordPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPasswordPaneMouseEntered
        // TODO add your handling code here:
        confirmPasswordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_confirmPasswordPaneMouseEntered

    private void passwordIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordIconMouseExited
        // TODO add your handling code here:
        confirmPasswordPane.setBorder(null);
    }//GEN-LAST:event_passwordIconMouseExited

    private void passwordIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordIconMouseEntered
        // TODO add your handling code here:
        confirmPasswordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_passwordIconMouseEntered

    private void pfConfirmPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfConfirmPasswordMouseExited
        // TODO add your handling code here:
        confirmPasswordPane.setBorder(null);
    }//GEN-LAST:event_pfConfirmPasswordMouseExited

    private void pfConfirmPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfConfirmPasswordMouseEntered
        // TODO add your handling code here:
        confirmPasswordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_pfConfirmPasswordMouseEntered

    private void pfConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfConfirmPasswordFocusLost
        // TODO add your handling code here:
        confirmPasswordPane.setBorder(null);
    }//GEN-LAST:event_pfConfirmPasswordFocusLost

    private void pfConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfConfirmPasswordFocusGained
        // TODO add your handling code here:
        confirmPasswordPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.lightGray));
    }//GEN-LAST:event_pfConfirmPasswordFocusGained

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Logo;
    private javax.swing.JLabel LogoImg;
    private javax.swing.JLabel LogoName;
    private javax.swing.JPanel SignUpForm;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel confirmPasswordIcon;
    private javax.swing.JPanel confirmPasswordPane;
    private javax.swing.JLabel labelConfirmPassword;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSignUp;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JPanel passwordPane;
    private javax.swing.JPasswordField pfConfirmPassword;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JRadioButton rbIsTeacher;
    private javax.swing.JLabel requestSignIn;
    private javax.swing.JLabel signIn;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JLabel usernameIcon;
    private javax.swing.JPanel usernamePane;
    // End of variables declaration//GEN-END:variables
}
