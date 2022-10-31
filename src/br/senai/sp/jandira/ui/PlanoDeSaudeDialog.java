
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {
    
    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;

    public PlanoDeSaudeDialog(
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
    public PlanoDeSaudeDialog(
            java.awt.Frame parent, 
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png")));
        
        planoDeSaude = p;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
    }
    
    private void preencherFormulario(){
     
        textFieldNomeDaOperadora.setText(planoDeSaude.getOperadora());
        textFieldCategoriaPlanoDeSaude.setText(planoDeSaude.getCategoria());
        textFieldNumeroPlanoDeSaude.setText(planoDeSaude.getNumeroDaCarteira());
        formattedTextFieldValidade.setText(planoDeSaude.getValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        System.out.println(planoDeSaude.getValidade().toString());
}
    
    
    private void preencherTitulo(){
        labelTitulo.setText(" PLANO DE SAÚDE - " + operacao);
        
        if(operacao == OperacaoEnum.EDITAR){
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png")));
        }else{
           labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); 
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelNumeroPlanoDeSaude = new javax.swing.JLabel();
        textFieldNumeroPlanoDeSaude = new javax.swing.JTextField();
        labelNomeDaOperadora = new javax.swing.JLabel();
        textFieldNomeDaOperadora = new javax.swing.JTextField();
        labelCategoriaPlanoDeSaude = new javax.swing.JLabel();
        textFieldCategoriaPlanoDeSaude = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        formattedTextFieldValidade = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        labelTitulo.setText("    PLANO DE SAÚDE - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(40, 10, 460, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano de saúde:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel2.setLayout(null);

        labelNumeroPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNumeroPlanoDeSaude.setText("Número :");
        jPanel2.add(labelNumeroPlanoDeSaude);
        labelNumeroPlanoDeSaude.setBounds(30, 40, 60, 16);

        textFieldNumeroPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroPlanoDeSaudeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNumeroPlanoDeSaude);
        textFieldNumeroPlanoDeSaude.setBounds(30, 60, 240, 30);

        labelNomeDaOperadora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomeDaOperadora.setText("Nome da Operadora :");
        jPanel2.add(labelNomeDaOperadora);
        labelNomeDaOperadora.setBounds(30, 130, 140, 16);

        textFieldNomeDaOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDaOperadoraActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeDaOperadora);
        textFieldNomeDaOperadora.setBounds(30, 150, 240, 30);

        labelCategoriaPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCategoriaPlanoDeSaude.setText("Categoria :");
        jPanel2.add(labelCategoriaPlanoDeSaude);
        labelCategoriaPlanoDeSaude.setBounds(30, 210, 110, 16);

        textFieldCategoriaPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCategoriaPlanoDeSaudeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCategoriaPlanoDeSaude);
        textFieldCategoriaPlanoDeSaude.setBounds(30, 230, 240, 30);

        labelValidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelValidade.setText("Validade :");
        jPanel2.add(labelValidade);
        labelValidade.setBounds(560, 60, 70, 20);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(560, 250, 60, 50);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(650, 250, 60, 50);

        formattedTextFieldValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldValidadeActionPerformed(evt);
            }
        });
        jPanel2.add(formattedTextFieldValidade);
        formattedTextFieldValidade.setBounds(510, 90, 170, 22);
        try {
            formattedTextFieldValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                new javax.swing.text.MaskFormatter("##/##/####")));
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();
    }

    getContentPane().add(jPanel2);
    jPanel2.setBounds(20, 100, 750, 310);

    setSize(new java.awt.Dimension(804, 475));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNumeroPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroPlanoDeSaudeActionPerformed

    private void textFieldNomeDaOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDaOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDaOperadoraActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        
        CharSequence s = " ";
        
        if(textFieldNumeroPlanoDeSaude.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite o Número da sua carteira");
            textFieldNumeroPlanoDeSaude.requestFocus();
        }else if(textFieldNomeDaOperadora.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite o nome da Operadora");
            textFieldNomeDaOperadora.requestFocus();
        }else if(textFieldCategoriaPlanoDeSaude.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite o nome da Categoria");
            textFieldCategoriaPlanoDeSaude.requestFocus();
        }else if(formattedTextFieldValidade.getText().contains(s) == true){
            JOptionPane.showMessageDialog(this, "POR FAVOR !!! Digite uma data correta");
            formattedTextFieldValidade.requestFocus();
        } else {
            if (operacao == OperacaoEnum.ADICIONAR){
                adicionar();
            }else {
                editar();
            }
        }
        
        
        
        

    }//GEN-LAST:event_buttonSalvarActionPerformed
    
    private void adicionar(){
        
        //Criar um objeto 
        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
        novoPlanoDeSaude.setNumeroDaCarteira(textFieldNumeroPlanoDeSaude.getText());
        novoPlanoDeSaude.setOperadora(textFieldNomeDaOperadora.getText());
        novoPlanoDeSaude.setCategoria(textFieldCategoriaPlanoDeSaude.getText());
        novoPlanoDeSaude.setValidade(LocalDate.parse(formattedTextFieldValidade.getText(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        PlanoDeSaudeDAO.gravar(novoPlanoDeSaude);
        
        JOptionPane.showMessageDialog(
                this, 
                "Plano de Saúde gravado com Sucesso!", 
                "Plano De Saude", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    private void editar(){
        
        planoDeSaude.setOperadora(textFieldNomeDaOperadora.getText());
        planoDeSaude.setCategoria(textFieldCategoriaPlanoDeSaude.getText());
        planoDeSaude.setValidade(LocalDate.parse(formattedTextFieldValidade.getText(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        planoDeSaude.setNumeroDaCarteira(textFieldNumeroPlanoDeSaude.getText());

        PlanoDeSaudeDAO.atualizar(planoDeSaude);
        
        JOptionPane.showMessageDialog(
                null, 
                "Plano de Saúde atualizado com Sucesso!", 
                "Plano de Saúde", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textFieldCategoriaPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCategoriaPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCategoriaPlanoDeSaudeActionPerformed

    private void formattedTextFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldValidadeActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField formattedTextFieldValidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCategoriaPlanoDeSaude;
    private javax.swing.JLabel labelNomeDaOperadora;
    private javax.swing.JLabel labelNumeroPlanoDeSaude;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JTextField textFieldCategoriaPlanoDeSaude;
    private javax.swing.JTextField textFieldNomeDaOperadora;
    private javax.swing.JTextField textFieldNumeroPlanoDeSaude;
    // End of variables declaration//GEN-END:variables
}
