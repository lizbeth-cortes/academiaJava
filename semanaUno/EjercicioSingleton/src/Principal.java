
/**
 * Clase principal para ejecutar el programa de la tienda en linea.
 */
public class Principal {
    public static void main(String[] args) throws Exception {
         // Se crean productos con sus respectivos nombres y precios
        Productos p1 = new Productos("Sombrero",220.50);
        Productos p2 = new Productos("Gorra",150.2);
        Productos p3 = new Productos("Playera",130.50);
        Productos p4 = new Productos("Pantalón",499.80);
        Productos p5 = new Productos("Sandalias",450);

        // Obtener la instancia única del carrito de compras
        // Incluso cuando se intente generar otra instancia
        // simplemente se obtendrá la unica instancia generada
        CarritoCompra carrito = CarritoCompra.obtenerCarrito();
        CarritoCompra carrito1 = CarritoCompra.obtenerCarrito();

         // Agregar productos al carrito
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito1.agregarProducto(p3);

        // Ver el contenido del carrito
        carrito1.verCarrito();

        // Eliminar un producto del carrito
        carrito.eliminarProducto(p2);

        // Ver el contenido del carrito después de la eliminación
        carrito1.verCarrito();

        // Comprar los productos en el carrito
        carrito.comprarCarrito();

        // Ver el contenido del carrito después de la compra
        carrito1.verCarrito();    

        // Agregar más productos al carrito
        carrito1.agregarProducto(p4);
        carrito1.agregarProducto(p5);

        // Ver el contenido del carrito después de agregar más productos
        carrito.verCarrito();    
    }
}
