package by.itacademy.hw7.Task4;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower("blue", 365);
        Roze roze = new Roze("Red", 3);
        Chamomile chamomile = new Chamomile("White", 2);
        Tulip tulip = new Tulip("Yellow", 4);
        Lily lily = new Lily("Pink", 6);
        Flower[] bouquet = new Flower[4];
        bouquet[0] = chamomile;
        bouquet[1] = roze;
        bouquet[2] = tulip;
        bouquet[3] = lily;
        int witherLastFlower = 0;
        for (int i = 0; i < bouquet.length; i++) {
            System.out.printf("В букете используется %s цвет\n", bouquet[i].color);
            if (witherLastFlower < bouquet[i].daysFade) {
                witherLastFlower = bouquet[i].daysFade;
            }
        }
        System.out.printf("Весь букет завянет на %d день", witherLastFlower);
    }
}
