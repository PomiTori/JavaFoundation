package core;

public class Cake {
    private String name;
    private double price;
    private String type;
    private String flavour;


    public Cake(String name, double price, String type, String flavour) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.flavour = flavour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void whatPrice(double maxPrice) {             //исп цену, которую ввели, сравниваем с средним значением, которое установит пользователем, относительно этого результат
        if (maxPrice > price) {
            System.out.println("Покупаем тортик!");
        } else {
            System.out.println("Не берем этот торт!");
        }
    }

    public String toString() {
        return "{name: " + name + "," + " price: " + price + "," + " type: " + type + "," + " flavour: " + flavour + "}";
    }

}


//1. set get для этого тортика
//2. цена большая то покупаем тортик.
// цена маленькая то не покупаем.
//3. строковое представление.
//4. проект на гит Практика
