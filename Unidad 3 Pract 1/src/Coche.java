public class Coche {
    private String modelo;
    private String color;
    private Boolean metalizado;
    private String matricula;
    private int ahno_fab;
    private boolean seg;

    public Coche(String modelo, String color, Boolean metalizado, String matricula, int ahno_fab, boolean seg) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.ahno_fab = ahno_fab;
        this.seg = seg;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getMetalizado() {
        return metalizado;
    }

    public void setMetalizado(Boolean metalizado) {
        this.metalizado = metalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAhno_fab() {
        return ahno_fab;
    }

    public void setAhno_fab(int ahno_fab) {
        this.ahno_fab = ahno_fab;
    }

    public boolean isSeg() {
        return seg;
    }

    public void setSeg(boolean seg) {
        this.seg = seg;
    }

    @Override
    public String toString(){
        return "Modelo: "+modelo+"\nColor: "+color+"\nMetalizado: "+metalizado+"\nMatrícula: "+matricula+"\nAño fabricación: "+ahno_fab+"\nSeguro: "+seg;

    }

    public void ImprimeCoche(){
        System.out.println("Modelo: "+modelo+"\nColor: "+color);
    }
}

