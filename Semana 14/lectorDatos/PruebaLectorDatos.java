package Semana_14.lectorDatos;

public class PruebaLectorDatos {
    public static void main(String[] args) {
        LectorDatos lector = new LectorDatos();

        int entero = lector.leerEntero("Ingrese un número entero: ");
        System.out.println("Número entero ingresado: " + entero);

        double decimal = lector.leerDouble("Ingrese un número decimal: ");
        System.out.println("Número decimal ingresado: " + decimal);

        char caracter = lector.leerChar("Ingrese un carácter: ");
        System.out.println("Carácter ingresado: " + caracter);

        String cadena = lector.leerCadena("Ingrese una cadena: ");
        System.out.println("Cadena ingresada: " + cadena);

        lector.cerrar();
    }
}
