package principal;

import principal.cafeteria.cafe.Cafe;
import principal.cafeteria.cafe.tipos.*;

/*
 * La clase Inyector se encarga de crear diferentes tipos de café.
 */
public class Inyector {

    /*
     * Crea una instancia de Cafe basada en el tipo de café y el tipo de leche especificados.
     *
     * El parámetro tipoCafe es el tipo de café que se desea crear.
     * El parámetro tipoLeche es el tipo de leche que se desea añadir al café.
     * Se retorna una instancia del tipo de café seleccionado.
     * Se arroja un IllegalArgumentException si el tipo de café no está disponible en el menú.
     */

    /*
     * En el método crearCafe se crea una instancia de tipo café y se 
     * solicitan dos parámetros (tipoCafe, tipoLeche). Este método se 
     * usa para los tipos de café Capuchino y Latte debido a que se agrega 
     * un tipo de leche.
     */
    public static Cafe crearCafe(TipoCafe tipoCafe, TipoLeche tipoLeche) {
        switch (tipoCafe) {
            case EXPRESSO:
                return new Expresso();
            case CAPUCHINO:
                return new Capuchino(tipoLeche);
            case AMERICANO:
                return new Americano();
            case LATTE:
                return new Latte(tipoLeche);
            default:
                throw new IllegalArgumentException("El café " + tipoCafe + " no está disponible en el menú.");
        }
    }

    /*
     * Se sobrecarga el método crearCafe en caso de que el 
     * tipo de café no necesite un tipo de leche (útil para 
     * los tipos de café Expresso y Americano)
     */
    public static Cafe crearCafe(TipoCafe tipoCafe) {
        return crearCafe(tipoCafe, null);
    }
}
