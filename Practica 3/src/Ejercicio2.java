import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        float neto;
        float finl;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el valor neto: ");
        neto = sc.nextFloat();
        finl= neto+(neto*0.21f);
        System.out.println("La factura final es de "+finl+"€");
        sc.close();
    }
}
