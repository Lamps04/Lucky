import java.util.Random;
import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // Inicializa o Scanner corretamente
        Random randomizacao = new Random(); // Inicializa o objeto Random
        
        // Arte ASCII no início do jogo
        String arteASCIIInicio = 
            "██████████████████████████████████████████████████████████████████████████████████\n" +
            "█░░░░░░█████████░░░░░░██░░░░░░█░░░░░░░░░░░░░░█░░░░░░██░░░░░░░░█░░░░░░░░██░░░░░░░░█\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░░░█░░░░▄▀░░██░░▄▀░░░░█\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█████░░▄▀▄▀░░▄▀▄▀░░███\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░░░░░▄▀░░█████░░░░▄▀▄▀▄▀░░░░███\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░███████░░░░▄▀░░░░█████\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░░░░░▄▀░░█████████░░▄▀░░███████\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█████████░░▄▀░░███████\n" +
            "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░░░███████░░▄▀░░███████\n" +
            "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀░░███████░░▄▀░░███████\n" +
            "█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██░░░░░░░░███████░░░░░░███████\n" +
            "██████████████████████████████████████████████████████████████████████████████████\n";

        System.out.println(arteASCIIInicio);

        System.out.print("\nDigite seu nome completo: ");
        String nome = leitor.nextLine(); // Usa 'leitor' ao invés de 'scanner'

        boolean continuar = true;

        while (continuar) {
            int numeroDaSorte = randomizacao.nextInt(7); // Gera um número aleatório entre 0 e 6
            int tentativas = 0;
            int palpite = -1;

            System.out.println("Bem-vindo, " + nome + "! Vamos jogar o Lucky!");

            while (palpite != numeroDaSorte) {
                System.out.print("Digite seu palpite (0 a 6): "); // Ajusta o intervalo para 0 a 6
                palpite = leitor.nextInt(); // Usa 'leitor' ao invés de 'scanner'
                tentativas++;

                if (palpite < numeroDaSorte) {
                    System.out.println("Seu palpite está abaixo do número sorteado. Tente novamente!");
                } else if (palpite > numeroDaSorte) {
                    System.out.println("Seu palpite está acima do número sorteado. Tente novamente!");
                } else {
                    System.out.println("Parabéns, " + nome + "! Você acertou o número sorteado: " + numeroDaSorte);
                    System.out.println("Você tentou " + tentativas + " vezes.");
                }
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            char resposta = leitor.next().toLowerCase().charAt(0); // Usa 'leitor' ao invés de 'scanner'
            continuar = (resposta == 's');
        }

        // Arte ASCII no final do jogo
        String arteASCIIFinal = 
            "██████████████████████████████████████████████████████████████████████████████████\n" +
            "█░░░░░░█████████░░░░░░██░░░░░░█░░░░░░░░░░░░░░█░░░░░░██░░░░░░░░█░░░░░░░░██░░░░░░░░█\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░░░█░░░░▄▀░░██░░▄▀░░░░█\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█████░░▄▀▄▀░░▄▀▄▀░░███\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░░░░░▄▀░░█████░░░░▄▀▄▀▄▀░░░░███\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░███████░░░░▄▀░░░░█████\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░░░░░▄▀░░█████████░░▄▀░░███████\n" +
            "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█████████░░▄▀░░███████\n" +
            "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░░░███████░░▄▀░░███████\n" +
            "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀░░███████░░▄▀░░███████\n" +
            "█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██░░░░░░░░███████░░░░░░███████\n" +
            "██████████████████████████████████████████████████████████████████████████████████\n";
        
        System.out.println(arteASCIIFinal);
        System.out.println("Obrigado por jogar o Lucky, " + nome + "! Até a próxima!");
        leitor.close(); // Fecha o Scanner após o término do loop
    }
}
