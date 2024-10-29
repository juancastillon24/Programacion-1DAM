import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;
        System.out.print("Introduce el lado del cuadrado: ");
        lado = sc.nextInt();
        for (int i = 1; i <= lado; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int fila=2; fila<lado; fila++);{
            System.out.print("*");
            for (int i=2;i<lado;i++){
                System.out.print("");
            }
            System.out.print("*");
        }
        //for (int )
    }
}