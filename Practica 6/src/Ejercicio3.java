import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int lado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el largo del lado: ");
        lado = sc.nextInt();
        for (int i=0; i<lado;i++){
            System.out.println("*");
        }
    }
}
