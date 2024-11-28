package Ejercicio1;

public class EmpleadoPorHora extends Empleado{
    //Creación atributos
    private int horasTrabajadas;
    private double tarifaPorHora;

    //Creación constructores
    public EmpleadoPorHora(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    //Getter y Setter
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    //Creación métodos
    @Override
    public double calcularSalario(){
        return horasTrabajadas*tarifaPorHora;
    }

    public double calcularSalario(int horasTrabajadas,double tarifaPorHora) {
        return calcularSalario();
    }

    @Override
    public void trabajar(){
        System.out.println("El empleado por hora está trabajando según las horas asignadas.");
    }

    @Override
    public String toString() {
        return "EmpleadoPorHora{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", tarifaPorHora=" + tarifaPorHora +
                '}';
    }
}
