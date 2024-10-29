import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre;
        float sueldoliq;
        float sueldobas;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del empleado: ");
        nombre =sc.nextLine();
        System.out.print("Introduce el sueldo base: ");
        sueldobas = sc.nextFloat();
        sueldoliq = sueldobas*(0.80f);
        System.out.println("El sueldo líquido es de: "+sueldoliq+"€");
        sc.close();
    }
}
