import java.util.Random;

public class Proveedor {
    private String nombre= "Julio Perez";
    private String telefono= "261332695";


    public Proveedor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Proveedor() {

    }


    public boolean envioStock() {
        Random random = new Random();
        int resultado = random.nextInt(2);

        return resultado == 1;
    }
}

