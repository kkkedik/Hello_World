package by.itacademy.hw7.Task4;

public class Main {
    public static void main(String[] args) {
        Roze roze = new Roze("Red", 3);
        Chamomile chamomile = new Chamomile("White", 2);
        Tulip tulip = new Tulip("Yellow", 4);
        Lily lily = new Lily("Pink", 6);
        Flower[] bouquet = new Flower[4];
        bouquet[0] = chamomile;
        bouquet[1] = roze;
        bouquet[2] = tulip;
        bouquet[3] = lily;
        Bouquet bouquet1 = new Bouquet();
        bouquet1.getBouquetColors(bouquet);
        bouquet1.withDayFade(bouquet);
        bouquet1.getTotalCost(bouquet);
    }
}
