package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio1Modulo2 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<String, String>();

        boolean chave = true;
        int menu = 0;

        while (chave == true) {
            //Fazendo o menu
            System.out.println("--- Olá,vamos iniciar nosso cadastro! ---");
            System.out.println("Digite 1 para prosseguir no cadastro, 2 para sair e 3 se deseja excluir funcionario cadastrado.");
            menu = leitor.nextInt();
            leitor.nextLine();

            switch (menu) {
                //fazendo lista de perguntas
                case 1:
                    System.out.println("Para cadastrar um funcionário digite seu nome: ");
                    String nome = leitor.nextLine();
                    System.out.println("CPF: ");
                    String cpf = leitor.nextLine();
                    System.out.println("Telefone: ");
                    String telefone = leitor.nextLine();
                    System.out.println("E-mail : ");
                    String email = leitor.nextLine();

                    //Printando informações da lista na tela
                    funcionarios.put(cpf,"\n Nome: " + nome + "\n Telefone: " + telefone + "\n e-mail: " + email);
                    System.out.print("Funcionário cadastrado \n");
                    System.out.println(funcionarios);
                    System.out.println("Processo finalizado com sucesso!");
                    break;
                case 2:
                    chave = false;
                    System.out.println("Você saiu do sistema de cadastro");
                    break;
                case 3 :
                    System.out.println("Digite o número do CPF para excluir funcionario: ");
                    String exclusao = leitor.nextLine();
                default:
                    System.out.println("Digite um valor valido!");
                    break;
            }
        }
    }
}
