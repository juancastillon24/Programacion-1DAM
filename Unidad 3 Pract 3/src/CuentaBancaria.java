import java.util.Scanner;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo>=0)
        this.saldo = saldo;
        else {
            System.out.println("No se admite un saldo negativo.");
        }
    }

    public void depositar(double cantidad){
        this.saldo+= cantidad;
    }
    public void retirar(double cantidad){
        if (this.saldo>=cantidad){
            this.saldo-= cantidad;
        }else {
            System.out.println("No es posible retirar esa cantidad");
        }
    }
    public void mostrarSaldo(){
        System.out.println("EL saldo actual es: "+saldo);
    }


}
