public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    Sexo s = Sexo.H;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, Sexo s) {
        this.nombre = nombre;
        this.edad = edad;
        this.s = s;
    }

    public Persona(String nombre, int edad, String DNI, Sexo s, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.s = s;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Sexo getS() {
        return s;
    }

    public void setS(Sexo s) {
        this.s = s;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC(){
        return (peso/(Math.pow(altura,2)));

    }
    public boolean esMayorDeEdad(){

    }
    public void comprobarSexo(char sexo){
        
    }
}
