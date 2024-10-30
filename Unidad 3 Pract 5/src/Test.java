import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double ancho;
        double alto;
        boolean anch_valido=false;
        boolean alt_valido=false;

        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Introduce un valor válido para el ancho: ");
            ancho= sc.nextDouble();
            if (ancho>0){
                anch_valido=true;
            }

        }while(!anch_valido);

        do{
            System.out.print("Introduce un valor válido para el alto: ");
            alto= sc.nextDouble();
            if (alto>0){
                alt_valido=true;
            }
        }while(!alt_valido);

        Rectangulo r1=new Rectangulo(ancho,alto);

        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());

    }

}
