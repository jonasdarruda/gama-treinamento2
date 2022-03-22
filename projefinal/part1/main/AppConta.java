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
           System.out.println(" 4 . Encerrar Operação "); 
        
        
        
        entradaDigitada = teclado.nextLine();
        opcao = Integer.parseInt(entradaDigitada);

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
        System.out.println("Digite o numero de busca");
         entradaDigitada = teclado.nextLine();
         numero = Integer.parseInt(entradaDigitada);
         System.out.println(contas.exibir(numero));
         
        case 4:
        System.out.println("Operação Finalizada");
        break;

        default:
        System.out.println("Opção incorreta");
        break; 
        
            }
        
        }

        teclado.close();

    }

} 