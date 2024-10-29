import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args) {
        float peso;
        int edad;
        String nombre;
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        nombre = sc.next();
        System.out.print("Hola "+nombre+" introduce tu peso: ");
        peso = sc.nextFloat();
        System.out.print("Ahora introduce tu edad: ");
        edad =sc.nextInt();
        System.out.println(nombre+" pesas "+peso+" kg y tienes "+edad+ " años");

    }
}
