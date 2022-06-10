package gui;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.*;
import javax.swing.DefaultComboBoxModel;
import modelo.*;

/**** @author ricar*/
public class TelaConsulta extends javax.swing.JFrame {

    ConsultaDAO consultaDAO = new ConsultaDAO();
    MedicoDAO medicoDAO = new MedicoDAO();
    PacienteDAO pacienteDAO = new PacienteDAO();
    
    public TelaConsulta() {
        initComponents();
        btnExcluir.setEnabled(false); //Desabilita o botão excluir
        this.preencherTabela();
        this.carregarCombos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdConsulta = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaConsultas = new javax.swing.JTable();
        cboMedico = new javax.swing.JComboBox<>();
        cboPaciente = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtConvenio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Consultas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ID. CONSULTA:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("MÉDICO:");

        txtIdConsulta.setEditable(false);
        txtIdConsulta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tabelaConsultas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id. Consulta", "Medico", "Paciente", "Convênio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConsultas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaConsultas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConsultasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaConsultas);
        if (tabelaConsultas.getColumnModel().getColumnCount() > 0) {
            tabelaConsultas.getColumnModel().getColumn(0).setMinWidth(20);
        }

        cboMedico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cboPaciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("PACIENTE:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("CONVÊNIO:");

        txtConvenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(467, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtConvenio))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(txtIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    public void carregarCombos()
    {
        ArrayList medicos;
        medicos = medicoDAO.listarMedico();
        
        Iterator itmedico = medicos.iterator();
        while(itmedico.hasNext())
        {
            Medico medico = (Medico)itmedico.next(); //converte o registro para um objeto do tipo medico
            cboMedico.addItem(medico);
        }
        
        ArrayList pacientes;
        pacientes = pacienteDAO.listarPaciente();
        
        Iterator itpaciente = pacientes.iterator();
        while(itpaciente.hasNext())
        {
            Paciente paciente = (Paciente)itpaciente.next(); //converte o registro para um objeto do tipo paciente
            cboPaciente.addItem(paciente);
        }
        
    }
    
    public void preencherTabela()
    {
        ArrayList consultas;
        DefaultTableModel tabela = (DefaultTableModel)tabelaConsultas.getModel(); //converte a tabela para o modelo padrão
        tabela.setRowCount(0); //Exclui todas as linhas da tabela
        consultas = consultaDAO.listarConsulta();
        Iterator it = consultas.iterator();
        while(it.hasNext())
        {
            Consulta consulta = (Consulta)it.next(); //converte o registro para um objeto do tipo aluno
            tabela.addRow(new Object[]{consulta.getIdconsulta(),consulta.getId_medico(), consulta.getId_paciente(), consulta.getConvenio()});
            //a linha acima preenche a tabela, adicionando uma linha na mesma com os dados de cada paciente encontrado.
        }
    }
    public void limparCampos()
    {
        txtIdConsulta.setText("");
        cboMedico.setSelectedIndex(-1);
        cboPaciente.setSelectedIndex(-1);
        txtConvenio.setText("");
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        if (cboMedico.getSelectedIndex() == -1 || cboPaciente.getSelectedIndex() == -1 ||
            txtConvenio.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"PREENCHA TODOS OS CAMPOS!!!");
        }
        else
        {
            
            Consulta consulta = new Consulta();
            Medico medico = (Medico)cboMedico.getSelectedItem();
            Paciente paciente = (Paciente)cboPaciente.getSelectedItem();
        
            if (!txtIdConsulta.getText().isEmpty())
            {
                consulta.setIdconsulta(Integer.parseInt(txtIdConsulta.getText()));
            }
            consulta.setId_medico(medico.getIdmedico());
            consulta.setId_paciente(paciente.getIdpaciente());
            consulta.setConvenio(txtConvenio.getText());
            
            String msg;
            if(consulta.getIdconsulta()==0)
            {
                msg = consultaDAO.cadastrarConsulta(consulta);
                if (msg.equals("1"))
                {
                    msg = "CADASTRO EFETUADO COM SUCESSO!";
                }
                JOptionPane.showMessageDialog(rootPane, msg);
            }
            else
            {
                msg = consultaDAO.atualizarConsulta(consulta);
                if (msg.equals("1"))
                {
                    msg = "ALTERAÇÃO EFETUADA COM SUCESSO!";
                }
                JOptionPane.showMessageDialog(rootPane, msg);
            }
            this.limparCampos();
            this.preencherTabela();
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane,"DESEJA EXCLUIR O REGISTRO?" );
        if(resposta == 0)
        {
            String idconsulta = txtIdConsulta.getText();
            String msg = consultaDAO.excluirConsulta(idconsulta);
            if(msg.equals("1"))
            {
                msg = "EXCLUSÃO EFETUADA COM SUCESSO!";
            }
            JOptionPane.showMessageDialog(rootPane, msg);
            this.limparCampos();
            this.preencherTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConsultasMouseClicked
        btnExcluir.setEnabled(true); //habilita o botão excluir
        txtIdConsulta.setText(tabelaConsultas.getValueAt(tabelaConsultas.getSelectedRow(),0).toString());
        txtConvenio.setText(tabelaConsultas.getValueAt(tabelaConsultas.getSelectedRow(),3).toString());
        
        /*
        txtNome.setText(tabelaConsultas.getValueAt(tabelaConsultas.getSelectedRow(),1).toString());
        txtCpf.setText(tabelaConsultas.getValueAt(tabelaConsultas.getSelectedRow(),2).toString());
        txtIdade.setText(tabelaConsultas.getValueAt(tabelaConsultas.getSelectedRow(),3).toString());
        */
    }//GEN-LAST:event_tabelaConsultasMouseClicked

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
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Object> cboMedico;
    private javax.swing.JComboBox<Object> cboPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaConsultas;
    private javax.swing.JTextField txtConvenio;
    private javax.swing.JTextField txtIdConsulta;
    // End of variables declaration//GEN-END:variables
}
