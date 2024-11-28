package Ejercicio3;

public class Revista extends MaterialBibliografico{
    //Creacion atributos
    private int numeroEdicion;
    private String mesPublicacion;

    //Creación constructores
    public Revista(String titulo, String autor, int anhoPublicacion, boolean disponible, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, anhoPublicacion, disponible);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    //Getter y Setter
    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    //Creacion métodos
    @Override
    public void prestar() {
        if (!isDisponible()){
            System.out.println("Esta revista solo es para consulta interna");
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println ("Título: "+ getTitulo() +"\n Autor: "+ getAutor() +"\n Año Publicación: "+ getAnhoPublicacion() +"\n Disponible: "+ isDisponible()+"\n Edición: "+numeroEdicion+"\n Mes de publicación: "+mesPublicacion);
    }
}
