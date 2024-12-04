package ejercicio5;

public class Futbolista extends Deportista {

    private Posicion posicion;
    private int cantGoles;

    public Futbolista(String nombre, String fechaNac, double altura, double peso, Posicion posicion) {
        super(nombre, fechaNac, altura, peso);
        this.posicion = posicion;
    }

    @Override
    public void competir() {
        this.cantGoles = (int) ((Math.random() * 5) + 1);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s - Posicion: %s - Cant. goles: %d", this.getNombre(), this.posicion.toString(), this.cantGoles);
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getCantGoles() {
        return cantGoles;
    }

}
