package porto2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author newton
 */
public class EmbarcacaoJPanel extends javax.swing.JPanel {
    
    private EmbarcacaoDAO dao = new EmbarcacaoDAOImpl();

    /**
     * Creates new form EmbarcacaoJPanel
     */
    public EmbarcacaoJPanel() {
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

        tipojTextField = new javax.swing.JTextField();
        corjTextField = new javax.swing.JTextField();
        empresajComboBox = new javax.swing.JComboBox<>();
        cadastrarjButton = new javax.swing.JButton();
        limparjButton = new javax.swing.JButton();
        tipojLabel = new javax.swing.JLabel();
        corjLabel = new javax.swing.JLabel();
        empresajLabel = new javax.swing.JLabel();
        codigojLabel = new javax.swing.JLabel();
        codigojTextField = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Embarcação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        corjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corjTextFieldActionPerformed(evt);
            }
        });

        empresajComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Item 1", "Item 2", "Item 3", "Item 4" }));
        empresajComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresajComboBoxActionPerformed(evt);
            }
        });

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

        tipojLabel.setText("Tipo:");

        corjLabel.setText("Cor:");

        empresajLabel.setText("Empresa:");

        codigojLabel.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigojLabel)
                    .addComponent(tipojLabel)
                    .addComponent(corjLabel)
                    .addComponent(empresajLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tipojTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(corjTextField)
                    .addComponent(empresajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigojTextField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipojLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empresajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresajLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigojLabel)
                    .addComponent(codigojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarjButton)
                    .addComponent(limparjButton))
                .addGap(0, 14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limparjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparjButtonActionPerformed
        // TODO add your handling code here:
        corjTextField.setText("");
        tipojTextField.setText("");
        empresajComboBox.setSelectedIndex(0);
        codigojTextField.setText("");
        
    }//GEN-LAST:event_limparjButtonActionPerformed

    private void corjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corjTextFieldActionPerformed

    private void cadastrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarjButtonActionPerformed
        // TODO add your handling code here:
        Embarcacao novo = new Embarcacao();
        novo.setCor(corjTextField.getText());
        novo.setTipo(tipojTextField.getText()); 
        novo.setCodigo(Integer.parseInt(codigojTextField.getText()));

        
        dao.inserir(novo);
        limparjButtonActionPerformed(null);
    }//GEN-LAST:event_cadastrarjButtonActionPerformed

    private void empresajComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresajComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_empresajComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarjButton;
    private javax.swing.JLabel codigojLabel;
    private javax.swing.JTextField codigojTextField;
    private javax.swing.JLabel corjLabel;
    private javax.swing.JTextField corjTextField;
    private javax.swing.JComboBox<String> empresajComboBox;
    private javax.swing.JLabel empresajLabel;
    private javax.swing.JButton limparjButton;
    private javax.swing.JLabel tipojLabel;
    private javax.swing.JTextField tipojTextField;
    // End of variables declaration//GEN-END:variables
}
