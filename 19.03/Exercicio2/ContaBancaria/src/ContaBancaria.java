public class ContaBancaria {
    private int saldo;

    public ContaBancaria(int saldoInicial) {
        saldo = saldoInicial;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean depositar(int valor) {
        if(valor > 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean sacar(int valor) {
        if(valor > saldo) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }


}