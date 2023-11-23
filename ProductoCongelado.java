public class ProductoCongelado extends Producto implements OTROS_COSTOS {
    private float tempCongelacion;

    public ProductoCongelado(float tempCongelacion, String nombre, int codigo, String fecha_caducidad, int numLote, double costoProducto) {
        super(nombre, codigo, fecha_caducidad, numLote, costoProducto);
        this.tempCongelacion = tempCongelacion;
    }

    public float getTempCongelacion() {
        return tempCongelacion;
    }

    public void setTempCongelacion(float tempCongelacion) {
        this.tempCongelacion = tempCongelacion;
    }

    @Override
    public String toString() {
        return "productoCongelado{ "+super.toString() + "tempCongelacion=" + tempCongelacion + '}';
    }

    @Override
    public double precioVenta() {
        double pv;
        pv=super.getCostoProduccion()+calculaOtrosCostos()+calculaDepFisAF();
        if(pv>1000)
            pv=pv*1.67;
        return pv;
    }

    @Override
    public double calculaOtrosCostos() {
        return rentaMaquinaria+mantoEquipo+costoTransporte;
    }

    @Override
    public double calculaDepFisAF() {
        return valorAF*depreciaciónAF;
    }

}
