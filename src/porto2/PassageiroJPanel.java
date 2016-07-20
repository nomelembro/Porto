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
public class PassageiroJPanel extends javax.swing.JPanel {
    
    private PassageiroDAO dao = new PassageiroDAOImpl();

    /**
     * Creates new form PacienteJPanel
     */
    public PassageiroJPanel() {
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

        nomejLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        cpfjLabel = new javax.swing.JLabel();
        cpfjTextField = new javax.swing.JTextField();
        rgjLabel = new javax.swing.JLabel();
        rgjTextField = new javax.swing.JTextField();
        nascimentojLabel = new javax.swing.JLabel();
        nascimentojTextField = new javax.swing.JTextField();
        telefonejLabel = new javax.swing.JLabel();
        telefonejTextField = new javax.swing.JTextField();
        cadastrarjButton = new javax.swing.JButton();
        limparjButton = new javax.swing.JButton();
        sexojLabel = new javax.swing.JLabel();
        sexojTextField = new javax.swing.JTextField();
        ruajLabel = new javax.swing.JLabel();
        ruajTextField = new javax.swing.JTextField();
        bairrojLabel = new javax.swing.JLabel();
        bairrojTextField = new javax.swing.JTextField();
        cepjLabel = new javax.swing.JLabel();
        cepjTextField = new javax.swing.JTextField();
        estadojLabel = new javax.swing.JLabel();
        estadojTextField = new javax.swing.JTextField();
        cidadejLabel = new javax.swing.JLabel();
        cidadejTextField = new javax.swing.JTextField();
        numerojLabel = new javax.swing.JLabel();
        numerojTextField = new javax.swing.JTextField();
        complementojLabel = new javax.swing.JLabel();
        complementojTextField = new javax.swing.JTextField();
        funcaojLabel = new javax.swing.JLabel();
        telEmergenciajTextField = new javax.swing.JTextField();
        telEmergenciajLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Passageiro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        nomejLabel.setText("Nome:");

        cpfjLabel.setText("CPF:");

        rgjLabel.setText("RG:");

        nascimentojLabel.setText("Nascimento:");

        telefonejLabel.setText("Telefone:");

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

        sexojLabel.setText("Sexo:");

        ruajLabel.setText("Rua:");

        bairrojLabel.setText("Bairro:");

        cepjLabel.setText("CEP:");

        estadojLabel.setText("Estado:");

        cidadejLabel.setText("Cidade:");

        numerojLabel.setText("Número:");

        complementojLabel.setText("Complemento:");

        telEmergenciajLabel.setText("Tel. Emergência:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(complementojLabel)
                    .addComponent(numerojLabel)
                    .addComponent(cidadejLabel)
                    .addComponent(estadojLabel)
                    .addComponent(cepjLabel)
                    .addComponent(bairrojLabel)
                    .addComponent(ruajLabel)
                    .addComponent(sexojLabel)
                    .addComponent(telefonejLabel)
                    .addComponent(rgjLabel)
                    .addComponent(cpfjLabel)
                    .addComponent(nomejLabel)
                    .addComponent(telEmergenciajLabel)
                    .addComponent(nascimentojLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(funcaojLabel)
                        .addContainerGap(272, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cpfjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomejTextField))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nascimentojTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rgjTextField))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telEmergenciajTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonejTextField))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ruajTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexojTextField))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cepjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bairrojTextField))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cidadejTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estadojTextField))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(complementojTextField)
                            .addComponent(numerojTextField))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(funcaojLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomejLabel)
                            .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfjLabel)
                            .addComponent(cpfjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rgjLabel)
                            .addComponent(rgjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nascimentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nascimentojLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telEmergenciajLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexojLabel)
                            .addComponent(sexojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ruajLabel)
                            .addComponent(ruajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bairrojLabel)
                            .addComponent(bairrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cepjLabel)
                            .addComponent(cepjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadojLabel)
                            .addComponent(estadojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidadejLabel)
                            .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numerojLabel)
                            .addComponent(numerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(complementojLabel)
                            .addComponent(complementojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limparjButton)
                            .addComponent(cadastrarjButton))))
                .addGap(0, 16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limparjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparjButtonActionPerformed
        // TODO add your handling code here:
        nomejTextField.setText("");
        cpfjTextField.setText("");
        rgjTextField.setText("");
        nascimentojTextField.setText("");
        telefonejTextField.setText("");
        telEmergenciajTextField.setText("");
        sexojTextField.setText("");
        ruajTextField.setText("");
        bairrojTextField.setText("");
        numerojTextField.setText("");
        estadojTextField.setText("");
        cidadejTextField.setText("");
        complementojTextField.setText("");
        cepjTextField.setText("");
    }//GEN-LAST:event_limparjButtonActionPerformed

    private void cadastrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarjButtonActionPerformed
        // TODO add your handling code here:
        Passageiro novo = new Passageiro();
        novo.setCpf(cpfjTextField.getText());
        novo.setNome(nomejTextField.getText());
        
        Endereco end = new Endereco();
        end.setBairro(bairrojTextField.getText());
        end.setCep(cepjTextField.getText());
        end.setCidade(cidadejTextField.getText());
        end.setComplemento(complementojTextField.getText());
        end.setEstado(estadojTextField.getText());
        end.setNumero(numerojTextField.getText());
        end.setRua(ruajTextField.getText());

        novo.setEndereco(end);
        novo.setRg(rgjTextField.getText());
        novo.setTelefone(telefonejTextField.getText());
        novo.setTelefoneEmergencia(telEmergenciajTextField.getText());
        
        dao.inserir(novo);
        limparjButtonActionPerformed(null);    
    }//GEN-LAST:event_cadastrarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairrojLabel;
    private javax.swing.JTextField bairrojTextField;
    private javax.swing.JButton cadastrarjButton;
    private javax.swing.JLabel cepjLabel;
    private javax.swing.JTextField cepjTextField;
    private javax.swing.JLabel cidadejLabel;
    private javax.swing.JTextField cidadejTextField;
    private javax.swing.JLabel complementojLabel;
    private javax.swing.JTextField complementojTextField;
    private javax.swing.JLabel cpfjLabel;
    private javax.swing.JTextField cpfjTextField;
    private javax.swing.JLabel estadojLabel;
    private javax.swing.JTextField estadojTextField;
    private javax.swing.JLabel funcaojLabel;
    private javax.swing.JButton limparjButton;
    private javax.swing.JLabel nascimentojLabel;
    private javax.swing.JTextField nascimentojTextField;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JLabel numerojLabel;
    private javax.swing.JTextField numerojTextField;
    private javax.swing.JLabel rgjLabel;
    private javax.swing.JTextField rgjTextField;
    private javax.swing.JLabel ruajLabel;
    private javax.swing.JTextField ruajTextField;
    private javax.swing.JLabel sexojLabel;
    private javax.swing.JTextField sexojTextField;
    private javax.swing.JLabel telEmergenciajLabel;
    private javax.swing.JTextField telEmergenciajTextField;
    private javax.swing.JLabel telefonejLabel;
    private javax.swing.JTextField telefonejTextField;
    // End of variables declaration//GEN-END:variables
}
