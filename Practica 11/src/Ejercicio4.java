import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num;
        int num_max;
        int sum;
        int intento=1;
        int intentos;
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Introduce el número máximo que puede llegar a salir: ");
            num_max= sc.nextInt();
        }while (num_max<=0);
        int aleatorio=r.nextInt(num_max)+1;
        int aleatorio2=r.nextInt(num_max)+1;
        sum=aleatorio+aleatorio2;
        do {
            System.out.print("Cuántos intentos necesitas para adivinar la suma de los dos dados? ");
            intentos= sc.nextInt();
        }while (intentos<=0);
               do {System.out.print("Intento nº "+intento+": ");
            num= sc.nextInt();
            intento++;
            if (num<sum){
                System.out.println("La suma es mayor.");
            } else if (num>sum) {
                System.out.println("La suma es menor.");
            }else System.out.println("Muy bien has acertado, los números eran: "+aleatorio+" y "+aleatorio2+" y la suma era "+sum);
        }while (intento<=intentos && num!=sum);
        sc.close();
        }
    }