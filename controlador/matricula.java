package controlador;

import modelo.curso;
import modelo.alumno;
import modelo.docente;

public class matricula {
    private alumno alumno;
    private curso curso;
    private docente docente;
    private String horario;

    public matricula(alumno alumno, curso curso, docente docente,String horario){
        this.alumno = alumno;
        this.curso = curso;
        this.docente = docente;
        this.horario = horario;
    }

    public void imprimir(){
        System.out.println("Nombre del alumno: "+alumno.getNombre());
        System.out.println("Nombre del curso: "+curso.getNombreCurso());
        System.out.println("Nombre del docente: "+docente.getNombre());
        System.out.println("Horario: "+horario);
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

    public void setDocente(docente docente){
        this.docente = docente;
    }
    public docente getDocente(){
        return docente;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }
    public String getHorario(){
        return horario;
    }
}
