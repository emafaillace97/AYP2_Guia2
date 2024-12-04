package ejercicio2;

public class Cheque {

    private double monto;
    private String titular;

    public Cheque(String titular, double monto) {
        this.titular = titular;
        this.monto = monto;
    }

    public String toString() {
        return String.format("Titular: %s - Monto: $%d", this.titular, this.monto);
    }

}
