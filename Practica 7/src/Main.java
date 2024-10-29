import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la base: ");
        n = sc.nextInt();
        int h=n;
        for (int i=0;i<n;i++){
            for (int z=h-1;z>0;z--){
                System.out.print("a");
                h--;
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
}