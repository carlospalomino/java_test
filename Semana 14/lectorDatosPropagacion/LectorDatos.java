package semana_14.lectorDatosPropagacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LectorDatos {
    private Scanner scanner;

    public LectorDatos() {
        scanner = new Scanner(System.in);
    }

    public int leerEntero(String mensaje) throws InputMismatchException {
        System.out.print(mensaje);

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpiar el búfer del teclado
            throw new InputMismatchException("Error: Debe ingresar un número entero.");
        }
    }

    public double leerDouble(String mensaje) throws InputMismatchException {
        System.out.print(mensaje);

        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpiar el búfer del teclado
            throw new InputMismatchException("Error: Debe ingresar un número decimal.");
        }
    }

    public char leerChar(String mensaje) throws StringIndexOutOfBoundsException {
        System.out.print(mensaje);

        try {
            return scanner.next().charAt(0);
        } catch (StringIndexOutOfBoundsException e) {
            scanner.nextLine(); // Limpiar el búfer del teclado
            throw new StringIndexOutOfBoundsException("Error: Debe ingresar un carácter.");
        }
    }

    public String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }

    public void cerrar() {
        scanner.close();
    }
}
