import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int tiempo;
        int seg;
        int min;
        int hor;
        int dia;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Escribe el número de segundos: ");
            tiempo= sc.nextInt();
        }while (tiempo<=0);
        sc.close();
        min=tiempo/60;
        seg=tiempo%60;
        hor=min/60;
        min=min%60;
        dia=hor/24;
        hor=dia%24;
        System.out.println("Equivale a "+dia+"dias, "+hor+" horas, "+min+" minutos y "+seg+" segundos.");
    }
}
