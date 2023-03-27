package computer_aided_instruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class Multiplication {

    public void Multiplica(int _result) {

        SecureRandom random = new SecureRandom();
        int numero1 = random.nextInt(10);
        int numero2 = random.nextInt(10);
        System.out.println("Quanto é " + numero1 + " vezes " + numero2 + "?");

        System.out.println("Digite a resposta: ");
        Scanner input = new Scanner(System.in);
        _result = input.nextInt();

        Verify verify = new Verify();
        verify.Verifica(_result, numero1, numero2);


    }

}
