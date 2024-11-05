import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int a;
        int b;
        int MCD_a;

        Scanner sc=new Scanner(System.in);

        System.out.print("Introduce a: ");
        a= sc.nextInt();
        System.out.print("Introduce b: ");
        b= sc.nextInt();

        for (int i = 1; i <=b; i++) {
            if (a%i==0){
                MCD_a=i;
                System.out.println("El MCD_A es: "+MCD_a);

            }
        }




    }
}
