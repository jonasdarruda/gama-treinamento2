package part1.modelo;

import part1.util.Conta;

public class ContaEspec extends Conta {

    public ContaEspec(int numero, double saldo) {
        super();
    }

    double limite;

    @Override
    public double saque(double valorSaque) {
        double limiteOperacao=getSaldo()+limite;
        if(limiteOperacao>valorSaque){
            super.saque(valorSaque);

        }
        return getSaldo();
    }

    private double getSaldo() {
        return 0;
    }

}
