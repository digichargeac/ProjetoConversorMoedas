package src;

import java.util.Scanner;
import src.controller.CurrencyController;

public class Main {
    void main() {

        Scanner scanner = new Scanner(System.in);
        CurrencyController controller = new CurrencyController();

        System.out.println("===========================================");
        System.out.println("      CONVERSOR DE MOEDAS (API) ");
        System.out.println("===========================================\n");

        System.out.println("Escolha uma conversão:");
        System.out.println("1 - USD → BRL");
        System.out.println("2 - BRL → USD");
        System.out.println("3 - EUR → GBP");
        System.out.println("4 - GBP → EUR");
        System.out.println("5 - EUR → USD");
        System.out.println("6 - USD → EUR");
        System.out.print("\nDigite a opção desejada: ");

        int opcao = scanner.nextInt();

        String from = "";
        String to = "";

        switch (opcao) {
            case 1 -> { from = "USD"; to = "BRL"; }
            case 2 -> { from = "BRL"; to = "USD"; }
            case 3 -> { from = "EUR"; to = "GBP"; }
            case 4 -> { from = "GBP"; to = "EUR"; }
            case 5 -> { from = "EUR"; to = "USD"; }
            case 6 -> { from = "USD"; to = "EUR"; }
            default -> {
                System.out.println("Opção inválida! Encerrando...");
                System.exit(0);
            }
        }

        System.out.print("\nDigite o valor que deseja converter: ");
        double valor = scanner.nextDouble();

        double resultado = controller.convert(from, to, valor);

        System.out.println("\n===========================================");
        System.out.printf("RESULTADO: %.2f %s = %.2f %s\n", valor, from, resultado, to);
        System.out.println("===========================================");

        scanner.close();
    }
}
