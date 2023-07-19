package formulario;

public class FormularioPractica01 extends javax.swing.JFrame {

    int totalSueldos, longitud, cantidadEmpleados, mayorSueldo, menorSueldo;
    int[] sueldos = new int[5];
    String[] nombres = new String[5];
    int indice = 0;

    public FormularioPractica01() {
        initComponents();
        this.btnCantidadEmpleados.setEnabled(false);
        this.btnCargar.setEnabled(true);
        this.btnMayorSueldo.setEnabled(false);
        this.btnMenorSueldo.setEnabled(false);
        this.btnMostrarTodo.setEnabled(false);
        this.btnPrimerSueldos.setEnabled(false);
        this.btnPromdioSueldos.setEnabled(false);
        this.btnTotalSueldos.setEnabled(false);
        this.btnUltimoSueldo.setEnabled(false);
        this.btnReemplazarSueldo.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbEmpleado = new javax.swing.JLabel();
        lbSueldo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        btnMostrarTodo = new javax.swing.JButton();
        btnPrimerSueldos = new javax.swing.JButton();
        btnUltimoSueldo = new javax.swing.JButton();
        btnMenorSueldo = new javax.swing.JButton();
        btnMayorSueldo = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnPromdioSueldos = new javax.swing.JButton();
        btnReemplazarSueldo = new javax.swing.JButton();
        btnCantidadEmpleados = new javax.swing.JButton();
        btnTotalSueldos = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbEmpleado.setText("NOMBRE EMPLEADO");

        lbSueldo.setText("SUELDO");

        btnMostrarTodo.setText("MOSTRAR TODO");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        btnPrimerSueldos.setText("PRIMER SUELDO");
        btnPrimerSueldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimerSueldosActionPerformed(evt);
            }
        });

        btnUltimoSueldo.setText("ULTIMO SUELDO");
        btnUltimoSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoSueldoActionPerformed(evt);
            }
        });

        btnMenorSueldo.setText("MENOR SUELDO");
        btnMenorSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorSueldoActionPerformed(evt);
            }
        });

        btnMayorSueldo.setText("MAYOR SUELDO");
        btnMayorSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayorSueldoActionPerformed(evt);
            }
        });

        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnPromdioSueldos.setText("PROMEDIO SUELDOS");
        btnPromdioSueldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromdioSueldosActionPerformed(evt);
            }
        });

        btnReemplazarSueldo.setText("REEMPLAZAR SUELDOS");
        btnReemplazarSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReemplazarSueldoActionPerformed(evt);
            }
        });

        btnCantidadEmpleados.setText("CANTIDAD EMPLEADOS");
        btnCantidadEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadEmpleadosActionPerformed(evt);
            }
        });

        btnTotalSueldos.setText("TOTAL SUELDOS");
        btnTotalSueldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalSueldosActionPerformed(evt);
            }
        });

        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReemplazarSueldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbSueldo)
                                    .addComponent(lbEmpleado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCargar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCantidadEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnTotalSueldos)
                        .addComponent(btnMostrarTodo)
                        .addComponent(btnPrimerSueldos)
                        .addComponent(btnMenorSueldo)
                        .addComponent(btnMayorSueldo)
                        .addComponent(btnPromdioSueldos, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btnUltimoSueldo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMayorSueldo, btnMenorSueldo, btnMostrarTodo, btnPrimerSueldos, btnPromdioSueldos, btnTotalSueldos, btnUltimoSueldo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbEmpleado)
                        .addGap(41, 41, 41)
                        .addComponent(lbSueldo)
                        .addGap(65, 65, 65)
                        .addComponent(btnMenorSueldo)
                        .addGap(18, 18, 18)
                        .addComponent(btnMayorSueldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTotalSueldos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMostrarTodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPrimerSueldos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUltimoSueldo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnPromdioSueldos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargar)
                            .addComponent(btnCantidadEmpleados))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReemplazarSueldo)
                            .addComponent(btnFinalizar))
                        .addGap(20, 20, 20))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnMayorSueldo, btnMenorSueldo, btnMostrarTodo, btnPrimerSueldos, btnPromdioSueldos, btnTotalSueldos, btnUltimoSueldo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        if (indice < sueldos.length) {
            nombres[indice] = txtNombre.getText();
            sueldos[indice] = Integer.parseInt(txtSueldo.getText());
            indice++;
        } else {
            System.out.println("El vector esta completo");
            this.btnCantidadEmpleados.setEnabled(true);
            this.btnCargar.setEnabled(false);
            this.btnMayorSueldo.setEnabled(true);
            this.btnMenorSueldo.setEnabled(true);
            this.btnMostrarTodo.setEnabled(true);
            this.btnPrimerSueldos.setEnabled(true);
            this.btnPromdioSueldos.setEnabled(true);
            this.btnTotalSueldos.setEnabled(true);
            this.btnUltimoSueldo.setEnabled(true);
            this.btnReemplazarSueldo.setEnabled(true);
        }

    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnCantidadEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadEmpleadosActionPerformed
        cantidadEmpleados = nombres.length;
        System.out.println("Cantidad de Empleados: " + nombres.length);
    }//GEN-LAST:event_btnCantidadEmpleadosActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        dispose();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnReemplazarSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReemplazarSueldoActionPerformed
        sueldos[1] = 75000;
        System.out.println("Nuevo sueldo empleado 2: " + sueldos[1]);
    }//GEN-LAST:event_btnReemplazarSueldoActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        // Mostrar nomnina de Empleados
        System.out.println("<----Nomina de Empleados---->");
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println((i + 1) + " - Empleado: " + nombres[i]);
            System.out.println((i + 1) + "  - Sueldo: " + sueldos[i]);

        }
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnPrimerSueldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimerSueldosActionPerformed
        System.out.println("Primer sueldo: " + sueldos[0]);
    }//GEN-LAST:event_btnPrimerSueldosActionPerformed

    private void btnUltimoSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoSueldoActionPerformed
        System.out.println("Ultimo sueldo: " + sueldos[sueldos.length - 1]);
    }//GEN-LAST:event_btnUltimoSueldoActionPerformed

    private void btnMenorSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorSueldoActionPerformed
        // Menor Sueldo
        for (int i = 1; i < sueldos.length; i++) {
            menorSueldo = sueldos[0];
            if (menorSueldo > sueldos[i]) {
                menorSueldo = sueldos[i];
            }
        }
        System.out.println("Menor Sueldo: " + menorSueldo);
    }//GEN-LAST:event_btnMenorSueldoActionPerformed

    private void btnMayorSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayorSueldoActionPerformed
        // Mayor Sueldo
        for (int j = 0; j < sueldos.length; j++) {
            if (mayorSueldo < sueldos[j]) {
                mayorSueldo = sueldos[j];
            }
        }
        System.out.println("Mayor Sueldo: " + mayorSueldo);
    }//GEN-LAST:event_btnMayorSueldoActionPerformed

    private void btnTotalSueldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalSueldosActionPerformed
        for (int i = 0; i < sueldos.length; i++) {
            totalSueldos = totalSueldos + sueldos[i];

        }
        System.out.println("Total de Sueldos: " + totalSueldos);
    }//GEN-LAST:event_btnTotalSueldosActionPerformed

    private void btnPromdioSueldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromdioSueldosActionPerformed
        double promedio = 0;
        promedio = totalSueldos / nombres.length;
        System.out.println("Promedio de Sueldos: " + promedio);
    }//GEN-LAST:event_btnPromdioSueldosActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPractica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPractica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPractica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPractica01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPractica01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCantidadEmpleados;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnMayorSueldo;
    private javax.swing.JButton btnMenorSueldo;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnPrimerSueldos;
    private javax.swing.JButton btnPromdioSueldos;
    private javax.swing.JButton btnReemplazarSueldo;
    private javax.swing.JButton btnTotalSueldos;
    private javax.swing.JButton btnUltimoSueldo;
    private javax.swing.JLabel lbEmpleado;
    private javax.swing.JLabel lbSueldo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
