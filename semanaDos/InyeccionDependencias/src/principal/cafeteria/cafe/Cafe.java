package principal.cafeteria.cafe;

import principal.cafeteria.cafe.tipos.TipoCafe;
import principal.cafeteria.cafe.tipos.TipoLeche;

/*
 * Esta clase abstracta representa los 4 diferentes tipos
 *  de café junto con los tipos de leche.
 */
public abstract class Cafe {
    private TipoCafe tipoCafe; // Tipo de café 
    private double precio; // Precio del café
    private TipoLeche tipoLeche; // Tipo de leche 

    /**
     * 
     * En el primer constructor se crea un café con los
     * parámetros del tipo de café, el precio y el tipo de leche especificados.
     * Este constructor es útil para los tipos de café que contienen leche.
     */
    public Cafe(TipoCafe tipoCafe, double precio, TipoLeche tipoLeche) {
        this.tipoCafe = tipoCafe;
        this.precio = precio;
        this.tipoLeche = tipoLeche;
    }


    /**
     * 
     * Se realiza una sobrecarga del constructor para poder crear un café con los
     * parámetros del tipo de café y el precio
     * Este constructor es útil para los tipos de café que no contienen leche, 
     * ya que tipoLeche se inicializa con null 
     */
    public Cafe(TipoCafe tipoCafe, double precio) {
        this(tipoCafe, precio, null); 
    }

    /**
     * Se devuelve el tipo de café.
     */
    public TipoCafe getTipo() {
        return tipoCafe;
    }

    /**
     * Se devuelve el precio del café.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Se devuelve el tipo de leche, si se ha especificado.e.
     */
    public TipoLeche getTipoLeche() {
        return tipoLeche;
    }

    /**
     * Se devuelve una cadena que indica el tipo de leche. 
     * Si no hay un tipo deleche, devuelve "No contiene leche".
     */
    public String obtenerNombreTipoLeche() {
        if (getTipoLeche() != null) {
            // Obtiene el nombre del tipo de leche y lo convierte a minúsculas, omitiendo la parte "LECHE_"
            String tipo = getTipoLeche().name().substring(6).toLowerCase();
            return "\nTipo de leche: " + tipo;
        } else {
            return "\nNo contiene leche";
        }
    }

    /**
     * Se devuelve una cadena que representa la información del café,
     * incluyendo el tipo de café, el precio total y el tipo de leche.
     */
    @Override
    public String toString() {
        return "Café: " + getTipo().name().toLowerCase()
            + "\nPrecio: $" + calcularTotal() + obtenerNombreTipoLeche();
    }

    /**
     * Se calcula el precio total del café. 
     * Este método será implementado por las subclases 
     * para definir cómo se calcula el total.
     */
    public abstract double calcularTotal();
}
