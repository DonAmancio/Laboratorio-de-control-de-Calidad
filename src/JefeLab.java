public class JefeLab {
    int idjefe;
    String nombre;
    String primerap;
    String segundoap;

    public JefeLab(int idjefe, String nombre, String primerap, String segundoap) {
        this.idjefe = idjefe;
        this.nombre = nombre;
        this.primerap = primerap;
        this.segundoap = segundoap;
    }

    public int getIdjefe() {
        return idjefe;
    }

    public void setIdjefe(int idjefe) {
        this.idjefe = idjefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerap() {
        return primerap;
    }

    public void setPrimerap(String primerap) {
        this.primerap = primerap;
    }

    public String getSegundoap() {
        return segundoap;
    }

    public void setSegundoap(String segundoap) {
        this.segundoap = segundoap;
    }
}
