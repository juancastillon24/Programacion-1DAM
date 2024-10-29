import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        float num1;
        float num2;
        float mult;
        float sum;
        float resta;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        num1 = sc.nextFloat();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextFloat();
        if (num1==num2){
            mult = num1 * num2;
            System.out.print("Los números son iguales por lo que se multiplican y el resultado es: "+mult);
        }
        if (num1>num2){
            resta = num1 - num2;
            System.out.print("El primer número es mayor que el segundo por lo que se restan y el resultado es: "+resta);
        }
        if (num1<num2){
            sum = num1 + num2;
            System.out.print("El primer número es menor que el segundo por lo que se suman y el resultado es: "+sum);
        }
    }
}
