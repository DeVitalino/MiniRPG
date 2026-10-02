package rpg;

import java.util.Scanner;

public class TelaInicial {

    private static final String NOME_JOGO = "NOME DO RPG";
    private final Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        boolean rodando = true;

        while (rodando) {
            exibirMenu();

            switch (lerOpcao("Escolha uma opção: ")) {
                case 1 -> novoJogo();
                case 2 -> continuar();
                case 3 -> comoJogar();
                case 4 -> creditos();
                case 0 -> rodando = false;
                default -> System.out.println("\nOpção inválida. Tente novamente.");
            }
        }

        System.out.println("\nAté a próxima, aventureiro!");
    }

    private void exibirMenu() {
        System.out.println();
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║                                       ║");
        System.out.printf( "║  %-37s║%n", "  " + NOME_JOGO);
        System.out.println("║                                       ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║   1 - Novo Jogo                       ║");
        System.out.println("║   2 - Continuar                       ║");
        System.out.println("║   3 - Como Jogar                      ║");
        System.out.println("║   4 - Créditos                        ║");
        System.out.println("║   0 - Sair                            ║");
        System.out.println("╚═══════════════════════════════════════╝");
    }


    private void novoJogo() {
        System.out.println("\nNovo Jogo (a construir)");
    }

    private void continuar() {
        System.out.println("\nContinuar (a construir)");
    }

    private void comoJogar() {
        System.out.println("\n=== COMO JOGAR ===");
        System.out.println("(a escrever)");
        pausar();
    }

    private void creditos() {
        System.out.println("\n=== CRÉDITOS ===");
        System.out.println("Criado por: Mateus Vitalino");
        pausar();
    }


    private int lerOpcao(String mensagem) {
        System.out.print(mensagem);
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void pausar() {
        System.out.print("\nPressione ENTER para continuar...");
        scanner.nextLine();
    }
}