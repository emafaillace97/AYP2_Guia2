package ejercicio2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CuentaCorriente extends Cuenta {

    private List<Cheque> chequera;

    public CuentaCorriente(String titular, String dni, double saldo) {
        super(titular, dni, saldo);
        this.chequera = new ArrayList<>();
        this.cobrarMantenimiento();
    }

    public CuentaCorriente(String titular, String dni) {
        super(titular, dni);
        this.chequera = new ArrayList<>();
        this.cobrarMantenimiento();
    }

    private void cobrarMantenimiento() {
        if (new Date().getDay() == 28) {
            this.setSaldo(this.getSaldo() * 0.95);
        }
    }

    /**
     * Se hace una transferencia a otra cuenta pero un con 3% de recargo
     *
     * @param otraCuenta destinatario
     * @param monto      menor o igual al saldo disponible de la cuenta emisoria
     */
    @Override
    public void hacerTransferencia(Cuenta otraCuenta, int monto) {
        if ((monto * 1.03) <= this.getSaldo()) {
            otraCuenta.setSaldo(otraCuenta.getSaldo() + monto);
            this.setSaldo(this.getSaldo() - (monto * 1.03));
        } else {
            System.out.println("[ERROR] Monto insufienciente para realizar una transferencia!");
        }
    }
}
