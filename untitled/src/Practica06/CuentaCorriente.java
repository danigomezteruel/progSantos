package Practica06;

public class CuentaCorriente {
    private Titular titular;
    private String numeroCuenta;
    private double saldo;


    public CuentaCorriente(Titular titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Titular titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 15.3;
    }

    public Titular getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "titular=" + titular +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void ingresarDinero(double dinero) {
        if (dinero < 0) {
        } else {
        saldo += dinero;
        }
    }

    public void retirarDinero (double dinero){
        if (dinero < 0) {
                System.out.println("La cantidad no puede ser negativa");
        } else {
            saldo-=dinero;
        }

    }

    public void printCuenta() {

        String nombre, apellido;
        int edad;
        nombre = titular.getNombre();
        apellido = titular.getApellidos();
        edad = titular.getEdad();
        System.out.println("Usuario: " + nombre + " " + apellido + ", " + edad);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    public void checkCuenta(String numeroCuentaNuevo) {
        //me acabo de dar cuenta de q es solo util si existe un array de cuentas xd
        if (numeroCuenta.compareTo(numeroCuentaNuevo) == 0) {
            System.out.println("este numero ya existe");

        } else {
            System.out.println("numero de cuenta valido");
        }

    }


}

