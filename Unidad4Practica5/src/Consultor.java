public class Consultor extends Empleado{
    private String categoria;

    public Consultor(String dni, String nombre, String apellidos, String domicilio, String codigopostal, String ciudad, PuestoTrabajo ptrabajo, String categoria) {
        super(dni, nombre, apellidos, domicilio, codigopostal, ciudad, ptrabajo);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Consultor{" +
                "categoria='" + categoria + '\'' +
                '}';
    }
    @Override
    public String getAtributos(){
        return super.getAtributos();
    }
}
