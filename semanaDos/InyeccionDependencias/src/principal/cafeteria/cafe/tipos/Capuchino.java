package principal.cafeteria.cafe.tipos;

import principal.cafeteria.cafe.Cafe;

/**
 * La clase Capuchino representa un tipo de café capuchino.
 * Extiende de la clase Cafe y define el precio base para el café capuchino.
 */
public class Capuchino extends Cafe {

    private static final double PRECIO_BASE = 90; // Precio base

    /**
     * Constructor que asigna el tipo de leche
     */
    public Capuchino(TipoLeche tipoLeche) {
        super(TipoCafe.CAPUCHINO, PRECIO_BASE, getDefaultLeche(tipoLeche));
    }

    /**
     * Método que devuelve el tipo de leche especificado o leche entera si no se especifica.
     */
    private static TipoLeche getDefaultLeche(TipoLeche tipoLeche) {
        if (tipoLeche == null) {
            return TipoLeche.LECHE_ENTERA;
        }
        return tipoLeche;
    }

    /**
     * Calcula el total del café, añadiendo el precio de la leche
     */
    @Override
    public double calcularTotal() {
        double total = getPrecio();
        total += getTipoLeche().getCosto();
        return total;
    }
}
