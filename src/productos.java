public class productos {
    public String color;
    public int id;
    public String nombre;
    public double precio;
    public String talle;
    public int stock;


    //constructores
    public productos() {
    }

    public productos(String color, int id, String nombre, double precio, String talle, int stock) {
        this.color = color;
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.talle = talle;
        this.stock = stock;;
    }
    //constructores




    //getters y setters//
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}




