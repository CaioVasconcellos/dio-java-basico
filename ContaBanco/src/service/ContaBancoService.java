package service;

import dominio.ContaBanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ContaBancoService {

    List<ContaBanco> contasBanco = new ArrayList<>();
    Scanner SCANNER = new Scanner(System.in).useLocale(Locale.US);

    public void criarConta (){
        System.out.println("Digite seu nome: ");
        String nome = SCANNER.nextLine();
        System.out.println("Digite a agencia: ");
        String agencia = SCANNER.nextLine();
        System.out.println("Digite o numero da conta: ");
        int numero = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("Digite o saldo");
        double saldo = SCANNER.nextDouble();
        SCANNER.nextLine();
        ContaBanco conta = new ContaBanco(numero,agencia, nome, saldo);
        contasBanco.add(conta);
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome,agencia,numero,saldo);
    }
}
