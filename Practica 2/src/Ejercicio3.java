import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args) {
        double area;
        float radio;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de el radio: ");
        radio = sc.nextFloat();
        area= Math.PI * radio*radio;
        System.out.println("El area del circulo es: "+area);
    }
}
