import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args) {
     float importe;
     int mes;
     float importedsc;
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduce el número de mes: ");
     mes = sc.nextInt();
     do {
         System.out.print("Vuelva a introducir un mes valido: ");
         mes = sc.nextInt();
     } while (mes<1 || mes>12);
     System.out.print("Introduzca el importe de su compra ");
     importe = sc.nextFloat();
     if (mes==10){
         importedsc=importe*0.85f;
         System.out.print("El importe de su compra es de: "+importedsc+"€");
     }
     else if (mes!=10){
         System.out.println("El importe de su compra es de: "+importe+"€");
     }
    }
    }
