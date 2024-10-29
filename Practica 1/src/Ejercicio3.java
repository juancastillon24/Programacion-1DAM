import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("introduce un número positivo");
        numero = sc.nextInt();
        while (numero < 0) {
            System.out.println("Vuelve a meter un número");
            numero = sc.nextInt();
        }
        if (numero > 0) {
            System.out.println("Bien hecho");
            }
    }
    }
