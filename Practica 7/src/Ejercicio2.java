import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Escribe un año: ");
        int anho = sc.nextInt();
        sc.close();
        if ((anho%4==0) && (anho%100==0) || anho%100==0 && anho%400==0) {
            System.out.println("El año es bisiesto");
        }
        else{
            System.out.println("El año no es bisiesto");
        }
    }
}
