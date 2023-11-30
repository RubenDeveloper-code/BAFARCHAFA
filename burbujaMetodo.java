public class burbujaMetodo {

    static final int NOMBRE = 0;

    Producto[] prods;
    burbujaMetodo(Producto[] prods) {
        this.prods = prods;
    }

    public String getOrderedByNameAscendentStr() {
        OrdenarProductoPorCampo(prods, NOMBRE, false);
        return printArray(prods);
    }

    public String getOrderByNameDesendentStr() {
        OrdenarProductoPorCampo(prods, NOMBRE, true);
        return printArray(prods);
    }

    private void OrdenarProductoPorCampo(Producto[] productos, int campo, boolean desendiente) {
        int len = utilities.initLength(productos), step = 0;
        boolean nskip = true;
        while(nskip && --len > 0) {
            nskip=false;
            for(step = 1; step <= len; step++) {
                if(comparator(productos, step, campo, desendiente)) {
                    swap(productos, step);
                    nskip=true;
                }
            }
        }
    }

    private void swap(Producto productos[], int startposswap) {
        Producto aux = productos[startposswap-1];
        productos[startposswap-1] = productos[startposswap];
        productos[startposswap]=aux;
    }

    private boolean comparator(Producto productos[], int startpos, int field,boolean inverse) {
        boolean resEval = false;
        switch(field) {
        case NOMBRE:
            resEval = productos[startpos-1].getCostoProduccion() > productos[startpos].getCostoProduccion();
            break;
        }
        return inverse? !resEval : resEval;
    }

    private String printArray(Producto[] objs) {
        String res = "";
        for(Producto obj:objs ) {
            if(obj==null)continue;
            res+=obj.toString()+'\n';
        }
        return res;
    }

}
