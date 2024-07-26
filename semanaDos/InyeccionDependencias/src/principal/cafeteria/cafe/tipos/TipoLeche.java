package principal.cafeteria.cafe.tipos;

/**
 * TipoLeche representa los diferentes tipos de leche disponibles para los cafés.
 * Cada tipo de leche tiene un precio asociado
 */
public enum TipoLeche {

    LECHE_ENTERA(5.5),
    LECHE_DESLACTOSADA(15.5),
    LECHE_ALMENDRAS(25.8);

    private double precio; // Precio del tipo de leche

    /**
     * Constructor del tipo de leche.
     */
    TipoLeche(double precio){
        this.precio = precio;
    }    

    /**
     * Obtiene el precio del tipo de leche.
     */
    public double getCosto() {
        return precio;
    }

}
