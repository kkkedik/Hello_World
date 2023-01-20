package by.itacademy.hw7.Task4;


public class Bouquet {
    private int witherLastFlower = 0;
    private int totalCost;

    public void getBouquetColors(Flower[] bouquet) {
        for (int i = 0; i < bouquet.length; i++) {
            System.out.printf("В букете используется %s цвет\n", bouquet[i].color);
        }
    }

    public void getTotalCost(Flower[] bouquet) {
        for (int i = 0; i < bouquet.length; i++) {
            totalCost += bouquet[i].getPrice();
        }
        System.out.println("Стоимость букета: " + totalCost);
    }

    public void withDayFade(Flower[] bouquet) {
        for (int i = 0; i < bouquet.length; i++) {
            if (witherLastFlower < bouquet[i].daysFade) {
                witherLastFlower = bouquet[i].daysFade;
            }
        }
        System.out.printf("Весь букет завянет на %d день", witherLastFlower);
    }
}
