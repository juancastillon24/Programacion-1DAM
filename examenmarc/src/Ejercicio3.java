import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int n;
        int suma=0;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Introduce un número positivo: ");
            n= sc.nextInt();
        }while (n<=0);

        System.out.println("Los primeros "+n+" números triangulares son: ");
        for (int i = 1; i <=n ; i++) {
            suma+=i;
            System.out.println(suma);
        }
    }
}
