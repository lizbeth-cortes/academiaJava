
public class Principal {
    public static void main(String[] args) throws Exception {
        Productos p1 = new Productos("Sombrero",220.50);
        Productos p2 = new Productos("Gorra",150.2);
        Productos p3 = new Productos("Playera",130.50);
        Productos p4 = new Productos("Pantalón",499.80);
        Productos p5 = new Productos("Sandalias",450);

        CarritoCompra carrito = CarritoCompra.obtenerCarrito();
        CarritoCompra carrito1 = CarritoCompra.obtenerCarrito();

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito1.agregarProducto(p3);

        carrito1.verCarrito();

        carrito.eliminarProducto(p2);

        carrito1.verCarrito();

        carrito.comprarCarrito();

        carrito1.verCarrito();    

        carrito1.agregarProducto(p4);
        carrito1.agregarProducto(p5);
        carrito.verCarrito();    
    }
}
