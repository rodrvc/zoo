/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import static Controller.ControllerAdministrativo.devolverAnimales;
import static Controller.ControllerAdministrativo.devolverCuidadores;
import static Controller.ControllerAdministrativo.devolverJaulas;
import static Controller.ControllerAdministrativo.devolverSectores;
import static Controller.ControllerAdministrativo.devolverTipoAnimales;
import static Controller.ControllerComidas.actualizarCantidadAnimales;
import Model.Animal;
import Model.Cuidador;
import Model.Jaula;
import Model.Sector;
import Model.TipoAnimal;
import static View.jpanelAgregar.cuidadores;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author silve
 */
public class jpanelAgregarAnimal extends javax.swing.JPanel {
    public static ArrayList<Animal> animales = devolverAnimales();
    public static ArrayList<Cuidador> cuidadores = devolverCuidadores();
    public static ArrayList<Jaula> jaulas = devolverJaulas();
    public static ArrayList<Sector> sectores = devolverSectores();
    public static ArrayList<TipoAnimal> tipos= devolverTipoAnimales();
    
    
    
    /**
     * Creates new form jpanelAgregarAnimal
     */
    public jpanelAgregarAnimal() {
        initComponents();
        cargarDatos();
    }
    
    
     int ObjetenerCapacidad(Jaula j){
        int contCapacidad = 0;
        for (Animal animale : animales) {
            if (animale.getIdJaula().equals(j.getIdJaula()) ) {
                contCapacidad ++;
            }
        }
        return contCapacidad;
    }
    
    
    public  void cargarDatos(){
       jTableAnimales.setModel( new DefaultTableModel(null , new String[]{"ID" , "NOMBRE" , "SEXO" , "TIPO" , "JAULA"} ));
      
       DefaultTableModel tba = (DefaultTableModel) jTableAnimales.getModel();
        jTableAnimales.removeAll();
        
       
       
       Object[] o = new Object[6];
        for (Animal animale : animales) {
            
            o[0] = animale.getIdAnimal();
            o[1] = animale.getNombre();
            o[2] = animale.getSexo();
            for (TipoAnimal tipo : tipos) {
                if (animale.getIdTIpo().equals(tipo.getIdTipo())) {
                    o[3] = tipo.getTipo();
                }
            }
            o[4] = animale.getIdJaula();
            tba.addRow(o);
        }
        
        
        jComboCuidador.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel cbCuidador = (DefaultComboBoxModel) jComboCuidador.getModel();
        cbCuidador.removeAllElements();
        for (Cuidador cui : cuidadores) {
              cbCuidador.addElement(cui.getRut() + "(" + cui.getNombre()+ ")");
        }
        
        jComboSector.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel cbSector = (DefaultComboBoxModel) jComboSector.getModel();
        cbSector.removeAllElements();
        cbSector.addElement("Seleccionar");
        for (Sector sec : sectores) {
            cbSector.addElement(sec.getIdSector() + "-" + sec.getNombreSector());
        }
        
         jComboJaula.setModel( new DefaultComboBoxModel()); //este combo se llena en base al sector
        DefaultComboBoxModel comboJaula = (DefaultComboBoxModel) jComboJaula.getModel();
        comboJaula.addElement("Seleccionar");

        
         jComboTipo.setModel(new DefaultComboBoxModel());
         DefaultComboBoxModel cbTipo =  (DefaultComboBoxModel) jComboTipo.getModel();
         cbTipo.removeAllElements();
         cbTipo.addElement("Seleccionar");
         for (TipoAnimal a : tipos) {
            cbTipo.addElement(a.getTipo());
        }
        
         jComboSexo.setModel(new DefaultComboBoxModel());
         DefaultComboBoxModel cbSexo = (DefaultComboBoxModel) jComboSexo.getModel();
         cbSexo.removeAllElements();
        cbSexo.addElement("Seleccionar");
        cbSexo.addElement("macho");
        cbSexo.addElement("hembra");
        
        actualizarCantidadAnimales();
    }  
    
    
        
    
    
    
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextNombreAnimal = new javax.swing.JTextField();
        jLabelTituloAgregarAnimal = new javax.swing.JLabel();
        jlabelNombreAnimal = new javax.swing.JLabel();
        jLabelSexoAnimal = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox<>();
        jLabelTipoAnimal = new javax.swing.JLabel();
        jLabelCuidadorAnimal = new javax.swing.JLabel();
        jComboCuidador = new javax.swing.JComboBox<>();
        jComboSector = new javax.swing.JComboBox<>();
        jLabelSector = new javax.swing.JLabel();
        jLabelJaula = new javax.swing.JLabel();
        jComboJaula = new javax.swing.JComboBox<>();
        jButtonAgregarAnimal = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAnimales = new javax.swing.JTable();
        jComboSexo = new javax.swing.JComboBox<>();

        jTextNombreAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreAnimalActionPerformed(evt);
            }
        });

        jLabelTituloAgregarAnimal.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabelTituloAgregarAnimal.setText("Agregar Animal");

        jlabelNombreAnimal.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlabelNombreAnimal.setText("Nombre:");

        jLabelSexoAnimal.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabelSexoAnimal.setText("Sexo:");

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabelTipoAnimal.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabelTipoAnimal.setText("Tipo:");

        jLabelCuidadorAnimal.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabelCuidadorAnimal.setText("Cuidador:");

        jComboCuidador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jComboSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jComboSector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboSectorItemStateChanged(evt);
            }
        });

        jLabelSector.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabelSector.setText("Sector:");

        jLabelJaula.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabelJaula.setText("Jaula:");

        jComboJaula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jButtonAgregarAnimal.setText("Agregar");
        jButtonAgregarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAnimalActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");

        jTableAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableAnimales);

        jComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jlabelNombreAnimal)
                                    .addGap(24, 24, 24))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelSexoAnimal)
                                        .addComponent(jLabelTipoAnimal))
                                    .addGap(41, 41, 41)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCuidadorAnimal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelJaula)
                                            .addComponent(jLabelSector))))
                                .addGap(41, 41, 41)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboSector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboJaula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboCuidador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTituloAgregarAnimal)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAgregarAnimal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCancel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTituloAgregarAnimal)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabelNombreAnimal)
                            .addComponent(jTextNombreAnimal))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTipoAnimal)
                                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCuidadorAnimal)
                                    .addComponent(jComboCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelSector)
                                    .addComponent(jComboSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelJaula)
                                    .addComponent(jComboJaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonAgregarAnimal)
                                    .addComponent(jButtonCancel)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelSexoAnimal)
                                .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(206, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreAnimalActionPerformed

    private void jButtonAgregarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAnimalActionPerformed
        // TODO add your handling code here:
        
        String idAnimal = String.valueOf(animales.size()+1);
        String nom = jTextNombreAnimal.getText();
        String sexo = jComboSexo.getSelectedItem().toString();
        String idTipo = jComboTipo.getSelectedItem().toString(); //  agregaron palabras
        String jaula = jComboJaula.getSelectedItem().toString(); //  agregaron palabras
        
        for (TipoAnimal tipo : tipos) {
            if (tipo.getTipo().equals(idTipo)) {
                idTipo = tipo.getIdTipo(); // 
            }
        }
        
        String[] SeleccionarSoloJaula = jaula.split(" ");
        
        //validaciones
        if (!nom.matches("[a-zA-Z]+")) {
             JOptionPane.showMessageDialog(null, "Ingresa un nombre valido!");
             jTextNombreAnimal.setText("");
             jTextNombreAnimal.requestFocus();
        }
        else if(sexo.equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Debes selecionar un sexo");
        }
        else if (idTipo.equals("Seleccionar")) 
        {
            JOptionPane.showMessageDialog(null, "Debes selecionar un tipo de animal");
        }
        else if(SeleccionarSoloJaula[0].equals("Seleccionar"))
        {
             JOptionPane.showMessageDialog(null, "Debes selecionar una jaula");
        }
        else 
        {
            Controller.ControllerAdministrativo.AgregarAnimal(idAnimal, nom, sexo, idTipo, SeleccionarSoloJaula[0]);
            cargarDatos();
        }
        
    }//GEN-LAST:event_jButtonAgregarAnimalActionPerformed

    private void jComboSectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboSectorItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
       
        String sectorSelecionado = null ; 
         
        jComboJaula.setModel( new DefaultComboBoxModel());
       
        DefaultComboBoxModel comboJaula = (DefaultComboBoxModel) jComboJaula.getModel();
        
        comboJaula.addElement("Seleccionar");
         sectorSelecionado=jComboSector.getSelectedItem().toString();
         String SoloIdSelecionadoDeSector[] = sectorSelecionado.split("-"); // se selecciona solo la parte del id del sector
            for (Jaula jaula : jaulas) {
                if (SoloIdSelecionadoDeSector[0].equals(jaula.getIdSector())) {
                    comboJaula.addElement(jaula.getIdJaula()+"  ("+ ObjetenerCapacidad(jaula)+ " / "+jaula.getIdcapacidad()+")"  );
                }
            }
            
            String tipoAnimal = null ; 
            
//            jComboTipo.setModel(new DefaultComboBoxModel());
//            DefaultComboBoxModel cbTipo =  (DefaultComboBoxModel) jComboTipo.getModel();
            
//            for (Animal a : animales) {
//                if (a.getIdTIpo().matches("1-10")) {
//                    cbTipo.addElement(a.getIdTIpo());
//                }
//                else if(a.getIdTIpo().matches(tipoAnimal)){
//                    
//                }
//                else if (a.getIdTIpo().matches(tipoAnimal)) {
//                    
//                }
//                else if (a.getIdTIpo().matches(tipoAnimal)) {
//                    
//                }
//            }
            
            
            
            
        }
    }//GEN-LAST:event_jComboSectorItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarAnimal;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JComboBox<String> jComboCuidador;
    private javax.swing.JComboBox<String> jComboJaula;
    private javax.swing.JComboBox<String> jComboSector;
    private javax.swing.JComboBox<String> jComboSexo;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabelCuidadorAnimal;
    private javax.swing.JLabel jLabelJaula;
    private javax.swing.JLabel jLabelSector;
    private javax.swing.JLabel jLabelSexoAnimal;
    private javax.swing.JLabel jLabelTipoAnimal;
    private javax.swing.JLabel jLabelTituloAgregarAnimal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAnimales;
    private javax.swing.JTextField jTextNombreAnimal;
    private javax.swing.JLabel jlabelNombreAnimal;
    // End of variables declaration//GEN-END:variables
}
