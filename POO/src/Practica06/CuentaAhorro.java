package Practica06;

public class CuentaAhorro extends CuentaCorriente{
    private double interes;


    public CuentaAhorro(Titular titular, String numeroCuenta, double saldo, double interes) {
        super(titular, numeroCuenta, saldo);
        this.interes = interes;
    }

   public CuentaAhorro(Titular titular, String numeroCuenta, double saldo){
       super(titular, numeroCuenta, saldo);
       setSaldo(15.3);;

   }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, String numeroCuenta) {
        super(titular, numeroCuenta);
        setSaldo(15.3);
        setInteres(2.5);
    }


    public void calcularInteres(){
        System.out.println("los intereses son de: "+ getInteres());
        double nuevoSaldo = getSaldo() + (getSaldo() * getInteres()/100);
        setSaldo(nuevoSaldo);

    }
}

