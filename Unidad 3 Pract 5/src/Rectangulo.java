public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho>0)
            this.ancho = ancho;
        else
            this.ancho = 0;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto>0)
            this.alto = alto;
        else
            this.alto = 0;
    }

    public double calcularArea(){
        return ancho*alto;
    }
    public double calcularPerimetro(){
        return 2*ancho+2*alto;
    }

}
