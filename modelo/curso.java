package modelo;

public class curso {
    private String nombreCurso;
    private String carrera;
    private int creditos;

    public curso(String nombreCurso, String carrera, int creditos) {
        this.nombreCurso = nombreCurso;
        this.carrera = carrera;
        this.creditos = creditos;
    }

    public void imprimir(){
        System.out.println("Nombre del curso: "+nombreCurso);
        System.out.println("Carrera: "+carrera);
        System.out.println("Creditos: "+creditos);
    }

    public void setNombreCurso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }
    public String getNombreCurso(){
        return nombreCurso;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public String getCarrera(){
        return carrera;
    }

    public void setCreditos(int creditos){
        this.creditos = creditos;
    }
    public int getCreditos(){
        return creditos;
    }
}
