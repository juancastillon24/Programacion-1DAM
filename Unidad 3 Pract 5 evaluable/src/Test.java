public class Test {
    public static void main(String[] args) {
        Producto p1=new Producto("Gráficas",998,130);
        p1.venderProducto(1111);
        p1.reabastecer(12);
        p1.venderProducto(17);
        p1.reabastecer(18);
        System.out.println(p1.getCantidadEnStock());
    }
}
