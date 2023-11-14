package semana_14.lectorDatosPropagacion;

import java.util.InputMismatchException;

public class PruebaLectorDatos {
    public static void main(String[] args) {
        LectorDatos lector = new LectorDatos();

        try {
            int entero = lector.leerEntero("Ingrese un número entero: ");
            System.out.println("Número entero ingresado: " + entero);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        lector.cerrar();
    }
}
