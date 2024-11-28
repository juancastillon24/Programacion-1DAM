package Ejercicio3;

public class MaterialBibliografico {
    //Declaracion de atributos
    private String titulo;
    private String autor;
    private int anhoPublicacion;
    private boolean disponible;

    //Creacion constructores
    public MaterialBibliografico(String titulo, String autor, int anhoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anhoPublicacion = anhoPublicacion;
        this.disponible = disponible;
    }

    //Getter y Setter
    public MaterialBibliografico() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnhoPublicacion() {
        return anhoPublicacion;
    }

    public void setAnhoPublicacion(int anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //Creacion métodos
    public void prestar(){
        if (!disponible){
            System.out.println("Material no disponible para préstamo");
        }
        else System.out.println("Material prestado exitosamente");
    }

    public void devolver(){
        System.out.println("Material devuelto exitosamente");
    }

    public void mostrarDetalles(){
        System.out.println ("Título: "+ titulo +"\n Autor: "+ autor +"\n Año Publicación: "+ anhoPublicacion +"\n Disponible: "+ disponible);
    }

}
