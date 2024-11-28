public class Recta extends Vector{
    private Vector director;
    private Punto p;


    public Recta(Punto p1, Punto p2) {
        super(p1, p2);
    }

    public Recta(Vector director, Punto p){
        super(director,p);
    }

    /*
    public double distancia(Punto p1){
        return ;
    }

    public Punto interseccion(Recta r){
        return
    }

    public Recta paralela(Punto p1){
        return
    }

    public boolean paralelas(Recta r){
        return
    }

    public boolean pasa(Punto p1){
        return
    }

    public Recta perpendicular(Punto p1){
        return
    }*/

    @Override
    public String toString() {
        return "Recta{" +
                "director=" + director +
                ", p=" + p +
                '}';
    }
}
