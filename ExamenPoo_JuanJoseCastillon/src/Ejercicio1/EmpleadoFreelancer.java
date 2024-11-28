package Ejercicio1;

public class EmpleadoFreelancer extends Empleado {
    //Creación atributos
    private int numeroDeProyectos;

    //Creación Constructores
    public EmpleadoFreelancer(String nombre, double salarioBase, int numeroDeProyectos) {
        super(nombre, salarioBase);
        this.numeroDeProyectos = numeroDeProyectos;
    }

    //Getter y Setter
    public int getNumeroDeProyectos() {
        return numeroDeProyectos;
    }

    public void setNumeroDeProyectos(int numeroDeProyectos) {
        this.numeroDeProyectos = numeroDeProyectos;
    }

    //Creación métodos
    @Override
    public double calcularSalario() {
        return 200*numeroDeProyectos;
    }

    @Override
    public void trabajar(){
        System.out.println("El freelancer está trabajando en proyectos específicos.");
    }
}
