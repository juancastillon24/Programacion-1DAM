import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Declaración de variables
        int num;
        int num_dig;
        int num_or;
        int exp=0;
        int digit;
        int narc=0;
        int i=1;
        Scanner sc=new Scanner(System.in);

        //Solicitar número
        do {
            System.out.print("Introduce un número mayor de 0: ");
            num= sc.nextInt();
        }while (num<=0);
        num_or=num;

        //Calcular dígitos
        do {
            double aux= num/Math.pow(10,exp);
            exp++;
        }while(num/Math.pow(10,exp)>=1);
        System.out.println(exp);
        num_dig=exp;
        exp--;

        //Separar números y cálculo narcisista
        do {
            digit=num/(int)Math.pow(10,exp);
            num=num%(int)Math.pow(10,exp);
            System.out.println("El número en la posición "+i+" es: "+digit);
            exp--;
            i++;
            narc+=(int)Math.pow(digit,num_dig);
        }while (num/Math.pow(10,exp)>=1);

        //Comprobacion narcisista
        if (num_or==narc){
            System.out.println("La suma de los números elevados a "+num_dig+" es de "+narc+" que es igual a el número que se dio al principio por lo que si es un número narcisista.");
        }
        else System.out.println(narc+" no es igual que "+num_or+" por lo que no es un número narcisista");
    }
}