
package Dependencias;

public class EmpleadosFullTime extends Empleado {
    
    private double salarioAnual; 

    public EmpleadosFullTime(String nombre, String apellido, int id, double salarioAnual) {
        super(nombre, apellido, id);
        this.salarioAnual = salarioAnual;
    }
    
    // implementar el metodo abtracto para generar salario
    
    @Override
    
    public double calcularSalario(){
        return salarioAnual;
    }
    
    
    
}
