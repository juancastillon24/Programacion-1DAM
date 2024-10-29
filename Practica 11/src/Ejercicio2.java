import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int dado=6;
        int v1=0;
        int v2=0;
        int v3=0;
        int v4=0;
        int v5=0;
        int v6=0;
        int tiradas;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        do {System.out.print("Introduce el número de tiradas del dado: ");
            tiradas= sc.nextInt();
        }while (tiradas<=0);
        sc.close();
        for (int i=1;i<=tiradas;i++){
            int aleatorio= r.nextInt(dado)+1;
            if (aleatorio==1)v1++;
            else if (aleatorio==2)v2++;
            else if (aleatorio==3)v3++;
            else if (aleatorio==4)v4++;
            else if (aleatorio==5)v5++;
            else v6++;
        }
        System.out.println("Ha salido el 1 "+v1+" veces.\nHa salido el 2 "+v2+" veces.\nHa salido el 3 "+v3+" veces.\nHa salido el 4 "+v4+" veces.\nHa salido el 5 "+v5+" veces.\nHa salido el 6 "+v6+" veces.\n");
    }
}
