package part1.main;


import java.util.Scanner;

import part1.modelo.ContaCorren;
import part1.modelo.ContaEspec;
import part1.util.Conta;
import part1.util.GerenciaConta;

public class AppConta {
 
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        GerenciaConta contas = new GerenciaConta();
        int opcao = 0;
        int numero;
        double saldo;
        String entradaDigitada;
        Conta c;

        

        while (opcao!=4){
           System.out.println("Vamos Começar");
           System.out.println(" 1 . Criar Conta Corrente ");
           System.out.println(" 2 . Criar Conta Especial ");
           System.out.println(" 3 . Consultar Conta Cadastrada ");
           System.out.println(" 5 . Depositar "); 
           System.out.println(" 6 . Sacar "); 
           System.out.println(" 5 . Encerrar a Operação "); 
        
        
        
        entradaDigitada = teclado.nextLine();
        opcao = Integer.parseInt(entradaDigitada);

        double valor;
        int conta;
        switch(opcao){

        case 1:
        System.out.println("Digite o número da sua conta ");
         entradaDigitada = teclado.nextLine();
         numero = Integer.parseInt(entradaDigitada);

        System.out.println("Digite o Saldo da sua Conta");
         entradaDigitada = teclado.nextLine();   
         saldo = Integer.parseInt(entradaDigitada);

        c = new ContaCorren(numero, saldo);
        contas.adicionar(c);    
                break;
        
        case 2:
        System.out.println("Digite o número da sua conta ");
         entradaDigitada = teclado.nextLine();
         numero = Integer.parseInt(entradaDigitada);

        System.out.println("Digite o Saldo da sua Conta");
         entradaDigitada = teclado.nextLine();   
         saldo = Integer.parseInt(entradaDigitada);

        c = new ContaEspec(numero, saldo);
        contas.adicionar(c);    
                break;

        case 3:
        System.out.println("Digite o Numero de Busca da  Conta");
         entradaDigitada = teclado.nextLine();
         numero = Integer.parseInt(entradaDigitada);
         System.out.println(contas.exibir(numero));
         
        case 4:
         System.out.println("Digite o valor do Deposito");
         valor = teclado.nextDouble();
         System.out.println("Digite o numero da conta");
         conta = teclado.nextInt();
         contas.deposita(conta, valor);
         break;

        case 5:
        System.out.println("Digite o valor do Saque");
        valor = teclado.nextDouble();
        System.out.println("Digite a conta a ser Debitada");
        conta = teclado.nextInt();
        contas.deposita(conta,valor);
        break;    

        case 6:
        System.out.println("Operação Finalizada");
        break;

        default:
        System.out.println("Opção Incorreta");
        break; 
        
            }
        
        }

        teclado.close();

    }

} 