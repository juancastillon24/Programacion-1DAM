import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num= sc.nextInt();

        do {
            sum+=num%10;
            num=num/10;
            if (num/10==0){
                sum+=num%10;
            }
        }while(num/10>0);
        System.out.println(sum);
    }
}
