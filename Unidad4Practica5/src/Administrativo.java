public class Administrativo extends Empleado{
    private int antiguedad;

    public Administrativo(String dni, String nombre, String apellidos, String domicilio, String codigopostal, String ciudad, PuestoTrabajo ptrabajo, int antiguedad) {
        super(dni, nombre, apellidos, domicilio, codigopostal, ciudad, ptrabajo);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }



    @Override
    public String toString() {
        return "Administrativo{" +
                "antiguedad=" + antiguedad +
                '}';
    }

    @Override
    public String getAtributos(){
        return super.getAtributos();
    }
}
