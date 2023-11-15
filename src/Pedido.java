import java.sql.Date;
import javax.swing.JOptionPane;

public class Pedido {

    private Date fecha;
    private String productos;
    private Cliente cliente;
    private String nombreProducto;



    public Pedido(Cliente cliente) {
        this.cliente = cliente;

    }





    public void agregarProductos(tiendaOnline tienda, Stock stock) {
        try {
            String input = JOptionPane.showInputDialog("Ingrese el ID del producto que desea comprar:");
            if (input != null) {
                int idProducto = Integer.parseInt(input);

                productos productoComprado = tienda.obtenerProductoPorId(idProducto);

                nombreProducto = productoComprado.getNombre();

                if (productoComprado != null) {
                    JOptionPane.showMessageDialog(null, "Ha seleccionado el producto: " + productoComprado.getNombre());



                    double total = calcularTotal(tienda, idProducto);
                    procesarPedido();
                    stock.reducirStock(tienda, idProducto);

                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
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
            return 0.0;
        }
    }







    public void procesarPedido() {

        String nombreCliente = cliente.getNombre();
        String direccionCliente = cliente.getDireccion();
        String mailCliente = cliente.getMail();



        String mensaje = "Compra realizada con éxito!\n"
                + " \n"
                + "Producto: " + nombreProducto + "\n"
                + "Nombre del cliente: " + nombreCliente + "\n"
                + "Dirección: " + direccionCliente + "\n"
                + "Correo electrónico: " + mailCliente;

        JOptionPane.showMessageDialog(null, mensaje);



    }







}































