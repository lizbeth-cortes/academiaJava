package principal.cafeteria.cafe.tipos;

import principal.cafeteria.cafe.Cafe;

/**
 * La clase Americano representa un tipo de café americano.
 * Extiende de la clase Cafe y define el precio base para el café americano.
 */
public class Americano extends Cafe {

    private static final double PRECIO_BASE = 60; // Precio base 

    /**
     * Se crea una instancia de café americano con un precio base definido.
     * El parámetro tipoLeche es null porque un americano 
     * no contiene leche
     */
    public Americano() {
        super(TipoCafe.AMERICANO, PRECIO_BASE, null); 
    }

    /**
     * Calcula el precio total del café americano.
     * Para el café americano, el precio total es simplemente el precio base
     */
    @Override
    public double calcularTotal() {
        return getPrecio();
    }
}
