import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double saldo;
        double pago_min;
        double pago_des;
        double saldo_ant;
        double pago_mes;
        double pago_rest;
        double pago_noint;
        double compras_tot;
        double compras;
        double compras_mesant;


        Scanner sc=new Scanner(System.in);

        do {
            System.out.print("Saldo anterior del cliente: ");
            saldo_ant= sc.nextDouble();
        }while (saldo_ant<=0);
        do {
            System.out.print("Pago del mes anterior: ");
            pago_mes= sc.nextDouble();
        }while (pago_mes<=0);
        do {
            System.out.print("Cantidad pendiente de las compras: ");
            compras_mesant= sc.nextDouble();
        }while (compras_mesant<0);
        do {
            System.out.print("Compras realizadas: ");
            compras= sc.nextDouble();
        }while (compras<0);

        compras_tot=compras+compras_mesant;

        pago_min=0.15*(compras+compras_mesant);
        System.out.println("El pago minimo que debe realizar es: "+pago_min+"€");

        pago_noint=0.85*compras_tot;
        System.out.println("El pago que debe realizar para no generar interes es: "+pago_noint+"€");

        do {
            System.out.print("Pago que desea realizar este mes: ");
            pago_des= sc.nextDouble();
        }while (pago_des<0);
        if (pago_des+pago_mes<0.85*compras_tot && pago_des<pago_min){
            pago_des=pago_des*1.12+200;
            saldo=saldo_ant-pago_des;
            pago_rest=compras_tot-pago_des;

        } else if (pago_des+pago_mes<0.85*compras_tot && pago_des>pago_min) {
            pago_des = pago_des * 1.12;
            saldo = saldo_ant - pago_des;
            pago_rest=compras_tot-pago_des;

        }else {
            saldo=saldo_ant-pago_des-pago_mes;
            pago_rest=compras_tot-pago_des;
        }

        System.out.println("Una vez realizado el pago, su saldo es: "+saldo+"€");
        System.out.println("La cantidad pendiente de pago de sus compras es: "+pago_rest+"€");


    }

}
