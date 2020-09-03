public class Tipo {
    int idtipo;
    String nombre;

    public Tipo(int idtipo, String nombre) {
        this.idtipo = idtipo;
        this.nombre = nombre;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
