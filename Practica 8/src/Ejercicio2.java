import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num_hamb;
        String tamano;
        double pago;
        String metodo_pago;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce la cantidad de hamburguesas deseadas: ");
        num_hamb= sc.nextInt();
        System.out.print("Introduce el tamaño deseado: ");
        tamano = sc.next();
        System.out.println("Introduce metodo de pago (efectivo o tarjeta)");
        metodo_pago = sc.next();
        if (tamano.equals("sencilla") && metodo_pago.equals("efectivo")){
            pago=num_hamb*5;
            System.out.println("El precio de "+num_hamb+" hamburguesas es de: "+pago+"€");
        }
        if (tamano.equals("sencilla") && metodo_pago.equals("tarjeta")){
            pago=num_hamb*5;
            pago=pago*1.05;
            System.out.println("El precio de "+num_hamb+" hamburguesas es de: "+pago+"€");
        }
        if (tamano.equals("doble")&&metodo_pago.equals("efectivo")){
            pago=num_hamb*8;
            System.out.println("El precio de "+num_hamb+" hamburguesas es de: "+pago+"€");
        }
        if (tamano.equals("doble")&&metodo_pago.equals("tarjeta")){
            pago=num_hamb*8;
            pago=pago*1.05;
            System.out.println("El precio de "+num_hamb+" hamburguesas es de: "+pago+"€");
        }
        if (tamano.equals("triple")&&metodo_pago.equals("efectivo")){
            pago=num_hamb*12;
            System.out.println("El precio de "+num_hamb+" hamburguesas es de: "+pago+"€");
        }
        if (tamano.equals("triple")&&metodo_pago.equals("tarjeta")){
            pago=num_hamb*12;
            pago=pago*1.05;
            System.out.println("El precio de "+num_hamb+" hamburguesas es de: "+pago+"€");
        }



    }
}
