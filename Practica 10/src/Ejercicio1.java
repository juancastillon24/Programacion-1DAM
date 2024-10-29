import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double A;
        double B;
        double C;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Introduce las dimensiones del triangulo: ");
            System.out.print("Lado A: ");A= sc.nextDouble();
            System.out.print("Lado B: ");B= sc.nextDouble();
            System.out.print("Lado C: ");C= sc.nextDouble();
        } while (A<=0 || B<=0 || C<=0);

        if (Math.pow(A,2)+Math.pow(B,2)==Math.pow(C,2)||Math.pow(A,2)+Math.pow(C,2)==Math.pow(B,2)||Math.pow(C,2)+Math.pow(B,2)==Math.pow(A,2)){
            System.out.println("Es un triángulo rectángulo.");
        }
        else if (A==B && A==C){
            System.out.println("El triángulo es equilatero.");
        }
        else if (A==B || A==C || B==C) {
            System.out.println("El triángulo es isósceles.");
        }
        else System.out.println("El triángulo es escaleno.");
        sc.close();
    }
}
