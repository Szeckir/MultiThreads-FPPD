public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria(1000);

        ThreadSacar task1 = new ThreadSacar(conta);
        ThreadDepositar task2 = new ThreadDepositar(conta);

        task1.start();
        task2.start();

        System.out.println("Saldo Final: " + conta.getSaldo());
    }
}

class ThreadSacar extends Thread {
    private ContaBancaria conta;

    public ThreadSacar(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            conta.sacar(200);
        }
    }
}

class ThreadDepositar extends Thread {
    private ContaBancaria conta;

    public ThreadDepositar(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            conta.depositar(200);
        }
    }
}

