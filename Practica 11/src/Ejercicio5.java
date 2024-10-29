import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num;
        int div=10;
        int dig=1;
        int calc_dig;
        boolean narc=false;
        boolean digitos=false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el número: ");
        num= sc.nextInt();
            do {
                calc_dig = num / div;
                dig++;
                if (calc_dig/div<1)digitos=true;
            }while (!digitos);
        System.out.println("El numero tiene "+dig+" digitos");
    }
}