// Modificación en la clase tiendaOnline
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class tiendaOnline {
    private String link = "www.tiendaonline.com";
    private String nombre = "Tienda Online";
    private Map<Integer, productos> catalogo;

    public tiendaOnline() {
        this.catalogo = new HashMap<>();
        catalogo.put(1, new productos("Negro", 1, "Remera Basic", 7800, "XL", 5));
        catalogo.put(2, new productos("Gris", 2, "Pantalón Cargo", 12480, "L", 10));
        catalogo.put(3, new productos("Verde", 3, "Zapatillas Vans", 28670, "43", 6));
    }

    public String mostrarCatalogo() {
        // Se crea una cadena con la información del catálogo
        StringBuilder catalogoInfo = new StringBuilder("Catálogo de productos:\n");
        for (Map.Entry<Integer, productos> entry : catalogo.entrySet()) {
            productos producto = entry.getValue();
            catalogoInfo.append("ID: ").append(entry.getKey()).append(", Nombre: ").append(producto.getNombre())
                    .append(", Precio: $").append(producto.getPrecio()).append(", Stock: ").append(producto.getStock())
                    .append(", Color: ").append(producto.getColor()).append("\n");
        }

        return catalogoInfo.toString();
    }



    public productos obtenerProductoPorId(int id) {
        productos producto = catalogo.get(id);
        if (producto != null) {
            return producto;
        } else {
            JOptionPane.showMessageDialog(null, "Error: No hay un producto con esa id");
            return null;
        }
    }



    public Map<Integer, productos> getCatalogo() {
        return catalogo;
    }
}
