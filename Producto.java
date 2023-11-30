import java.io.Serializable;

public abstract class Producto implements Serializable {
    private String nombre;
    private int codigo;
    private String fecha_caducidad;
    private int numLote;
    private double costoProduccion;

    public Producto(String nombre, int codigo, String fecha_caducidad, int numLote, double costoProduccion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fecha_caducidad = fecha_caducidad;
        this.numLote = numLote;
        this.costoProduccion = costoProduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(double costoProducto) {
        this.costoProduccion = costoProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", fecha_caducidad=" + fecha_caducidad + ", numLote=" + numLote + ", costoProducto=" + costoProduccion + '}';
    }

    abstract public double precioVenta();

}
