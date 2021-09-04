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
            System.out.println("Digite 1 para efetuar no cadastro.");
            System.out.println("Digite 2 para exibir a lista de funcionários cadastrado.");
            System.out.println("Digite 3 para excluir funcionário.");
            System.out.println("Digite 4 para sair do programa");
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

                    System.out.println("Processo finalizado com sucesso!");
                    //Printando informações da lista na tela
                    funcionarios.put(cpf, "\n Nome: " + nome + "\n Telefone: " + telefone + "\n e-mail: " + email);
                    break;
                case 2:
                    for (String funcionariosCadastrados : funcionarios.keySet())
                        System.out.println("Funcionário: " + funcionarios.get(funcionariosCadastrados));
                    break;
                case 3:
                    System.out.println("Para excluir funcionário digite o CPF do mesmo: ");
                    String excluirCpf = leitor.nextLine();
                    for (String cpfFuncio : funcionarios.keySet()) {

                        if (cpfFuncio.equals(excluirCpf)) {
                            System.out.println("Funcionário deletado com sucesso");
                            funcionarios.remove(excluirCpf);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Você saiu do sistema de cadastro");
                    chave = false;
                    break;

                default:
                    System.out.println("Digite um valor valido!");
                    break;
            }
        }
    }
}
