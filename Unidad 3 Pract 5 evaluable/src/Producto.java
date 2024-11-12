import java.util.Scanner;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.setPrecio(precio);
        this.cantidadEnStock = cantidadEnStock;
    }

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
        if (precio>0)
            this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public void venderProducto (int cantidad_v){
        if (cantidadEnStock>0 && cantidad_v<=cantidadEnStock) {
            cantidadEnStock-=cantidad_v;
        }
    }

    public void reabastecer(int cantidad_r){
        if (cantidad_r>0)
            cantidadEnStock+=cantidad_r;
    }
}
