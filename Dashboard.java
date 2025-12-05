
public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
         this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
         jButton5.setFocusPainted(false);
    jButton4.setFocusPainted(false);
    jButton3.setFocusPainted(false);
    // Disable default blue highlight
    jButton5.setContentAreaFilled(false);
    jButton5.setOpaque(true);
    jButton3.setContentAreaFilled(false);
    jButton3.setOpaque(true);
    jButton4.setContentAreaFilled(false);
    jButton4.setOpaque(true);
    
    // Your colors
    jButton5.setBackground(new java.awt.Color(255, 255, 255)); 
    jButton5.setForeground(new java.awt.Color(51, 51, 51));
   jButton3.setBackground(new java.awt.Color(255, 255, 255)); 
    jButton3.setForeground(new java.awt.Color(51, 51, 51));
    jButton4.setBackground(new java.awt.Color(255, 255, 255)); 
    jButton4.setForeground(new java.awt.Color(51, 51, 51));

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_pets_60px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Elephant", 0, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(171, 113, 113));
        jLabel6.setText("PAW SPHERE");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 340, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Adoption Requests Management");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 219, 219), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 490, 70));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Pet Management");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 219, 219), 3, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 490, 70));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Adopter Management");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 219, 219), 3, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 490, 70));

        jPanel2.setBackground(new java.awt.Color(248, 219, 219));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 560, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setBorder(
            javax.swing.BorderFactory.createLineBorder(
                new java.awt.Color(206,206,206), // your pink shade
                3,                                 // thickness
                true                                // rounded corners
            )
        );
        jButton3.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(206,206,206), 3, true
        )
    );

    // --- OPEN ADOPTION REQUEST WINDOW ---
    AdoptionRequest ar = new AdoptionRequest();
    ar.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  jButton4.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(206,206,206), // your pink shade
            3,                                 // thickness
            true                                // rounded corners
        )
    );
                                         

    jButton4.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(206,206,206), 3, true
        )
    );

    // --- OPEN PET MANAGEMENT WINDOW ---
    PetManagement pm = new PetManagement();
    pm.setVisible(true);
    this.dispose();


// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  jButton5.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(206,206,206), // your pink shade
            3,                                 // thickness
            true                                // rounded corners
        )
    );  
  jButton5.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(206,206,206), 3, true
        )
    );

    // --- OPEN ADOPTER MANAGEMENT WINDOW ---
    AdopterManagement am = new AdopterManagement();
    am.setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
