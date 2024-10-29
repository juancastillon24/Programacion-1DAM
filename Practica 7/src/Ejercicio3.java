import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num;
        int precio;
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos alumnos van a la excursión?: ");
        num = sc.nextInt();

        if (num >= 100) {
            precio = num * 65;
            System.out.println("Cada alumno debe pagar 65€ por lo que el pago total será de: " + precio+ "€");
        }
        if (num >= 100) {
            precio = num * 65;
            System.out.println("Cada alumno debe pagar 65€ por lo que el pago total será de: " + precio+ "€");
        }
        if (num >= 50 && num<=99) {
            precio = num * 70;
            System.out.println("Cada alumno debe pagar 70€ por lo que el pago total será de: " + precio+ "€");
        }
        if (num >= 30 && num<=49) {
            precio = num * 95;
            System.out.println("Cada alumno debe pagar 95€ por lo que el pago total será de: " + precio+ "€");
        }
        if (num<30) {
            precio = 3000;
            System.out.println("Solo se cobrará el alquiler del autobus: " + precio+ "€");
        }
    }
}
