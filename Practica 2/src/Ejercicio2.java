import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args) {
        float base;
        float altura;
        float area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de la base: ");
        base = sc.nextFloat();
        System.out.print("Introduce el valor de la altura: ");
        altura = sc.nextFloat();
        area = (base*altura)/2;
        System.out.print("El area es: "+area);
    }
}
