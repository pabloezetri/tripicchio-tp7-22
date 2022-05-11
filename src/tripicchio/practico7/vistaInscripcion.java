/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripicchio.practico7;

/**
 *
 * @author Gatito
 */
import static tripicchio.practico7.vistaAlumno.alumnos;
import static tripicchio.practico7.vistaMaterias.materias;
import javax.swing.JOptionPane;


public class vistaInscripcion extends javax.swing.JInternalFrame {

    /**
     * Creates new form vInscripcion
     */
    public vistaInscripcion() {
        initComponents();
        agregarAlumnos();
        agregarMateria();
    }
    
    public void agregarAlumnos(){
        for(Alumno a: alumnos){
            menuAlumno.addItem(a);
         }
    }
    
    public void agregarMateria(){
        for(Materia m: materias){
            menuMateria.addItem(m);
        }
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
        jbInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        menuMateria = new javax.swing.JComboBox<>();
        menuAlumno = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Inscripcion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Elija una Materia");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Elija un Alumno");

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        menuMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMateriaActionPerformed(evt);
            }
        });

        menuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(menuMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbInscribir)
                                .addGap(37, 37, 37)
                                .addComponent(jbSalir))
                            .addComponent(menuAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(menuMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(menuAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbSalir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMateriaActionPerformed

    private void menuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAlumnoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
       
        Alumno alum = (Alumno)menuAlumno.getSelectedItem();
       
        Materia mate = (Materia)menuMateria.getSelectedItem();
       
       alum.AgregarMateria(mate);
    }//GEN-LAST:event_jbInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> menuAlumno;
    private javax.swing.JComboBox<Materia> menuMateria;
    // End of variables declaration//GEN-END:variables
}