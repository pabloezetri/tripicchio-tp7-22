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
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //a) Crear las materias:
            Materia mat1 = new Materia  (1,"Ingles I de primer año.", 1);
            Materia mat2 = new Materia (2,"Matemáticas de primer año.", 1);
            Materia mat3 = new Materia  (2,"Laboratorio 1 de primer año", 1);
        //b) Crear 2 alumnos.
            Alumno al1 = new Alumno(1001,"Martin","López");
            Alumno al2 = new Alumno(1002,"Brenda","Martinez");
        //c) Inscribir a López en las 3 materias.
            al1.AgregarMateria(mat1);
            al1.AgregarMateria(mat2);
            al1.AgregarMateria(mat3);
        //d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
            al2.AgregarMateria(mat1);
            al2.AgregarMateria(mat2);
            al2.AgregarMateria(mat3);        
            al2.AgregarMateria(mat3);
        //Visualizar la cantidad de materias a las que está inscripto cada alumno.
            al1.cantidadMaterias();
            al2.cantidadMaterias();
    }
}
