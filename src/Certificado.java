public class Certificado {
    int idcertificado;
    String hash;
    Lote lote;

    public Certificado(int idcertificado, String hash, Lote lote) {
        this.idcertificado = idcertificado;
        this.hash = hash;
        this.lote = lote;
    }

    public int getIdcertificado() {
        return idcertificado;
    }

    public void setIdcertificado(int idcertificado) {
        this.idcertificado = idcertificado;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
}
