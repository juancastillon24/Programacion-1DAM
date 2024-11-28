package Ejercicio2;

public class ProductoRopa extends Producto {
    //Creación atributos
    private String Tamanho;

    //Creación constructores
    public ProductoRopa(String nombre, double precio, int cantidadStock, String tamanho) {
        super(nombre, precio, cantidadStock);
        Tamanho = tamanho;
    }

    //Getter y Setter
    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String tamanho) {
        Tamanho = tamanho;
    }

    //Creación métodos
    @Override
    public double calcularPrecio() {
        if (Tamanho.equals("Xl") || Tamanho.equals("L")){
            return getPrecio()*1.10;
        }
        else return getPrecio();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre() + "\n Precio: " + getPrecio() + " € \n Cantidad Stock: "+ getCantidadStock() + "\n Tamaño: "+Tamanho);
    }
}
