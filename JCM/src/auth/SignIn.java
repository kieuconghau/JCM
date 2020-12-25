/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

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
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btnSignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JCM Sign In");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName("signInFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        Logo.setBackground(new java.awt.Color(153, 153, 255));
        Logo.setMaximumSize(new java.awt.Dimension(600, 600));
        Logo.setMinimumSize(new java.awt.Dimension(600, 600));
        Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/auth/online-course.png"))); // NOI18N
        Logo.add(LogoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        LogoName.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        LogoName.setForeground(java.awt.Color.darkGray);
        LogoName.setText("JCM - Java Courses Management");
        Logo.add(LogoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        SignInForm.setBackground(new java.awt.Color(204, 204, 255));
        SignInForm.setMaximumSize(new java.awt.Dimension(400, 600));
        SignInForm.setMinimumSize(new java.awt.Dimension(400, 600));
        SignInForm.setPreferredSize(new java.awt.Dimension(400, 600));
        SignInForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSignIn.setFont(labelSignIn.getFont().deriveFont(labelSignIn.getFont().getStyle() | java.awt.Font.BOLD, 31));
        labelSignIn.setText("Sign in");
        SignInForm.add(labelSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, 40));

        labelUsername.setFont(labelUsername.getFont().deriveFont((float)18));
        labelUsername.setLabelFor(username);
        labelUsername.setText("Username");
        SignInForm.add(labelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        labelPassword.setFont(labelPassword.getFont().deriveFont((float)18));
        labelPassword.setLabelFor(password);
        labelPassword.setText("Password");
        SignInForm.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        username.setFont(username.getFont().deriveFont((float)18));
        username.setText("username");
        username.setToolTipText("");
        username.setName("username"); // NOI18N
        username.setNextFocusableComponent(password);
        username.setSelectedTextColor(java.awt.Color.darkGray);
        username.setSelectionColor(new java.awt.Color(153, 153, 255));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        SignInForm.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 340, 50));

        password.setFont(password.getFont().deriveFont((float)18));
        password.setText("password");
        password.setName("password"); // NOI18N
        password.setNextFocusableComponent(btnSignIn);
        password.setSelectedTextColor(java.awt.Color.darkGray);
        password.setSelectionColor(new java.awt.Color(153, 153, 255));
        SignInForm.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 340, 50));

        btnSignIn.setBackground(new java.awt.Color(153, 153, 255));
        btnSignIn.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnSignIn.setText("Sign in");
        SignInForm.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(SignInForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SignInForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

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
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
