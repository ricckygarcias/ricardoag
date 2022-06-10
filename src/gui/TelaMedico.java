package gui;

import dao.MedicoDAO;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Medico;

/**** @author ricar*/
public class TelaMedico extends javax.swing.JFrame {

    MedicoDAO medicoDAO = new MedicoDAO();
    
    public TelaMedico() {
        initComponents();
        btnExcluir.setEnabled(false); //Desabilita o botão excluir
        this.preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdMedico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEspecialidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCrm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaMedicos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Médicos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ID. MÉDICO:");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("NOME:");

        txtIdMedico.setEditable(false);
        txtIdMedico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("ESPECIALIDADE:");

        txtEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("CRM:");

        txtCrm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("CPF:");

        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

        tabelaMedicos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Id. Médico", "Nome", "Esp.", "CRM", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMedicos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaMedicos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMedicosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaMedicos);
        if (tabelaMedicos.getColumnModel().getColumnCount() > 0) {
            tabelaMedicos.getColumnModel().getColumn(0).setMinWidth(20);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    public void preencherTabela()
    {
        ArrayList medicos;
        DefaultTableModel tabela = (DefaultTableModel)tabelaMedicos.getModel(); //converte a tabela para o modelo padrão
        tabela.setRowCount(0); //Exclui todas as linhas da tabela
        medicos = medicoDAO.listarMedico();
        Iterator it = medicos.iterator();
        while(it.hasNext())
        {
            Medico medico = (Medico)it.next(); //converte o registro para um objeto do tipo aluno
            tabela.addRow(new Object[]{medico.getIdmedico(),medico.getNome(),medico.getEspecialidade(),medico.getCrm(), medico.getCpf()});
            //a linha acima preenche a tabela, adicionando uma linha na mesma com os dados de cada medico encontrado.
        }
    }
    public void limparCampos()
    {
        txtIdMedico.setText("");
        txtNome.setText("");
        txtEspecialidade.setText("");
        txtCrm.setText("");
        txtCpf.setText("");
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().trim().isEmpty() ||
            txtEspecialidade.getText().trim().isEmpty() ||
            txtCrm.getText().trim().isEmpty() ||
            txtCpf.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"PREENCHA TODOS OS CAMPOS!!!");
        }
        else
        {
            Medico medico = new Medico();
            if (!txtIdMedico.getText().isEmpty())
            {
                medico.setIdmedico(Integer.parseInt(txtIdMedico.getText()));
            }
            medico.setNome(txtNome.getText().trim());
            medico.setEspecialidade(Integer.parseInt(txtEspecialidade.getText().trim()));
            medico.setCrm(Integer.parseInt(txtCrm.getText().trim()));
            medico.setCpf(txtCpf.getText().trim());
            
            String msg;
            if(medico.getIdmedico()==0)
            {
                msg = medicoDAO.cadastrarMedico(medico);
                if (msg.equals("1"))
                {
                    msg = "CADASTRO EFETUADO COM SUCESSO!";
                }
                JOptionPane.showMessageDialog(rootPane, msg);
            }
            else
            {
                msg = medicoDAO.atualizarMedico(medico);
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
            String idmedico = txtIdMedico.getText();
            String msg = medicoDAO.excluirMedico(idmedico);
            if(msg.equals("1"))
            {
                msg = "EXCLUSÃO EFETUADA COM SUCESSO!";
            }
            JOptionPane.showMessageDialog(rootPane, msg);
            this.limparCampos();
            this.preencherTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMedicosMouseClicked
        btnExcluir.setEnabled(true); //habilita o botão excluir
        txtIdMedico.setText(tabelaMedicos.getValueAt(tabelaMedicos.getSelectedRow(),0).toString());
        txtNome.setText(tabelaMedicos.getValueAt(tabelaMedicos.getSelectedRow(),1).toString());
        txtEspecialidade.setText(tabelaMedicos.getValueAt(tabelaMedicos.getSelectedRow(),2).toString());
        txtCrm.setText(tabelaMedicos.getValueAt(tabelaMedicos.getSelectedRow(),3).toString());
        txtCpf.setText(tabelaMedicos.getValueAt(tabelaMedicos.getSelectedRow(),4).toString());
    }//GEN-LAST:event_tabelaMedicosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaMedicos;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCrm;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JTextField txtIdMedico;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
