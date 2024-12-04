package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Velocista extends Deportista {

    private List<Double> marcas;
    private double mejorMarca;
    private Carrera tipoCarrera;

    public Velocista(String nombre, String fechaNac, double altura, double peso, Carrera tipoCarrera) {
        super(nombre, fechaNac, altura, peso);
        this.marcas = new ArrayList<>();
        this.tipoCarrera = tipoCarrera;
    }

    @Override
    public void competir() {
        double marca = ((Math.random() * 20) + 1);
        this.marcas.add(marca);
    }

    private void actualizarMejorMarca() {
        if (!this.marcas.isEmpty()) {
            double minMarca = this.marcas.get(0);
            for (int i = 1; i < this.marcas.size(); i++) {
                if (this.marcas.get(i) < minMarca) {
                    minMarca = this.marcas.get(i);
                }
            }
            this.mejorMarca = minMarca;
        } else {
            this.mejorMarca = 0.0;
        }
    }

    @Override
    public String toString() {
        this.actualizarMejorMarca();
        return String.format("Nombre: %s - Mejor marca: %.2f seg. - Tipo de carrera: %s", this.getNombre(), this.mejorMarca, this.tipoCarrera.toString());
    }

}
