
package co.cajero.interfaz;

import co.cajero.bean.Cliente;
import co.cajero.bean.General;
import javax.swing.JOptionPane;


public class FrmCajeroOpciones extends javax.swing.JFrame {

    Cliente cliente = null;

  
    public FrmCajeroOpciones() {
        initComponents();
    }

    public FrmCajeroOpciones(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        cargarDatosPantalla();
    }

    void cargarDatosPantalla() {
        lblBienvenida.setText("Bienvenido(a) " + cliente.getNombreCompleto());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenida = new javax.swing.JLabel();
        btnConsultarSaldo = new javax.swing.JButton();
        btnRetiro10 = new javax.swing.JButton();
        btnRetiro20 = new javax.swing.JButton();
        btnRetiro50 = new javax.swing.JButton();
        btnRetiroOtro = new javax.swing.JButton();
        btnConsignar = new javax.swing.JButton();
        btnTransaccion = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblBienvenida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Bienvenido");

        btnConsultarSaldo.setText("Consultar Saldo");
        btnConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarSaldoActionPerformed(evt);
            }
        });

        btnRetiro10.setText("Retiro $10000");
        btnRetiro10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiro10ActionPerformed(evt);
            }
        });

        btnRetiro20.setText("Retiro $20000");
        btnRetiro20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiro20ActionPerformed(evt);
            }
        });

        btnRetiro50.setText("Retiro $50000");
        btnRetiro50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiro50ActionPerformed(evt);
            }
        });

        btnRetiroOtro.setText("Otro valor");
        btnRetiroOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroOtroActionPerformed(evt);
            }
        });

        btnConsignar.setText("Consignar");
        btnConsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsignarActionPerformed(evt);
            }
        });

        btnTransaccion.setText("Transacción");
        btnTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaccionActionPerformed(evt);
            }
        });

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetiro10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRetiro20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetiro50, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRetiroOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTransaccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetiro10)
                    .addComponent(btnTransaccion))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetiro20)
                    .addComponent(btnConsignar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetiro50)
                    .addComponent(btnConsultarSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnRetiroOtro))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarSaldoActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Su saldo es $" + cliente.getSaldo(),
                "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnConsultarSaldoActionPerformed

    private void btnRetiro10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiro10ActionPerformed
        retirar(10000);
    }//GEN-LAST:event_btnRetiro10ActionPerformed

    private void btnRetiro20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiro20ActionPerformed
        retirar(20000);
    }//GEN-LAST:event_btnRetiro20ActionPerformed

    private void btnRetiro50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiro50ActionPerformed
        retirar(50000);
    }//GEN-LAST:event_btnRetiro50ActionPerformed

    private void btnRetiroOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroOtroActionPerformed
        String cadenaRetiro = JOptionPane.showInputDialog("Digite el monto a retirar");
        //Si la cadena de Retiro tiene un valor válido entonces se convierte a número
        if (cadenaRetiro!=null){
            float dinero = Float.parseFloat(cadenaRetiro);
            retirar(dinero);
        }
    }//GEN-LAST:event_btnRetiroOtroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        General.general.guardar();
    }//GEN-LAST:event_formWindowClosing

    private void btnConsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignarActionPerformed
      float dinero = Float.parseFloat (JOptionPane.showInputDialog("Digite el monto a consignar"));
        consignar(dinero);
    }//GEN-LAST:event_btnConsignarActionPerformed

    private void btnTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaccionActionPerformed
         float dinero = Float.parseFloat (JOptionPane.showInputDialog("Digite el monto a transferir"));
        retirar(dinero);
        consignar(dinero);
    }//GEN-LAST:event_btnTransaccionActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
 float dinero = Float.parseFloat (JOptionPane.showInputDialog("Digite el monto a transferir"));
        retirar(dinero);
        consignar(dinero);
    }//GEN-LAST:event_btnExitActionPerformed

    private void retirar(float dinero) {
        boolean sw = General.general.getCajero().retirar(cliente, dinero);
        if (sw) {
            JOptionPane.showMessageDialog(rootPane, "Retiro exitoso");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Fondos insuficientes");
        }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCajeroOpciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsignar;
    private javax.swing.JButton btnConsultarSaldo;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRetiro10;
    private javax.swing.JButton btnRetiro20;
    private javax.swing.JButton btnRetiro50;
    private javax.swing.JButton btnRetiroOtro;
    private javax.swing.JButton btnTransaccion;
    private javax.swing.JLabel lblBienvenida;
    // End of variables declaration//GEN-END:variables

  
