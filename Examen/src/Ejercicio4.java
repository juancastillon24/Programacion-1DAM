
public class Ejercicio4 {
    public static void main(String[] args) {
        //Declarar variables
        int prim;
        int prim_ant=1;

        System.out.println("Resultado:");
        //Llegar hasta el número 100
        for (int i = 2; i < 100; i++) {
            //Calcular los divisores que tiene, ya que, si son mas de 2 no es primo
            int div=0;
            for (int j = 1; j <= i/2; j++) {
                if (i%j==0) {
                    div++;
                }
            }
            if (div<2){
                prim=i;
                //Comprobar si son primos gemelos
                if (prim-prim_ant==2){
                    System.out.println("("+prim_ant+","+prim+")");
                }
                //Actualizar el primo anterior
                prim_ant=prim;
            }
        }
    }
}
