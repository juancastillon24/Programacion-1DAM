import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args) {
        float num1;
        float num2;
        float resultado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer numero:");
        num1 = sc.nextFloat();
        System.out.print("Introduce el segundo numero:");
        num2 = sc.nextFloat();
        if (num1<num2){
            resultado = num2/num1;
            System.out.println("El número mayor es el "+num2+" y el número menor es el "+num1);
            System.out.println("El cociente de la division es: "+resultado);
        }
        if (num2<num1){
            resultado = num1/num2;
            System.out.println("El número mayor es el "+num1+" y el número menor es el "+num2);
            System.out.println("El cociente de la division es: "+resultado);
        }
    }
    }
