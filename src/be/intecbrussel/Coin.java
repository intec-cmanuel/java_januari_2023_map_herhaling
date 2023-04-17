package be.intecbrussel;

public enum Coin {
    ONE_CENT(0.01),
    TWO_CENT(0.02),
    FIVE_CENT(0.05),
    TEN_CENT(0.1),
    TWENTY_CENT(0.2),
    FIFTY_CENT(0.5),
    ONE_EURO(1),
    TWO_EURO(2);

    private double valueInEuro;

    Coin(double valueInEuro) {
        this.valueInEuro = valueInEuro;
    }

    public double getValueInEuro() {
        return valueInEuro;
    }
}
