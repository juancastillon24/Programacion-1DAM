import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int num;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Introduce un número positivo: ");
            num= sc.nextInt();
        }while (num<=0);

        for (int i=num;i>0;i--){
            fact*=i;
        }
        System.out.println("El factorial de "+num+" es: "+fact);
    }
}
