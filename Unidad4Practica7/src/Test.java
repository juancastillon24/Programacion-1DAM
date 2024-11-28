public class Test {
    public static void main(String[] args) {
        Actor a1=new Actor("Jhon",67);
        Director d1 = new Director("Steven", 57);
        Pelicula p1= new Pelicula(1997,"Jurassic Park","Ficción",d1,a1);

        Actor a2=new Actor("Bin",43);
        Director d2=new Director("Alq",57);
        Pelicula p2=new Pelicula(2001,"El ataque de las gemelas","Terror",d2,a2);

        p1.mostrarDetalles();
        p2.mostrarDetalles();
    }

}
