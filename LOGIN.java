import javax.swing.JOptionPane;
import petadoption.utils.FileUtils;
public class LOGIN extends javax.swing.JFrame {

    
    public LOGIN() {
        initComponents();
        jCheckBox1.setOpaque(false);
        jCheckBox1.setBorderPainted(false);
        jCheckBox1.setFocusPainted(false);
        jCheckBox1.setContentAreaFilled(false);
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
         // Remove blue focus border
    jButton1.setFocusPainted(false);
    jButton2.setFocusPainted(false);
    jButton3.setFocusPainted(false);
    // Disable default blue highlight
    jButton1.setContentAreaFilled(false);
    jButton1.setOpaque(true);
    jButton3.setContentAreaFilled(false);
    jButton3.setOpaque(true);
    jButton2.setContentAreaFilled(false);
    jButton2.setOpaque(true);
    
    // Your colors
    jButton1.setBackground(new java.awt.Color(255, 255, 255)); 
    jButton1.setForeground(new java.awt.Color(51, 51, 51));
   jButton3.setBackground(new java.awt.Color(255, 255, 255)); 
    jButton3.setForeground(new java.awt.Color(51, 51, 51));
    jButton2.setBackground(new java.awt.Color(255, 255, 255)); 
    jButton2.setForeground(new java.awt.Color(51, 51, 51));

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(248, 219, 219));
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
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 497, -1));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        jLabel3.setText("Let's Sign you in");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel4.setText("Welcome Back!");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, 47));

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel9.setText("To keep yourself connected with us log in with your already present account");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, 22));

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel8.setText("Log In");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField1.setText("Username");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_user_48px.png"))); // NOI18N

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_password_48px.png"))); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPasswordField1.setText("Password");
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jCheckBox1.setText("Remember me");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Forgot Password?");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Sign Up");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 219, 219), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Log In");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 219, 219), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))))
                                .addGap(13, 13, 13)))
                        .addContainerGap(179, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jCheckBox1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addComponent(jButton1)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton1.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(248,219,219), // your pink shade
            3,                                 // thickness
            true                                // rounded corners
        )
    );
        SIGNUP su = new SIGNUP();
su.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         jButton1.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(248,219,219), // your pink shade
            3,                                 // thickness
            true                                // rounded corners
        )
    );
         JOptionPane.showMessageDialog(this, 
            "Password recovery email sent successfully.Please contact system admin.",
            "Forgot Password",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String email = jTextField1.getText().trim();
    String pass = new String(jPasswordField1.getPassword());

    // Empty field check
    if (email.isEmpty() || email.equals("Username")) {
        JOptionPane.showMessageDialog(this, "Please enter your email/username.");
        return;
    }

    if (pass.isEmpty() || pass.equals("Password")) {
        JOptionPane.showMessageDialog(this, "Please enter your password.");
        return;
    }

    // Read users
    java.util.List<String> users = FileUtils.readAll("data/users.txt");
    boolean loginSuccess = false;

    for (String line : users) {
        String[] u = line.split(",");
        if (u.length >= 3) {
            String savedName = u[0];
            String savedEmail = u[1];
            String savedPass = u[2];

            if (email.equalsIgnoreCase(savedEmail) && pass.equals(savedPass)) {
                loginSuccess = true;
                break;
            }
        }
    }

    if (loginSuccess) {
        JOptionPane.showMessageDialog(this, "Login Successful! Welcome Back️");

        Dashboard db = new Dashboard();
db.setVisible(true);
this.dispose();
    } 
    else {
        JOptionPane.showMessageDialog(this, 
                "Invalid email or password.\nPlease try again!",
                "Login Failed!",
                JOptionPane.ERROR_MESSAGE);
    }        // TODO add your handling code here:
        jButton3.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(206,206,206), // your pink shade
            3,                                 // thickness
            true                                // rounded corners
        )
    );
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
