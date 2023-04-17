package be.intecbrussel;

import java.util.EnumMap;
import java.util.Map;

public class Wallet {
    private Map<Coin, Integer> coinMap = new EnumMap<Coin, Integer>(Coin.class);
    private Map<Bill, Integer> billMap = new EnumMap<Bill, Integer>(Bill.class);

    public Wallet() {
        for (Coin coin : Coin.values()) {
            coinMap.putIfAbsent(coin, 0);
        }

        for (Bill bill : Bill.values()) {
            billMap.putIfAbsent(bill, 0);
        }
    }

    public void addCoin(Coin coin) {
        int oldAmount = coinMap.get(coin);
        coinMap.put(coin, ++oldAmount);
    }

    public void addBill(Bill bill) {
        int oldAmount = billMap.get(bill);
        billMap.replace(bill, oldAmount + 1);
    }

    public boolean removeCoin(Coin coin) {
        int oldAmount = coinMap.get(coin);
        if (oldAmount <= 0) {
            return false;
        }

        coinMap.put(coin, --oldAmount);
        return true;
    }

    public boolean removeBill(Bill bill) {
        int oldAmount = billMap.get(bill);
        int currentAmount = oldAmount-1;

        if (oldAmount <= 0) {
            return false;
        }

        billMap.put(bill, currentAmount);
        return true;
    }

    public void printWalletContent() {
        coinMap.forEach((coin, amount) -> System.out.println(coin.name() + ": " + amount));
        billMap.forEach((bill, amount) -> System.out.println(bill.name() + ": " + amount));
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "coinMap=" + coinMap +
                ", billMap=" + billMap +
                '}';
    }
}
