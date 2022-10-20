/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author 22282227
 */
public class PanelEspecialidades extends javax.swing.JPanel {

    private int linha;
    
    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidades();
        preencherTabela();
    }
    
    //metodos
    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }
    
    private Integer getCodigo(){
        String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr); 
        return codigo;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonNovaEspecialidade = new javax.swing.JButton();
        buttonEditarEspecialidade = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades médicas:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        setPreferredSize(new java.awt.Dimension(880, 380));
        setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollEspecialidades.setViewportView(tableEspecialidades);

        add(scrollEspecialidades);
        scrollEspecialidades.setBounds(10, 30, 860, 280);

        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("EXCLUIR a Especialidade selecionada");
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(640, 320, 60, 50);

        buttonNovaEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonNovaEspecialidade.setToolTipText("ADICIONAR uma nova Especialidade");
        buttonNovaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonNovaEspecialidade);
        buttonNovaEspecialidade.setBounds(800, 320, 60, 50);

        buttonEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarEspecialidade.setToolTipText("EDITAR a Especialidade selecionada");
        buttonEditarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonEditarEspecialidade);
        buttonEditarEspecialidade.setBounds(720, 320, 60, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed

        if( getLinha() != -1){
            excluirEspecialidade();
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor selecione a especialidade que deseja excluir!!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed
    
    private void excluirEspecialidade(){
        
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
            EspecialidadeDAO.excluir(getCodigo());
            preencherTabela();
        }

    }
    private void buttonNovaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovaEspecialidadeActionPerformed
        
        EspecialidadesDialog d = 
                new EspecialidadesDialog(
                        null,
                        true, 
                        OperacaoEnum.ADICIONAR);
        
        d.setVisible(true);
        
        preencherTabela();
        
    }//GEN-LAST:event_buttonNovaEspecialidadeActionPerformed

    private void buttonEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadeActionPerformed

        if(getLinha() != -1){
            editarEspecialidade();    
        }else{
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor, selecione a Especialidade que você deseja EDITAR",
                    "Especialidades",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarEspecialidadeActionPerformed
  
    private void editarEspecialidade(){
        
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        EspecialidadesDialog especialidadeDialog = 
                new EspecialidadesDialog(
                        null, 
                        true, 
                        especialidade, 
                        OperacaoEnum.EDITAR);
        
        especialidadeDialog.setVisible(true);
        preencherTabela();
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JButton buttonNovaEspecialidade;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        
        tableEspecialidades.setModel(EspecialidadeDAO.getTabelaEspecialidades());
        ajustarTabela();
        
    }
        
    private void ajustarTabela(){
        
        //Impedir que o usuario movimente as colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);
        
        //bloquear as edições das células da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);
        
        //denifir a largura das colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(557);
        
    }
    
    
    
}
