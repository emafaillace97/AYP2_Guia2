package ejercicio4;

public class SensorLluvia extends Sensor {

    @Override
    public StringBuilder mostrarPorPantalla() throws Exception {
        return super.mostrarPorPantalla().append("mm\n");
    }

}
