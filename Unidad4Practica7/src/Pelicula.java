public class Pelicula {
    private int anho;
    private String titulo;
    private String genero;
    private Director director;
    private Actor actor;

    public Pelicula(int anho, String titulo, String genero, Director director, Actor actor) {
        this.anho = anho;
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.actor = actor;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void mostrarDetalles() {
        System.out.println("Pelicula:\n" +
                "Año=" + anho + '\n'+
                "Titulo='" + titulo + '\n' +
                "Genero='" + genero + '\n' +
                "Director=" + director + '\n'+
                "Actor=" + actor
                );
    }
}
