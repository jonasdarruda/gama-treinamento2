package part1;

public class ContaCorren extends Conta {

    public ContaCorren(int numero, int saldo) {
        super(numero, saldo);
    }

    @Override

    public int saque(double valorSaque) {
        if (getSaldo() >= valorSaque) {
            super.saque(valorSaque);
        }
        return getSaldo();
    }

}
