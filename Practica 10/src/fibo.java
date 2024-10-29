import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        int n;
        int sumatotal=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("N:");
        n= sc.nextInt();
        for (int i =0;i<=n;i++){
            sumatotal=sumatotal+i;
            System.out.println(sumatotal);
        }
    }
}
