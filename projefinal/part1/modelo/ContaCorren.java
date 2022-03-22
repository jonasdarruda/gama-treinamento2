package part1.modelo;

import part1.util.Conta;

public class ContaCorren extends Conta {

    public ContaCorren(int numero, double saldo) {
        super();
    }

   

    @Override

    public double saque(double valorSaque) {
        if (getSaldo() >= valorSaque) {
            super.saque(valorSaque);
        }
        return getSaldo();
    }



    private double getSaldo() {
        return 0;
    }

}
