public class Medida {
    int idmedida;
    String nombre;

    public Medida(int idmedida, String nombre) {
        this.idmedida = idmedida;
        this.nombre = nombre;
    }

    public int getIdmedida() {
        return idmedida;
    }

    public void setIdmedida(int idmedida) {
        this.idmedida = idmedida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
