
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class EspecialidadesDialog extends javax.swing.JDialog {

    
    private Especialidade especialidade;
    private OperacaoEnum operacao;
    
    //novo
    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png")));
        this.operacao = operacao;
        preencherTitulo();
    }

  //exclusivo do editar
    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png")));
        
        especialidade = e;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
        
    }
    
    private void preencherFormulario(){
        
        textFieldCodigoEspecialidade.setText(especialidade.getCodigo().toString());
        textFieldNomeDaEspecialidade.setText(especialidade.getNome());
        textFieldDescriçãoEspecialidade.setText(especialidade.getDescricao());
        
    }
 //----------------------  
    
    private void preencherTitulo() {
        labelTitulo.setText(" Especialidades - " + operacao);
        
        if(operacao == OperacaoEnum.EDITAR){
          labelTitulo.setIcon(new javax.swing.ImageIcon(
                  getClass().getResource(
                          "/br/senai/sp/jandira/imagens/editar.png")));  
        }else{
          labelTitulo.setIcon(new javax.swing.ImageIcon(
                  getClass().getResource(
                          "/br/senai/sp/jandira/imagens/adicionar.png")));
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigoEspecialidade = new javax.swing.JLabel();
        textFieldCodigoEspecialidade = new javax.swing.JTextField();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        textFieldNomeDaEspecialidade = new javax.swing.JTextField();
        labelDescriçãoEspecialidade = new javax.swing.JLabel();
        textFieldDescriçãoEspecialidade = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        labelTitulo.setText("    Especialidades - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(40, 10, 420, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel2.setLayout(null);

        labelCodigoEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCodigoEspecialidade.setText("Código :");
        jPanel2.add(labelCodigoEspecialidade);
        labelCodigoEspecialidade.setBounds(30, 40, 60, 16);

        textFieldCodigoEspecialidade.setEditable(false);
        textFieldCodigoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigoEspecialidade);
        textFieldCodigoEspecialidade.setBounds(30, 60, 140, 30);

        labelNomeDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomeDaEspecialidade.setText("Nome da Especialidade :");
        jPanel2.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(30, 110, 140, 16);

        textFieldNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeDaEspecialidade);
        textFieldNomeDaEspecialidade.setBounds(30, 130, 330, 30);

        labelDescriçãoEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDescriçãoEspecialidade.setText("Descrição");
        jPanel2.add(labelDescriçãoEspecialidade);
        labelDescriçãoEspecialidade.setBounds(30, 180, 60, 16);

        textFieldDescriçãoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescriçãoEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldDescriçãoEspecialidade);
        textFieldDescriçãoEspecialidade.setBounds(30, 200, 540, 30);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(680, 250, 60, 50);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(600, 250, 60, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 100, 750, 310);

        setSize(new java.awt.Dimension(804, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoEspecialidadeActionPerformed

    private void textFieldNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDaEspecialidadeActionPerformed

    private void textFieldDescriçãoEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescriçãoEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDescriçãoEspecialidadeActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
         dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        
        if (operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{
            editar();
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed
//dando erro pq a validade ainda não está sendo chamada por um "textfield" então vai dar errado
    //fazer isso na proxima aula e fazer o botão editar
    private void adicionar(){
        //Criar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNomeDaEspecialidade.getText());
        novaEspecialidade.setDescricao(textFieldDescriçãoEspecialidade.getText());
        
        
        //gravar o objeto, através do DAO.
        EspecialidadeDAO.gravar(novaEspecialidade);
        
        JOptionPane.showMessageDialog(this,
                "Especialidade gravada com Sucesso!",
                "Especialidades", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose(); 
    }

    private void editar(){
        
        especialidade.setNome(textFieldNomeDaEspecialidade.getText());
        especialidade.setDescricao(textFieldDescriçãoEspecialidade.getText());
        
        EspecialidadeDAO.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(
                null, 
                "Especialidade atualizada com sucesso!", 
                "Especialidades", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigoEspecialidade;
    private javax.swing.JLabel labelDescriçãoEspecialidade;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textFieldCodigoEspecialidade;
    private javax.swing.JTextField textFieldDescriçãoEspecialidade;
    private javax.swing.JTextField textFieldNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
