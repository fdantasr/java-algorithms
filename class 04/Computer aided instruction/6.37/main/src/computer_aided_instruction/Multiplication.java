package computer_aided_instruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class Multiplication {

    public void multiplica() {

        int tentativas = 1;
        int wrongAnswers = 0;
        int correctAnswers = 0;
        int resposta = 0;
        
        while (tentativas < 4 && wrongAnswers < 4) {
            SecureRandom random = new SecureRandom();
            int numero1 = random.nextInt(10);
            int numero2 = random.nextInt(10);

            while (resposta != numero1 * numero2 && wrongAnswers < 4) {
                System.out.println("Quanto é " + numero1 + " vezes " + numero2 + "?");
                System.out.println("Digite a resposta: ");
                resposta = new Scanner(System.in).nextInt();

                if (resposta == numero1 * numero2) {
                    int index_true = random.nextInt(4);
                    switch (index_true) {
                        case 0 -> System.out.println("Muito bom!");
                        case 1 -> System.out.println("Excelente!");
                        case 2 -> System.out.println("Bom trabalho!");
                        case 3 -> System.out.println("Mantenha um bom trabalho!");
                        default -> {
                        }
                    }

                    correctAnswers++;
                } else {
                    int index_false = random.nextInt(4);
                    switch (index_false) {
                        case 0 -> System.out.println("Não. Por favor, tente de novo.");
                        case 1 -> System.out.println("Errado. Tente mais uma vez.");
                        case 2 -> System.out.println("Não desista!");
                        case 3 -> System.out.println("Não. Continue tentando.");
                        default -> {
                        }
                    }
                    wrongAnswers++;
                }
                tentativas++;
            }
        }
        Resultado result = new Resultado();
        result.Result(tentativas, correctAnswers);
    }
}
