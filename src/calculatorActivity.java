import javax.swing.JOptionPane;

public class calculatorActivity extends javax.swing.JFrame {

    double number1, number2, res;
    
    public calculatorActivity() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        number_two = new javax.swing.JTextField();
        number_one = new javax.swing.JTextField();
        sub_button = new javax.swing.JButton();
        add_button = new javax.swing.JButton();
        div_button = new javax.swing.JButton();
        mul_button = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setResizable(false);

        number_two.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        number_two.setToolTipText("");

        number_one.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        sub_button.setText("SUB");
        sub_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_buttonActionPerformed(evt);
            }
        });

        add_button.setText("ADD");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        div_button.setText("DIV");
        div_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div_buttonActionPerformed(evt);
            }
        });

        mul_button.setText("MUL");
        mul_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mul_buttonActionPerformed(evt);
            }
        });

        result.setBackground(new java.awt.Color(255, 255, 255));
        result.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        result.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter first number:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter second number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(number_two)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(number_one)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sub_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mul_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(div_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(number_one, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(number_two, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mul_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(div_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void operation(String operation){
        
        if(number_one.getText().isEmpty() || number_two.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Please check the input.", "Error", 1);
        }else{
            
            try{
                number1 = Double.parseDouble(number_one.getText());
                number2 = Double.parseDouble(number_two.getText());

                switch(operation){
                    case "ADD":
                        res = number1+number2;
                        result.setText("Addition: " + String.valueOf(res));
                        break;
                    case "SUB":
                        res = number1-number2;
                        result.setText("Substraction: " + String.valueOf(res));
                        break;
                    case "MUL":
                        res = number1*number2;
                        result.setText("Multiplication: " + String.valueOf(res));
                        break;
                    case "DIV":
                        res = number1/number2;
                        result.setText("Divition: " + String.valueOf(res));
                        break;
                    default:
                        break;
                }
                
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Enter number only.", "Error", 1);
            }
        }  
    }
    
    
    
    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        // TODO add your handling code here:
        operation(add_button.getText());
    }//GEN-LAST:event_add_buttonActionPerformed
              
    private void sub_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_buttonActionPerformed
        // TODO add your handling code here:
        operation(sub_button.getText());
    }//GEN-LAST:event_sub_buttonActionPerformed

    private void mul_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mul_buttonActionPerformed
        // TODO add your handling code here:
        operation(mul_button.getText());
    }//GEN-LAST:event_mul_buttonActionPerformed

    private void div_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div_buttonActionPerformed
        // TODO add your handling code here:
        operation(div_button.getText());
    }//GEN-LAST:event_div_buttonActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(calculatorActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculatorActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculatorActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculatorActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculatorActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton div_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton mul_button;
    private javax.swing.JTextField number_one;
    private javax.swing.JTextField number_two;
    private javax.swing.JLabel result;
    private javax.swing.JButton sub_button;
    // End of variables declaration//GEN-END:variables
}
