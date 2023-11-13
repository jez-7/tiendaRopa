import java.sql.Date;

public class Pedido {
    private String cliente;
    private Date fecha;
    private int edad;
    private String productos;

    public void agregarProductos() {

    }
    public void procesarPedido() {

    }
    public double calcularTotal() {
        return 0;
    }

    public Pedido(String cliente, Date fecha, int edad, String productos) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.edad = edad;
        this.productos = productos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
}









