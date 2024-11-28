public class PuestoTrabajo {
    private String codigo;
    private String descripcion;
    private double sueldoBruto;

    public PuestoTrabajo(String codigo, String descripcion, double sueldoBruto) {
        setCodigo(codigo);
        setDescripcion(descripcion);
        setSueldoBruto(sueldoBruto);
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
}