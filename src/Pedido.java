import java.sql.Date;
import javax.swing.JOptionPane;

public class Pedido {

    private Date fecha;
    private String productos;
    private Cliente cliente;
    private tiendaOnline tienda;



    public Pedido(Cliente cliente) {
        this.cliente = cliente;

    }


    public String getNombreCliente() {
        return cliente != null ? cliente.getNombre() : "Cliente no especificado";
    }



    public void agregarProductos(tiendaOnline tienda) {
        try {
            String input = JOptionPane.showInputDialog("Ingrese el ID del producto que desea comprar:");
            if (input != null) {
                int idProducto = Integer.parseInt(input);

                productos productoComprado = tienda.obtenerProductoPorId(idProducto);

                if (productoComprado != null) {
                    JOptionPane.showMessageDialog(null, "Ha seleccionado el producto: " + productoComprado.getNombre());


                    double total = calcularTotal(tienda, idProducto);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
        }
    }

    public double calcularTotal(tiendaOnline tienda, int idProducto) {
        productos producto = tienda.obtenerProductoPorId(idProducto);

        if (producto != null) {
            double precioUnitario = producto.getPrecio();
            double total = precioUnitario * 0.21 + 1800 + precioUnitario;

            JOptionPane.showMessageDialog(null, "Total (incluido IVA + envío):  $" + total);

            return total;
        } else {
            JOptionPane.showMessageDialog(null, "Fallo en el calculo del pago");
            return 0.00;
        }
    }

    public void procesarPedido() {

    }







}































