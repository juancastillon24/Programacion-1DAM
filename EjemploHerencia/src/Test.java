public class Test {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.comer();
        a1.dormir();
        a1.rugir();
        System.out.println("CANINO");
        Canino c1=new Canino();
        c1.comer();
        c1.dormir();
        c1.rugir();
        System.out.println("PERRO");
        Perro p1=new Perro();
        p1.comer();
        p1.dormir();
        p1.rugir();
    }
}
