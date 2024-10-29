import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num;
        int contador = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        for (int i=1;i<num;i++){
            if (num%i==0){
                contador++;
            }
        }
        if (contador>1){
            System.out.println("El número no es primo");
        }
        if (contador<=1){
            System.out.println("El número es primo");
        }
    }
}
