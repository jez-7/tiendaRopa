import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class GUI extends JFrame {
    public JTextField direccionTextField;
    public JTextField correoTextField;
    public JTextField nombreTextField;
    public JButton enviarButton;
    private JLabel nombreLabel;
    private JLabel correoLabel;
    private JLabel direccionLabel;
    private JPanel panelMain;
    private JTextArea catalogoTextArea;
    private boolean continuar = true;

    private tiendaOnline tienda = new tiendaOnline();


    public GUI() {
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Se obtienen los datos ingresados por el usuario
                String nombre = nombreTextField.getText();
                String direccion = direccionTextField.getText();
                String correo = correoTextField.getText();

                // Crea una instancia de Cliente con los datos ingresados
                Cliente cliente = new Cliente(nombre, direccion, correo);

                // Realiza un pedido utilizando la instancia de Cliente
                realizarPedido(cliente);
            }
        });
        catalogoTextArea.setVisible(false);
    }

    private void realizarPedido(Cliente cliente) {
        cliente.realizarPedido(this);
        Stock stock = new Stock();


        // Mostrar el catálogo en el JTextArea
        mostrarCatalogo();

        while (continuar) {

            Pedido pedido = new Pedido(cliente);


            pedido.agregarProductos(tienda, stock);


            // Actualizar el catálogo en el JTextArea después de cada pedido
            mostrarCatalogo();

            continuar = preguntarContinuar();
        }
    }


    public void mostrarCatalogo() {

        String catalogoInfo = tienda.mostrarCatalogo();

        // Muestra el catálogo en el JTextArea
        catalogoTextArea.setText(catalogoInfo);
        catalogoTextArea.setVisible(true);
    }

    public boolean preguntarContinuar() {
        int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Desea realizar otra compra?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {
            return true;
        } else {
            // Si selecciona "No" o cierra el cuadro de diálogo, salir del programa
            JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestra tienda. Hasta luego");
            System.exit(0);
            return false;
        }
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setContentPane(gui.panelMain);
        gui.setTitle("Tienda Online");
        gui.setSize(600, 450);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setBounds(600, 200, 800, 600);
    }
}
