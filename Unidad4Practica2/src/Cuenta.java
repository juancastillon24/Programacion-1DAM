public class Cuenta {
    private long numeroCuenta;
    private double saldo;
    private Persona propietario;

    public Cuenta(long numeroCuenta, double saldo, Persona propietario) {
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
        setPropietario(propietario);
    }

    public Cuenta() {
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public void transaccion(int cantidad, boolean tipoTransaccion){
        if (tipoTransaccion){
            saldo+=cantidad;
        }
        else saldo-=cantidad;
    }

    @Override
    public String toString(){
        return "Nº Cuenta: " + numeroCuenta + "\nSaldo: " + saldo + "€\nPropietario: " + propietario;
    }
}
