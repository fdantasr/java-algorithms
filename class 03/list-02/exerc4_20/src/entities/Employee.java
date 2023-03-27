package entities;

public class Employee {
    private int workedHours;
    private double hourlyWage;

    public Employee(int workedHours, double wageHour) {
        this.workedHours = workedHours;
        this.hourlyWage = wageHour;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public double gethourlyWage() {
        return hourlyWage;
    }

    public void sethourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double totalWage() {
        if(this.workedHours > 40)
            return (double) this.workedHours * (0.5*this.hourlyWage+this.hourlyWage);
        else
            return (double) this.hourlyWage * this.workedHours;
    }

    public String toString() {
        return String.format("%.2f\n", totalWage());
    }
}

