package entities;

public class Account {
    private int numberAccount;
    private String name;
    private double saldo;
    public Account () {

    }
    public Account (int numeberAccount, String name) {
        this.numberAccount = numeberAccount;
        this.name = name;
    }
    public Account (int numberAccount, String name, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.name = name;
        depositAccount(initialDeposit);
    }

    public double depositAccount(double value) {
       return saldo += value;
    }

    public double withdrawAccount (double value) {
        return saldo -= value + (value * 0.06);
    }

    public String toString () {
        return "Account "
                + numberAccount
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", saldo);
    }

    public double getSaldo() {
        return saldo;
    }
    public void setName(String name) {
        this.name = name;
    }


}
