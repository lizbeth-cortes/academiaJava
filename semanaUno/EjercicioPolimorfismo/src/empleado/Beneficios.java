package empleado;

/**
 * Interfaz que define los métodos relacionados con los beneficios 
 * para empleados como vacaciones y bonos
 */
public interface Beneficios {
    /**
     * Método que calcula y asigna el monto de los bonos a los empleados.
     */
    float asignarBonos();
    
    /**
     * Método que asigna las vacaciones correspondientes a los empleados.
     */
    void asignarVacaciones();
}
