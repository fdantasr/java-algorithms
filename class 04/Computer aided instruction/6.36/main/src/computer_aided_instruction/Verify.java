package computer_aided_instruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class Verify {
    public void Verifica(int _result, int _numero1, int _numero2) {
        int r = 0;
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);



        while (_result != _numero1 * _numero2) {
            int index_false = random.nextInt(4);
            switch (index_false) {
                case 0 -> System.out.println("Não. Por favor, tente de novo.");
                case 1 -> System.out.println("Errado. Tente mais uma vez.");
                case 2 -> System.out.println("Não desista!");
                case 3 -> System.out.println("Não. Continue tentando.");
                default -> {
                }
            }
            System.out.printf("Quanto é %d vezes %d? ", _numero1, _numero2);
            _result = input.nextInt();
        }

        int index_true = random.nextInt(4);
        switch (index_true) {
            case 0 -> System.out.println("Muito bom!");
            case 1 -> System.out.println("Excelente!");
            case 2 -> System.out.println("Bom trabalho!");
            case 3 -> System.out.println("Mantenha um bom trabalho!");
            default -> {
            }
        }
        Multiplication multi = new Multiplication();
        multi.Multiplica(r);

    }
}

