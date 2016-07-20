/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto2;

/**
 *
 * @author newton
 */
public class LocalJPanel extends javax.swing.JPanel {

    private LocalDAO dao = new LocalDAOImpl();
    
    /**
     * Creates new form LocalJPanel
     */
    public LocalJPanel() {
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

        cidadejTextField = new javax.swing.JTextField();
        caisjTextField = new javax.swing.JTextField();
        nomePortojTextField = new javax.swing.JTextField();
        cidadejLabel = new javax.swing.JLabel();
        caisjLabel = new javax.swing.JLabel();
        nomePortojLabel = new javax.swing.JLabel();
        cadastrarjButton = new javax.swing.JButton();
        limparjButton = new javax.swing.JButton();
        codigojLabel = new javax.swing.JLabel();
        codigojTextField = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Local", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        cidadejLabel.setText("Cidade:");

        caisjLabel.setText("Nº Cais:");

        nomePortojLabel.setText("Nome do Porto:");

        cadastrarjButton.setText("Cadastrar");
        cadastrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarjButtonActionPerformed(evt);
            }
        });

        limparjButton.setText("Limpar");
        limparjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparjButtonActionPerformed(evt);
            }
        });

        codigojLabel.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigojLabel)
                    .addComponent(cidadejLabel)
                    .addComponent(caisjLabel)
                    .addComponent(nomePortojLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomePortojTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(caisjTextField)
                    .addComponent(cidadejTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(codigojTextField)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caisjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomePortojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePortojLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigojLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarjButton)
                    .addComponent(limparjButton))
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarjButtonActionPerformed
        // TODO add your handling code here:
        Local novo = new Local();
        novo.setCidade(cidadejTextField.getText());
        Cais cais = new Cais();
        cais.setNumero(Integer.parseInt(caisjTextField.getText()));
        novo.setCais(cais);
        novo.setNomePorto(nomePortojTextField.getText());
        novo.setCodigo(Integer.parseInt(codigojTextField.getText()));
        
        dao.inserir(novo);
        limparjButtonActionPerformed(null);
    }//GEN-LAST:event_cadastrarjButtonActionPerformed

    private void limparjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparjButtonActionPerformed
        // TODO add your handling code here:
        caisjTextField.setText("");
        cidadejTextField.setText("");
        nomePortojTextField.setText("");
        codigojTextField.setText("");
    }//GEN-LAST:event_limparjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarjButton;
    private javax.swing.JLabel caisjLabel;
    private javax.swing.JTextField caisjTextField;
    private javax.swing.JLabel cidadejLabel;
    private javax.swing.JTextField cidadejTextField;
    private javax.swing.JLabel codigojLabel;
    private javax.swing.JTextField codigojTextField;
    private javax.swing.JButton limparjButton;
    private javax.swing.JLabel nomePortojLabel;
    private javax.swing.JTextField nomePortojTextField;
    // End of variables declaration//GEN-END:variables
}