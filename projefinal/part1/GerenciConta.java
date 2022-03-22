package part1;

import java.util.ArrayList;

public class GerenciConta {
    public static void main(String[] args) {
        ArrayList<Conta> gerenciamentoContas = new ArrayList<>();
    }

    ContaCorren cc1 = new ContaCorren(0, 0);
    ContaEspec ce1 = new ContaEspec(0, 0);

    gerenciamentoContas.add(cc1); gerenciamentoContas.add(ce1);

    for(Conta c:gerenciamentoContas)
    {
        System.out.println(c.getNumero());
    }

}