package principal.cafeteria.cafe.tipos;

/**
 * TipoCafe define los diferentes tipos de café y sus proporciones de ingredientes.
 * Cada tipo de café tiene una proporción de café, agua y leche especificada.
 */
public enum TipoCafe {
    //Café expresso: 1 parte de café, 0 partes de agua y 0 partes de leche.
    EXPRESSO(1, 0, 0),
    
    //Café americano: 1 parte de café, 2 partes de agua y 0 partes de leche.
    AMERICANO(1, 2, 0),
    
    //Café latte: 1 parte de café, 1 parte de agua y 2 partes de leche.
    LATTE(1, 1, 2),
    
    //Café capuchino: 1 parte de café, 1 parte de agua y 1 parte de leche.
    CAPUCHINO(1, 1, 1);

    private final int proporcionCafe;    // Proporción de café
    private final int proporcionAgua;    // Proporción de agua
    private final int proporcionLeche;   // Proporción de leche

     //Constructor para inicializar las proporciones de cada tipo de café.
    TipoCafe(int proporcionCafe, int proporcionAgua, int proporcionLeche) {
        this.proporcionCafe = proporcionCafe;
        this.proporcionAgua = proporcionAgua;
        this.proporcionLeche = proporcionLeche;
    }

    /**
     * Obtiene la proporción de café para este tipo de café.
     */
    public int getProporcionCafe() {
        return proporcionCafe;
    }

    /**
     * Obtiene la proporción de agua para este tipo de café.
     */
    public int getProporcionAgua() {
        return proporcionAgua;
    }

    /**
     * Obtiene la proporción de leche para este tipo de café.
     */
    public int getProporcionLeche() {
        return proporcionLeche;
    }

    /**
     * Se devuelve una descripción detallada de las proporciones de 
     * ingredientes para un tipo de café.
     */
    public String getDescripcion() {
        return String.format(
            "El café %s contiene: %d proporción(es) de café expreso (concentrado), %d proporción(es) de agua y %d proporción(es) de leche.",
            name().toLowerCase(), proporcionCafe, proporcionAgua, proporcionLeche
        );
    }
}
