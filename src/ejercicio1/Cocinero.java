package ejercicio1;

public class Cocinero extends Empleado{

    public Cocinero(String dni, String fechaIngreso, int antiguedad) {
        super(dni, fechaIngreso, antiguedad);
    }

    public void prepararPlato(){
        System.out.println("Preparando platos...");
    }

    public void pelerPapas(){
        System.out.println("Pelando papas...");
    }

    public void emplatar(){
        System.out.println("Emplatando...");
    }

}
