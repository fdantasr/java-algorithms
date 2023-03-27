package computer_aided_instruction;

public class Resultado{
    public void Result (int totalAnswers, int correctAnswers) {

        double percent = (double) correctAnswers / totalAnswers * 100;
        if (percent < 75) {
            System.out.println("Por favor, peça ajuda ao seu professor.");
        } else {
            System.out.println("Parabéns, você está pronto para o próximo nível!");
        }
    }
}

