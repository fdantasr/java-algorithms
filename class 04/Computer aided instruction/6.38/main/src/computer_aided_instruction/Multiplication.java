package computer_aided_instruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class Multiplication {

    public void multiplica() {
        int tentativas = 1, wrongAnswers = 0, correctAnswers = 0, numero1 = 0, nivel = 0, numero2 = 0, resposta = 0;

        SecureRandom random = new SecureRandom();

        System.out.println("Digite o nível de dificuldade das questões (1, 2, 3 ou 4) : ");
        nivel = new Scanner(System.in).nextInt();

        while (tentativas < 4 && wrongAnswers < 4) {
            switch (nivel) {
                case 1 -> {
                    System.out.println("Você receberá perguntas de Nível 1");
                    numero1 = random.nextInt(10);
                    numero2 = random.nextInt(10);
                }
                case 2 -> {
                    System.out.println("Você receberá perguntas de Nível 2");
                    numero1 = random.nextInt(90) + 10;
                    numero2 = random.nextInt(90) + 10;
                }
                case 3 -> {
                    System.out.println("Você receberá perguntas de Nível 3");
                    numero1 = random.nextInt(900) + 100;
                    numero2 = random.nextInt(900) + 100;
                }
                case 4 -> {
                    System.out.println("Você receberá perguntas de Nível 4");
                    numero1 = random.nextInt(9000) + 1000;
                    numero2 = random.nextInt(9000) + 1000;
                }
                default -> {
                    System.out.println("Nível inválido, escolha um válido!");
                    Multiplication multi = new Multiplication();
                    multi.multiplica();
                    return;
                }
            }

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


