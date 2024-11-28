public class Cilindro extends Circulo{
    private float altura;

    public Cilindro(float x, float y, float radio, float altura) {
        super(x, y, radio);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                '}';
    }
}
