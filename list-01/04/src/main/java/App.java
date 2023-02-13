public class App {
    public static void main(String[] args) {
        long population = 7900000000L;
        double growthRate = 0.011;
        
        System.out.println("Current world population: " + population);
        System.out.println("Annual growth rate: " + growthRate);
        
        for (int i = 1; i <= 5; i++) {
            population *= (1 + growthRate);
            System.out.println("World population in " + i + " year(s): " + (long) population);
        }
    }
}