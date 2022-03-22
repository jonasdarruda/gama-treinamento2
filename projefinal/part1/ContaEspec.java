package part1;

public class ContaEspec extends Conta {

    public ContaEspec(int numero, int saldo) {
        super(numero, saldo);
    }

    int limite

    @Override
    public int saque(int valorSaque) {
        int limiteOperacao=getSaldo()+limite;
        if(limiteOperacao>valorSaque){
            super.saque(valorSaque)

        };
        return getSaldo();
    }

}
