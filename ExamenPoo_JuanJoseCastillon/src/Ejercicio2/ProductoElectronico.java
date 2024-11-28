package Ejercicio2;

public class ProductoElectronico extends Producto{
    //Creación atributos
    private int garantia;

    //Creación constructores
    public ProductoElectronico(String nombre, double precio, int cantidadStock, int garantia) {
        super(nombre, precio, cantidadStock);
        this.garantia = garantia;
    }

    //Getter y Setter
    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    //Creación Métodos
    @Override
    public double calcularPrecio() {
        if (garantia>2){
            return getPrecio()*0.9;
        }
        else return getPrecio();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre() + "\n Precio: " + getPrecio() + " € \n Cantidad Stock: "+ getCantidadStock() + " \n Garantía: "+garantia);
    }
}
