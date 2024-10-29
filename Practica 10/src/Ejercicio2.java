import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        double precio_k;
        int tamanho;
        double kg;
        String tipo;
        double ganancia;

        Scanner sc=new Scanner(System.in);

        do{System.out.print("Introduce los kilos de uvas deseada: ");
            kg= sc.nextDouble();
        }while (kg<=0);

        do {System.out.print("Que tipo de uva desea? ");
            tipo= sc.next();
        }while(!(tipo.equalsIgnoreCase("a"))&&!(tipo.equalsIgnoreCase("b")));

        do {System.out.print("Que tamaño de uva desea? ");
            tamanho=sc.nextInt();
        }while(tamanho!=1 && tamanho!=2);

        do {System.out.print("Introduce el precio del kilo: ");
            precio_k= sc.nextDouble();
        }while(precio_k<=0);

        sc.close();

        if (tipo.equalsIgnoreCase("a")){
            if (tamanho==1){
                ganancia=(precio_k+0.20)*kg;
            }
            else ganancia=(precio_k+0.30)*kg;
        }else {
            if (tamanho==1){
                ganancia=(precio_k-0.30)*kg;
            }
            else ganancia=(precio_k-0.50)*kg;
        }
        System.out.print("La ganancia final será de: "+ganancia+"€, al ser de tipo: "+tipo+" y de tamaño: "+tamanho+".");

    }
}
