import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //producto
        Producto alcoholgel=new Producto(1,"gel antibacterial");
        Producto fragancia=new Producto(2,"Fragancia");
        //lote
        Lote lotegel=new Lote(1,"alcgel2020", Calendar.getInstance().getTime(),alcoholgel);
        Lote lotefrag=new Lote(2,"frag2020",Calendar.getInstance().getTime(), fragancia);
        //certificado
        Certificado certgel=new Certificado(1,"alcgel215478",lotegel);
        Certificado certfrag=new Certificado(2,"frag3187842s",lotefrag);
        //muestra
        Muestra muestgel=new Muestra(1,"muestragel");
        Muestra muestfra=new Muestra(2,"muestrafragancia");
        //tipo
        Tipo gel=new Tipo(1,"Alcohol en gel");
        Tipo fragan=new Tipo(2,"fragancia perfume");
        //ensayo
        Ensayo ensayog=new Ensayo(1,"ensalc2020",gel);
        Ensayo ensayof=new Ensayo(2,"ensafr2020",fragan);
        //norma
        Norma norgel=new Norma(1,"Prueba de viscocidad","cumplir con el minimo de viscocidad establecido(g/ml a 24º C)",0.90,gel);
        Norma norfrag=new Norma(2,"Prueba de pureza","cumplir con el minimo de pureza establecido(%)",9,fragan);
        //medida
        Medida kilos=new Medida(1,"kilos");
        Medida litros=new Medida(2,"litros");
        //jefe de laboratorio
        JefeLab fanor=new JefeLab(1,"Fanor","Rojas","Calvi");
        Producto.getIdprod();
    }
}
