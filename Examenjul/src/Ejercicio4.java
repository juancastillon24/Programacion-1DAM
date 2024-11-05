import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num;
        int dig=1;

        Scanner sc=new Scanner(System.in);
        num= sc.nextInt();

        while (num/10!=0){
            num=num/10;
            dig++;
        }
        System.out.println(dig);
        

    }
}
