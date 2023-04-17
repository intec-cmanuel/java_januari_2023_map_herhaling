package be.intecbrussel;

public class App {
    public static void main(String[] args) {
        Wallet mySadlyEmptyWallet = new Wallet();

        mySadlyEmptyWallet.addCoin(Coin.TWO_EURO);
        mySadlyEmptyWallet.addCoin(Coin.TWO_EURO);
        mySadlyEmptyWallet.addCoin(Coin.TWO_EURO);
        mySadlyEmptyWallet.addCoin(Coin.TWO_EURO);
        mySadlyEmptyWallet.addCoin(Coin.TWO_EURO);
        mySadlyEmptyWallet.addCoin(Coin.FIFTY_CENT);

        mySadlyEmptyWallet.addBill(Bill.FIFTY_EURO);
        mySadlyEmptyWallet.addBill(Bill.FIFTY_EURO);
        mySadlyEmptyWallet.addBill(Bill.FIFTY_EURO);
        mySadlyEmptyWallet.addBill(Bill.FIFTY_EURO);
        mySadlyEmptyWallet.addBill(Bill.FIFTY_EURO);
        mySadlyEmptyWallet.addBill(Bill.FIFTY_EURO);
        mySadlyEmptyWallet.addBill(Bill.FIFTY_EURO);
        mySadlyEmptyWallet.addBill(Bill.FIVE_EURO);
        mySadlyEmptyWallet.addBill(Bill.FIVE_EURO);

        mySadlyEmptyWallet.removeBill(Bill.FIVE_EURO);
        mySadlyEmptyWallet.removeCoin(Coin.FIFTY_CENT);
        mySadlyEmptyWallet.removeCoin(Coin.FIFTY_CENT);
        mySadlyEmptyWallet.removeCoin(Coin.FIFTY_CENT);

//        System.out.println(mySadlyEmptyWallet);
        mySadlyEmptyWallet.printWalletContent();
    }
}
