import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int nac;
        int anoact;
        int edad;
        System.out.print("Introduzca su año de nacimiento: ");
        nac = sc.nextInt();
        anoact= LocalDate.now().getYear();
        edad = anoact-nac;
        System.out.println("Tiene "+edad+" años");
        sc.close();
    }
}
