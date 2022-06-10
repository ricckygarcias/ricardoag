package gui;

/**** @author ricar*/
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadastroMedico = new javax.swing.JMenuItem();
        menuCadastroPaciente = new javax.swing.JMenuItem();
        menuCadastroConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menuCadastro.setText("CADASTROS");

        menuCadastroMedico.setText("MÉDICOS");
        menuCadastroMedico.setToolTipText("");
        menuCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroMedicoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroMedico);

        menuCadastroPaciente.setText("PACIENTES");
        menuCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroPacienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroPaciente);

        menuCadastroConsulta.setText("CONSULTAS");
        menuCadastroConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroConsultaActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroConsulta);

        jMenuBar1.add(menuCadastro);

        jMenu2.setText("SOBRE");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroMedicoActionPerformed
        
        TelaMedico tela = new TelaMedico();
        tela.show();
        
    }//GEN-LAST:event_menuCadastroMedicoActionPerformed

    private void menuCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroPacienteActionPerformed
        TelaPaciente tela = new TelaPaciente();
        tela.show();
    }//GEN-LAST:event_menuCadastroPacienteActionPerformed

    private void menuCadastroConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroConsultaActionPerformed
        TelaConsulta tela = new TelaConsulta();
        tela.show();// TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCadastroConsulta;
    private javax.swing.JMenuItem menuCadastroMedico;
    private javax.swing.JMenuItem menuCadastroPaciente;
    // End of variables declaration//GEN-END:variables
}
