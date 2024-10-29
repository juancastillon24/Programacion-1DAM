import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int din;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuánto dinero tienes disponibles?");
        din = sc.nextInt();

        if (din<=10){
            System.out.println("El regalo podrá ser un tarjeta de regalo,");
        }
        if (din>10 && din<=20){
            System.out.println("El regalo podrá ser un tarjeta de regalo o bombones");
        }
        if (din>20 && din<=50){
            System.out.println("El regalo podrá ser un tarjeta de regalo y bombones o solamente flores ");
        }
        if (din>50){
            System.out.println("El regalo podrá ser un tarjeta de regalo, bombones y flores o solamente un anillo");
        }
    }
}
