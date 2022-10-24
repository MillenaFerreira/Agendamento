
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.awt.Toolkit;


public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png")));
        initPanels();
    }
        
    //Atributos da classe
    PanelEspecialidades panelEspecialidades;
    PanelPlanoDeSaude panelPlanoDeSaude;
    
    //Constantes
    private final int POS_X = 10;
    private final int POS_Y = 150;
    private final int LARGURA = 880;
    private final int ALTURA = 380;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        labelNomeDaEmpresa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRisca = new javax.swing.JPanel();
        labelDadosParaContatos = new javax.swing.JLabel();
        labelSite = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelIconEmpresa1 = new javax.swing.JLabel();
        labelIconEmpresa2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agendamento de Consultas");
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(null);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendario.png"))); // NOI18N
        jPanel1.add(labelIcon);
        labelIcon.setBounds(50, 0, 70, 70);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        labelTitulo.setText("Agendamento de Consultas");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(220, 10, 490, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 70);

        buttonSair.setBackground(new java.awt.Color(255, 0, 0));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sair.png"))); // NOI18N
        buttonSair.setToolTipText("Sair");
        buttonSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(810, 90, 70, 40);

        buttonHome.setBackground(new java.awt.Color(102, 255, 102));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/home.png"))); // NOI18N
        buttonHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(20, 90, 70, 40);

        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Paciente.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(290, 90, 80, 40);

        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Especialidade.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidade");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(470, 90, 80, 40);

        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(380, 90, 80, 40);

        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(200, 90, 80, 40);

        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/PlanoDeSaude.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Planos de Saúde");
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(560, 90, 90, 40);

        panelHome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HOME:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        panelHome.setLayout(null);

        labelNomeDaEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        labelNomeDaEmpresa.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        labelNomeDaEmpresa.setText("   SISACON");
        panelHome.add(labelNomeDaEmpresa);
        labelNomeDaEmpresa.setBounds(320, 40, 210, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Sistema para Agendamento de Consulta");
        panelHome.add(jLabel2);
        jLabel2.setBounds(290, 90, 280, 20);

        panelRisca.setBackground(new java.awt.Color(51, 255, 255));
        panelHome.add(panelRisca);
        panelRisca.setBounds(30, 134, 830, 10);

        labelDadosParaContatos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        labelDadosParaContatos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDadosParaContatos.setText("Dados para contato:");
        panelHome.add(labelDadosParaContatos);
        labelDadosParaContatos.setBounds(660, 170, 190, 20);

        labelSite.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelSite.setText("Site: www.sisacon.com.br");
        panelHome.add(labelSite);
        labelSite.setBounds(660, 240, 190, 16);

        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmail.setText("Email: suporte@sisacon.com.br");
        panelHome.add(labelEmail);
        labelEmail.setBounds(660, 200, 190, 16);

        labelTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTelefone.setText("Telefone: (11)95748-5959");
        panelHome.add(labelTelefone);
        labelTelefone.setBounds(660, 220, 190, 16);

        labelIconEmpresa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/empresa.png"))); // NOI18N
        panelHome.add(labelIconEmpresa1);
        labelIconEmpresa1.setBounds(200, 40, 70, 70);

        labelIconEmpresa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/empresa.png"))); // NOI18N
        panelHome.add(labelIconEmpresa2);
        labelIconEmpresa2.setBounds(580, 40, 70, 70);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 150, 880, 380);

        setSize(new java.awt.Dimension(912, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        
        panelEspecialidades.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelHome.setVisible(true);
        
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        
        panelEspecialidades.setVisible(true);
        panelHome.setVisible(false);
        
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        panelEspecialidades.setVisible(false);
        panelPlanoDeSaude.setVisible(true);
        panelHome.setVisible(false);
        
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDadosParaContatos;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelIconEmpresa1;
    private javax.swing.JLabel labelIconEmpresa2;
    private javax.swing.JLabel labelNomeDaEmpresa;
    private javax.swing.JLabel labelSite;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelRisca;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
       
        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
               POS_X, 
               POS_Y, 
               LARGURA, 
               ALTURA
       );
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
        
        
        panelPlanoDeSaude = new PanelPlanoDeSaude();
        panelPlanoDeSaude.setBounds(
                POS_X, 
                POS_Y, 
                LARGURA, 
                ALTURA);
        getContentPane().add(panelPlanoDeSaude);
        panelPlanoDeSaude.setVisible(false);
    }








}
