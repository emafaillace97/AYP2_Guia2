package ejercicio4;

public class Demo {

    public static void main(String[] args){
        Sensor s1 = new SensorLluvia();
        Sensor s2 = new SensorTemperatura();
        Sensor s3 = new SensorHumedad();
        s1.tomarLectura();
        s2.tomarLectura();
        s3.tomarLectura();
        try {
            System.out.println(s1.mostrarPorPantalla());
            System.out.println(s2.mostrarPorPantalla());
            System.out.println(s3.mostrarPorPantalla());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
