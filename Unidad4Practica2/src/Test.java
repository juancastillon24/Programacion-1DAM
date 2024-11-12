public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ramiro","Ramirez","654321787");
        Cuenta c1=new Cuenta(231454135,123.25, p1);
        System.out.println(c1);
    }
}
