package ejercicio2;

public class CajaDeAhorro extends Cuenta {

    public CajaDeAhorro(String titular, String dni, double saldo) {
        super(titular, dni, saldo);
    }

    public CajaDeAhorro(String titular, String dni) {
        super(titular, dni);
    }

    @Override
    public void hacerTransferencia(Cuenta otraCuenta, int monto) {
        if (monto <= this.getSaldo()) {
            otraCuenta.setSaldo(otraCuenta.getSaldo() + monto);
            this.setSaldo(this.getSaldo() - monto);
        } else {
            System.out.println("[ERROR] Monto insufienciente para realizar una transferencia!");
        }
    }

}
