import java.util.Random;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int numeroDeTentativas = 0;

        while (numeroDeTentativas < 5) {
            System.out.println("Digite um número entre 1 e 100");
            int numeroDigitado = leitor.nextInt();
            numeroDeTentativas++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número secreto com " + numeroDeTentativas + " tentativas.");
                break;
            } else if (numeroDigitado > numeroAleatorio) {
                System.out.println("O número secreto é menor que o número digitado.");
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número secreto é maior que o número digitado.");
            }

            if (numeroDeTentativas == 5) {
                System.out.println("Você perdeu! O número secreto era " + numeroAleatorio);
            }
        }
    }
}
