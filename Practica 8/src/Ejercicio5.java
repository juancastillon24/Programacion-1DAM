import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num_pant;
        double costo;
        double ganancia_p_p;
        double ganancia;
        String modelo;
        double prec_pA;
        double prect_tel_pA;
        double prec_pB;
        double prec_tel_pB;
        double prec_tela;
        int talla;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce cuántos pantalones desea: ");
        num_pant= sc.nextInt();
        System.out.print("Introduce el modelo de pantalón (A/B): ");
        modelo = sc.next();
        System.out.print("Introduce la talla del pantalón (30/32/36): ");
        talla = sc.nextInt();
        System.out.print("Introduce el precio de la tela por metro: ");
        prec_tela = sc.nextDouble();
        prec_pA=prec_tela*1.5*1.8;
        prec_pB=prec_tela*1.8*1.95;
        sc.close();
        if (modelo.equals("A")&& talla==30){
            costo=prec_pA;
            ganancia_p_p=costo*1.30;
            ganancia=num_pant*ganancia_p_p;
            System.out.println("El precio de "+num_pant+" pantalones del modelo "+modelo+" será de: "+ganancia+ "€ ya que, el costo de cada pantalon será de "+ganancia_p_p+"€");
        }
        if (modelo.equals("A")&& (talla==32 || talla==36)){
            costo=prec_pA*1.04;
            ganancia_p_p=costo*1.30;
            ganancia=num_pant*ganancia_p_p;
            System.out.println("El precio de "+num_pant+" pantalones del modelo "+modelo+" será de: "+ganancia+ "€ ya que, el costo de cada pantalon será de "+ganancia_p_p+"€");
        }
        if (modelo.equals("B")&& talla==30){
            costo=prec_pB;
            ganancia_p_p=costo*1.30;
            ganancia=num_pant*ganancia_p_p;
            System.out.println("El precio de "+num_pant+" pantalones del modelo "+modelo+" será de: "+ganancia+ "€ ya que, el costo de cada pantalon será de "+ganancia_p_p+"€");
        }
        if (modelo.equals("B") && ((talla==32) || talla==36)){
            costo=prec_pB*1.04;
            ganancia_p_p=costo*1.30;
            ganancia=num_pant*ganancia_p_p;
            System.out.println("El precio de "+num_pant+" pantalones del modelo "+modelo+" será de: "+ganancia+ "€ ya que, el costo de cada pantalon será de "+ganancia_p_p+"€");
        }




    }
}
