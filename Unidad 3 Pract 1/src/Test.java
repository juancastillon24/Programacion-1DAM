public class Test {
    public static void main(String[] args) {
        Coche c1 = new Coche("Peugeot 208","Rojo",false,"2412ADC",2022,true);
        System.out.println(c1.toString());
        c1.ImprimeCoche();
    }
}
