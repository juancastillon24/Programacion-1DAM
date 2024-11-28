public class Vector extends Punto {
    private Punto e;
    private Punto o;

    public Vector(double x, double y) {
        super(x, y);
    }
    public Vector (Punto e){
        super(e.getX(), e.getY());
    }
    public Vector(Punto o, Punto e){
        super(e.getX()- o.getX(), e.getY()- o.getY());
    }

    public Punto getE() {
        return e;
    }

    public void setE(Punto e) {
        this.e = e;
    }

    public Punto getO() {
        return o;
    }

    public void setO(Punto o) {
        this.o = o;
    }

    /*public double modulo(){
        return Math.sqrt(Math.pow(e.getX()-o.getX(),2)+Math.pow(e.getY()-o.getY(),2));
    }*/
    public double modulo(){
        return distancia(e);
    }
    public Vector ortogonal(){
        return new Vector(-this.getY(),this.getX());
    }

    public boolean comblineal(Vector v){
        return Math.pow(getX()* v.getY(),2)==Math.pow(getY()* v.getX(),2);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "e=" + e +
                ", o=" + o +
                '}';
    }
}
