import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int articulos;
        double precio_art;
        double precio_total=0;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.print("Cuantos articulos comprará: ");
            articulos= sc.nextInt();
        }while (articulos<=0);

        for (int i =1;i<=articulos;i++){
            System.out.print("Introduce el precio del articulo número "+i+": ");
            precio_art=sc.nextDouble();
            if (precio_art>=200){
                precio_art=precio_art*0.85;
            }
            else if (precio_art>100 && precio_art<200) {
                precio_art=precio_art*0.88;
            }
            else precio_art=precio_art*0.9;
            System.out.println("El precio con el descuento es de: "+precio_art+"€");
            precio_total=precio_total+precio_art;

        }
        System.out.print("El pago final a realizar será de: "+precio_total+"€");



        sc.close();
    }
}
