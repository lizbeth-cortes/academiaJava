package empleado.tiposEmpleados;
import empleado.Empleado;

/**
 * Clase que representa a un empleado de tipo asalariado. 
 * Esta clase extiende la clase Empleado y proporciona la 
 * implementación de métodos heredados para calcular el salario, asignar
 * bonos y vacaciones basados en la antigüedad del empleado.
 */

public class EmpleadoAsalariado extends Empleado {
    //* Atributos de la clase */
    private float salarioBase;
    private int antiguedadAnios;

    /**
     * Constructor para crear un nuevo empleado asalariado
     */
    public EmpleadoAsalariado(String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
            String telefono, String puesto, float salarioBase, int antiguedadAnios) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, telefono, puesto);
        this.salarioBase = salarioBase;
        this.antiguedadAnios = antiguedadAnios;
    }

    /* 
     * Se proporcionan métodos para acceder y modificar los atributos.
    */
    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAntiguedadAnios() {
        return antiguedadAnios;
    }

    public void setAntiguedadAnios(int antiguedadAnios) {
        this.antiguedadAnios = antiguedadAnios;
    }

    /**
     * El método aignarBonos() calcula el porcentaje de 
     * bono basado en la antigüedad del empleado
     */
    @Override
    public float asignarBonos() {
        float bono = 0.0f;
        if (antiguedadAnios <= 3) {
            bono = 0.05f; // 5% si la antigüedad es de 3 años o menos.
        } else if (antiguedadAnios <= 6) {
            bono = 0.10f; //10% si la antigüedad está entre 4 y 6 años.
        } else {
            bono = 0.15f; //15% si la antigüedad es mayor de 6 años.
        }
        return bono;
    }

    /**
     * El método asignarVacaciones() asigna y muestra los días de 
     * vacaciones del empleado basado en los años de antigüedad.
     */
    @Override
    public void asignarVacaciones() {
        int diasVacaciones;
        if (antiguedadAnios <= 3) {
            diasVacaciones = 6; //6 días si la antigüedad es de 3 años o menos.
        } else if (antiguedadAnios <= 6) {
            diasVacaciones = 12; //12 días si la antigüedad está entre 4 y 6 años.
        } else {
            diasVacaciones = 15; //15 días si la antigüedad es mayor de 6 años.
        }
        System.out.println("Tiene " + diasVacaciones + " días de vacaciones.");
    }

    /**
     * El método calcularSalario() calcula y muestra el salario 
     * mensual del empleado.
     */
    @Override
    public void calcularSalario() {
        float salarioTotal = asignarBonos() * salarioBase + salarioBase;
        System.out.println("Salario mensual de: $" + salarioTotal);
    }
}
