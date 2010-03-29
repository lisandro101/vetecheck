package vete.Interfaz;

/**
 *
 * @author Lisandro
 */
public class PanelArticulos extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    /** Creates new form PanelArticulos */
    public PanelArticulos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpArticulo = new javax.swing.JPanel();
        tfBuscarArticulo = new javax.swing.JTextField();
        jbBuscarArticulo = new javax.swing.JButton();
        spArticulo = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtArticulo = new javax.swing.JTable();
        jtpArticulo = new javax.swing.JTabbedPane();
        jpGeneralArticulo = new javax.swing.JPanel();
        tfCodigoArticulo = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombreArticulo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCostoArticulo = new javax.swing.JFormattedTextField();
        tfPrecioArticulo = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        tfStockArticulo = new javax.swing.JFormattedTextField();
        cbRubroArticulo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbEstadoMargenArticulo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cbImpuestoArticulo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        sMinimoArticulo = new javax.swing.JSpinner();
        sMargenArticulo = new javax.swing.JSpinner();
        jLabel66 = new javax.swing.JLabel();
        sMaximoArticulo = new javax.swing.JSpinner();
        jpOpcionalArticulo = new javax.swing.JPanel();
        jpDetalleArticulo = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jepDetalleArticulo = new javax.swing.JEditorPane();
        pbArticulo = new javax.swing.JPanel();
        jbNuevoArticulo = new javax.swing.JButton();
        jbModificarArticulo = new javax.swing.JButton();
        jbEliminarArticulo = new javax.swing.JButton();
        jbImprimirArticulo = new javax.swing.JButton();
        jbVenderArticulo = new javax.swing.JButton();
        jbComprarArticulo = new javax.swing.JButton();
        jbOpcionesArticulo = new javax.swing.JButton();

        tfBuscarArticulo.setFont(new java.awt.Font("Arial", 0, 12));

        jbBuscarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vete/buscar1.gif"))); // NOI18N
        jbBuscarArticulo.setToolTipText("Buscar");
        jbBuscarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarArticuloActionPerformed(evt);
            }
        });

        spArticulo.setDividerLocation(200);
        spArticulo.setDividerSize(10);
        spArticulo.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(468, 424));

        jtArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        jtArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "C�digo", "Nombre", "Precio", "Costo", "IVA", "Stock"
            }
        ));
        jtArticulo.setColumnSelectionAllowed(true);
        jtArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtArticuloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtArticulo);

        spArticulo.setLeftComponent(jScrollPane1);

        tfCodigoArticulo.setFont(new java.awt.Font("Arial", 0, 12));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel1.setText("C�digo");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel2.setText("Nombre");

        tfNombreArticulo.setFont(new java.awt.Font("Arial", 0, 12));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel4.setText("Costo");

        tfCostoArticulo.setFont(new java.awt.Font("Arial", 0, 12));

        tfPrecioArticulo.setFont(new java.awt.Font("Arial", 0, 12));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel5.setText("Stock");

        tfStockArticulo.setEnabled(false);
        tfStockArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        tfStockArticulo.setOpaque(false);

        cbRubroArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        cbRubroArticulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Medicamento", "Inyectable", "Vacuna", "Alimento", "Pet" }));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel6.setText("Rubro");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel7.setText("M�nimo");

        cbEstadoMargenArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        cbEstadoMargenArticulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "%", "" }));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel9.setText("Margen");

        cbImpuestoArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        cbImpuestoArticulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IVA (10,5%)", "IVA (21,0%)" }));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel10.setText("Impuesto");

        sMinimoArticulo.setFont(new java.awt.Font("Arial", 0, 12));

        sMargenArticulo.setFont(new java.awt.Font("Arial", 0, 12));

        jLabel66.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel66.setText("M�ximo");

        sMaximoArticulo.setFont(new java.awt.Font("Arial", 0, 12));

        javax.swing.GroupLayout jpGeneralArticuloLayout = new javax.swing.GroupLayout(jpGeneralArticulo);
        jpGeneralArticulo.setLayout(jpGeneralArticuloLayout);
        jpGeneralArticuloLayout.setHorizontalGroup(
            jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGeneralArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCostoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(tfStockArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGeneralArticuloLayout.createSequentialGroup()
                        .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpGeneralArticuloLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel9))
                                .addComponent(tfNombreArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                            .addGroup(jpGeneralArticuloLayout.createSequentialGroup()
                                .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sMinimoArticulo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPrecioArticulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sMaximoArticulo)
                                    .addComponent(sMargenArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel66))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstadoMargenArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jpGeneralArticuloLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(214, 214, 214)))
                .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRubroArticulo, 0, 257, Short.MAX_VALUE)
                    .addComponent(cbImpuestoArticulo, 0, 257, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpGeneralArticuloLayout.setVerticalGroup(
            jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGeneralArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRubroArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCostoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpGeneralArticuloLayout.createSequentialGroup()
                        .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPrecioArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstadoMargenArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sMargenArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbImpuestoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeneralArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStockArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sMinimoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sMaximoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jtpArticulo.addTab("General", jpGeneralArticulo);

        javax.swing.GroupLayout jpOpcionalArticuloLayout = new javax.swing.GroupLayout(jpOpcionalArticulo);
        jpOpcionalArticulo.setLayout(jpOpcionalArticuloLayout);
        jpOpcionalArticuloLayout.setHorizontalGroup(
            jpOpcionalArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        jpOpcionalArticuloLayout.setVerticalGroup(
            jpOpcionalArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );

        jtpArticulo.addTab("Opcional", jpOpcionalArticulo);

        jepDetalleArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        jScrollPane9.setViewportView(jepDetalleArticulo);

        javax.swing.GroupLayout jpDetalleArticuloLayout = new javax.swing.GroupLayout(jpDetalleArticulo);
        jpDetalleArticulo.setLayout(jpDetalleArticuloLayout);
        jpDetalleArticuloLayout.setHorizontalGroup(
            jpDetalleArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDetalleArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpDetalleArticuloLayout.setVerticalGroup(
            jpDetalleArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDetalleArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpArticulo.addTab("Detalle", jpDetalleArticulo);

        spArticulo.setBottomComponent(jtpArticulo);

        pbArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        jbNuevoArticulo.setBackground(new java.awt.Color(255, 255, 255));
        jbNuevoArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        jbNuevoArticulo.setText("Nuevo");
        jbNuevoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoArticuloActionPerformed(evt);
            }
        });

        jbModificarArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        jbModificarArticulo.setText("Modificar");
        jbModificarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarArticuloActionPerformed(evt);
            }
        });

        jbEliminarArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        jbEliminarArticulo.setText("Eliminar");
        jbEliminarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarArticuloActionPerformed(evt);
            }
        });

        jbImprimirArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        jbImprimirArticulo.setText("Imprimir");

        jbVenderArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        jbVenderArticulo.setText("Vender");

        jbComprarArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        jbComprarArticulo.setText("Comprar");

        jbOpcionesArticulo.setFont(new java.awt.Font("Arial", 0, 12));
        jbOpcionesArticulo.setText("Opciones");

        javax.swing.GroupLayout pbArticuloLayout = new javax.swing.GroupLayout(pbArticulo);
        pbArticulo.setLayout(pbArticuloLayout);
        pbArticuloLayout.setHorizontalGroup(
            pbArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pbArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbImprimirArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jbEliminarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jbModificarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jbNuevoArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jbOpcionesArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jbComprarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jbVenderArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addContainerGap())
        );
        pbArticuloLayout.setVerticalGroup(
            pbArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbImprimirArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbVenderArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbComprarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jbOpcionesArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpArticuloLayout = new javax.swing.GroupLayout(jpArticulo);
        jpArticulo.setLayout(jpArticuloLayout);
        jpArticuloLayout.setHorizontalGroup(
            jpArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpArticuloLayout.createSequentialGroup()
                        .addComponent(tfBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpArticuloLayout.createSequentialGroup()
                        .addComponent(spArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pbArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpArticuloLayout.setVerticalGroup(
            jpArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarArticuloActionPerformed

//        //Realiza la verdadera busqueda
//        this.articulos = ControladorArticulo.getInstancia().buscar(hashArticulo);
//
//        //Cargar la busqueda en la JTable
//        cargarJTableArticulo(articulos);
//
//        limpiarCampos(jpGeneralArticulo);
//        limpiarCampos(jpOpcionalArticulo);
//        jepDetalleArticulo.setText("");
}//GEN-LAST:event_jbBuscarArticuloActionPerformed

    private void jtArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtArticuloMouseClicked

//        //Carga el articulo seleccionado en la jTable en los textFields
//        cargarCamposArticulo(articulos.get(jtArticulo.getSelectedRow()));
    }//GEN-LAST:event_jtArticuloMouseClicked

    private void jbNuevoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoArticuloActionPerformed
//        String msg;
//
//        //Crea una hash con todos los datos del articulo introducidos
//        HashMap<String, Object> hashArticulo = armarHashArticulo();
//
//        //Si se ha ingresado un nombre de articulo
//        if (!(hashArticulo.get("nombre").equals("") || hashArticulo.get("codigo").equals(""))){
//
//            //Se intenta grabar un vendedor en la Base de Datos
//            msg = ControladorArticulo.getInstancia().ingresar(hashArticulo);
//
//            //Si se produce un error mostrar el dialogo de error
//            if (!(msg.equals(""))){
//                JOptionPane.showMessageDialog(null, msg,"ERROR", JOptionPane.ERROR_MESSAGE);
//            }
//            //Sino limpiar los campos
//            else {
//                JOptionPane.showMessageDialog(null, "Articulo ingresado con exito.","Alta Articulo", JOptionPane.INFORMATION_MESSAGE);
//
//                limpiarCampos(jpGeneralArticulo);
//                limpiarCampos(jpOpcionalArticulo);
//                jepDetalleArticulo.setText("");
//
//            }
//        }
//
//        //Sino muestra un dialogo de error
//        else {
//            JOptionPane.showMessageDialog(null, "Falta ingresar datos","Alta Articulo", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_jbNuevoArticuloActionPerformed

    private void jbModificarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarArticuloActionPerformed

//        //Modifica el ultimo articulo seleccionado
//        ControladorArticulo.getInstancia().actualizar(cargarArticulo(ultimoArticulo));
//
//
//        limpiarCampos(jpGeneralArticulo);
//        limpiarCampos(jpOpcionalArticulo);
//        jepDetalleArticulo.setText("");
    }//GEN-LAST:event_jbModificarArticuloActionPerformed

    private void jbEliminarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarArticuloActionPerformed

        //eliminar el ultimo articulo seleccionado
//        ControladorArticulo.getInstancia().borrar(ultimoArticulo);
    }//GEN-LAST:event_jbEliminarArticuloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbEstadoMargenArticulo;
    private javax.swing.JComboBox cbImpuestoArticulo;
    private javax.swing.JComboBox cbRubroArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton jbBuscarArticulo;
    private javax.swing.JButton jbComprarArticulo;
    private javax.swing.JButton jbEliminarArticulo;
    private javax.swing.JButton jbImprimirArticulo;
    private javax.swing.JButton jbModificarArticulo;
    private javax.swing.JButton jbNuevoArticulo;
    private javax.swing.JButton jbOpcionesArticulo;
    private javax.swing.JButton jbVenderArticulo;
    private javax.swing.JEditorPane jepDetalleArticulo;
    private javax.swing.JPanel jpArticulo;
    private javax.swing.JPanel jpDetalleArticulo;
    private javax.swing.JPanel jpGeneralArticulo;
    private javax.swing.JPanel jpOpcionalArticulo;
    private javax.swing.JTable jtArticulo;
    private javax.swing.JTabbedPane jtpArticulo;
    private javax.swing.JPanel pbArticulo;
    private javax.swing.JSpinner sMargenArticulo;
    private javax.swing.JSpinner sMaximoArticulo;
    private javax.swing.JSpinner sMinimoArticulo;
    private javax.swing.JSplitPane spArticulo;
    private javax.swing.JTextField tfBuscarArticulo;
    private javax.swing.JFormattedTextField tfCodigoArticulo;
    private javax.swing.JFormattedTextField tfCostoArticulo;
    private javax.swing.JFormattedTextField tfNombreArticulo;
    private javax.swing.JFormattedTextField tfPrecioArticulo;
    private javax.swing.JFormattedTextField tfStockArticulo;
    // End of variables declaration//GEN-END:variables

}
