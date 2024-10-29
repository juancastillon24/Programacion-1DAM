import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num_cita;
        int pago=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Qué número de cita será la que va a solicitar?");
        num_cita = sc.nextInt();
        if (num_cita>=1 && num_cita<=3){
            System.out.println("Siendo su cita "+num_cita+ " el pago a realizar será de: 150€");
        }
        if (num_cita>3 && num_cita<=5){
            System.out.println("Siendo su cita "+num_cita+ " el pago a realizar será de: 100€");
        }
        if (num_cita>5 && num_cita<=8){
            System.out.println("Siendo su cita "+num_cita+ " el pago a realizar será de: 90€");
        }
        if (num_cita>8){
            System.out.println("Siendo su cita "+num_cita+ " el pago a realizar será de: 50€");
        }
        for (int i=1; i<num_cita; i++){
            if (i>=1 && i<=3){
                pago=pago+150;
            }
            if (i>3 && i<=5){
                pago=pago+100;
            }
            if (i>5 && i<=8){
                pago=pago+90;
            }
            if (i>8){
                pago=pago+50;
            }
        }
        System.out.println("El pago total realizado por el tratamiento es de: "+pago+"€");
    }
}
