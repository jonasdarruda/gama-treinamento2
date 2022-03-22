package part1;

public class AppConta {
    public static void main(String[] args) {

        Conta conta1 = new ContaCorrente(0, 1000);

        conta1.saque(100);
        conta1.mostrarDados();

    }
}
