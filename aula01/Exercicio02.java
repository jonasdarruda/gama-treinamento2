
import java.util.Scanner;



public class Exercicio02 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double salario, prestacao, emprestimo;

        System.out.println("Digite o valor do salario ");
        salario = teclado.nextDouble();

        System.out.println("Digite o valor da prestação ");
        prestacao = teclado.nextDouble();

        emprestimo = salario * 0.3;

        if(prestacao <= emprestimo){
            System.out.println("Você pode receber o emprestimo ");
        } else {
            System.out.println( "Você não pode receber o emprestimo");

            
        }






        teclado.close();

    }
    
}
