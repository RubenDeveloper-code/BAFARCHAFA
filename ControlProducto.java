public class ControlProducto {
    static final int ERROR = -1;
    private Producto productos[];
    private int cont;
    private int max;
    SaveRecoverSystem srs;

    public ControlProducto() {
        srs = new SaveRecoverSystem();
        try {
            productos = srs.readArray();
        } catch(Exception e) {
            e.printStackTrace();
            productos = new Producto[max];
        }
        max=20;
        cont=-1;
    }
    public void save() {
        try {
            srs.saveArray(productos);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String buscarPorNombre(String nombre) {
        busquedaBinaria bb = new busquedaBinaria(productos);
        int index = bb.buscarBinariamenteentePerNombre(nombre);
        if(index == -1)return "Producto no encontrados";
        return productos[index].toString();
    }

    //Depreciado
    public String buscarPorCodigo(int codigo) {
        busquedaBinaria bb = new busquedaBinaria(productos);
        int index = bb.buscarBinariamenteentePerCodigo(codigo);
        if(index == -1)return "Producto no encontrados";
        return productos[index].toString();
    }
    public Producto findbyName(String nombre) {
        busquedaBinaria bb = new busquedaBinaria(productos);
        return productos[bb.buscarBinariamenteentePerNombre(nombre)];

    }
    //Depreciado
    public Producto findbyCode(int code) {
        busquedaBinaria bb = new busquedaBinaria(productos);
        return productos[bb.buscarBinariamenteentePerCodigo(code)];
    }

//acuerdeze solo la superclase atributos, no los base, los de superclasepoderosa, ya tu das el  tratamiento de copia de datos desde la interfas de antiguos a nuevos
//WAWAWAWAWAWA ALERTA SISMICA ALERTA SISMICA
    public String cambioProducto(String nombre, Producto nuevoProducto) {
        busquedaBinaria bb = new busquedaBinaria(productos);
        int index = bb.buscarBinariamenteentePerNombre(nombre);
        if(index==-1)return "No se encontro el producto por nombre";
        productos[index]=nuevoProducto;
        return "Producto actualizado correctamente";
    }

    public double calcularPrecioVentaPorNombre(String nombre) {
        busquedaBinaria bb = new busquedaBinaria(productos);
        int index = bb.buscarBinariamenteentePerNombre(nombre);
        if(index==ERROR)return ERROR;//fua epico
        return productos[index].precioVenta();
    }

    public double calcularPrecioVentaGeneral() {
        double total = 0;
        for(Producto prod : productos) {
            if(prod==null)continue;
            total+=prod.precioVenta();
        }
        return total;
    }

//El producto lo creas con la info de la interfas fresquesita y lo pasas wuawuawua
    public String altas(Producto  objeto) {
        int index = indexToAddItemFrom(productos);
        if(index == ERROR)return "no se puede añadir";
        productos[index]=objeto;
        cont++;
        return "Producto añadido";
    }

    public String bajas(String nombre) {
        int index = getIndexFromName(nombre);
        if(index == ERROR)return "Item no encontrado";
        safeDelete(index);
        cont--;
        return "Producto dado de baja";
    }

    private void safeDelete(int index) {
        for(int i = 0; i < max; i++) {
            if(i >= index) {
                productos[index] = productos[index+1];
            }
            cont--;
        }

    }

    public String reporteGeneral() {
        String res = "";
        for(Producto producto : productos) {
            if(producto==null)continue;
            res+=producto.toString()+"\n";
        }
        return res;
    }

    public String reporteCategoriasAsendenteInsert() {
        String reporte = "---------------------Reporte----------------------\n";
        insertMetodo insFrescos = new insertMetodo(getSubStringFrescos());
        reporte+="------>Frescos<-------\n";
        reporte+=insFrescos.getOrderedByNameAscendentStr();

        insertMetodo insConjelados = new insertMetodo(getSubStringCongelados());
        reporte+="------>Conjelados<-------\n";
        reporte+=insConjelados.getOrderedByNameAscendentStr();

        insertMetodo insRefrigerados = new insertMetodo(getSubStringRefrigerado());
        reporte+="------>Refrigerados<-------\n";
        reporte+=insRefrigerados.getOrderedByNameAscendentStr();
        return reporte;
    }

    public String reporteCategoriasDescendienteInsert() {
        String reporte = "---------------------Reporte Desendiente----------------------\n";
        insertMetodo insFrescos = new insertMetodo(getSubStringFrescos());
        reporte+="------>Frescos<-------\n";
        reporte+=insFrescos.getOrderByNameDesendentStr();

        insertMetodo insConjelados = new insertMetodo(getSubStringCongelados());
        reporte+="------>Conjelados<-------\n";
        reporte+=insConjelados.getOrderByNameDesendentStr();

        insertMetodo insRefrigerados = new insertMetodo(getSubStringRefrigerado());
        reporte+="------>Refrigerados<-------\n";
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
            if(prod==null)continue;
            if(prod instanceof ProductoFresco) {
                tempProds[indexToAddItemFrom(tempProds)]=prod;
            }
        }
        return tempProds;
    }

    public Producto[] getSubStringCongelados() {
        Producto tempProds[] = new Producto[max];
        for(Producto prod : productos) {
            if(prod==null)continue;
            if(prod instanceof ProductoCongelado) {
                tempProds[indexToAddItemFrom(tempProds)]=prod;
            }
        }
        return tempProds;
    }

    public Producto[] getSubStringRefrigerado() {
        Producto tempProds[] = new Producto[max];
        for(Producto prod : productos) {
            if(prod==null)continue;
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
        for(int i = 0; i < utilities.initLength(productos); i++) {
            if(productos[i].getNombre().equals(name))return i;
        }
        return -1;
    }

}
