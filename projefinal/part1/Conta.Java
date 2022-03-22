abstract class Conta {
    private int numero, saldo ;
    


    public Conta(int numero, int saldo){
        this.numero = numero;
        this.saldo = saldo;
    }


    public void mostrarDados(){
        System.out.println(numero + " " + saldo);

    }

    public int deposita(double valorDeposito){
        this.saldo + = valorDeposito;
        return saldo;

    }

    public int saque(double valorSaque){
        return this.saldo- = valorSaque;
    }


    public int getSaldo() {
        return saldo;
    }
    
    public int getNumero() {
        return numero;
    }

}