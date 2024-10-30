import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String titulo;
        String autor;
        int numeroPaginas;
        int paginaActual;
        Scanner sc=new Scanner(System.in);
        System.out.print("Titulo del libro? ");
        titulo= sc.next();
        System.out.print("Autor/a del libro? ");
        autor= sc.next();
        do {
            System.out.print("Introduce el número de páginas que tiene el libro: ");
            numeroPaginas= sc.nextInt();
        }while (numeroPaginas<=50);
        do {
            System.out.print("Introduce la página por la que vas del libro: ");
            paginaActual= sc.nextInt();
        }while (paginaActual<0||paginaActual>numeroPaginas);


        Libro libro=new Libro(titulo,autor,numeroPaginas,paginaActual);
        libro.mostrarInfo();
        libro.leerPagina();
        libro.mostrarInfo();
        libro.retrocederPagina();
        libro.leerPagina();
        libro.leerPagina();
        libro.mostrarInfo();

    }
}
