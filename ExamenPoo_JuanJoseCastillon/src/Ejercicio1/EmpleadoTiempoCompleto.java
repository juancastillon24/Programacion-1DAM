package Ejercicio1;

public class EmpleadoTiempoCompleto extends Empleado {
    //Creación constructores
    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    //Creación métodos
   @Override
    public double calcularSalario(){
        return getSalarioBase()+500;
   }

   @Override
    public void trabajar(){
       System.out.println("El empleado de tiempo completo está trabajando en un horario regular");
   }
}
