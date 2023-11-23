class quickSort {

    Producto objects[];
    quickSort(Producto objects[]) {
        this.objects = objects;
        quicksort(objects);
    }

    public String getOrderedByNameAscendentStr() {
        String res = "";
        for(Producto producto : objects) {
            res+=producto.toString()+"\n";
        }
        return res;
    }

    public String getOrderByNameDesendentStr() {
        String res = "";
        for(int i = objects.length-1; i > 0; i--) {
            res+=objects[i].toString()+"\n";
        }
        return res;
    }
    public Producto[] arregloOrdenado() {
        return objects;
    }

    public static void quicksort(Producto[] array) {
        qs(array, 0, array.length - 1);
    }

    private static void qs(Producto[] array, int limInferior, int limSuperior) {
        int izq, der;
        String mitad;
        Producto aux;
        izq = limInferior;
        der = limSuperior;
        mitad = array[(izq + der) / 2].getNombre();
        do {
            while (array[izq].getNombre().compareTo(mitad) > 0 && izq < limSuperior)
                izq++;
            while (mitad.compareTo(array[der].getNombre()) > 0 && der > limInferior)
                der--;
            if (izq <= der) {
                aux = array[izq];
                array[izq] = array[der];
                array[der] = aux;
                izq++;
                der--;
            }
        } while (izq <= der);

        if (limInferior < der)
            qs(array, limInferior, der);
        if (izq < limSuperior)
            qs(array, izq, limSuperior);
    }
    //Esta mistiherramienta nos servira mas tardesisni
    public static int BBinaria(String[] array, String busqueda) {
        if (array.length == 0)
            return -1;
        int mitad, inf = 0, sup = array.length - 1;
        do {
            mitad = (inf + sup) / 2;
            if (busqueda.compareTo(array[mitad]) < 0)
                inf = mitad + 1;
            else
                sup = mitad - 1;
        } while (array[mitad].compareTo(busqueda) != 0 && inf <= sup);
        if (array[mitad].compareTo(busqueda) == 0)
            return mitad;
        else
            return -1;
    }
}
