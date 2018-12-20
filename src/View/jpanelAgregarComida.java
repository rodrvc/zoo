
package View;


import Controller.ControllerComidas;
import static Controller.ControllerComidas.CargarAlimentos;
import static Controller.ControllerComidas.ObjenerVegetales;
import static Controller.ControllerComidas.ObtenerAgua;
import static Controller.ControllerComidas.ObtenerCarnes;
import static Controller.ControllerComidas.ObtenerFrutosSecos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;





public class jpanelAgregarComida extends javax.swing.JPanel {
    static int n = 100 ; 
    static Timer t ; 
    static ActionListener a;
    
    public jpanelAgregarComida() {
        initComponents();
        this.setBackground(Color.white);
        cargarBarrasyCombobox();
        laComidaSeAcaba();
    }
    
    public void laComidaSeAcaba(){
         
        a  = new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e) {
                    int v = 0;
                    int c = 0;
                    int f = 0;
                    int a = 0;
                    
                    v = ObjenerVegetales();
                    c = ObtenerCarnes();
                    f = ObtenerFrutosSecos();
                    a = ObtenerAgua();
                    String alertaV = "";
                    String alertaC = "";
                    String alertaF = "";
                    String alertaA = "";
                    
                 
                    
                    //v<100 && c < 80 && f <30 && a < 15
                    if (v > 0) {
                        jProgressVegetales.setValue(v);
                        jvegetalesPorcentaje.setText(v + "kg");
                    }else  
                    { 
                         jProgressVegetales.setValue(0);
                        jvegetalesPorcentaje.setText("0kg");
                        alertaV =  "-Hervivoros";
                    }
                    
                    if (c > 0) {
                        jprogressCarnes.setValue(c);
                        jcarnesPorcentaje.setText(c + "kg");
                    } else {
                        jprogressCarnes.setValue(0);
                        jcarnesPorcentaje.setText("0kg");
                        alertaC =  "-Carnivoros";
                    }
                    
                    if (f > 0 ) {
                        jfrutosPorcentaje.setText(f + "kg");
                        jprogressFrutosSecos.setValue(f);
                    }
                    else 
                    {
                        jfrutosPorcentaje.setText("0");
                        jprogressFrutosSecos.setValue(0);
                         alertaF =  "-Omnivoros";
                    }
                    
                    if (a > 0) {
                          jaguaPorcentaje.setText(a+ "kg");
                          jProgressAgua.setValue(a);
                    }
                    else 
                    {
                          jaguaPorcentaje.setText("0"+ "kg");
                          jProgressAgua.setValue(0);
                          alertaA = "-Agua";
                    }
                    if (v <= 0 || c <=  0 || f <=  0 ||  a <=  0) {
                           
                       jniveles.setText("Ponatencion a los siguientes niveles " + alertaV + alertaC + alertaF + alertaA  );
                       jniveles.setForeground(Color.ORANGE);
                             
                    }else{
                        jniveles.setText("Niveles en Orden");
                        jniveles.setForeground(Color.green);
                    }
            }
        };
        
        t = new Timer(100, a);
        t.start();
    }
    

    public void cargarBarrasyCombobox(){
        //cargar barras de comidas
        jProgressVegetales.setMaximum(700);
        jprogressCarnes.setMaximum(200);
        jprogressFrutosSecos.setMaximum(300);
        jProgressAgua.setMaximum(1500);
        
        
        
        
        jProgressVegetales.setValue(ObjenerVegetales());
        jprogressFrutosSecos.setValue(ObtenerFrutosSecos());
        jprogressCarnes.setValue(ObtenerCarnes());
        jProgressAgua.setValue(ObtenerAgua());
        
        //cargar comboBox
        jComboSeleccionarAlimento.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel comboAgregar = (DefaultComboBoxModel) jComboSeleccionarAlimento.getModel();
        comboAgregar.removeAllElements();
        
        comboAgregar.addElement("Alimento");
        comboAgregar.addElement("Vegetales");
        comboAgregar.addElement("Carnes");
        comboAgregar.addElement("Frutos secos");
        comboAgregar.addElement("Agua");
        
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlabelTextoSeleccionarAlimento = new javax.swing.JLabel();
        jComboSeleccionarAlimento = new javax.swing.JComboBox<>();
        jtextCantidadAlimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbuttonAgregarAlimento = new javax.swing.JButton();
        jbuttonCancelarAgregarAlimento = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Aviso = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jprogressCarnes = new javax.swing.JProgressBar();
        jProgressVegetales = new javax.swing.JProgressBar();
        jprogressFrutosSecos = new javax.swing.JProgressBar();
        jProgressAgua = new javax.swing.JProgressBar();
        jLabelVegetales = new javax.swing.JLabel();
        jLabelCarnes = new javax.swing.JLabel();
        jLabelFrutos = new javax.swing.JLabel();
        jLabelAgua = new javax.swing.JLabel();
        jvegetalesPorcentaje = new javax.swing.JLabel();
        jcarnesPorcentaje = new javax.swing.JLabel();
        jfrutosPorcentaje = new javax.swing.JLabel();
        jaguaPorcentaje = new javax.swing.JLabel();
        jniveles = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel2.setText("INGRESAR ALIMENTO");

        jlabelTextoSeleccionarAlimento.setText("Tipo alimento");

        jComboSeleccionarAlimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "herbivoro", "carnivoro", "omnivoro" }));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad");

        jbuttonAgregarAlimento.setText("Agregar");
        jbuttonAgregarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonAgregarAlimentoActionPerformed(evt);
            }
        });

        jbuttonCancelarAgregarAlimento.setText("Cancelar");

        Aviso.setText("              ");

        jLabel5.setText("Uzoo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(97, 97, 97))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jlabelTextoSeleccionarAlimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jComboSeleccionarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jtextCantidadAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jbuttonAgregarAlimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbuttonCancelarAgregarAlimento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(Aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextCantidadAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboSeleccionarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelTextoSeleccionarAlimento)
                    .addComponent(jLabel5))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonAgregarAlimento)
                    .addComponent(jbuttonCancelarAgregarAlimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aviso))
        );

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setText("CANTIDAD DE ALIMENTO ");

        jProgressVegetales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressVegetalesStateChanged(evt);
            }
        });

        jLabelVegetales.setText("Vegetales");

        jLabelCarnes.setText("Carnes");

        jLabelFrutos.setText("Frutos");

        jLabelAgua.setText("Agua");

        jvegetalesPorcentaje.setText("  ");

        jcarnesPorcentaje.setText("  ");

        jfrutosPorcentaje.setText("  ");

        jaguaPorcentaje.setText("  ");

        jniveles.setText("Indicador");

        jLabel6.setText("max 700kg");

        jLabel7.setText("max 200kg");

        jLabel8.setText("max 300kg");

        jLabel9.setText("max 1500L");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCarnes)
                                .addGap(18, 18, 18)
                                .addComponent(jcarnesPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelVegetales)
                                    .addComponent(jLabelFrutos)
                                    .addComponent(jLabelAgua))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jaguaPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(jfrutosPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jvegetalesPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jProgressAgua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jprogressCarnes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressVegetales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(jprogressFrutosSecos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jniveles, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jProgressVegetales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelVegetales)
                                                .addComponent(jvegetalesPorcentaje))
                                            .addComponent(jLabel6))
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelCarnes)
                                                .addComponent(jcarnesPorcentaje))
                                            .addComponent(jprogressCarnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jprogressFrutosSecos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelFrutos)
                                        .addComponent(jfrutosPorcentaje))))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelAgua)
                                .addComponent(jaguaPorcentaje))
                            .addComponent(jProgressAgua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(44, 44, 44)
                .addComponent(jniveles)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonAgregarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonAgregarAlimentoActionPerformed

        //Se obtienen las variables
        int cantidadDeComidaParaAgregar = 0 ; 
        String seleccionDeComidaParaAgregar ;
        
        seleccionDeComidaParaAgregar = jComboSeleccionarAlimento.getSelectedItem().toString();
        
        if (seleccionDeComidaParaAgregar.equals("Alimento"))
        {
                        JOptionPane.showMessageDialog(null, "Debes Ingresar un Alimento o Agua de la combobox"
                        , "AGREGAR COMIDA", JOptionPane.CLOSED_OPTION);
        }
        else
        {
        //CANTIDAD NECESITA PASAR DESDE STRING A INT *(TRY CATCH)
                try 
                {
                    cantidadDeComidaParaAgregar = Integer.parseInt(jtextCantidadAlimento.getText());
                 } 
                catch (Exception e) { // vaciara el campo , mostrara mensaje, y hara focus en el campo erroneo
                            jtextCantidadAlimento.setText("");
                            JOptionPane.showMessageDialog(null, "Debes Ingresar un numero de kg"
                            , "AGREGAR COMIDA", JOptionPane.CLOSED_OPTION);
                            jtextCantidadAlimento.requestFocus();
                }
        //*** FIN TRY CATCH**
        // No SUPERAR EL MAXIMO DE CANTIDAD
                 if (CargarAlimentos(seleccionDeComidaParaAgregar, cantidadDeComidaParaAgregar) == 0) { // 0 representa la operacion no realizada por sobrecarga en cantidad
                            JOptionPane.showMessageDialog(null, "La Cantidad de comida sobrepasa el almacen"
                        , "AGREGAR COMIDA", JOptionPane.CLOSED_OPTION); 
                }
                cargarBarrasyCombobox();
            }
    }//GEN-LAST:event_jbuttonAgregarAlimentoActionPerformed

    private void jProgressVegetalesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressVegetalesStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jProgressVegetalesStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aviso;
    private javax.swing.JComboBox<String> jComboSeleccionarAlimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAgua;
    private javax.swing.JLabel jLabelCarnes;
    private javax.swing.JLabel jLabelFrutos;
    private javax.swing.JLabel jLabelVegetales;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressAgua;
    private javax.swing.JProgressBar jProgressVegetales;
    private javax.swing.JLabel jaguaPorcentaje;
    private javax.swing.JButton jbuttonAgregarAlimento;
    private javax.swing.JButton jbuttonCancelarAgregarAlimento;
    private javax.swing.JLabel jcarnesPorcentaje;
    private javax.swing.JLabel jfrutosPorcentaje;
    private javax.swing.JLabel jlabelTextoSeleccionarAlimento;
    private javax.swing.JLabel jniveles;
    private javax.swing.JProgressBar jprogressCarnes;
    private javax.swing.JProgressBar jprogressFrutosSecos;
    private javax.swing.JTextField jtextCantidadAlimento;
    private javax.swing.JLabel jvegetalesPorcentaje;
    // End of variables declaration//GEN-END:variables
}
