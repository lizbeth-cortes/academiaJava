package principal;

import principal.cafeteria.Cliente;
import principal.cafeteria.cafe.Cafe;
import principal.cafeteria.cafe.tipos.*;

public class Principal {
    public static void main(String[] args) {

        /*
        * Hay 4 tipos de café (Expresso, Americano, Latte y Capuchino)
        * Hay 3 tipos de leche (Entera, Deslactosada y de Almendras) 
        * El tipo de leche sólo se pueden añadir en los tipos de café
        * Latte y Capuchino.
        */

        //*  Se crea un cliente con café Expresso */
        Cafe cafe0 = Inyector.crearCafe(TipoCafe.EXPRESSO);
        Cliente cliente0 = new Cliente("Juan", cafe0);
        cliente0.mostrarInfo();

        /*
         * Se crea un cliente con café Expresso y tipo de leche
         * Deslactosada, pero por definición un café Expresso es sólo
         * concentrado de café. Por eso, aunque se defina un tipo de leche
         * ese valor no se toma en cuenta.
         */
        Cafe cafe1 = Inyector.crearCafe(TipoCafe.EXPRESSO, TipoLeche.LECHE_DESLACTOSADA);
        Cliente cliente1 = new Cliente("Juan", cafe1);
        cliente1.mostrarInfo();

        //* Se crea un cliente con café Capuchino y leche de Almendras */
        Cafe cafe2 = Inyector.crearCafe(TipoCafe.CAPUCHINO, TipoLeche.LECHE_ALMENDRAS);
        Cliente cliente2 = new Cliente("Adriana", cafe2);
        cliente2.mostrarInfo();
        
        /*
         *  En los tipos de café Capuchino y Latte si no se agrega un tipo
         * de leche se agrega por default leche entera
         */
        Cafe cafe3 = Inyector.crearCafe(TipoCafe.CAPUCHINO);
        Cliente cliente3 = new Cliente("Alejandra", cafe3);
        cliente3.mostrarInfo();

        Cafe cafe4 = Inyector.crearCafe(TipoCafe.LATTE,TipoLeche.LECHE_DESLACTOSADA);
        Cliente cliente4 = new Cliente("Raúl", cafe4);
        cliente4.mostrarInfo();
    }
}
