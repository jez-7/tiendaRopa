import java.util.HashMap;
import java.util.Map;

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

    public void mostrarCatalogo() {
        System.out.println("Catálogo de productos:");
        for (Map.Entry<Integer, productos> entry : catalogo.entrySet()) {
            productos producto = entry.getValue();
            System.out.println("ID: " + entry.getKey() + ", Nombre: " + producto.getNombre() +
                    ", Precio: $" + producto.getPrecio() + ", Stock: " + producto.getStock() +
                    ", Color: " + producto.getColor());
        }
    }

    public productos obtenerProductoPorId(int id) {
        return catalogo.get(id);
    }
}
