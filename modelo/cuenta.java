package modelo;

public class cuenta {
    private String nroCuenta;
    private alumno alumno;
    private double saldo;
    private String tipoCuenta;
    private String moneda;
    private double interes;

    public cuenta(String nroCuenta, alumno alumno, double saldo, String tipoCuenta, String moneda) {
        this.nroCuenta = nroCuenta;
        this.alumno = alumno;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.moneda = moneda;
    }

    public void imprimir(){
        System.out.println("Nro de cuenta: "+nroCuenta);
        System.out.println("Nombre del alumno: "+alumno.getNombre());
        System.out.println("Saldo: "+saldo);
        System.out.println("Tipo de cuenta: "+tipoCuenta);
        System.out.println("Moneda: "+moneda);
    }

    public void agregarSaldo(double monto){
        saldo += monto;
    }

    public void   retiro(double monto){
        saldo -= monto;
    }

    public void agregarInteres(){
        saldo += saldo*interes;
    }

    public void setTipoCuenta(String tipoCuenta){
        this.tipoCuenta = tipoCuenta;
        if(this.tipoCuenta.equals("ahorros")){
            interes = 0.05;

        }else if(this.tipoCuenta.equals("corriente")){
            interes = 0.02;
        }
             
    }





}
