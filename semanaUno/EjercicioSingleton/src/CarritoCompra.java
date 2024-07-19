import java.util.ArrayList;

/**
 * Clase para representar un carrito de compras.
 */
public class CarritoCompra {
    private static CarritoCompra cc; // Instancia única del carrito de compras (Singleton)
    private ArrayList<Productos> listaProductos; // Lista de productos en el carrito

    /**
     * Constructor privado para inicializar la lista de productos.
     * Utilizado para implementar el patrón Singleton.
     */

    private CarritoCompra() {
        listaProductos = new ArrayList<>();
    }

    /**
     * Método de la clase para obtener la instancia única del carrito de compras.
     * Si no existe la instancia, la crea.
     */
    public static CarritoCompra obtenerCarrito() {
        if (cc == null) {
            cc = new CarritoCompra();
            return cc;
        } else {
            return cc;
        }
    }

    //* Añade un producto al carrito de compras.
    public void agregarProducto(Productos p) {
        System.out.println("Añadiendo producto al carrito: " + p.getnombreArticulo());
        listaProductos.add(p);
    }

    //* Elimina un producto del carrito de compras.
    public void eliminarProducto(Productos p) {
        System.out.println("\nEliminado producto del carrito: " + p);
        listaProductos.remove(p);
    }

    //*  Muestra el precio total de la lista
    public void precioTotal() {
        double total = 0;
        for (Productos pd: listaProductos) {
            total += pd.getPrecio();
        }
        System.out.println("Precio total: $"+ total);
    }

    //* Muestra los productos actualmente en el carrito de compras y el precio total*/
    public void verCarrito() {
        System.out.println("\nArtículos en el carrito:");
        if (listaProductos.size() == 0) {
            System.out.println("No hay productos en el carrito.\n");
        } else {
            for (Productos p : listaProductos) {
                System.out.println(p);
            }
            precioTotal();
        }
    }

    //* Realiza la compra de todos los productos en el carrito y limpia la lista.
    public void comprarCarrito() {
        System.out.println("\nComprando: " + listaProductos.size() + " productos");
        precioTotal();
        listaProductos.clear();
    }

}
