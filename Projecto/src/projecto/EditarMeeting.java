/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import projecto.MeetingsOrganizer;

/**
 *
 * @author DMORAIS
 */
public class EditarMeeting extends javax.swing.JFrame {

    /**
     * Creates new form EditarParticipante
     */
    public EditarMeeting() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMeetings = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelNumeroColaborador = new javax.swing.JLabel();
        jTextFieldNumeroC = new javax.swing.JTextField();
        jLabelIdEvento = new javax.swing.JLabel();
        jTextFieldIdNum = new javax.swing.JTextField();
        jComboBoxOperacao = new javax.swing.JComboBox<>();
        jLabelOperacao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMeetings1 = new javax.swing.JTable();
        jButtonConfirmarAlteracao = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTableMeetings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Evento", "Descrição", "Data", "Hora", "Local"
            }
        ));
        jScrollPane1.setViewportView(jTableMeetings);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Meeting", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabelNumeroColaborador.setText("Número de colaborador:");

        jTextFieldNumeroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroCActionPerformed(evt);
            }
        });

        jLabelIdEvento.setText("ID Evento:");

        jComboBoxOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adicionar", "Eliminar" }));
        jComboBoxOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperacaoActionPerformed(evt);
            }
        });

        jLabelOperacao.setText("Escolha operação");

        jTableMeetings1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Descrição", "Data", "Hora", "Local", "Participantes"
            }
        ));
        jScrollPane2.setViewportView(jTableMeetings1);

        jButtonConfirmarAlteracao.setText("Confirmar");
        jButtonConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAlteracaoActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonConfirmarAlteracao)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelNumeroColaborador)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelIdEvento)
                                    .addGap(36, 36, 36)
                                    .addComponent(jTextFieldIdNum)))
                            .addGap(29, 29, 29)
                            .addComponent(jLabelOperacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdEvento)
                    .addComponent(jTextFieldIdNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOperacao)
                    .addComponent(jComboBoxOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButtonConfirmarAlteracao)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperacaoActionPerformed
         
    }//GEN-LAST:event_jComboBoxOperacaoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         MeetingsOrganizer c = new MeetingsOrganizer();
                c.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldNumeroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroCActionPerformed

    private void jButtonConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAlteracaoActionPerformed

       PainelOrganizador m = new PainelOrganizador();
       int n = Integer.parseInt(jTextFieldNumeroC.getText());
       int idEvento = Integer.parseInt(jTextFieldIdNum.getText());
       Colaborador c = m.getColaboradorByNum(n);
       if(c!= null){
           List<Meeting> listaMeetings = c.getListMeeting();
           Meeting mee = null;
           for(Meeting meet : listaMeetings){
               if(meet.getIdEvento() == idEvento ){
                  //pegar operacao
                  String s = (String)jComboBoxOperacao.getSelectedItem();
                  if(s.equals("Adicionar")){
                      meet.addParticipante(c.getNumeroColaborador());
                  
                  }
                  else
                      meet.eliminarParticipante(n);
               }         
           }
           
           //popular a tabela!!
            DefaultTableModel tableModel = (DefaultTableModel) this.jTableMeetings.getModel();
            tableModel = eliminarLinhas(tableModel);
            for(Meeting met : listaMeetings){
                    List<Integer> lc = met.getListaParticipantes();
                   // System.out.println(met.getDescricaoEvento()+"tamanho lista: " + lc.size());
                    StringBuilder sb = new StringBuilder();
                    String s = null;
                    for(Integer co : lc){
                        Colaborador cola = m.getColaboradorByNum(co);
                        sb.append(cola.getNomeColaborador()+" nº"+cola.getNumeroColaborador());
                        sb.append(",");
                        
                    }     
                    sb.deleteCharAt(sb.length() - 1);
                    s = sb.toString();
                    Object [] ob = new Object[6];
                    ob[0] = met.getIdEvento();
                    ob[1] = met.getDescricaoEvento();
                    ob[2] = met.getDataEvento();
                    ob[3] = met.getHoraEvento();
                    ob[4] = met.getLocal();
                    if(s!= null)
                        ob[5] = s;
                    tableModel.addRow(ob);

                }
             
             jTableMeetings.setModel(tableModel);
    
       }
  
    }//GEN-LAST:event_jButtonConfirmarAlteracaoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarMeeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarMeeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarMeeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarMeeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarMeeting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonConfirmarAlteracao;
    private javax.swing.JComboBox<String> jComboBoxOperacao;
    private javax.swing.JLabel jLabelIdEvento;
    private javax.swing.JLabel jLabelNumeroColaborador;
    private javax.swing.JLabel jLabelOperacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMeetings;
    private javax.swing.JTable jTableMeetings1;
    private javax.swing.JTextField jTextFieldIdNum;
    private javax.swing.JTextField jTextFieldNumeroC;
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
