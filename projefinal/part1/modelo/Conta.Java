package part1.main.modelo;



abstract class Conta {
    private int numero;
    private double saldo;
    


    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }


    public void mostrarDados(){
        System.out.println(numero + " " + saldo);

    }

    public double deposita(double valorDeposito){
        this.saldo + = valorDeposito;
        return saldo;

    }

    public double saque(double valorSaque){
        return this.saldo- = valorSaque;
    }


    public double getSaldo() {
        return saldo;
    }
    
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString(){
        return numero + " : " + saldo;
    }
    }
}