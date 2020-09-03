public class Norma {
    int idnorma;
    String nombre;
    String condicion;
    double valor;
    Tipo tipo;

    public Norma(int idnorma, String nombre, String condicion, double valor, Tipo tipo) {
        this.idnorma = idnorma;
        this.nombre = nombre;
        this.condicion = condicion;
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getIdnorma() {
        return idnorma;
    }

    public void setIdnorma(int idnorma) {
        this.idnorma = idnorma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
