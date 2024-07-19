
//Clase para crear diferentes productos en una tienda
//Con los atributos de id, nombre del Articulo y precio 

public class Productos {
    // Atributos de la clase
    int id;
    String nombreArticulo;
    double precio;
    static int contador;  // Contador estático para generar ids únicos

    Productos(String nombreArticulo, double precio) {
        this.id = ++contador;  // Incrementa el contador y asigna el nuevo id
        this.nombreArticulo = nombreArticulo; 
        this.precio = precio;
    }

    /*Se generan los getters y setters de cada atributo
     *Se sobreescribió el método toString() para obtener 
     *los datos de cada objeto
     */  
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
