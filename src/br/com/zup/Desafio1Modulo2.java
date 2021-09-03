package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio1Modulo2 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<String, String>();

        System.out.println("--- Olá,vamos iniciar nosso cadastro! ---");

        System.out.println("Para cadastrar um funcionário digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("CPF: ");
        String cpf = leitor.nextLine();
        System.out.println("Telefone: ");
        String telefone = leitor.nextLine();
        System.out.println("E-mail : ");
        String email = leitor.nextLine();

    }
}
