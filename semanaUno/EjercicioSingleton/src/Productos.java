
//Clase para crear diferentes productos en una tienda
//Con los atributos de id, nombre del Articulo y precio 
public class Productos {
    int id;
    String nombreArticulo;
    double precio;
    static int contador;

    Productos(String nombreArticulo, double precio) {
        this.id = ++contador;
        this.nombreArticulo = nombreArticulo; 
        this.precio = precio;
    }
    public int getId() {
        return id;
    }

    public String getnombreArticulo() {
        return nombreArticulo;
    }

    public void setnombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", artículo: " + nombreArticulo + ", precio: " + precio;
    }
}
