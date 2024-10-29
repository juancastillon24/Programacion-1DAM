import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int x;
        int num;
        long mayor=-99999999;
        long menor=99999999;
        float media;
        int sum = 0;
        int contador=1;
        int contadorpar=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuantos numeros deseas introducir: ");
        x= sc.nextInt();

        for (int i=0; i<x; i++){
            System.out.print("Introduce el número "+contador+ ": ");
            num = sc.nextInt();
            contador++;
            if (num%2==0){
                sum=sum+num;
                contadorpar++;
            }
            if (num>mayor){
                mayor=num;
            }
            if (num<menor){
                menor=num;
            }
        }
        media=sum/contadorpar;
        System.out.println("La media de la suma de los numeros pares es: "+media);
        System.out.println("El mayor de todos los números es: "+mayor);
        System.out.println("El menor de todos los números es: "+menor);
        sc.close();


    }
}
