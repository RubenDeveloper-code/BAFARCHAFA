public class ProductoFresco extends Producto implements OTROS_COSTOS {
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String fechaEnvasado, String paisOrigen, String nombre, int codigo, String fecha_caducidad, int numLote, double costoProducto) {
        super(nombre, codigo, fecha_caducidad, numLote, costoProducto);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "productoFresco{ "+super.toString() + "fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + '}';
    }

    @Override
    public double precioVenta() {
        return (super.getCostoProduccion()+calculaOtrosCostos())*1.15;
    }

    @Override
    public double calculaOtrosCostos() {
        return rentaMaquinaria+costoTransporte;
    }

    @Override
    public double calculaDepFisAF() {
        return 0;
    }

}
