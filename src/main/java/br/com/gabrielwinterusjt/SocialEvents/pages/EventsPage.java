/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.gabrielwinterusjt.SocialEvents.pages;

import br.com.gabrielwinter.SocialEvents.model.User;
import br.com.gabrielwinter.SocialEvents.ConnectionFactory;
import br.com.gabrielwinter.SocialEvents.EventDAO;
import br.com.gabrielwinter.SocialEvents.EventsTable;
import br.com.gabrielwinter.SocialEvents.model.Event;
import java.net.ConnectException;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Winter
 */
public class EventsPage extends javax.swing.JFrame {

    /**
     * Creates new form EventsPage
     */
    EventsTable eventsTable = new EventsTable();

    public EventsPage() {

        initComponents();

        this.eventsTableForm.setModel(eventsTable.listAllEvents());
        

    }

    public EventsPage(User user) {

        initComponents();
        this.eventsTableForm.setModel(eventsTable.listAllEvents());
       
        NewEventBtn.setVisible(user.isAdm());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        eventsTableForm = new javax.swing.JTable();
        imgLogo = new javax.swing.JLabel();
        NewEventBtn = new javax.swing.JButton();
        orderByName = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        orderByDate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(253, 166, 27));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        eventsTableForm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        eventsTableForm.setCellSelectionEnabled(false);
        eventsTableForm.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                eventsTableFormAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(eventsTableForm);

        imgLogo.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        imgLogo.setForeground(new java.awt.Color(255, 255, 128));
        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setText("Events");

        NewEventBtn.setBackground(new java.awt.Color(255, 255, 128));
        NewEventBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewEventBtn.setForeground(new java.awt.Color(253, 166, 27));
        NewEventBtn.setText("New Event");
        NewEventBtn.setBorder(null);
        NewEventBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewEventBtnActionPerformed(evt);
            }
        });

        orderByName.setBackground(new java.awt.Color(255, 255, 128));
        orderByName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderByName.setForeground(new java.awt.Color(253, 166, 27));
        orderByName.setText("Order By Name");
        orderByName.setBorder(null);
        orderByName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderByNameActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 255, 128));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(253, 166, 27));
        logoutBtn.setText("Logout");
        logoutBtn.setBorder(null);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        orderByDate.setBackground(new java.awt.Color(255, 255, 128));
        orderByDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderByDate.setForeground(new java.awt.Color(253, 166, 27));
        orderByDate.setText("Order By Date");
        orderByDate.setBorder(null);
        orderByDate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderByDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderByName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                            .addComponent(NewEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(107, 107, 107))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imgLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderByDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderByName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderByDateActionPerformed
        // TODO add your handling code here:
        eventsTable.clearTable();
        this.eventsTableForm.setModel(eventsTable.listAllEventsByStart());
    }//GEN-LAST:event_orderByDateActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void orderByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderByNameActionPerformed
        eventsTable.clearTable();
        this.eventsTableForm.setModel(eventsTable.listAllEventsByName());
        // TODO add your handling code here:
    }//GEN-LAST:event_orderByNameActionPerformed

    private void eventsTableFormAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_eventsTableFormAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_eventsTableFormAncestorAdded

    private void NewEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewEventBtnActionPerformed
        NewEventPage newEventPage = new NewEventPage();
        newEventPage.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_NewEventBtnActionPerformed

     
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
            java.util.logging.Logger.getLogger(EventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewEventBtn;
    private javax.swing.JTable eventsTableForm;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton orderByDate;
    private javax.swing.JButton orderByName;
    // End of variables declaration//GEN-END:variables
}
