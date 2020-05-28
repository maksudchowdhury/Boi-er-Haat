
package boierhaat;

import javax.swing.JOptionPane;

public class loginForm extends javax.swing.JFrame {

    public loginForm() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginFormPanel = new javax.swing.JPanel();
        unTf = new javax.swing.JTextField();
        passTf = new javax.swing.JPasswordField();
        headerImage = new javax.swing.JLabel();
        usrLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        userTypeDropMenu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("loginFrame"); // NOI18N
        setResizable(false);

        loginFormPanel.setBackground(new java.awt.Color(255, 204, 0));

        unTf.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        unTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unTfActionPerformed(evt);
            }
        });

        passTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTfActionPerformed(evt);
            }
        });

        headerImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boierhaat/images/boi - Copy.png"))); // NOI18N

        usrLabel.setForeground(new java.awt.Color(0, 0, 0));
        usrLabel.setText("User name");

        passLabel.setForeground(new java.awt.Color(0, 0, 0));
        passLabel.setText("Password");

        loginBtn.setText("login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        userTypeDropMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        userTypeDropMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeDropMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginFormPanelLayout = new javax.swing.GroupLayout(loginFormPanel);
        loginFormPanel.setLayout(loginFormPanelLayout);
        loginFormPanelLayout.setHorizontalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFormPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(headerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginFormPanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passLabel)
                            .addComponent(usrLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passTf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(unTf))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                        .addComponent(userTypeDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
        );
        loginFormPanelLayout.setVerticalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usrLabel))
                .addGap(18, 18, 18)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userTypeDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(loginBtn)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unTfActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if(unTf.getText().equals("")||passTf.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please put Username or Password"); 
        }
        else{
            
            String username=unTf.getText();
            String password=passTf.getText();
            String id="001";
            String userType = userTypeDropMenu.getSelectedItem().toString();
            
            if(userType.equals("Admin")){
                System.out.println(userType);
                Verify v = new Verify(username,password,"Admin.txt");
                
                if(v.verifyUser()){
                    Admin user = new Admin(username,id,userType);
                    Application app = new Application(user.getName(),user.getId(),user.getUserType());
                    this.setVisible(false);
                    app.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                }   
            }
            
            else if(userType.equals("Employee")){
                System.out.println(userType);
                Verify v = new Verify(username,password,"Employee.txt");
                if(v.verifyUser()){
                    
                    Admin user = new Admin(username,id,userType);
                    Application app = new Application(user.getName(),user.getId(),user.getUserType());
                    this.setVisible(false);
                    app.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                }
            }
            
            else{
              
            }
            
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTfActionPerformed

    private void userTypeDropMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeDropMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTypeDropMenuActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerImage;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTf;
    private javax.swing.JTextField unTf;
    private javax.swing.JComboBox<String> userTypeDropMenu;
    private javax.swing.JLabel usrLabel;
    // End of variables declaration//GEN-END:variables
}
