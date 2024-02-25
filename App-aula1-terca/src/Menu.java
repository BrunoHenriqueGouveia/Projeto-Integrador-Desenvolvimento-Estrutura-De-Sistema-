/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bruno.hgsilva3
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuDepartamentos = new javax.swing.JMenu();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        itmExcluir = new javax.swing.JMenuItem();
        itmAlterar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmBuscarUsuario = new javax.swing.JMenuItem();
        itmListar = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuDocumentacao = new javax.swing.JMenu();
        itmManualDoUsuario = new javax.swing.JMenuItem();
        itmSobre = new javax.swing.JMenuItem();
        itmCodigoDeConsumidor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carro-levou-a-composicao-realista-de-luzes-com-vista-da-estrada-a-noite-e-silhuetas-de-ilustracao-de-semaforos-de-automoveis_1284-28531.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1060, 480);

        mnuDepartamentos.setText("Departamento");
        jMenuBar1.add(mnuDepartamentos);

        mnuFuncionarios.setText("Funcionarios");
        jMenuBar1.add(mnuFuncionarios);

        itmCadastrar.setText("Usuarios");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\bruno.hgsilva3\\Downloads\\cadastro.png")); // NOI18N
        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        itmCadastrar.add(jMenuItem1);

        itmExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        itmExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excluir.png"))); // NOI18N
        itmExcluir.setText("Excluir");
        itmCadastrar.add(itmExcluir);

        itmAlterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alterar.png"))); // NOI18N
        itmAlterar.setText("Alterar");
        itmCadastrar.add(itmAlterar);
        itmCadastrar.add(jSeparator1);

        itmBuscarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verificacao-da-lista-da-area-de-transferencia.png"))); // NOI18N
        itmBuscarUsuario.setText("Buscar Usuario");
        itmCadastrar.add(itmBuscarUsuario);

        itmListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/motor-de-busca.png"))); // NOI18N
        itmListar.setText("Listar");
        itmCadastrar.add(itmListar);

        jMenuBar1.add(itmCadastrar);

        mnuAjuda.setText("Ajuda");

        mnuDocumentacao.setText("Documentação");

        itmManualDoUsuario.setText("Manual do Usuario");
        mnuDocumentacao.add(itmManualDoUsuario);

        itmSobre.setText("Sobre");
        mnuDocumentacao.add(itmSobre);

        itmCodigoDeConsumidor.setText("Codigo de Consumidor");
        itmCodigoDeConsumidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCodigoDeConsumidorActionPerformed(evt);
            }
        });
        mnuDocumentacao.add(itmCodigoDeConsumidor);

        mnuAjuda.add(mnuDocumentacao);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1070, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCodigoDeConsumidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCodigoDeConsumidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCodigoDeConsumidorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new CadastrarUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAlterar;
    private javax.swing.JMenuItem itmBuscarUsuario;
    private javax.swing.JMenu itmCadastrar;
    private javax.swing.JMenuItem itmCodigoDeConsumidor;
    private javax.swing.JMenuItem itmExcluir;
    private javax.swing.JMenuItem itmListar;
    private javax.swing.JMenuItem itmManualDoUsuario;
    private javax.swing.JMenuItem itmSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuDepartamentos;
    private javax.swing.JMenu mnuDocumentacao;
    private javax.swing.JMenu mnuFuncionarios;
    // End of variables declaration//GEN-END:variables
}