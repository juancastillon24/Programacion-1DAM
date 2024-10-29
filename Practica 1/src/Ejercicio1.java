import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println("Introduce el primer número");
        n1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        n2 = sc.nextInt();
        System.out.println("Introduce el tercer número");
        n3 = sc.nextInt();

        if ( n1 > n2 && n1 > n3) {
            System.out.println("El primer número es el mayor");
            }
            else if (n2 > n1 && n2>n3) {
                System.out.println("El segundo número es el mayor");
            }
            else if (n3>n1 && n3>n2) {
                System.out.println("El tercer número es el mayor");
            }
        }
    }
