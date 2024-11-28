public class Ejrecta {
    public static void main(String[] args) {
        Punto p1=new Punto(0,0);
        Punto p2=new Punto(4,0);
        Punto p3=new Punto(2,3);
        double base= p1.distancia(p2);
        Recta r1=new Recta(p1,p2);
        double altura= r1.distancia(p3);
        double area=base*altura/2;
        System.out.println("Puntos: "+p1+","+p2+","+p3);

        System.out.println("Area = "+area);
    }
}
