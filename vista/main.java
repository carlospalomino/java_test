package vista;

import modelo.cuenta;
import modelo.alumno;


public class main {
    public static void main(String[] args) {
        
        cuenta cuenta1
        =new cuenta("123456789", new alumno("nombre","codigo",22), 1000, "ahorro", "soles");
        cuenta1.imprimir();
        cuenta1.agregarSaldo(500);
        cuenta1.imprimir();
        cuenta1.retiro(200);
        cuenta1.imprimir();


    }
}
