package ejercicio4;

public class SensorHumedad extends Sensor {

    @Override
    public StringBuilder mostrarPorPantalla() throws Exception {
        return super.mostrarPorPantalla().append("%\n");
    }

}
