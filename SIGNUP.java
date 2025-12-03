import javax.swing.UIManager;
import javax.swing.BorderFactory;
import petadoption.utils.FileUtils;
import javax.swing.JOptionPane;
public class SIGNUP extends javax.swing.JFrame {
    

    public SIGNUP() {
        initComponents();
        // keep imports: import javax.swing.BorderFactory; import javax.swing.UIManager;
UIManager.put("Button.defaultButtonFollowsFocus", Boolean.FALSE);

// Style jButton1 (repeat for any other button)
jButton1.setFocusPainted(false);
jButton1.setContentAreaFilled(true);    // allow background paint
jButton1.setOpaque(true);               // important on some L&Fs
jButton1.setBackground(new java.awt.Color(255, 255, 255)); // desired bg
jButton1.setForeground(new java.awt.Color(51, 51, 51));    // text color
jButton1.setBorder(BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
jButton2.setFocusPainted(false);
jButton2.setContentAreaFilled(true);    // allow background paint
jButton2.setOpaque(true);               // important on some L&Fs
jButton2.setBackground(new java.awt.Color(255, 255, 255)); // desired bg
jButton2.setForeground(new java.awt.Color(51, 51, 51));    // text color
jButton2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(248,219,219)));
jButton3.setFocusPainted(false);
jButton3.setContentAreaFilled(true);    // allow background paint
jButton3.setOpaque(true);               // important on some L&Fs
jButton3.setBackground(new java.awt.Color(255, 255, 255)); // desired bg
jButton3.setForeground(new java.awt.Color(51, 51, 51));    // text color
jButton3.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));



      this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jLabel9.setText("jLabel9");

        jCheckBox1.setText("jCheckBox1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setText("Password");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 300, -1));

        jPanel2.setBackground(new java.awt.Color(248, 219, 219));
        jPanel2.setPreferredSize(new java.awt.Dimension(863, 1000));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Elephant", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(171, 113, 113));
        jLabel6.setText("PAW SPHERE");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 254, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_pets_60px_1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(171, 113, 113));
        jLabel2.setText("Connecting pets, people, and possibilities.");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 450, -1));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel3.setText("Already have an account?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, -1, 17));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 10)); // NOI18N
        jLabel4.setText("Unauthorized access is strictly prohibited.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 670, -1, 17));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel5.setText("Hey!");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, 41));

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(200, 119, 119));
        jLabel7.setText("Helping find the little paws their new homes!");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, 30));

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel8.setText("Join to access streamlined pet, adopter, and request tools.");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, 20));

        jButton2.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jButton2.setText("Log In");
        jButton2.setToolTipText("");
        jButton2.setAlignmentY(0.0F);
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 290, 30));

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jLabel13.setText("This system is restricted to verified staff. ");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, 17));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 700));

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel10.setText("Sign Up");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setText("Name");
        jTextField2.setToolTipText("");
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 300, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setText("Email Address");
        jTextField3.setToolTipText("");
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 300, -1));

        jCheckBox2.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jCheckBox2.setText("Accept Terms and Conditions");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, -1, -1));

        jButton1.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.setToolTipText("");
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 219, 219), 3, true));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 300, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, 130, 10));

        jLabel11.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("or");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 130, 10));

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel12.setText("Join by using");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_google_32px.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    String name = jTextField2.getText().trim();
    String email = jTextField3.getText().trim();
    String pass = jTextField1.getText().trim();

    // Validation
    if (name.isEmpty() || name.equals("Name")) {
        JOptionPane.showMessageDialog(this, "Please enter your name.");
        return;
    }
    if (email.isEmpty() || email.equals("Email Address")) {
        JOptionPane.showMessageDialog(this, "Please enter your email.");
        return;
    }
    if (pass.isEmpty() || pass.equals("Password")) {
        JOptionPane.showMessageDialog(this, "Please enter your password.");
        return;
    }
    if (!jCheckBox2.isSelected()) {
        JOptionPane.showMessageDialog(this, "Please accept Terms and Conditions.");
        return;
    }

    // Check if user email already exists
    java.util.List<String> users = FileUtils.readAll("data/users.txt");
    for (String line : users) {
        String[] p = line.split(",");
        if (p[1].equalsIgnoreCase(email)) {
            JOptionPane.showMessageDialog(this, "Email already registered!");
            return;
        }
    }

    // Save to file
    String data = name + "," + email + "," + pass;
    FileUtils.append("data/users.txt", data);

    JOptionPane.showMessageDialog(this, "Account Created Successfully!");

    // Open Login Page
    LOGIN login = new LOGIN();
    login.setVisible(true);
    this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
LOGIN log = new LOGIN();
log.setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jButton3.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
JOptionPane.showMessageDialog(
        this,
        "Your request has been submitted.\nYou must wait for the team to approve your access.",
        "Access Pending Approval",
        JOptionPane.INFORMATION_MESSAGE
);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGNUP().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
