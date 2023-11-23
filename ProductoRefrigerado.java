public class ProductoRefrigerado extends Producto implements OTROS_COSTOS {
    private int codigoSupAlimentaria;

    public ProductoRefrigerado(int codigoSupAlimentaria, String nombre, int codigo, String fecha_caducidad, int numLote, double costoProducto) {
        super(nombre, codigo, fecha_caducidad, numLote, costoProducto);
        this.codigoSupAlimentaria = codigoSupAlimentaria;
    }

    public int getCodigoSupAlimentaria() {
        return codigoSupAlimentaria;
    }

    public void setCodigoSupAlimentaria(int codigoSupAlimentaria) {
        this.codigoSupAlimentaria = codigoSupAlimentaria;
    }

    @Override
    public String toString() {
        return "productoRefrigerado{ "+super.toString() + "codigoSupAlimentaria=" + codigoSupAlimentaria + '}';
    }

    @Override
    public double precioVenta() {
        return ((super.getCostoProduccion()+calculaOtrosCostos()+calculaDepFisAF())*1.30)*1.1;
    }

    @Override
    public double calculaOtrosCostos() {
        return rentaMaquinaria+mantoEquipo;
    }

    @Override
    public double calculaDepFisAF() {
        return valorAF*depreciaciónAF;
    }

}
