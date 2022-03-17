package exercicio01;
public class Funcionario{
    private String nome;
    private int horasTrabalhadas;
    private double valorDaHora;
    
    public Funcionario(String nome, int horasTrabalhadas, double valorDaHora){
        this.nome = nome;
        setHorasTrabalhadas(horasTrabalhadas);
        setvalorDaHora(valorDaHora);
    }

    public int getHorasTrablhadas(){
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas){
        if(horasTrabalhadas > 0){
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }
    public void setvalorDaHora(double valorDaHora) {
        if(valorDaHora > 0){
            this.valorDaHora = valorDaHora;
        }
    }

    public double calcularSalario(){
        return horasTrabalhadas * valorDaHora;
    }

    public String exibirDados(){
        return nome + ", " + horasTrabalhadas + ", " + valorDaHora;
    }
}
