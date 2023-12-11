import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {


        boolean continuar = true;

        Cliente cliente = new Cliente();



        Stock stock = new Stock();
        tiendaOnline tienda = new tiendaOnline();

        while (continuar) {
            Pedido pedido = new Pedido(cliente);

            tienda.mostrarCatalogo();
            pedido.agregarProductos(tienda, stock);



            continuar = preguntarContinuar();
        }
    }

    private static boolean preguntarContinuar() {
        int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Desea realizar otra compra?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        return opcion == JOptionPane.YES_OPTION;
    }
}


