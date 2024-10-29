import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int nalumnos;
        float media;
        float nota;
        float sumnot = 0;
        int contador = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de alumnos: ");
        nalumnos = sc.nextInt();
        for (nalumnos = nalumnos; nalumnos>0 ; nalumnos--){
            System.out.print("Introduce la nota del alumno "+contador+": ");
            nota = sc.nextInt();
            sumnot = nota + sumnot;
            contador++;
        }
        media=sumnot/contador;
        System.out.println("La media de los alumnos es de: "+media);
        sc.close();
    }
}
