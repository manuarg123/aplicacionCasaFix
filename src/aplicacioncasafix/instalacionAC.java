/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncasafix;

/**
 *
 * @author Administrator
 */
public class instalacionAC extends javax.swing.JFrame {

    /**
     * Creates new form instalacionAC
     */
    public instalacionAC() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opt_mttointT = new javax.swing.JRadioButton();
        opt_mttointF = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        spin_mtscañeria = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        opt_inselecT = new javax.swing.JRadioButton();
        opt_inselecF = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_mintegral = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_insmat = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_viaticos = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_inselec = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_manobra = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl_prestotal = new javax.swing.JLabel();
        ins_calcular = new javax.swing.JButton();
        ins_limpiar = new javax.swing.JButton();
        ins_cerrar = new javax.swing.JButton();
        combo_localidad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        opt_mensulaT = new javax.swing.JRadioButton();
        opt_mensulaF = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        lbl_mensula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Presupuesto Instalación:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("¿Mantenimiento previo al equipo? (Recomendado para equipos usados):");

        buttonGroup1.add(opt_mttointT);
        opt_mttointT.setText("SI");

        buttonGroup1.add(opt_mttointF);
        opt_mttointF.setText("NO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Largo estimado para el conjunto de  cañerias y cables de conexión (En Mts):");

        spin_mtscañeria.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(10500.0f), Float.valueOf(0.1f)));

        jLabel4.setText("mts");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("¿Desea incluir la instalación eléctrica? (Enchufes y/o Llave térmica para conectar equipo):");

        buttonGroup2.add(opt_inselecT);
        opt_inselecT.setText("SI");

        buttonGroup2.add(opt_inselecF);
        opt_inselecF.setText("NO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Seleccione la ubicación o LOCALIDAD CERCANA donde desea realizar la instalación:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Costo Mantenimiento:");

        lbl_mintegral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_mintegral.setText("0.0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Materiales instalación:");

        lbl_insmat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_insmat.setText("0.0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Viáticos (Según localidad):");

        lbl_viaticos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_viaticos.setText("0.0");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Instalación eléctica:");

        lbl_inselec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_inselec.setText("0.0");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Mano de Obra:");

        lbl_manobra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_manobra.setText("0.0");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 51));
        jLabel17.setText("Presupuesto total:");

        lbl_prestotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_prestotal.setForeground(new java.awt.Color(0, 153, 51));
        lbl_prestotal.setText("0.0");

        ins_calcular.setText("Calcular");
        ins_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ins_calcularActionPerformed(evt);
            }
        });

        ins_limpiar.setText("Limpiar");
        ins_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ins_limpiarActionPerformed(evt);
            }
        });

        ins_cerrar.setText("Cerrar");
        ins_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ins_cerrarActionPerformed(evt);
            }
        });

        combo_localidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Rio Ceballos", "Unquillo", "Malagueño", "Alta Gracia", "Carlos Paz", "Santa Rosa de Calamuchita", "Villa General Belgrano" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("¿Desea colocar la unidad externa colgada en la pared?");

        buttonGroup3.add(opt_mensulaT);
        opt_mensulaT.setText("SI");

        buttonGroup3.add(opt_mensulaF);
        opt_mensulaF.setText("NO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Mensula (Unidad externa colgada):");

        lbl_mensula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_mensula.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(lbl_prestotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opt_inselecT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opt_inselecF, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(combo_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spin_mtscañeria, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opt_mttointT)
                            .addComponent(opt_mensulaT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opt_mttointF)
                            .addComponent(opt_mensulaF))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_insmat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_inselec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_viaticos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_manobra, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_mintegral, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ins_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ins_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ins_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 67, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_mensula, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spin_mtscañeria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(opt_inselecT)
                            .addComponent(opt_inselecF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(combo_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_mintegral)
                            .addComponent(ins_calcular)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opt_mttointT)
                            .addComponent(opt_mttointF)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opt_mensulaT)
                            .addComponent(opt_mensulaF)
                            .addComponent(jLabel8))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(lbl_mensula, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ins_limpiar)
                        .addGap(34, 34, 34)
                        .addComponent(ins_cerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lbl_insmat, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lbl_inselec))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_viaticos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lbl_manobra))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lbl_prestotal))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ins_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ins_cerrarActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ins_cerrarActionPerformed

    private void ins_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ins_limpiarActionPerformed
    buttonGroup1.clearSelection();
    buttonGroup2.clearSelection();
    spin_mtscañeria.setValue(0);
    combo_localidad.setSelectedIndex(0);
    buttonGroup3.clearSelection();
    
    lbl_mintegral.setText("0.0");
    lbl_inselec.setText("0.0");
    lbl_insmat.setText("0.0");
    lbl_manobra.setText("0.0");
    lbl_viaticos.setText("0.0");  
    lbl_prestotal.setText("0.0");
    lbl_mensula.setText("0.0");// TODO add your handling code here:
    }//GEN-LAST:event_ins_limpiarActionPerformed

    private void ins_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ins_calcularActionPerformed
    aireAcondicionado ventanaInstalacion;
    ventanaInstalacion= new aireAcondicionado();
    
    ventanaInstalacion.setChoice_mintegral(opt_mttointT.isSelected());
    ventanaInstalacion.setMts_cañeria(Float.parseFloat(spin_mtscañeria.getValue().toString()));
    ventanaInstalacion.setChoice_inselectrica(opt_inselecT.isSelected());
    ventanaInstalacion.setLocalidad(String.valueOf(combo_localidad.getSelectedItem()));
    ventanaInstalacion.setChoice_mensula(opt_mensulaT.isSelected());

 lbl_mintegral.setText(String.valueOf(ventanaInstalacion.calcularMantenimientoIntegral()));
lbl_insmat.setText(String.valueOf(ventanaInstalacion.calcularMaterialesxmetro()));
lbl_inselec.setText(String.valueOf(ventanaInstalacion.calcularInstalacionElectrica()));
lbl_viaticos.setText(String.valueOf(ventanaInstalacion.calcularViaticos()));
lbl_manobra.setText(String.valueOf(ventanaInstalacion.calcularManodeObraInstalacion()));
lbl_mensula.setText(String.valueOf(ventanaInstalacion.calcularMensula()));
lbl_prestotal.setText(String.valueOf(ventanaInstalacion.presupuestoTotalInstalacion()));
    }//GEN-LAST:event_ins_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(instalacionAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instalacionAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instalacionAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instalacionAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instalacionAC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> combo_localidad;
    private javax.swing.JButton ins_calcular;
    private javax.swing.JButton ins_cerrar;
    private javax.swing.JButton ins_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_inselec;
    private javax.swing.JLabel lbl_insmat;
    private javax.swing.JLabel lbl_manobra;
    private javax.swing.JLabel lbl_mensula;
    private javax.swing.JLabel lbl_mintegral;
    private javax.swing.JLabel lbl_prestotal;
    private javax.swing.JLabel lbl_viaticos;
    private javax.swing.JRadioButton opt_inselecF;
    private javax.swing.JRadioButton opt_inselecT;
    private javax.swing.JRadioButton opt_mensulaF;
    private javax.swing.JRadioButton opt_mensulaT;
    private javax.swing.JRadioButton opt_mttointF;
    private javax.swing.JRadioButton opt_mttointT;
    private javax.swing.JSpinner spin_mtscañeria;
    // End of variables declaration//GEN-END:variables
}