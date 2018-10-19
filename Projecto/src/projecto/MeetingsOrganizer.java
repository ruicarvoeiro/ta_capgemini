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
public class MeetingsOrganizer extends javax.swing.JFrame {
    int valorBrutal;
    /**
     * Creates new form meetingsArea
     */
    public MeetingsOrganizer() {
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

        MeetingsAreaPanel = new javax.swing.JPanel();
        pesquisarMeetingsLabel = new javax.swing.JLabel();
        numeroColaboradorTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMeetings = new javax.swing.JTable();
        jButtonPesquisarMeetings = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MeetingsAreaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Meetings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        pesquisarMeetingsLabel.setText("Pesquisar por número de Colaborador:");

        numeroColaboradorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroColaboradorTextFieldActionPerformed(evt);
            }
        });

        jTableMeetings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Evento", "Descrição", "Data", "Hora", "Local", "Parts"
            }
        ));
        jScrollPane1.setViewportView(jTableMeetings);

        jButtonPesquisarMeetings.setText("Pesquisar");
        jButtonPesquisarMeetings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarMeetingsActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Editar Meeting");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MeetingsAreaPanelLayout = new javax.swing.GroupLayout(MeetingsAreaPanel);
        MeetingsAreaPanel.setLayout(MeetingsAreaPanelLayout);
        MeetingsAreaPanelLayout.setHorizontalGroup(
            MeetingsAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MeetingsAreaPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MeetingsAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEliminar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MeetingsAreaPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(MeetingsAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(MeetingsAreaPanelLayout.createSequentialGroup()
                                .addComponent(pesquisarMeetingsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroColaboradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jButtonPesquisarMeetings)))))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        MeetingsAreaPanelLayout.setVerticalGroup(
            MeetingsAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MeetingsAreaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MeetingsAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarMeetingsLabel)
                    .addComponent(numeroColaboradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarMeetings))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButtonEliminar)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MeetingsAreaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MeetingsAreaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PainelOrganizador c = new PainelOrganizador();
                c.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numeroColaboradorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroColaboradorTextFieldActionPerformed

    }//GEN-LAST:event_numeroColaboradorTextFieldActionPerformed

    private void jButtonPesquisarMeetingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarMeetingsActionPerformed

        //numero do colaborador
        int n = Integer.parseInt(numeroColaboradorTextField.getText());
        PainelOrganizador m = new PainelOrganizador();

        DefaultTableModel tableModel = (DefaultTableModel) this.jTableMeetings.getModel();
        tableModel = eliminarLinhas(tableModel);
        Colaborador c = m.getColaboradorByNum(n);
        List<Meeting> listaMeetings;
        if(c == null){
            //retornar mensagem!!!
        }
        else{
            listaMeetings = c.getListMeeting();
            if(listaMeetings.size()!=0){
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
                
            } else{
                // retornar uma mensagem a dizer que nao existe resultados
                //alert!
            }

        }
    }//GEN-LAST:event_jButtonPesquisarMeetingsActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        EditarMeeting p = new EditarMeeting();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(MeetingsOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeetingsOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeetingsOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeetingsOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MeetingsOrganizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MeetingsAreaPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonPesquisarMeetings;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMeetings;
    private javax.swing.JTextField numeroColaboradorTextField;
    private javax.swing.JLabel pesquisarMeetingsLabel;
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
