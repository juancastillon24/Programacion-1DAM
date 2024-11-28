package Ejercicio2;

public class ProductoAlimenticio extends Producto{
    //Creacion atributos
    private String fechaVencimiento;

    //Creación constructores
    public ProductoAlimenticio(String nombre, double precio, int cantidadStock, String fechaVencimiento) {
        super(nombre, precio, cantidadStock);
        this.fechaVencimiento = fechaVencimiento;
    }

    //Getter y Setter
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    //Creación métodos
    @Override
    public double calcularPrecio() {
        if (fechaVencimiento.equals("próximo mes")){
            return getPrecio()*0.80;
        }
        else return getPrecio();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre() + "\n Precio: " + getPrecio() + " € \n Cantidad Stock: "+ getCantidadStock()+ "\n Fecha de Vencimiento: "+fechaVencimiento);
    }
}
