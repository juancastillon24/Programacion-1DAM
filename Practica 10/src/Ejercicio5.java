public class Ejercicio5 {
    public static void main(String[] args) {
        double temp_F;
        double temp_C;
        //F=(C*9/5)+32;
        for (temp_F=0; temp_F<=100;temp_F=temp_F+5){
            temp_C=((temp_F-32)*5/9);
            System.out.printf("La temperatura en Fahrenheit son "+temp_F+"ºF, lo que serian: "+temp_C+"ºC.\n");
        }
    }
}