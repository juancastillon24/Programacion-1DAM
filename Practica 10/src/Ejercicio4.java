import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int arma_j;
        int arma_o;
        int valor;
        int punt_j=0;
        int punt_o=0;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.print("Introduce el rango 1-X: ");
        valor= sc.nextInt();
        for (int i=0;punt_o<3 && punt_j<3;i++){
            do {
                System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
                System.out.println("Elige tu arma: ");
                System.out.println("0.-Piedra");
                System.out.println("1.-Papel");
                System.out.println("2.-Tijeras");
                System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
                arma_j= sc.nextInt();
                arma_o=r.nextInt(valor);
            }while (arma_j!=0 && arma_j!=1 && arma_j!=2);
            if (arma_j==0 && arma_o==1){
                System.out.println("Arma jugador: Piedra - Arma ordenador: Papel");
                System.out.println("El ganador es el ordenador. Papel envuelve a piedra");
                punt_o++;
            }if (arma_j==1 && arma_o==2){
                System.out.println("Arma jugador: Papel - Arma ordenador: Tijeras");
                System.out.println("El ganador es el ordenador. Tijeras corta a papel");
                punt_o++;
            }if (arma_j==2 && arma_o==0){
                System.out.println("Arma jugador: Tijeras - Arma ordenador: Piedra");
                System.out.println("El ganador es el ordenador. Piedra aplasta a tijeras");
                punt_o++;
            }if (arma_o==0 && arma_j==1){
                System.out.println("Arma ordenador: Piedra - Arma jugador: Papel");
                System.out.println("El ganador es el jugador. Papel envuelve a piedra");
                punt_j++;
            }if (arma_o==1 && arma_j==2){
                System.out.println("Arma ordenador: Papel - Arma jugador: Tijeras");
                System.out.println("El ganador es el jugador. Tijeras corta a papel");
                punt_j++;
            }if (arma_o==2 && arma_j==0){
                System.out.println("Arma ordenador: Tijeras - Arma jugador: Piedra");
                System.out.println("El ganador es el jugador. Piedra aplasta a tijeras");
                punt_j++;
            }if (arma_o==arma_j){
                System.out.println("Ha habido un empate saca de nuevo");
                System.out.println("El jugador ha sacado "+arma_j+" y el ordenador ha sacado "+arma_o);
            }
            System.out.println("El marcador va: "+punt_j+" jugador, "+punt_o+" ordenador");
        }
        sc.close();
    }
}