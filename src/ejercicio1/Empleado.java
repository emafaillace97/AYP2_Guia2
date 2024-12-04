package ejercicio1;

public class Empleado {

    private String dni, fechaIngreso;
    private int antiguedad;

    public Empleado(String dni, String fechaIngreso, int antiguedad){
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.antiguedad = antiguedad;
    }

    public String toString(){
        return String.format("DNI: %s - Fecha de ingreso: %s - Antiguedad: %d años");
    }

}
