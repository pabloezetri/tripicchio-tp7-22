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
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    
    HashSet <Materia> materiasIncripto = new HashSet<>();

     Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void AgregarMateria(Materia materia){
        
        if (!(materiasIncripto.contains(materia))){
            System.out.println("Inscripcion exitosa ("+materia+")");
           JOptionPane.showMessageDialog(null, "Inscripcion exitosa ("+materia+")");
            materiasIncripto.add(materia);
            }else{
            System.out.println("Solo se puede inscribir una vez x materia");
            JOptionPane.showMessageDialog(null,"Solo se puede inscribir una vez x materia");
        }
    }
     
     public int cantidadMaterias(){
         System.out.println("El Alumno, legajo: " + legajo +" esta inscripto en " + materiasIncripto.size()+ " materias");
      JOptionPane.showMessageDialog(null,"El Alumno, legajo: " + legajo +" esta inscripto en " + materiasIncripto.size()+ " materias");
      return  materiasIncripto.size();
    }
     
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + " apellido: " + apellido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
}
