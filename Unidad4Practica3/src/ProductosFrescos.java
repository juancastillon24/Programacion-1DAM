public class ProductosFrescos {
    private String envasado;
    private String pais;

    public ProductosFrescos(String envasado, String pais) {
        this.envasado = envasado;
        this.pais = pais;
    }

    public String getEnvasado() {
        return envasado;
    }

    public void setEnvasado(String envasado) {
        this.envasado = envasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
