package principal.cafeteria.cafe.tipos;

import principal.cafeteria.cafe.Cafe;

/**
 * La clase Latte representa un tipo de café latte.
 * Extiende de la clase Cafe y define el precio base para el café latte.
 */
public class Latte extends Cafe {

    private static final double PRECIO_BASE = 80; // Precio base para un latte

    /**
     * Constructor que asigna el precio, cafe latte y tipo de leche
     */
    public Latte(TipoLeche tipoLeche) {
        super(TipoCafe.LATTE, PRECIO_BASE, getDefaultLeche(tipoLeche));
    }

    /**
     * Método que devuelve el tipo de leche especificado o 
     * leche entera si no se especifica.
     */
    private static TipoLeche getDefaultLeche(TipoLeche tipoLeche) {
        if (tipoLeche == null) {
            return TipoLeche.LECHE_ENTERA;
        }
        return tipoLeche;
    }

    /**
     * Calcula el total del café, añadiendo el precio de la leche.
     */
    @Override
    public double calcularTotal() {
        double total = getPrecio();
        total += getTipoLeche().getCosto();
        return total;
    }
}
