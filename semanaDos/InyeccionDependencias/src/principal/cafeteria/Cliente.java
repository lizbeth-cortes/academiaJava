package principal.cafeteria;

import principal.cafeteria.cafe.Cafe;

/**
 * La clase Cliente representa a un cliente que compra un café.
 */
public class Cliente {
    private String nombre; // Nombre del cliente
    private Cafe cafe; // Café que el cliente quiere comprar

    /**
     * Crea una instancia de Cliente con el nombre y café especificados.
     */
    public Cliente(String nombre, Cafe cafe) {
        this.nombre = nombre;
        this.cafe = cafe;
    }

    /**
     * Muestra la información del cliente, incluyendo el nombre y los detalles del café.
     */
    public void mostrarInfo() {
        System.out.println("\nCliente: " + nombre); 
        // Muestra la información del café usando el método toString() de Cafe
        System.out.println(cafe); 
    }
}
