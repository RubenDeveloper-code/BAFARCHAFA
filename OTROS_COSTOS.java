import java.util.Calendar;
public interface OTROS_COSTOS {
    public final static double mantoEquipo=200;
    public final static double valorAF=50000;
    public final static double depreciaciónAF=0.20;
    public final static double rentaMaquinaria=1000;
    public final static double costoTransporte=300;
    public abstract double calculaOtrosCostos();
    public abstract double calculaDepFisAF();
}
