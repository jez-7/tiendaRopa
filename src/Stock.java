public class Stock {
    private int cantidad;
    private String producto;
    private productos productos;
    private Proveedor proveedor;


    public Stock() {
    }

    public Stock(int cantidad, String producto, productos productos, Proveedor proveedor) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.productos = productos;
        this.proveedor = proveedor;
    }


    public void aumentarStock() {
            if (proveedor.envioStock()) {
                // Lógica para aumentar el stock
                productos.stock = productos.stock + 10;
                System.out.println("Stock aumentado exitosamente. Nuevo stock: " + productos.stock);
            } else {
                System.out.println("Error: el proveedor no pudo enviar el stock.");
            }
    }
}



