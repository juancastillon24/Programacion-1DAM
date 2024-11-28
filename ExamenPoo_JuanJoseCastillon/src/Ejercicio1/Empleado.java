package Ejercicio1;

public class Empleado {
    //Creación atributos
    private String nombre;
    private double salarioBase;

    //Creación constructores
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public Empleado() {
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Creación métodos
    public double calcularSalario(){
        return salarioBase;
    }

    public void trabajar(){
        System.out.println("El empleado esta trabajando.");
    }
    public void infoEmpleado() {
        System.out.println("Informacion del empleado: \n Nombre: "+ nombre + "\n Salario base: "+ salarioBase +" €");

    }
}
