package ejercicio2;

public abstract class Cuenta {
    private String titular, dni;
    private double saldo;

    public Cuenta(String titular, String dni, double saldo) {
        this.titular = titular;
        this.dni = dni;
        this.saldo = saldo;
    }

    public Cuenta(String titular, String dni) {
        this.titular = titular;
        this.dni = dni;
    }

    /**
     * Se hace una transferencia a otra cuenta
     *
     * @param otraCuenta destinatario
     * @param monto      menor o igual al saldo disponible de la cuenta emisoria
     */
    public abstract void hacerTransferencia(Cuenta otraCuenta, int monto);

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return String.format("Titular: %s - DNI: %s - Saldo: $%d", this.titular, this.dni, this.saldo);
    }

}
