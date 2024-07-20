package empleado.tiposEmpleados;
import empleado.Empleado;

public class EmpleadoPorHoras extends Empleado {
    private int numHoras;
    private float tarifaPorHora;
    private boolean asistenciaDiaria;

    public EmpleadoPorHoras(String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
        String telefono, String puesto, int numHoras, float tarifaPorHora, boolean asistenciaDiaria) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad,  telefono, puesto);
        this.numHoras = numHoras;
        this.tarifaPorHora = tarifaPorHora;
        this.asistenciaDiaria = asistenciaDiaria;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public float getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(float tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean isasistenciaDiaria() {
        return asistenciaDiaria;
    }

    public void setasistenciaDiaria(boolean asistenciaDiaria) {
        this.asistenciaDiaria = asistenciaDiaria;
    }

    @Override
    public float asignarBonos() {
        float bono = 0.0f;
        if (asistenciaDiaria) {
            bono = numHoras * tarifaPorHora * 0.02f; 
        } else{
            bono = numHoras * tarifaPorHora;
        }
        return bono;
    }

    @Override
    public void asignarVacaciones() {
        int diasVacaciones = 0;
        if (numHoras <= 500) {
            diasVacaciones = 0; // 12 días de vacaciones si trabaja 2000 o más horas al año
        } else if (numHoras <= 1000) {
            diasVacaciones = 6; // 6 días de vacaciones si trabaja entre 1000 y 1999 horas al año
        }else if (numHoras <= 2000) {
            diasVacaciones = 12; // 6 días de vacaciones si trabaja entre 1000 y 1999 horas al año
        }
        System.out.println("Tiene " + diasVacaciones + " días de vacaciones.");
    }

    @Override
    public void calcularSalario() {
        float salarioTotal = (numHoras * tarifaPorHora) + asignarBonos();
        System.out.println("Salario de: $" + salarioTotal);
    }
}
