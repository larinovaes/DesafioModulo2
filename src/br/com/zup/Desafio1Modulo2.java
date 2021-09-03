package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio1Modulo2 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<String, String>();

        System.out.println("--- Olá,vamos iniciar nosso cadastro! ---");
        //fazendo lista de perguntas
        System.out.println("Para cadastrar um funcionário digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("CPF: ");
        String cpf = leitor.nextLine();
        System.out.println("Telefone: ");
        String telefone = leitor.nextLine();
        System.out.println("E-mail : ");
        String email = leitor.nextLine();

        //Printando informações da lista na tela
        funcionarios.put(cpf, " Nome: " + nome + " Telefone: " + telefone + " e-mail: " + email);
        System.out.println(funcionarios);
        System.out.println("Processo finalizado com sucesso!");
    }
}
