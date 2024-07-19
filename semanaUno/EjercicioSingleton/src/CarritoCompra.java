import java.util.ArrayList;

public class CarritoCompra {
    public String nombre;
    private static CarritoCompra cc;
    private ArrayList<Productos> listaProductos;

    private CarritoCompra() {
        listaProductos = new ArrayList<>();
    }

    public static CarritoCompra obtenerCarrito() {
        if (cc == null) {
            cc = new CarritoCompra();
            return cc;
        } else {
            return cc;
        }
    }

    public ArrayList<Productos> agregarProducto(Productos p) {
        System.out.println("Añadiendo producto al carrito: " + p.getnombreArticulo());
        listaProductos.add(p);
        return listaProductos;
    }

    public ArrayList<Productos> eliminarProducto(Productos p) {
        System.out.println("\nEliminado producto del carrito: " + p);
        listaProductos.remove(p);
        return listaProductos;
    }

    public void verCarrito() {
        System.out.println("\nArtículos en el carrito:");
        if (listaProductos.size() == 0) {
            System.out.println("No hay productos en el carrito.");
        } else {
            for (Productos p : listaProductos) {
                System.out.println(p);
            }
        }
    }

    public void comprarCarrito() {
        System.out.println("\nComprando: " + listaProductos.size() + " productos");
        listaProductos.clear();
    }

}
