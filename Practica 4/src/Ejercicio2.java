import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num;
        int contp=0;
        int contimp=0;
        int contpos=0;
        int contneg=0;
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=10;i++){
            System.out.print("Introduce el número "+i+": ");
            num = sc.nextInt();
            if (num%2==0){
                contp++;
            }
            if (num%2!=0){
                contimp++;
            }
            if (num>0){
                contpos++;
            }
            if (num<0){
                contneg++;
            }
        }
        System.out.print("Has introducido: "+contp+ " números pares, "+contimp+" números impares, "+contpos+" números positivos y "+contneg+" números impares.");
        sc.close();
    }
}
