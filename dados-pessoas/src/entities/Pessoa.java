package entities;

public class Pessoa {
    private double altura;
    private char gender;

    public Pessoa(double altura, char gender) {
        this.altura = altura;
        this.gender = gender;
    }

    public double getAltura() {
        return altura;
    }

    public char getGender() {
        return gender;
    }
}
