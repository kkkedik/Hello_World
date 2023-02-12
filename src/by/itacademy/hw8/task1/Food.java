package by.itacademy.hw8.task1;

public class Food {
    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Сегодня мы приготовим: " + str);
            }
        };
        food.prepare(cookable, "Сырники");
        food.prepare(cookable, "Драники");
        food.prepare(cookable, "Борщик");
    }

    public void prepare(Cookable cookable, String str) {
        cookable.cook(str);
    }
}

