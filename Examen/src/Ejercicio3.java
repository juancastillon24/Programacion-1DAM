import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Declarar variables
        int num;
        int capicua=0;
        int exp=0;
        int i=1;
        int exp_2=0;
        Scanner sc=new Scanner(System.in);
        //Pedir un número entero positivo
        do {
            System.out.print("Introduce un número positivo: ");
            num= sc.nextInt();
        }while (num<=0);
        sc.close();
        int num_or=num;
        //Calcular el número de dígitos
        do {
            double aux= num/Math.pow(10,exp);
            exp++;
        }while(num/Math.pow(10,exp)>=1);
        exp--;
        //Calcular el número a la inversa
        do {
            int num_pos=num/(int)Math.pow(10,exp);
            num=num%(int)Math.pow(10,exp);
            exp--;
            i++;
            capicua+=num_pos*(int)Math.pow(10,exp_2);
            exp_2++;
        }while (num/Math.pow(10,exp)>=1);
        //Comprobar si es capicúa
        if (capicua==num_or){
            System.out.println("El número es capicúa");
        }
        else System.out.println("El número no es capicúa");
    }
}