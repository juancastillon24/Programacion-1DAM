public class Circulo extends Punto{
    private float radio;

    public Circulo(float x, float y, float radio) {
        super(x, y);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
