import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double jornal;
        double horas;
        int h_diar=10;
        double h_noct=13.5;
        double fest_d=1.1;
        double fest_n=1.15;
        String horario;
        String fest;
        System.out.print("Cuantas horas trabajará?: ");
        horas= sc.nextDouble();
        System.out.print("En que horario trabajará?(dia/noche): ");
        horario= sc.next();
        System.out.print("Trabajará en festivo?(si/no): ");
        fest= sc.next();
        if (horario.equals("dia") && fest.equals("no")){
            jornal=horas*h_diar;
            System.out.println("El jornal que cobrará por haber trabajado "+horas+" horas, en el turno de "+horario+" será de: "+jornal+"€");
        }
        if (horario.equals("dia") && fest.equals("si")){
            jornal=horas*h_diar*fest_d;
            System.out.println("El jornal que cobrará por haber trabajado "+horas+" horas, en el turno de "+horario+" será de: "+jornal+"€");
        }
        if (horario.equals("noche") && fest.equals("no")){
            jornal=horas*h_noct;
            System.out.println("El jornal que cobrará por haber trabajado "+horas+" horas en el turno de "+horario+" será de: "+jornal+"€");
        }
        if (horario.equals("noche") && fest.equals("si")){
            jornal=horas*h_noct*fest_n;
            System.out.println("El jornal que cobrará por haber trabajado "+horas+" horas, en el turno de "+horario+" será de: "+jornal+"€");
        }
        sc.close();
    }
}
