class insertMetodo {
    static final int NOMBRE = 0;
    static final int NCONTROL = 1;
    static final int CALIFICACION = 2;
    static final int CARRERA = 3;

    Producto[] prods;
    insertMetodo(Producto[] prods) {
        this.prods = prods;
    }

    public String getOrderedByNameAscendentStr() {
        IncersionMetodoPorCampo(prods, NOMBRE, false);
        return array2String(prods);
    }

    public String getOrderByNameDesendentStr() {
        IncersionMetodoPorCampo(prods, NOMBRE, true);
        return array2String(prods);
    }

    private String array2String(Producto[] objs) {
        String res="";
        for(Producto obj:objs ) {
            res += obj.toString();
        }
        return res;
    }

    private void IncersionMetodoPorCampo(Producto []array,int campo, boolean inverso) {
        int i, k, n_elementos = array.length;
        Producto aux;
        for(i=1; i<n_elementos; i++)
        {
            aux= array[i];
            k= (i-1);

            while(k>=0 && comparator(array, k,aux, campo, inverso))
            {
                array[k+1]=array[k];
                k--;
            }
            array[k+1]=aux;
        }
    }

    private boolean comparator(Producto alumnos[], int k, Producto aux, int field,boolean inverse) {
        boolean resEval = false;
        switch(field) {
        case NOMBRE:
            resEval = alumnos[k].getCodigo() > aux.getCodigo();
            break;
        }
        return inverse? !resEval : resEval;
    }

}
