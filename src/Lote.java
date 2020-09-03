import java.util.Date;

public class Lote {
    int idlot;
    String codigo;
    Date fechav;
    Producto loteprod;

    public Lote(int idlot, String codigo, Date fechav, Producto loteprod) {
        this.idlot = idlot;
        this.codigo = codigo;
        this.fechav = fechav;
        this.loteprod = loteprod;
    }

    public int getIdlot() {
        return idlot;
    }

    public void setIdlot(int idlot) {
        this.idlot = idlot;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechav() {
        return fechav;
    }

    public void setFechav(Date fechav) {
        this.fechav = fechav;
    }

    public Producto getLoteprod() {
        return loteprod;
    }

    public void setLoteprod(Producto loteprod) {
        this.loteprod = loteprod;
    }
}
