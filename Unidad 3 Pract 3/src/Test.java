import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double saldo=0;
        System.out.print("Número de cuenta? ");
        String cuenta=sc.next();
        do {
            System.out.print("Saldo: ");
            saldo=sc.nextDouble();
        }while (saldo<0);

        CuentaBancaria mov1= new CuentaBancaria(cuenta,saldo);

        mov1.mostrarSaldo();
        mov1.depositar(150);
        mov1.mostrarSaldo();
        mov1.retirar(707);
        mov1.mostrarSaldo();
    }

}
