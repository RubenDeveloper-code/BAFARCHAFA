/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Alejandro Alejandre
 */
public class PF extends javax.swing.JInternalFrame {

    ControlProducto producto;
    public PF(ControlProducto producto) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        f_caducidad = new javax.swing.JTextField();
        nlote = new javax.swing.JTextField();
        f_envasado = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        costo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        realizar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        jLabel1.setText("PRODUCTO FRESCO");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("CODIGO");

        jLabel4.setText("FECHA CADUCIDAD");

        jLabel5.setText("N. LOTE");

        jLabel6.setText("FECHA ENVASADO");

        jLabel7.setText("PAIS ORIGEN");

        jLabel8.setText("COSTO PRODUCCION");

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        realizar.setText("Realizar");
        realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(jLabel2)
                                                  .addComponent(jLabel3)
                                                  .addComponent(jLabel4)
                                                  .addComponent(jLabel5)
                                                  .addComponent(jLabel6)
                                                  .addComponent(jLabel7)
                                                  .addComponent(jLabel8))
                                          .addGap(18, 18, 18)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                  .addComponent(codigo)
                                                  .addComponent(nombre)
                                                  .addComponent(f_caducidad)
                                                  .addComponent(nlote)
                                                  .addComponent(f_envasado)
                                                  .addComponent(pais)
                                                  .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createSequentialGroup()
                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                          .addComponent(jScrollPane1))
                                                  .addGroup(layout.createSequentialGroup()
                                                          .addGap(26, 26, 26)
                                                          .addComponent(realizar)
                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                          .addComponent(regresar)
                                                          .addGap(9, 9, 9))))
                                .addGroup(layout.createSequentialGroup()
                                          .addGap(156, 156, 156)
                                          .addComponent(jLabel1)
                                          .addGap(0, 0, Short.MAX_VALUE)))
                      .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                      .addGap(23, 23, 23)
                      .addComponent(jLabel1)
                      .addGap(18, 18, 18)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(realizar)
                                          .addComponent(regresar))
                                .addGroup(layout.createSequentialGroup()
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel2)
                                                  .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGap(18, 18, 18)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel3)
                                                  .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGap(18, 18, 18)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel4)
                                                  .addComponent(f_caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGap(18, 18, 18)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel5)
                                                  .addComponent(nlote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGap(18, 18, 18)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel6)
                                                  .addComponent(f_envasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGap(18, 18, 18)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel7)
                                                  .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGap(18, 18, 18)
                                          .addComponent(jLabel8))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarActionPerformed
        Producto Altaproducto = new ProductoFresco(f_envasado.getText(), pais.getText(), nombre.getText(),
            Integer.parseInt(codigo.getText()), f_caducidad.getText(), Integer.parseInt(nlote.getText()),
            Double.parseDouble(costo.getText()));

        texto.setText(producto.altas(Altaproducto));
        String cadena=producto.buscarPorNombre((nombre.getText()))+" se agrego exitosamente";
        texto.append("\n"+cadena);
        producto.cambioProducto(nombre.getText(), Altaproducto);
    }//GEN-LAST:event_realizarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField costo;
    private javax.swing.JTextField f_caducidad;
    private javax.swing.JTextField f_envasado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nlote;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pais;
    private javax.swing.JButton realizar;
    private javax.swing.JButton regresar;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
