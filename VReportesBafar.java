


public class VReportesBafar extends javax.swing.JInternalFrame {

    ControlProducto producto;
    public VReportesBafar(ControlProducto producto) {
        this.producto=producto;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        general = new javax.swing.JButton();
        asc_nombre = new javax.swing.JButton();
        desc_nombre = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        desc_categoria = new javax.swing.JButton();
        asc_categoria = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        asc_costo = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        jLabel1.setText("REPORTES");

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        general.setText("General");
        general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalActionPerformed(evt);
            }
        });

        asc_nombre.setText("Ascendente");
        asc_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asc_nombreActionPerformed(evt);
            }
        });

        desc_nombre.setText("Descendente");
        desc_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desc_nombreActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        jLabel3.setText("COSTO PR.");

        desc_categoria.setText("Descendente");
        desc_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desc_categoriaActionPerformed(evt);
            }
        });

        asc_categoria.setText("Ascendente");
        asc_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asc_categoriaActionPerformed(evt);
            }
        });

        jLabel4.setText("CATEGORIA");

        asc_costo.setText("Ascendente");
        asc_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asc_costoActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asc_nombre)
                            .addComponent(desc_nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asc_categoria)
                            .addComponent(desc_categoria))
                        .addGap(27, 27, 27)
                        .addComponent(asc_costo)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(general)
                                .addGap(37, 37, 37)
                                .addComponent(regresar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(asc_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(desc_nombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(asc_categoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(desc_categoria)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(general)
                            .addComponent(regresar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(asc_costo)
                        .addGap(50, 50, 50))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalActionPerformed
        texto.setText(producto.reporteGeneral());
    }//GEN-LAST:event_generalActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_regresarActionPerformed

    private void asc_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asc_nombreActionPerformed
        texto.setText(producto.reporteAscendenteQuickSort());
    }//GEN-LAST:event_asc_nombreActionPerformed

    private void desc_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desc_nombreActionPerformed
        texto.setText(producto.reporteDescendenteQuickSort());
    }//GEN-LAST:event_desc_nombreActionPerformed

    private void asc_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asc_categoriaActionPerformed
        texto.setText(producto.reporteCategoriasAsendenteInsert());
    }//GEN-LAST:event_asc_categoriaActionPerformed

    private void desc_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desc_categoriaActionPerformed
        texto.setText(producto.reporteCategoriasDescendienteInsert());
    }//GEN-LAST:event_desc_categoriaActionPerformed

    private void asc_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asc_costoActionPerformed
        texto.setText(producto.reporteDescendenteBurbuja());
    }//GEN-LAST:event_asc_costoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asc_categoria;
    private javax.swing.JButton asc_costo;
    private javax.swing.JButton asc_nombre;
    private javax.swing.JButton desc_categoria;
    private javax.swing.JButton desc_nombre;
    private javax.swing.JButton general;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
