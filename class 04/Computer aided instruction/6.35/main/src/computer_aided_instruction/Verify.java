package computer_aided_instruction;

import java.util.Scanner;

public class Verify {
    public void Verifica (int _result, int _numero1, int _numero2) {
        int r  = 0;
        Scanner input = new Scanner(System.in);

        while (_result != _numero1 * _numero2) {
            System.out.println("Não. Por favor, tente de novo.");
            System.out.printf("Quanto é %d vezes %d? ", _numero1, _numero2);
            _result = input.nextInt();
        }
            System.out.println("Muito bem!");
            Multiplication multi = new Multiplication();
            multi.Multiplica(r);

    }
}

