import javax.swing.JOptionPane;

public class Cliente {
    private String direccion;
    private String mail;
    private String nombre;

    public Cliente() {
    }

    public Cliente(String direccion, String mail, String nombre) {
        this.direccion = direccion;
        this.mail = mail;
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método
    public void realizarPedido() {
        JOptionPane.showMessageDialog(null, "Ingrese sus datos para realizar el pedido");

        this.nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        this.direccion = JOptionPane.showInputDialog("Ingrese su dirección:");
        this.mail = JOptionPane.showInputDialog("Ingrese su correo electrónico:");
    }
}




