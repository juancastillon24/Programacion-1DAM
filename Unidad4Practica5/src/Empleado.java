public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private String domicilio;
    private String codigopostal;
    private String ciudad;
    private PuestoTrabajo puesto;

    public Empleado(String dni, String nombre, String apellidos, String domicilio, String codigopostal, String ciudad, PuestoTrabajo ptrabajo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.codigopostal = codigopostal;
        this.ciudad = ciudad;
        this.puesto = ptrabajo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public PuestoTrabajo getPuesto() {
        return puesto;
    }

    public void setPuesto(PuestoTrabajo puesto) {
        this.puesto = puesto;
    }


    public String getAtributos(){
        return puesto.getDescripcion();
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", codigopostal='" + codigopostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", puesto=" + puesto +
                '}';
    }

}
