import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(); //
        cliente.realizarPedido();


        System.out.println(" ");



        tiendaOnline tienda = new tiendaOnline();
        tienda.mostrarCatalogo();




        System.out.println(" ");





        Pedido pedido = new Pedido(cliente);


        pedido.agregarProductos(tienda);








    }
}


