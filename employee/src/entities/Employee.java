package entities;

public class Employee {
    public String name;
    public double glossSalary;
    public double tax;

    public double getGlossSalary() {
        return glossSalary;
    }

    public double NetSalary() {
        return getGlossSalary() - tax;

    }
    public void IncreaseSalary (double percentage) {
        glossSalary += glossSalary * percentage/100;

    }

    public String toString() {
        return  name
                +" , "
                +"$ "
                +String.format("%.2f", NetSalary());
    }
}
