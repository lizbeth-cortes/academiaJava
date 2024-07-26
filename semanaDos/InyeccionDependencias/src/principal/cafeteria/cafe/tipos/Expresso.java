package principal.cafeteria.cafe.tipos;

import principal.cafeteria.cafe.Cafe;

/**
 * La clase Expreso representa un tipo de café expresso.
 * Extiende de la clase abstracta Cafe y define el precio base para el café expresso.
 */
public class Expresso extends Cafe {

    private static final double PRECIO_BASE = 60; // Precio base 

    /**
     * Se crea una instancia de café expresso con un precio base definido.
     * El parámetro tipoLeche es null porque un expresso 
     * no contiene leche
     */
    public Expresso() {
        super(TipoCafe.EXPRESSO, PRECIO_BASE, null); 
    }

    /**
     * Se calcula el precio total del café expresso.
     * Para el café expresso, el precio total es simplemente el precio base,
     * ya que no se añade leche.
     */
    @Override
    public double calcularTotal() {
        return getPrecio();
    }
}

