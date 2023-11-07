package controlador;

import modelo.curso;
import modelo.alumno;

public class calificaciones {
    private alumno alumno;
    private curso curso;
    private double calificacion;

    public calificaciones(alumno alumno, curso curso, 
    double calificacion) {
        this.alumno = alumno;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void imprimir(){
        System.out.println("Nombre del alumno: "+alumno.getNombre());
        System.out.println("Nombre del curso: "+curso.getNombreCurso());
        System.out.println("Calificacion: "+calificacion);
    }

    public void setAlumno(alumno alumno){
        this.alumno = alumno;
    }
    public alumno getAlumno(){
        return alumno;
    }

    public void setCurso(curso curso){
        this.curso = curso;
    }
    public curso getCurso(){
        return curso;
    }

    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
    public double getCalificacion(){
        return calificacion;
    }
}
