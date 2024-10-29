import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor del lado? ");
        int lado = sc.nextInt();
        sc.close();
        for (int fila=1; fila <= lado ; fila++){
            for (int i=1; i<=fila ; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}