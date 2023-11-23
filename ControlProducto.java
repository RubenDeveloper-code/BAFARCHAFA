public class ControlProducto {
    static final int ERROR = -1;
    private Producto productos[];
    private int con;
    private int max;

    public ControlProducto() {
        max=20;
        con=-1;
        productos = new Producto[max];
    }

    public String buscarPorNombre(String nombre) {
        busquedaBinaria bb = new busquedaBinaria(productos);
        return productos[bb.buscarBinariamenteentePerNombre(nombre)].toString();
    }

    public String buscarPorCodigo(int codigo) {
        busquedaBinaria bb = new busquedaBinaria(productos);
        return productos[bb.buscarBinariamenteentePerCodigo(codigo)].toString();
    }

    //El producto lo creas con la info de la interfas fresquesita y lo pasas wuawuawua
    public String altas(Producto objeto) {
        int index = indexToAddItemFrom(productos);
        if(index == ERROR)return "no se puede añadir";
        productos[index]=objeto;
        return "Producto añadido";
    }

    public String bajas(String nombre) {
        int index = getIndexFromName(nombre);
        if(index == ERROR)return "Item no encontrado";
        productos[index] = null;
        return "Producto dado de baja";
    }

    public String reporteGeneral() {
        String res = "";
        for(Producto producto : productos) {
            res+=producto.toString();
        }
        return res;
    }

    public String reporteCategoriasAsendenteInsert() {
        String reporte = "---------------------Reporte----------------------";
        insertMetodo insFrescos = new insertMetodo(getSubStringFrescos());
        reporte+="------>Frescos<-------";
        reporte+=insFrescos.getOrderedByNameAscendentStr();

        insertMetodo insConjelados = new insertMetodo(getSubStringCongelados());
        reporte+="------>Conjelados<-------";
        reporte+=insConjelados.getOrderedByNameAscendentStr();

        insertMetodo insRefrigerados = new insertMetodo(getSubStringRefrigerado());
        reporte+="------>Refrigerados<-------";
        reporte+=insRefrigerados.getOrderedByNameAscendentStr();
        return reporte;
    }

    public String reporteCategoriasDescendienteInsert() {
        String reporte = "---------------------Reporte Desendiente----------------------";
        insertMetodo insFrescos = new insertMetodo(getSubStringFrescos());
        reporte+="------>Frescos<-------";
        reporte+=insFrescos.getOrderByNameDesendentStr();

        insertMetodo insConjelados = new insertMetodo(getSubStringCongelados());
        reporte+="------>Conjelados<-------";
        reporte+=insConjelados.getOrderByNameDesendentStr();

        insertMetodo insRefrigerados = new insertMetodo(getSubStringRefrigerado());
        reporte+="------>Refrigerados<-------";
        reporte+=insRefrigerados.getOrderByNameDesendentStr();
        return reporte;
    }

    public String reporteAscendenteQuickSort() {
        quickSort qs = new quickSort(productos);
        return qs.getOrderedByNameAscendentStr();
    }

    public String reporteDescendenteQuickSort() {
        quickSort qs = new quickSort(productos);
        return qs.getOrderByNameDesendentStr();
    }

    public String reporteAscendenteBurbuja() {
        burbujaMetodo bbja = new burbujaMetodo(productos);
        return bbja.getOrderedByNameAscendentStr();
    }

    public String reporteDescendenteBurbuja() {
        burbujaMetodo bbja = new burbujaMetodo(productos);
        return bbja.getOrderByNameDesendentStr();
    }

    public Producto[] getSubStringFrescos() {
        Producto tempProds[] = new Producto[max];
        for(Producto prod : productos) {
            if(prod instanceof ProductoFresco) {
                tempProds[indexToAddItemFrom(tempProds)]=prod;
            }
        }
        return tempProds;
    }

    public Producto[] getSubStringCongelados() {
        Producto tempProds[] = new Producto[max];
        for(Producto prod : productos) {
            if(prod instanceof ProductoCongelado) {
                tempProds[indexToAddItemFrom(tempProds)]=prod;
            }
        }
        return tempProds;
    }

    public Producto[] getSubStringRefrigerado() {
        Producto tempProds[] = new Producto[max];
        for(Producto prod : productos) {
            if(prod instanceof ProductoRefrigerado) {
                tempProds[indexToAddItemFrom(tempProds)]=prod;
            }
        }
        return tempProds;
    }

    private int indexToAddItemFrom(Object objs[]) {
        for(int i = 0; i < objs.length; i++) {
            if(objs[i]==null)return i;
        }
        return -1;
    }

    private int getIndexFromName(String name) {
        for(int i = 0; i < productos.length; i++) {
            if(productos[i].getNombre().equals(name))return i;
        }
        return -1;
    }

}