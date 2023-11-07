
package vista;

import java.util.Scanner;

import modelo.curso;
import modelo.alumno;
import modelo.docente;

public class ejecucion{
   
    public static void main(String[] args) {
        String menu="1. Alumno\n2. Curso\n3. Docente\n4. Matricula\n5. Reporte\n6. Salir";
        int opcion=0;
        Scanner lector=new Scanner(System.in);

        while(opcion!=6){
            opcion=lector.nextInt();
            lector.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("ingrese nomnbre del alumno");
                    String nombre=lector.nextLine();
                    System.out.println("ingrese codigo del alumno");
                    String codigo=lector.nextLine();
                    System.out.println("ingrese edad del alumno");
                    lector.nextLine();
                    int edad=lector.nextInt();

                    alumno alumno1=new alumno(nombre, codigo, edad);
                    
                case 2:

                case 3:

                case 4:

                case 5:

                case 6:
                     
                 
        }

        lector.close();
    }
}

        } 