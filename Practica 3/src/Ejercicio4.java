public class Ejercicio4 {
    public static void main(String[] args) {
        int suma1 = 0;
        for (int num = 50;num >= 20;num--){
            if (num%2==0){
                suma1 = num + suma1;
                System.out.println(suma1);
            }
        }
    }
}
