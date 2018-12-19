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
import Model.Animal;
import Model.Cuidador;
import Model.Jaula;
import Model.Sector;
import static View.jpanelAgregar.cuidadores;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
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
    
    
    /**
     * Creates new form jpanelAgregarAnimal
     */
    public jpanelAgregarAnimal() {
        initComponents();
        cargarDatos();
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
            o[3] = animale.getIdTIpo();
            o[4] = animale.getIdJaula();
            tba.addRow(o);
        }
        
        
        jComboCuidador.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel cbCuidador = (DefaultComboBoxModel) jComboCuidador.getModel();
        cbCuidador.removeAllElements();
        for (Cuidador cui : cuidadores) {
              cbCuidador.addElement(cui.getRut() + "(" + cui.getNombre()+ ")");
        }
        
        jComboJaula.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel cbJaula = (DefaultComboBoxModel) jComboJaula.getModel();
        cbJaula.removeAllElements();
        for (Sector sec : sectores) {
            
        }
        
        
        
    
        
        
        
    }
    
    public boolean camposVacios(String run, String nom , String ape ,String Corr, String pass){
        if (run.equals("")|| nom.equals("") || ape.equals("") || Corr.equals("") || pass.equals("") ) {
            return true;
        }
        return false;
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
        jTextSexoAnimal = new javax.swing.JTextField();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jlabelNombreAnimal)
                                        .addComponent(jLabelSexoAnimal))
                                    .addGap(45, 45, 45))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTipoAnimal)
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
                            .addComponent(jComboCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSexoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboJaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTituloAgregarAnimal)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAgregarAnimal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCancel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelTituloAgregarAnimal)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabelNombreAnimal))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSexoAnimal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextSexoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                            .addComponent(jButtonCancel))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreAnimalActionPerformed

    private void jButtonAgregarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarAnimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarAnimal;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JComboBox<String> jComboCuidador;
    private javax.swing.JComboBox<String> jComboJaula;
    private javax.swing.JComboBox<String> jComboSector;
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
    private javax.swing.JTextField jTextSexoAnimal;
    private javax.swing.JLabel jlabelNombreAnimal;
    // End of variables declaration//GEN-END:variables
}
