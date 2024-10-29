import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int intento=0;
        int intentos;
        int valor;
        boolean acierto=false;
        Random r=new Random();
        System.out.print("Introduce el rango 1-X: ");
        valor= sc.nextInt();
        int aleatorio=r.nextInt(valor)+1;

        System.out.print("¿Cuántos intentos máximos tendrá?: ");
        intentos= sc.nextInt();

       /* do {
            for (int i=1;i<=intentos;i++){
                System.out.print("Introduce el número que creas que puede ser: ");
                num= sc.nextInt();
                if (num!=aleatorio && num<aleatorio){

                    System.out.println("Vas por el intento "+i+". Vuelve a probar un número mayor.");
                }
                else if(num!=aleatorio && num>aleatorio){

                    System.out.println("Vas por el intento "+i+". Vuelve a probar un número menor.");
                }
                else System.out.println("Enhorabuena has acertado el número era: "+aleatorio+".");

            }
        }while (!acierto);*/

        while (!acierto){
            System.out.print("Introduce el número que creas que puede ser: ");
            num= sc.nextInt();
            if (num!=aleatorio && num<aleatorio){
                intento++;
                if (intento==intentos){
                    System.out.println("Has perdido, el número era: "+aleatorio);
                    acierto=true;
                }
                else System.out.println("Vuelve a probar un número mayor. Vas por el intento: "+intento);
            }
            else if(num!=aleatorio && num>aleatorio){
                intento++;
                if (intento==intentos){
                    System.out.println("Has perdido, el número era: "+aleatorio);
                    acierto=true;
                }
                else System.out.println("Vuelve a probar un número menor. Vas por el intento: "+intento);
            }
            else if (num==aleatorio){
                System.out.println("Enhorabuena has acertado el número era: "+aleatorio+".");
                acierto=true;
            }
        }
    }
}
