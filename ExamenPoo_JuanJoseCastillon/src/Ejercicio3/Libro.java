package Ejercicio3;

public class Libro extends MaterialBibliografico{
    //Creacion atributos
    private String genero;
    private int numPaginas;

    public Libro(String titulo, String autor, int anhoPublicacion, boolean disponible, String genero, int numPaginas) {
        super(titulo, autor, anhoPublicacion, disponible);
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void prestar(int prestar) {
        if (prestar>14){
            System.out.println("El libro no puede ser prestado por más de 14 días");
        }
        else System.out.println("Material prestado por "+prestar+" dias");
    }


    @Override
    public void mostrarDetalles() {
        System.out.println ("Título: "+ getTitulo() +"\n Autor: "+ getAutor() +"\n Año Publicación: "+ getAnhoPublicacion() +"\n Disponible: "+ isDisponible()+"\n Género: "+genero+"\n Número de páginas: "+numPaginas);
    }


}
