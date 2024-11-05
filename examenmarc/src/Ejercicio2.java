import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num;
        int select;
        int resultado;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1. Calcular el cuadrado de un número \n2. Calcular el cubo de un número. \n3. Salir");
            select= sc.nextInt();
            if (select==1){
                System.out.print("Introduce el número que deseas elevar al cuadrado: ");
                num=sc.nextInt();
                resultado=(int)Math.pow(num,2);
                System.out.println(resultado);
            } else if (select==2) {
                System.out.print("Introduce el número que deseas elevar al cubo: ");
                num=sc.nextInt();
                resultado=(int)Math.pow(num,3);
                System.out.println(resultado);
            }
        }while(select!=3);
    }
}
