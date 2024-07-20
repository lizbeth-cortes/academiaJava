package empleado.tiposEmpleados;

import empleado.Empleado;

public class EmpleadoConComision extends Empleado {
    private int ventasRealizadas;
    private float porcentajeComision;
    private static final float SALARIO_BASE = 1200; // Atributo de salario base

    public EmpleadoConComision(String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
        String telefono, String puesto, int ventasRealizadas, float porcentajeComision) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, telefono, puesto);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public float asignarBonos() {
        // Bono basado en el número de ventas realizadas
        float bono = 0.0f;
        if (ventasRealizadas > 150) {
            bono = ventasRealizadas * porcentajeComision * 0.30f;
        } else if (ventasRealizadas > 100) {
            bono = ventasRealizadas * porcentajeComision * 0.20f;
        } else if (ventasRealizadas > 50) {
            bono = ventasRealizadas * porcentajeComision * 0.10f;
        }
        return bono;
    }

    @Override
    public void asignarVacaciones() {
        // Días de vacaciones basados en el número de ventas realizadas
        int diasVacaciones = 0;
        if (ventasRealizadas >= 100) {
            diasVacaciones = 15; // 15 días de vacaciones si realiza 100 o más ventas
        } else if (ventasRealizadas >= 50) {
            diasVacaciones = 10; // 10 días de vacaciones si realiza entre 50 y 99 ventas
        } else if (ventasRealizadas >= 20) {
            diasVacaciones = 5; // 5 días de vacaciones si realiza entre 20 y 49 ventas
        }
        System.out.println("Tiene " + diasVacaciones + " días de vacaciones.");
    }

    @Override
    public void calcularSalario() {
        // Salario basado en el salario base más las comisiones y bonos
        float salarioTotal = SALARIO_BASE + (ventasRealizadas * porcentajeComision) + asignarBonos();
        System.out.println("Salario mensual de: $" + salarioTotal);
    }
}
