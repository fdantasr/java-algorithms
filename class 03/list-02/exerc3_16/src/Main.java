import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HeartRates person = new HeartRates("João", "Silva", LocalDate.of(1990, 1, 1));

        System.out.println("Nome: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Data de Nascimento: " + person.getBirthDate());
        System.out.println("Idade: " + person.getAge());
        System.out.println("Frequência Cardíaca Máxima: " + person.getMaxHeartRate());
        System.out.println("Frequência Cardíaca Alvo: " + person.getTargetHeartRate());
    }
}
