package exercicio01;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Jonas",50, 100);
        Senior s = new Senior("Arruda", 20, 250, 10);
        
        System.out.println(f.exibirDados());
        System.out.println("Salario = " + f.calcularSalario());
        System.out.println(s.exibirDados());
        System.out.println("Salario = " + s.calcularSalario());
    }
    
}
