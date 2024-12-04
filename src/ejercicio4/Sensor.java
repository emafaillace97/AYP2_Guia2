package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private List<Integer> lecturas;

    public Sensor() {
        this.lecturas = new ArrayList<>();
    }

    public int tomarLectura() {
        int lectura = (int) ((Math.random() * 100) + 1);
        this.lecturas.add(lectura);
        return lectura;
    }

    public StringBuilder mostrarPorPantalla() throws Exception {
        if (this.lecturas.size() != 0) {
            int ultimaLectura = this.lecturas.getLast();
            return new StringBuilder("Humedad: " + ultimaLectura);
        }else{
            throw new Exception("No hay lecturas cargadas!");
        }
    }

}
