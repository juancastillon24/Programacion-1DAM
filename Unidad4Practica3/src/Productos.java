public class Productos {

    private String caducidad;
    private String lote;

    public Productos(String caducidad, String lote) {
        this.caducidad = caducidad;
        this.lote = lote;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
}
