package empleado;

/**
 * Clase abstracta que representa un empleado y proporciona la implementación de 
 * la interfaz Beneficios. 
 */
public abstract class Empleado implements Beneficios {
    //** Se definen los atributos comunes de un empleado */
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String telefono;
    private String puesto;
    private static int contador = 0; //* variable que contará los empleados creados */

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
        String telefono, String puesto) {
        this.id = ++contador; // se asignará el valor del contador para cada empleado
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.telefono = telefono;
        this.puesto = puesto;
    }

    /* 
     * Se proporcionan métodos para acceder y modificar los atributos.
    */
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases 
     * para calcular el salario de cada tipo de empleado.
     */
    public abstract void calcularSalario();

    /**
     * El método toString devuelve una cadena que representa al 
     * empleado con su ID, nombre completo, 
     * edad, teléfono y puesto.
     */
    @Override
    public String toString() {
        return "\nId: " + id + ", nombre: " + nombre + " " + apellidoPaterno 
        + " " + apellidoMaterno + ", edad: " + edad + ", telefono: "
        + telefono + ", puesto: " + puesto ;
    }
}
