package entities;

public class Aluno {
    public String name;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;


    public double notaFinal () {
        return primeiraNota + segundaNota + terceiraNota;
    }


}
