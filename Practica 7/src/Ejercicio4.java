import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int dinero;
        int veces;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de dinero: ");
        dinero = sc.nextInt();

        if (dinero>=500) {
            veces=dinero/500;
            System.out.println("Billetes de 500€: "+veces);
            dinero=dinero - veces*500;
        }
        if (dinero<500 && dinero>=200) {
            veces=dinero/200;
            System.out.println("Billetes de 200€: "+veces);
            dinero=dinero - veces*200;

        }
        if (dinero>=100 && dinero<200) {
            System.out.println("Billetes de 100€: 1");
            dinero=dinero - 100;

        }
        if (dinero<100 && dinero>=50) {
            System.out.println("Billetes de 50€: 1");
            dinero=dinero - 50;

        }
        if (dinero<50 && dinero>=20) {
            veces=dinero/20;
            System.out.println("Billetes de 20€: "+veces);
            dinero=dinero - veces*20;

        }
        if (dinero<20 && dinero>=10) {
            System.out.println("Billetes de 10€: 1");
            dinero=dinero - 10;
        }
        if (dinero<10 && dinero>=5) {
            System.out.println("Billetes de 5€: 1");
            dinero=dinero - 5;

        }
        if (dinero<5 && dinero>=2) {
            veces=dinero/2;
            System.out.println("Monedas de 2€: "+veces);
            dinero=dinero - veces*2;

        }
        if (dinero<2 && dinero>=1) {
            System.out.println("Monedas de 1€: 1");
        }

    }
}
