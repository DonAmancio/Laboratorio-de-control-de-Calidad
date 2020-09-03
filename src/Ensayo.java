public class Ensayo {
    int idensayo;
    String codigo;
    Tipo tipo;

    public Ensayo(int idensayo, String codigo, Tipo tipo) {
        this.idensayo = idensayo;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public int getIdensayo() {
        return idensayo;
    }

    public void setIdensayo(int idensayo) {
        this.idensayo = idensayo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
