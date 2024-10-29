import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.print("Introduce tu nota: ");
        nota=sc.nextDouble();
                if (nota>=0 && nota<4) {
                    System.out.println("Has sacado un insuficiente");
                } else if (nota>=4 && nota<6) {
                    System.out.println("Has sacado un regular");
                } else if (nota>=6 && nota<7) {
                    System.out.println("Has sacado un bien");
                } else if (nota>=7 && nota<9) {
                    System.out.println("Has sacado un notable");
                } else if (nota>=9 && nota<=10) {
                    System.out.println("Has sacado un sobresaliente");
                }
        }

    }

