package modelo;

public class docente {
    private String nombre;
    private String especialidad;
    private String dni;

    public docente(String nombre, String especialidad, String dni) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.dni = dni;
    }

    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especialidad: "+especialidad);
        System.out.println("DNI: "+dni);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public String getEspecialidad(){
        return especialidad;
    }

    public void setDni(String dni){
        this.dni = dni;
    }
    public String getDni(){
        return dni;
    }
}
