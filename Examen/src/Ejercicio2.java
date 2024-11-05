import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Declarar variables
        int n;
        int num;
        int mayor=0;
        Scanner sc=new Scanner(System.in);

        //Escanear cantidad de números que se desea comprobar
        System.out.print("Introduce cuantos números deseas meter: ");
        n=sc.nextInt();

        //Comprobar que número es el mayor de los introducidos
        for (int i = 1; i <= n ; i++) {
            System.out.print("Ingrese un número: ");
            num= sc.nextInt();
            if (num>mayor){
                mayor=num;
            }
        }
        sc.close();
        System.out.println("El mayor de los números introducidos es: "+mayor);
    }
}
