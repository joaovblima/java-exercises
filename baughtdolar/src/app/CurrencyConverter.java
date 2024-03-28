package app;

public class CurrencyConverter {

    public static final double TAX = 0.06;
    public static double yourDolar (double dolar, double dolarQuantity) {
        return dolar * dolarQuantity + (dolar * dolarQuantity * TAX);
    }
}
