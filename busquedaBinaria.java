class busquedaBinaria {
    Producto[] prods;
    busquedaBinaria(Producto[] prods) {
        this.prods = prods;
    }

    public int buscarBinariamenteentePerNombre(String nombre) {
        quickSort qs = new quickSort(prods);
        Producto productos[] = qs.arregloOrdenado();
        return BBinaria(productos, nombre);
    }
    public int buscarBinariamenteentePerCodigo(int codigo) {
        quickSort qs = new quickSort(prods);
        Producto productos[] = qs.arregloOrdenado();
        return BBinariaCodigo(productos, codigo);
    }

    private int BBinaria(Producto[] array, String busqueda) {
        if (array.length == 0)
            return -1;
        int mitad, inf = 0, sup = array.length - 1;
        do {
            mitad = (inf + sup) / 2;
            if (busqueda.compareTo(array[mitad].getNombre()) < 0)
                inf = mitad + 1;
            else
                sup = mitad - 1;
        } while (array[mitad].getNombre().compareTo(busqueda) != 0 && inf <= sup);
        if (array[mitad].getNombre().compareTo(busqueda) == 0)
            return mitad;
        else
            return -1;
    }

    private int BBinariaCodigo(Producto[] array, int busqueda) {
        if (array.length == 0)
            return -1;
        int mitad, inf = 0, sup = array.length - 1;
        do {
            mitad = (inf + sup) / 2;
            if (busqueda > array[mitad].getCodigo())
                inf = mitad + 1;
            else
                sup = mitad - 1;
        } while (array[mitad].getCodigo()!=busqueda && inf <= sup);
        if (array[mitad].getCodigo()==busqueda)
            return mitad;
        else
            return -1;
    }

}
