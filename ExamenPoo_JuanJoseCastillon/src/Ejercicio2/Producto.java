package Ejercicio2;

public class Producto {

    //Creación atributos
    private String nombre;
    private double precio;
    private int cantidadStock;

    //Creación constructores
    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public Producto() {
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double calcularPrecio(){
        return precio;
    }

    //Creación métodos
    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre + "\n Precio: " + precio + " € \n Cantidad Stock: "+ cantidadStock);
    }

    public void disponibilidad(){
        if (cantidadStock>0){
            System.out.println("Está disponible");
        }
        else System.out.println("No hay stock de este producto");
    }
}
