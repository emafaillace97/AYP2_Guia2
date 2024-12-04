package ejercicio4;

public class SensorTemperatura extends Sensor {

    @Override
    public StringBuilder mostrarPorPantalla() throws Exception {
        return super.mostrarPorPantalla().append("°\n");
    }
}
