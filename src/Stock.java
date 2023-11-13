public class Stock {
    private int cantidad;
    private String producto;

    public void aumentarStock() {

    }

    public void reducirStock() {

    }

    public Stock(int cantidad, String producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
