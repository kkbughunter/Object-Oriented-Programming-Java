
package miniproject;

import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Registerpage extends javax.swing.JFrame {
       
    public Registerpage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        companyName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordNo = new javax.swing.JPasswordField();
        submitBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        companyName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        companyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyNameActionPerformed(evt);
            }
        });
        companyName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                companyNameKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register Page");

        jLabel2.setText("Company Name ");

        jLabel3.setText("Password");

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(submitBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordNo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(loginBtn))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void companyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyNameActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        dispose();
        Loginpage login = new Loginpage();
        login.show();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
         String CompanyName = companyName.getText();
         String temp,Passwordno = passwordNo.getText();
         
        try {
             //FileWriter file=new FileWriter("register_data.txt",true);
             //FileWriter file=new FileWriter("register_data.txt",true);
             try (FileWriter registerfile = new FileWriter("register_data.txt",true)) {
                 //FileWriter file=new FileWriter("register_data.txt",true);
                 //FileWriter file=new FileWriter("register_data.txt",true);
                 registerfile.write(CompanyName + "|" + Passwordno + "\n");
                 temp = CompanyName+"_purchaces_data.txt";                           // to create importent files
                 
                FileWriter purchacesfile=new FileWriter(temp,true);
                purchacesfile.write("");
                temp = CompanyName+"_Task_data_me.txt";
                FileWriter taskfile=new FileWriter(temp,true);
                taskfile.write("");
                temp = CompanyName+"_Workerspage_data.txt";
                FileWriter workersfile=new FileWriter(temp,true);
                workersfile.write("");
                JOptionPane.showMessageDialog(this,"Successfully Registered");
             }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(this,"Some thing went woring");   // alert massage
        }
        dispose();
        Loginpage login = new Loginpage();
        login.show();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void companyNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_companyNameKeyPressed
        if(evt.getKeyChar() == '|'){
            companyName.setEditable(false);
        } else {
            companyName.setEditable(true);
        }
    }//GEN-LAST:event_companyNameKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField companyName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordNo;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
