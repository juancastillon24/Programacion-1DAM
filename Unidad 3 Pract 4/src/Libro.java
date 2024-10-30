public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int paginaActual=0;

    public Libro(String titulo, String autor, int numeroPaginas, int paginaActual) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.paginaActual = paginaActual;
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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    public void leerPagina(){
        if (paginaActual==numeroPaginas) {
            System.out.println("Ya has terminado el libro");
        }
        else if (numeroPaginas>numeroPaginas) {
            System.out.println("Esa pagina no existe porfavor introduce una entre la 0 y la "+numeroPaginas);
        }else {
            paginaActual++;
            System.out.println("Has avanzado una pagina: "+paginaActual);
        }
    }
    public void retrocederPagina(){
        if (paginaActual<=0) {
            System.out.println("No has empezado el libro");
        }
        else {
            paginaActual--;
            System.out.println("Has retrocceido a la página: "+paginaActual);
        }
    }
    public void mostrarInfo(){
        System.out.println("Estas leyendo el libro "+titulo+" que lo ha escrito "+autor+", vas por la página "+paginaActual+" de las "+numeroPaginas+" páginas que tiene.");
    }
}
