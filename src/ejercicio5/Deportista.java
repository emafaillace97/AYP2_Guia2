package ejercicio5;

public abstract class Deportista {

    private String nombre, fechaNac;
    private double altura, peso;

    public Deportista(String nombre, String fechaNac, double altura, double peso) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.altura = altura;
        this.peso = peso;
    }

    /**
     * El deportista practica su deporte
     */
    public abstract void competir();

    public String toString() {
        return String.format("Nombre: %s - Fecha de nac.: %s - Altura: %d cm - Peso: %d kg", this.nombre, this.fechaNac, this.altura, this.peso);
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }


}
