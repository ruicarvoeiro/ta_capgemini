/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DMORAIS
 */
public class PesquisaAppointmentOrganizador extends javax.swing.JFrame {

    /**
     * Creates new form appointmentsArea
     */
    public PesquisaAppointmentOrganizador() {
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

        pesquisarAppointmentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numeroColaboradorTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        appointmentsTable = new javax.swing.JTable();
        jButtonPesquisarAppointement = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonEditarApp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pesquisarAppointmentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Appointment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setText("Número de colaborador:");

        numeroColaboradorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroColaboradorTextFieldActionPerformed(evt);
            }
        });

        appointmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Evento", "Descrição", "Data", "Hora", "Local"
            }
        ));
        jScrollPane2.setViewportView(appointmentsTable);

        jButtonPesquisarAppointement.setText("Pesquisar");
        jButtonPesquisarAppointement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAppointementActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonEditarApp.setText("Editar Appointment");
        jButtonEditarApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarAppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisarAppointmentPanelLayout = new javax.swing.GroupLayout(pesquisarAppointmentPanel);
        pesquisarAppointmentPanel.setLayout(pesquisarAppointmentPanelLayout);
        pesquisarAppointmentPanelLayout.setHorizontalGroup(
            pesquisarAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarAppointmentPanelLayout.createSequentialGroup()
                .addGroup(pesquisarAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesquisarAppointmentPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroColaboradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarAppointement)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pesquisarAppointmentPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pesquisarAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pesquisarAppointmentPanelLayout.createSequentialGroup()
                                .addComponent(jButtonEditarApp)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesquisarAppointmentPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        pesquisarAppointmentPanelLayout.setVerticalGroup(
            pesquisarAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarAppointmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(pesquisarAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroColaboradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarAppointement))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButtonEditarApp)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pesquisarAppointmentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pesquisarAppointmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroColaboradorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroColaboradorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroColaboradorTextFieldActionPerformed

    private void jButtonPesquisarAppointementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAppointementActionPerformed
        int n = Integer.parseInt(numeroColaboradorTextField.getText());
        PainelOrganizador m = new PainelOrganizador();
        
        DefaultTableModel tableModel = (DefaultTableModel) this.appointmentsTable.getModel();
        tableModel = eliminarLinhas(tableModel);
        Colaborador c = m.getColaboradorByNum(n);
        List<Appointment> listaApps;
        if(c == null){
            //retornar mensagem!!!
        }
        else{
            listaApps = c.getListAppoint();
            if(listaApps.size()!=0){
             for(Appointment app : listaApps){
             Object [] ob = new Object[5];
             ob[0] = app.getIdEvento();
             ob[1] = app.getDescricaoEvento();
             ob[2] = app.getDataEvento();
             ob[3] = app.getHoraEvento();
             ob[4] = app.getLocal();
             
             tableModel.addRow(ob);
            
            
            }
           appointmentsTable.setModel(tableModel);
            } else{
            // retornar uma mensagem a dizer que nao existe resultados
            //alert!
            }
            
        }
      
    }//GEN-LAST:event_jButtonPesquisarAppointementActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PainelOrganizador c = new PainelOrganizador();
                c.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonEditarAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarAppActionPerformed
       EditarAppoint e = new EditarAppoint();
       e.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonEditarAppActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisaAppointmentOrganizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaAppointmentOrganizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaAppointmentOrganizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaAppointmentOrganizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaAppointmentOrganizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEditarApp;
    private javax.swing.JButton jButtonPesquisarAppointement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numeroColaboradorTextField;
    private javax.swing.JPanel pesquisarAppointmentPanel;
    // End of variables declaration//GEN-END:variables
private DefaultTableModel eliminarLinhas(DefaultTableModel t) {
       while (t.getRowCount() != 0) {
            for (int i = 0; i < t.getRowCount(); i++) {
                t.removeRow(i);
            }
        }
        return t;
    }
}
