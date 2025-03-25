//Projeto Linguagem Orientada a Objeto de Victor Samuel.

package com.mycompany.projeto_loo;
import java.util.Scanner;
import java.util.Locale;

public class Projeto_LOO {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Deposito depositar = new Deposito();
        ContaBancaria conta = new ContaBancaria();
        ConsultarSaldo consulta = new ConsultarSaldo();
        Saque sacar = new Saque();
        
        System.out.println("Digite seu nome, Sobrenome e CPF");
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Sobrenome: ");
        String sobrenome = sc.next();
        System.out.print("CPF: ");
        String cpf = sc.next();
        
        while (true){
            System.out.println("");
            System.out.println("Escolha uma opcao para seguir: \n"
                    + "consultar. \n"
                    + "depositar. \n"
                    + "sacar. \n"
                    + "encerrar. ");
            
            String opcao = sc.next();
            if (!opcao.equals("consultar") && !opcao.equals("depositar") && !opcao.equals("sacar") && !opcao.equals("encerrar")){
                System.out.println("Opcao invalida, tente de novo.");
                continue;
            }
            if (opcao.equals("encerrar")){
                System.out.println("Obrigado por usar o sistema! Encerrando a operacao...");
                break;
            }
            
            switch(opcao){
                case "consultar":
                    consulta.consultar(conta);
                    break;
                case "depositar":
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = sc.nextDouble();
                    if (valorDeposito > 0){
                        depositar.deposiar(conta, valorDeposito);
                    }
                    else {
                        System.out.printf("Valor $%.2f e invalido\n", valorDeposito);
                    }
                    break;
                case "sacar":
                    if (conta.saldo > 0){
                        System.out.println("Digite o valor a ser sacado:");
                        double valorSaque = sc.nextDouble();
                        sacar.sacar(conta, valorSaque);
                    }
                    else {
                        System.out.printf("Saque indisponivel, voce nao possui dinheiro na conta\n");
                    }
                    break;
            }
            
            System.out.print("Deseja continuar (s/n): ");
            String x = sc.next();
            
            if (x.equals("s")){
                System.out.println("Continunado...");
                continue;
            }
            else if (x.equals("n")){
                System.out.println("Obrigado por usar o sistema! Encerrando operacao...");
                break;
            }
            else{
                System.out.println("Opcao invalida. Obrigado por usar o sistema! Encerrando operacao...");
            }
        }
        sc.close();
    }
}

class ContaBancaria{
    double saldo = 0.00;
}

class ConsultarSaldo{
    void consultar(ContaBancaria conta){
         System.out.printf("O seu saldo e de $%.2f%n", conta.saldo);
    } 
}
class Deposito{
    void deposiar(ContaBancaria conta, double valor) {
            conta.saldo += valor;
            System.out.printf("O deposito de $%.2f foi efetuado com sucesso!\n", valor);
    }
}
class Saque{
    void sacar(ContaBancaria conta, double valor){
            conta.saldo -= valor;
            System.out.printf("Seu saque de $%.2f foi efetuado com sucesso!\n", valor);
    }
}
