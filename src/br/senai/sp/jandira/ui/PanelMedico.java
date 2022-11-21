package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import javax.swing.JTable;


public class PanelMedico extends javax.swing.JPanel {

    public PanelMedico() {
        initComponents();
        MedicoDAO.criarListaDeMedico();
        preencherTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollMedico = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        buttonExcluirMedico = new javax.swing.JButton();
        buttonNovaMedico = new javax.swing.JButton();
        buttonEditarMedico = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        setPreferredSize(new java.awt.Dimension(880, 380));
        setLayout(null);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollMedico.setViewportView(tableMedico);

        add(scrollMedico);
        scrollMedico.setBounds(10, 30, 860, 280);

        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("EXCLUIR o Médico");
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(640, 320, 60, 50);

        buttonNovaMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonNovaMedico.setToolTipText("ADICIONAR um novo Médico");
        buttonNovaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaMedicoActionPerformed(evt);
            }
        });
        add(buttonNovaMedico);
        buttonNovaMedico.setBounds(800, 320, 60, 50);

        buttonEditarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarMedico.setToolTipText("EDITAR o Médico");
        buttonEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicoActionPerformed(evt);
            }
        });
        add(buttonEditarMedico);
        buttonEditarMedico.setBounds(720, 320, 60, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed

        
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed

    private void buttonNovaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaMedicoActionPerformed
        MedicoDialog medico =
                new MedicoDialog(
                        null, 
                        true);
        
        medico.setVisible(true);
        
        preencherTabela();
    }//GEN-LAST:event_buttonNovaMedicoActionPerformed

    private void buttonEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicoActionPerformed

        
    }//GEN-LAST:event_buttonEditarMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JButton buttonNovaMedico;
    private javax.swing.JScrollPane scrollMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables
 private void preencherTabela(){
      
        tableMedico.setModel(MedicoDAO.getTabelaMedico());
        ajustarTabela();
    }
    
    private void ajustarTabela(){
        tableMedico.getTableHeader().setReorderingAllowed(false);
        
        tableMedico.setDefaultEditor(Object.class, null);
        
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(200);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(200);
        tableMedico.getColumnModel().getColumn(3).setPreferredWidth(200);
    }


}
