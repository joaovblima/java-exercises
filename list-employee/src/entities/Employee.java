package entities;

import java.util.List;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public String toString() {
        return  id
                +", "
                + name
                +", "
                + String.format("%.2f", salary);
    }

    public void increaseSalary(Double percentage) {
        salary += salary * percentage / 100;

    }



}
