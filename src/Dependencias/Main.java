package Dependencias;

public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new EmpleadosFullTime("Camilo", "Cuetia", 1, 1000);
        Empleado empleado2 = new EmpleadoMedioTiempo("Juan", "Hernandez", 2, 5, 20);

        //mostrar informacion
        System.out.println("Empleado1: " + empleado1.obtenerNombreEmpleado() + ", Salario: $" + empleado1.calcularSalario());
        System.out.println("Empleado2: " + empleado2.obtenerNombreEmpleado() + ", Salario: $" + empleado2.calcularSalario());

    }
}
