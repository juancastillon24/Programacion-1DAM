package Ejercicio3;

import java.util.Scanner;

public class Tesis extends MaterialBibliografico{
    //Creacion atributos
    private String universidad;
    private String campoEstudio;

    //Creacion constructores
    public Tesis(String titulo, String autor, int anhoPublicacion, boolean disponible, String universidad, String campoEstudio) {
        super(titulo, autor, anhoPublicacion, disponible);
        this.universidad = universidad;
        this.campoEstudio = campoEstudio;
    }

    //Getter y Setter
    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCampoEstudio() {
        return campoEstudio;
    }

    public void setCampoEstudio(String campoEstudio) {
        this.campoEstudio = campoEstudio;
    }


    //Creacion métodos
    public void prestar(boolean tienePermiso) {
        if (!tienePermiso){
            System.out.println("El préstamo de esta tesis requiere permisos especiales.");
        }
        else System.out.println("Tesis prestada exitosamente. \n Material prestado exitosamente.");

    }

    public void prestar(int dias) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantos dias durará el préstamo?");
        dias= sc.nextInt();
        sc.close();
    }

    public void prestar(String usuario){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nombre de usuario: ");
        usuario=sc.next();
        sc.close();
    }


    @Override
    public void mostrarDetalles() {
        System.out.println ("Título: "+ getTitulo() +"\n Autor: "+ getAutor() +"\n Año Publicación: "+ getAnhoPublicacion() +"\n Disponible: "+ isDisponible()+"\n Universidad: "+universidad+"\n Campo de Estudio: "+campoEstudio);
    }
}
