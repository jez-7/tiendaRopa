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


    /*public void aumentarStock() {
            if (proveedor.envioStock()) {
                // Lógica para aumentar el stock
                productos.stock = productos.stock + 10;
                System.out.println("Stock aumentado exitosamente. Nuevo stock: " + productos.stock);
            } else {
                System.out.println("Error: el proveedor no pudo enviar el stock.");
            }
    }*/

    public void reducirStock(tiendaOnline tienda, int idProducto) {
        productos producto = tienda.obtenerProductoPorId(idProducto);

        if (producto != null) {
            int stockActual = producto.getStock();

            if (stockActual > 0) {
                producto.setStock(stockActual - 1);
                System.out.println("Stock reducido para el producto con ID " + idProducto);
            } else {
                System.out.println("Error: Stock insuficiente para el producto con ID " + idProducto);
            }
        } else {
            System.out.println("Error: Producto no encontrado con ID " + idProducto);
        }
    }










}







