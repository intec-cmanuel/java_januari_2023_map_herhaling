package be.intecbrussel;

public enum Bill {
    FIVE_EURO(5),
    TEN_EURO(10),
    TWENTY_EURO(20),
    FIFTY_EURO(50),
    ONE_HUNDRED_EURO(100),
    TWO_HUNDRED_EURO(200),
    FIVE_HUNDRED_EURO(500);

    private double valueInEuro;

    Bill(double valueInEuro) {
        this.valueInEuro = valueInEuro;
    }

    public double getValueInEuro() {
        return valueInEuro;
    }
}
