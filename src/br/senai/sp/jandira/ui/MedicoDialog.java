
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;
    
    public MedicoDialog(
            java.awt.Frame parent, 
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                getClass().getResource(
                        "/br/senai/sp/jandira/imagens/agenda.png")));
        this.operacao = operacao;
        preencherTitulo();
        adicionandoNaList();
       // aaa();
    }
    
    public MedicoDialog(
            java.awt.Frame parent, 
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                getClass().getResource(
                        "/br/senai/sp/jandira/imagens/agenda.png")));
        
        medico = m;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
        adicionandoNaList();
       // aaa();
    }
    
    private void preencherFormulario(){
        
        textFieldCodigoMedico.setText(medico.getCodigo().toString());
        textFieldCrmMedico.setText(medico.getCrm());
        textFieldNomeDoMedico.setText(medico.getNome());
        textFieldTelefoneMedico.setText(medico.getTelefone());
        textFieldEmailMedico.setText(medico.getEmail());
        formattedTextFieldDataDeNascimento.setText(
                medico.getDataDeNascimento().format(
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private void preencherTitulo(){
        labelTitulo.setText(" Médico - " + operacao);
        
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
        labelCodigoMedico = new javax.swing.JLabel();
        textFieldCodigoMedico = new javax.swing.JTextField();
        labelCrmMedico = new javax.swing.JLabel();
        textFieldCrmMedico = new javax.swing.JTextField();
        labelNomeDoMedico = new javax.swing.JLabel();
        textFieldNomeDoMedico = new javax.swing.JTextField();
        labelTelefoneMedico = new javax.swing.JLabel();
        textFieldTelefoneMedico = new javax.swing.JTextField();
        labelEmailMedico = new javax.swing.JLabel();
        textFieldEmailMedico = new javax.swing.JTextField();
        labelDataDeNascimentoMedico = new javax.swing.JLabel();
        formattedTextFieldDataDeNascimento = new javax.swing.JFormattedTextField();
        labelListaEspecialidade = new javax.swing.JLabel();
        scrollListaDeEspecialidade = new javax.swing.JScrollPane();
        listListaDeEspecialidade = new javax.swing.JList<>();
        buttonDireita = new javax.swing.JButton();
        buttonEsquerda = new javax.swing.JButton();
        labelEspecialidadesDoMedico = new javax.swing.JLabel();
        scrollEspecialidadesDoMedico = new javax.swing.JScrollPane();
        listEspecialidadesDoMedico = new javax.swing.JList<>();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        labelTitulo.setText("    Médico - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(40, 10, 420, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Médico :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jPanel2.setLayout(null);

        labelCodigoMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCodigoMedico.setText("Código :");
        jPanel2.add(labelCodigoMedico);
        labelCodigoMedico.setBounds(30, 40, 60, 16);

        textFieldCodigoMedico.setEditable(false);
        textFieldCodigoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigoMedico);
        textFieldCodigoMedico.setBounds(30, 60, 130, 30);

        labelCrmMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCrmMedico.setText("CRM :");
        jPanel2.add(labelCrmMedico);
        labelCrmMedico.setBounds(180, 40, 80, 16);

        textFieldCrmMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCrmMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCrmMedico);
        textFieldCrmMedico.setBounds(180, 60, 160, 30);

        labelNomeDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomeDoMedico.setText("Nome do Médico :");
        jPanel2.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(360, 40, 120, 16);

        textFieldNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeDoMedico);
        textFieldNomeDoMedico.setBounds(360, 60, 370, 30);

        labelTelefoneMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTelefoneMedico.setText("Telefone :");
        jPanel2.add(labelTelefoneMedico);
        labelTelefoneMedico.setBounds(30, 100, 60, 16);

        textFieldTelefoneMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldTelefoneMedico);
        textFieldTelefoneMedico.setBounds(30, 120, 160, 30);

        labelEmailMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelEmailMedico.setText("E-mail :");
        jPanel2.add(labelEmailMedico);
        labelEmailMedico.setBounds(200, 100, 60, 16);

        textFieldEmailMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldEmailMedico);
        textFieldEmailMedico.setBounds(200, 120, 390, 30);

        labelDataDeNascimentoMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataDeNascimentoMedico.setText("Data de Nascimento :");
        jPanel2.add(labelDataDeNascimentoMedico);
        labelDataDeNascimentoMedico.setBounds(600, 100, 130, 16);

        formattedTextFieldDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldDataDeNascimentoActionPerformed(evt);
            }
        });
        jPanel2.add(formattedTextFieldDataDeNascimento);
        formattedTextFieldDataDeNascimento.setBounds(600, 120, 130, 30);
        try {
            formattedTextFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                new javax.swing.text.MaskFormatter("##/##/####")));
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();
    }

    labelListaEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    labelListaEspecialidade.setText("Lista de Especialidades :");
    jPanel2.add(labelListaEspecialidade);
    labelListaEspecialidade.setBounds(30, 180, 140, 16);

    listListaDeEspecialidade.setModel(new javax.swing.AbstractListModel<String>() {
        String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
        public int getSize() { return strings.length; }
        public String getElementAt(int i) { return strings[i]; }
    });
    scrollListaDeEspecialidade.setViewportView(listListaDeEspecialidade);

    jPanel2.add(scrollListaDeEspecialidade);
    scrollListaDeEspecialidade.setBounds(30, 200, 280, 190);

    buttonDireita.setBackground(new java.awt.Color(0, 255, 0));
    buttonDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-direita.png"))); // NOI18N
    buttonDireita.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonDireitaActionPerformed(evt);
        }
    });
    jPanel2.add(buttonDireita);
    buttonDireita.setBounds(330, 230, 70, 40);

    buttonEsquerda.setBackground(new java.awt.Color(255, 51, 51));
    buttonEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-esquerda.png"))); // NOI18N
    buttonEsquerda.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonEsquerdaActionPerformed(evt);
        }
    });
    jPanel2.add(buttonEsquerda);
    buttonEsquerda.setBounds(330, 310, 70, 40);

    labelEspecialidadesDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    labelEspecialidadesDoMedico.setText("Especialidades do Médico :");
    jPanel2.add(labelEspecialidadesDoMedico);
    labelEspecialidadesDoMedico.setBounds(430, 180, 160, 16);

    scrollEspecialidadesDoMedico.setViewportView(listEspecialidadesDoMedico);

    jPanel2.add(scrollEspecialidadesDoMedico);
    scrollEspecialidadesDoMedico.setBounds(430, 200, 280, 190);

    buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
    buttonCancelar.setToolTipText("Cancelar");
    buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonCancelarActionPerformed(evt);
        }
    });
    jPanel2.add(buttonCancelar);
    buttonCancelar.setBounds(580, 420, 60, 50);

    buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salvar.png"))); // NOI18N
    buttonSalvar.setToolTipText("Salvar");
    buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonSalvarActionPerformed(evt);
        }
    });
    jPanel2.add(buttonSalvar);
    buttonSalvar.setBounds(660, 420, 60, 50);

    getContentPane().add(jPanel2);
    jPanel2.setBounds(20, 80, 750, 480);

    setSize(new java.awt.Dimension(804, 614));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoMedicoActionPerformed

    private void textFieldNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDoMedicoActionPerformed

    private void textFieldTelefoneMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneMedicoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        
        CharSequence s = " ";
        
        if(textFieldCrmMedico.getText().isEmpty()){
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor !! Digite o CRM do Médico");
            textFieldCrmMedico.requestFocus();
        }else if(textFieldNomeDoMedico.getText().isEmpty()){
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor !! Digite o Nome do Médico");
            textFieldNomeDoMedico.requestFocus();
        }else if(textFieldTelefoneMedico.getText().isEmpty()){
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor !! Digite o E-mail do Médico");
            textFieldTelefoneMedico.requestFocus();
        }else if(textFieldEmailMedico.getText().isEmpty()){
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor !! Digite o Telefone do Médico");
            textFieldEmailMedico.requestFocus();
        }else if(formattedTextFieldDataDeNascimento.getText().contains(s) == true){
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor !! Digite a Data correta!");
            formattedTextFieldDataDeNascimento.requestFocus();
        }else{
            if(operacao == OperacaoEnum.ADICIONAR){
                adicionar();
            }else{
                editar();
            }
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed
    
    private void adicionar(){
        Medico novoMedico = new Medico();
        novoMedico.setCrm(textFieldCrmMedico.getText());
        novoMedico.setNome(textFieldNomeDoMedico.getText());
        novoMedico.setTelefone(textFieldTelefoneMedico.getText());
        novoMedico.setEmail(textFieldEmailMedico.getText());
        novoMedico.setDataDeNascimento(LocalDate.parse(
                formattedTextFieldDataDeNascimento.getText(), 
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        MedicoDAO.gravar(novoMedico);
        
        JOptionPane.showMessageDialog(
                this, 
                "Novo Médico gravado com Sucesso!", 
                "Médico", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    private void editar(){
    
        medico.setCrm(textFieldCrmMedico.getText());
        medico.setNome(textFieldNomeDoMedico.getText());
        medico.setTelefone(textFieldTelefoneMedico.getText());
        medico.setEmail(textFieldEmailMedico.getText());
        medico.setDataDeNascimento(LocalDate.parse(
                formattedTextFieldDataDeNascimento.getText(), 
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        MedicoDAO.atualizar(medico);
        
        JOptionPane.showMessageDialog(
                null, 
                "Médico atualizado com sucesso!", 
                "Médico", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
}
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textFieldCrmMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCrmMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCrmMedicoActionPerformed

    private void textFieldEmailMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailMedicoActionPerformed

    private void buttonDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDireitaActionPerformed

        if (listEspecialidadesDoMedico.isSelectionEmpty() == true) {
            
            ArrayList<String> novaLista = new ArrayList<>();
            
            int tamanho = listEspecialidadesDoMedico.getModel().getSize();
            
            for(int i = 0; i < tamanho; i++){
                novaLista.add(listEspecialidadesDoMedico.getModel().getElementAt(i));
            }
            
            if(novaLista.contains(listListaDeEspecialidade.getSelectedValue()) == false){
                novaLista.add(listListaDeEspecialidade.getSelectedValue());
                
                DefaultListModel<String> listaEspecilidadeMedicoModel = new DefaultListModel<>();
                
                for(String acaoDoBotaoAvancar : novaLista){
                    listaEspecilidadeMedicoModel.addElement(acaoDoBotaoAvancar);
                }
                listEspecialidadesDoMedico.setModel(listaEspecilidadeMedicoModel);
                
            }else{
                JOptionPane.showMessageDialog(null, 
                        "Você não pode adicionar ema especialidade já cadastrada!", 
                        "Médico", 
                        JOptionPane.WARNING_MESSAGE);
            } 
        
        
        }else{
                JOptionPane.showMessageDialog(
                this, 
                "Selecione uma especialidade", 
                "Médico", 
                JOptionPane.WARNING_MESSAGE);
                }       








// DefaultListModel<String> listaEspecialidadeMedico = new DefaultListModel<>();
        //     for(Especialidade especialidade : EspecialidadeDAO.getEspecialidades()){
          //      listaEspecialidadeMedico.addElement(listListaDeEspecialidade.getSelectedValue());
           //   break;
              
            // }
             //listEspecialidadesDoMedico.setModel(listaEspecialidadeMedico);
        
        
      //listListaDeEspecialidade.getSelectedValue();
      //System.out.println( listListaDeEspecialidade.getSelectedValue());
        
       //int valeu = listListaDeEspecialidade.getSelectedIndex();
       //System.out.println(listListaDeEspecialidade.getSelectedIndex());
        
       //if(listListaDeEspecialidade.getSelectedIndex() == 0){
        //   listEspecialidadesDoMedico.addElement();
       //}else{
       //    
       //
       
       
       //terminar
        
    }//GEN-LAST:event_buttonDireitaActionPerformed

    private void buttonEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsquerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEsquerdaActionPerformed

    private void formattedTextFieldDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldDataDeNascimentoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonDireita;
    private javax.swing.JButton buttonEsquerda;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField formattedTextFieldDataDeNascimento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigoMedico;
    private javax.swing.JLabel labelCrmMedico;
    private javax.swing.JLabel labelDataDeNascimentoMedico;
    private javax.swing.JLabel labelEmailMedico;
    private javax.swing.JLabel labelEspecialidadesDoMedico;
    private javax.swing.JLabel labelListaEspecialidade;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelTelefoneMedico;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listEspecialidadesDoMedico;
    private javax.swing.JList<String> listListaDeEspecialidade;
    private javax.swing.JScrollPane scrollEspecialidadesDoMedico;
    private javax.swing.JScrollPane scrollListaDeEspecialidade;
    private javax.swing.JTextField textFieldCodigoMedico;
    private javax.swing.JTextField textFieldCrmMedico;
    private javax.swing.JTextField textFieldEmailMedico;
    private javax.swing.JTextField textFieldNomeDoMedico;
    private javax.swing.JTextField textFieldTelefoneMedico;
    // End of variables declaration//GEN-END:variables

    //mostrar os dados na Jlist com o DefaultListModel<String>
    private void adicionandoNaList(){ 
        listListaDeEspecialidade.setModel(
                EspecialidadeDAO.getListaEspecialidade());
        
}  
    //private void aaa(){ 
      ///  listEspecialidadesDoMedico.setModel(
         //       EspecialidadeDAO.getListaEspecialidadesDoMedico());
        
//}  
    
    
}
   
    

