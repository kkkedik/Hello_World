package by.itacademy.hw5.Task2;

public class Phone {
    private String number; // прописал строчным
    // т.к в наших реалиях часто пишут через +375
    private String model;
    private int weight;

    Phone() {
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }



    public String getNumber() {
        return number;
    }

    public void sendMassage(String... agr) {
        for (String x : agr) {
            System.out.println("Номер на который будет отправлено смс: " + x);
        }
    }

    public void receiveCall(String name) {
        System.out.println("Вам вонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Вам звонит: " + name + " с номера: " + number);
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.model = number;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
