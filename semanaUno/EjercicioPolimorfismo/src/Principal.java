import java.util.ArrayList;

import empleado.*;
import empleado.tiposEmpleados.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        // Se crea una lista de empleados donde se almacenará todos los empleados
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        // Se crea empleados asalariados 
        Empleado e1 = new EmpleadoAsalariado("Juan", "Pérez", "Hernandez", 27, "5567664532", "Abogado", 15000, 3);
        Empleado e2 = new EmpleadoAsalariado("Luis", "Martínez", "Ramírez", 45, "5561234567", "Ingeniero", 20000, 5);

        // Se crea empleados con comisión 
        Empleado e3 = new EmpleadoConComision("Erick", "Durán", "Guerra", 34, "5768668573", "Vendedor", 70, 0.6f);
        Empleado e4 = new EmpleadoConComision("Laura", "Jiménez", "Torres", 29, "5761234567", "Agente de ventas", 151, 0.5f);

        // Se crea empleados por horas
        Empleado e5 = new EmpleadoPorHoras("Diana", "Méndez", "Villanueva", 25, "5898665673", "Diseñadora web", 800, 60, true);
        Empleado e6 = new EmpleadoPorHoras("María", "López", "Martínez", 28, "5891234567", "Programadora", 300, 80, false);

        // Añade todos los empleados a la lista.
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);
        listaEmpleados.add(e6);
        
        // Recorre la lista de empleados, muestra información, calcula salario y asigna vacaciones.
        for (Empleado e : listaEmpleados) {
            System.out.println(e); // Muestra la representación en cadena del empleado.
            e.calcularSalario();  
            e.asignarVacaciones();
        }
    }
}
