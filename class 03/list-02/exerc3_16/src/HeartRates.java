import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public HeartRates(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    public int getMaxHeartRate() {
        int age = getAge();
        return 220 - age;
    }

    public String getTargetHeartRate() {
        int maxHeartRate = getMaxHeartRate();
        int lowerTarget = (int) (maxHeartRate * 0.5);
        int upperTarget = (int) (maxHeartRate * 0.85);
        return lowerTarget + " - " + upperTarget;
    }
}
