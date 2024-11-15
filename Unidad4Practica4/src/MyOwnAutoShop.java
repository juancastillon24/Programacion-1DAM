public class MyOwnAutoShop {
    public static void main(String[] args) {
        Truck t1=new Truck(175,12500,"azul",2700);
        Ford f1=new Ford(240,47395,"Rojo",2010,1200);
        Sedan s1=new Sedan(195,27000,"Plata",27);

        System.out.println(t1.getSalePrice());
        System.out.println(f1.getSalePrice());
        System.out.println(s1.getSalePrice());
    }
}
