class testPutaCola {
    public static void main(String args[]) {
        ControlProducto control = new ControlProducto();
        control.altas(new ProductoCongelado(0, "a", 2, "a", 0, 0));
        control.altas(new ProductoCongelado(0, "a", 100, "a", 0, 0));
        control.altas(new ProductoCongelado(0, "a", 22, "a", 0, 0));
        System.out.println(control.buscarPorCodigo(2).toString());
        System.out.println(control.buscarPorCodigo(100).toString());
        System.out.println(control.buscarPorCodigo(22).toString());
    }
}
