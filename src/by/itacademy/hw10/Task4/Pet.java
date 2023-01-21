package by.itacademy.hw10.Task4;


public abstract class Pet implements Comparable<Pet> {
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    private String nickname;
    private int age;
    private double price;

    public Pet(String nickname, int age, double price) {
        this.nickname = nickname;
        this.age = age;
        this.price = price;
    }

    @Override
    public int compareTo(Pet o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return "Pet{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

}
