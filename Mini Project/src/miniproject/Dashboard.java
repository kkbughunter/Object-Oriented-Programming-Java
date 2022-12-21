
package miniproject;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Dashboard extends javax.swing.JFrame {
    public String cmpname;
    public Dashboard(String compname){
        cmpname = compname;
        initComponents();
        String temp = "Welcome "+compname;
        displaytext.setText(temp);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        Income = new javax.swing.JButton();
        Expenses = new javax.swing.JButton();
        Workers = new javax.swing.JButton();
        Analysis = new javax.swing.JButton();
        displaytext = new javax.swing.JLabel();
        On1task = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TaskButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        Home.setBackground(new java.awt.Color(0, 102, 255));
        Home.setText("Home");
        Home.setBorder(null);

        Income.setBackground(new java.awt.Color(0, 102, 255));
        Income.setText("Purchaces");
        Income.setBorder(null);
        Income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomeActionPerformed(evt);
            }
        });

        Expenses.setBackground(new java.awt.Color(0, 102, 255));
        Expenses.setText("Expenses");
        Expenses.setBorder(null);
        Expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpensesActionPerformed(evt);
            }
        });

        Workers.setBackground(new java.awt.Color(0, 102, 255));
        Workers.setText("Workers");
        Workers.setBorder(null);
        Workers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkersActionPerformed(evt);
            }
        });

        Analysis.setBackground(new java.awt.Color(0, 102, 255));
        Analysis.setText("Analysis");
        Analysis.setBorder(null);
        Analysis.setMaximumSize(new java.awt.Dimension(61, 16));
        Analysis.setMinimumSize(new java.awt.Dimension(61, 16));
        Analysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalysisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Income, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Expenses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Workers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Analysis, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Income, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Workers, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Analysis, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        displaytext.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        displaytext.setForeground(new java.awt.Color(0, 0, 102));
        displaytext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displaytext.setText("Welcome ");
        displaytext.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                displaytextAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        displaytext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displaytextMouseClicked(evt);
            }
        });

        On1task.setForeground(new java.awt.Color(255, 0, 0));
        On1task.setText("Ongoing task 1");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Ongoing task 2");

        TaskButton.setBackground(new java.awt.Color(0, 102, 255));
        TaskButton.setText("Today Task");
        TaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(On1task, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(displaytext, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(TaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(displaytext, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(On1task))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkersActionPerformed
       new Workerspage().setVisible(true);
    }//GEN-LAST:event_WorkersActionPerformed

    private void AnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalysisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnalysisActionPerformed

    private void ExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpensesActionPerformed
        Taskpage t = new Taskpage();
        t.setVisible(true);
    }//GEN-LAST:event_ExpensesActionPerformed

    private void TaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TaskButtonActionPerformed

    private void displaytextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displaytextMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_displaytextMouseClicked

    private void displaytextAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displaytextAncestorAdded
        //String str = "welcome "+cmpname;
        
    }//GEN-LAST:event_displaytextAncestorAdded

    private void IncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomeActionPerformed
        Purchase pur = new Purchase();
        pur.setVisible(true);
    }//GEN-LAST:event_IncomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Analysis;
    private javax.swing.JButton Expenses;
    private javax.swing.JButton Home;
    private javax.swing.JButton Income;
    private javax.swing.JLabel On1task;
    private javax.swing.JButton TaskButton;
    private javax.swing.JButton Workers;
    private javax.swing.JLabel displaytext;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
