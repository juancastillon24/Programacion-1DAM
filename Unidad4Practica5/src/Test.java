public class Test {
    public static void main(String[] args) {
        PuestoTrabajo p=new PuestoTrabajo("15","normales?",1500);
        Empleado e=new Empleado("564685","Marcos","Solano","Coin","29100","Málaga",p);
        Administrativo a=new Administrativo("564651","Pablo","Durán","Campanillas","29099","Malaga",p,5);
        Consultor c=new Consultor("8654124","Julia","Valverde","Malaga","29045","Malaga",p,"karate");

        System.out.println(e.getAtributos());
        System.out.println(a.getAtributos());
        System.out.println(c.getAtributos());
    }

}
