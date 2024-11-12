public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;

    public Persona(String nombre, String apellido, String telefono) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length()==9)
            this.telefono = telefono;
        else telefono="0";

    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nTeléfono: " + telefono;
    }
}
