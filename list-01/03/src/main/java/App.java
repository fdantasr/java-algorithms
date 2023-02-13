
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite seu peso:");
        float pesoEmQuilogramas = scanner.nextFloat();

        System.out.printf("Digite sua altura:");
        float alturaEmMetros = scanner.nextFloat();
        scanner.close();

        float imc = pesoEmQuilogramas / (float) (Math.pow(alturaEmMetros, 2));
        // float imc = (alturaEmMetros * alturaEmMetros) / pesoEmQuilogramas;
        System.out.printf("Seu IMC é de: %f\n ", imc);
        System.out.printf("BMI VALUE\n");

        if (imc < 18.5) {
            System.out.printf("Underweight");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Normal weight");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("Overweight");
        } else if (imc >= 30) {
            System.out.printf("Obesity");
        }

    }
}
