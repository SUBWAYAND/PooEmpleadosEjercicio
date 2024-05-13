
package Dependencias;


public class EmpleadoMedioTiempo extends Empleado{
    
    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoMedioTiempo(String nombre, String apellido, int id, int horasTrabajadas, double salarioPorHora) {
        super(nombre, apellido, id);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }
    
    @Override
    public double calcularSalario(){
        return horasTrabajadas * salarioPorHora;
    }
    
}
