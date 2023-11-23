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

    private void quicksort(Producto[] array) {
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
}
