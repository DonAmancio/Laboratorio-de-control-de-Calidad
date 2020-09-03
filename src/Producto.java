public class Producto {
    int idprod;
    String nombre;

    public Producto(int idprod, String nombre) {
        this.idprod = idprod;
        this.nombre = nombre;
    }

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
