package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee1 data:");
        System.out.print("Worked hours: ");
        int workedHours = sc.nextInt();
        System.out.print("Hourly wage: ");
        double hourlyWage = sc.nextDouble();
        Employee employee1 = new Employee(workedHours, hourlyWage);

        System.out.println();
        System.out.println("Enter employee2 data:");
        System.out.print("Worked hours: ");
        workedHours = sc.nextInt();
        System.out.print("Hourly wage: ");
        hourlyWage = sc.nextDouble();
        Employee employee2 = new Employee(workedHours, hourlyWage);

        System.out.println();
        System.out.println("Enter employee3 data:");
        System.out.print("Worked hours: ");
        workedHours = sc.nextInt();
        System.out.print("Hourly wage: ");
        hourlyWage = sc.nextDouble();
        Employee employee3 = new Employee(workedHours, hourlyWage);

        System.out.println();
        System.out.println("Gross salary employee1" + employee1);
        System.out.println("Gross salary employee1" + employee2);
        System.out.println("Gross salary employee1" + employee3);

        sc.close();
    }

}
