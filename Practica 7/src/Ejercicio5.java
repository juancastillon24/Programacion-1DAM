import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num_dec;
        int num_bin;
        int cociente;
        String guardar_r_bin ="";
        String binario;
        String guardar_r_oct="";
        String guardar_r_hex="";



        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num_dec = sc.nextInt();
        /*do{
             num_bin=num_bin/2;
                  if (num_bin>=2) {
                  int rest_div = num_bin % 2;
                  System.out.println("Resto" +rest_div);
              }
             System.out.println("Cociente " + num_bin);
         }while (num_dec>=2);*/

        for (num_bin = num_dec; num_bin >= 2; num_bin = num_bin / 2) {
            int resto = num_bin % 2;
            /*System.out.print(" " + resto);*/
            guardar_r_bin = resto+guardar_r_bin;    //00
        }
        System.out.println("");
        System.out.println(""+num_bin+guardar_r_bin);

        int num_oct;

        for ( num_oct = num_dec; num_oct > 8; num_oct = num_oct / 8) {
            int resto = num_oct % 8;
            /*System.out.print(" " + resto);*/
            guardar_r_oct = resto + guardar_r_oct;
        }
        System.out.println("");
        System.out.println(""+num_oct+guardar_r_oct);

        int num_hex;

        for ( num_hex = num_dec; num_hex > 16; num_hex = num_hex / 16) {
            int resto = num_hex % 16;
            if (resto==10){
                guardar_r_hex += "A";

            }if (resto==11){
                guardar_r_hex += "B";

            }if (resto==12){
                guardar_r_hex += "C";

            }if (resto==13){
                guardar_r_hex += "D";

            }if (resto==14){
                guardar_r_hex += "E";

            }
            if (resto==15){
                guardar_r_hex += "F";

            }
            /*System.out.print(" " + resto);*/
            guardar_r_hex = resto +guardar_r_hex;
        }
        System.out.println("");
        System.out.println(""+num_hex+guardar_r_hex);

    }
}