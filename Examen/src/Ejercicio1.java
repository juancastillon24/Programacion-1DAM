import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Declarar variables
        int n;
        int sum=0;

        //Introducir el valor de N.
        Scanner sc=new Scanner(System.in);
        System.out.print("Escribe un número");
        n= sc.nextInt();
        sc.close();

        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println("La suma de los números del 1 al "+n+" es: "+sum);
    }
}
