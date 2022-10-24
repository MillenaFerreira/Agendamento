/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PanelPlanoDeSaude extends javax.swing.JPanel {

    private int linha;
    
    public PanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanoDeSaude();
        preencherTabela();
    }
    
    private Integer getLinha(){
        linha = tablePlanoDeSaude.getSelectedRow();
        return linha;
    }
    
    private String getNumero(){
        String numeroStr = tablePlanoDeSaude.getValueAt(getLinha(), 0).toString();
        //Integer numero = Integer.valueOf(numeroStr);
        return numeroStr;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPlanoDeSaude = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonNovaPlanoDeSaude = new javax.swing.JButton();
        buttonEditarPlanoDeSaude = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos de Saúde:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        setPreferredSize(new java.awt.Dimension(880, 380));
        setLayout(null);

        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPlanoDeSaude.setViewportView(tablePlanoDeSaude);

        add(scrollPlanoDeSaude);
        scrollPlanoDeSaude.setBounds(10, 30, 860, 280);

        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("EXCLUIR a Especialidade selecionada");
        buttonExcluirPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(640, 320, 60, 50);

        buttonNovaPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonNovaPlanoDeSaude.setToolTipText("ADICIONAR uma nova Especialidade");
        buttonNovaPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonNovaPlanoDeSaude);
        buttonNovaPlanoDeSaude.setBounds(800, 320, 60, 50);

        buttonEditarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarPlanoDeSaude.setToolTipText("EDITAR a Especialidade selecionada");
        buttonEditarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonEditarPlanoDeSaude);
        buttonEditarPlanoDeSaude.setBounds(720, 320, 60, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed

        if( getLinha() != -1){
            excluirPlanoDeSaude();
        }else{
            JOptionPane.showMessageDialog(
                this,
                "Por favor selecione o plano de saúde que deseja excluir!!",
                "Atenção",
                JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed
    
    private void excluirPlanoDeSaude(){
        
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão", 
                "Atenção", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
            PlanoDeSaudeDAO.excluir(getNumero().toString());
            preencherTabela();
        }
    }
    
    
    private void buttonNovaPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaPlanoDeSaudeActionPerformed
        PlanoDeSaudeDialog planoDeSaude = 
                new PlanoDeSaudeDialog(
                null, 
                true);
        
        planoDeSaude.setVisible(true);
        
        preencherTabela();
    }//GEN-LAST:event_buttonNovaPlanoDeSaudeActionPerformed

    private void buttonEditarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanoDeSaudeActionPerformed


    }//GEN-LAST:event_buttonEditarPlanoDeSaudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JButton buttonNovaPlanoDeSaude;
    private javax.swing.JScrollPane scrollPlanoDeSaude;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables
    
    private void preencherTabela(){
        
        tablePlanoDeSaude.setModel(PlanoDeSaudeDAO.getTabelaPlanoDeSaude());
        ajustarTabela();
    }

    private void ajustarTabela(){
        
        tablePlanoDeSaude.getTableHeader().setReorderingAllowed(false);
        
        tablePlanoDeSaude.setDefaultEditor(Object.class, null);
        
        tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(200);
        tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(200);
        tablePlanoDeSaude.getColumnModel().getColumn(3).setPreferredWidth(200);
    }


}
