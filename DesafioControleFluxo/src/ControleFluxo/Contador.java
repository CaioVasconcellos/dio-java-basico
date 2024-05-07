package ControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int b = scanner.nextInt();

        try {
            contar(a, b);
        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public static void contar(int a, int b) throws ParametrosInvalidosException {
        int contagem = 0;

        if (a >= b) {
            throw new ParametrosInvalidosException();
        }
        for (int i = a; i < b; i++) {
            contagem++;
        }
        System.out.printf("Existe %d ocorrências%n", contagem);

    }

}
