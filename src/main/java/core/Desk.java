package core;

public class Desk {                 //класс
    private String color;           //поля
    private String material;
    private double length;
    private double width;
    private double high;

    public Desk(String material, double length, double width, double high) {    //конструктор
        this.material = material;
        this.length = length;
        this.width = width;
        this.high = high;
        this.color = "white";
    }

    //alt+insert
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "{ color: " + color + ", material: " + material + ", length: "  + length + ", width: "
                + width + ", high: " + high + "}";

        //не нужны параметры, т.к. использует уже параметры внутри объекта
//    //вывести все значения строкой
//        // вывести объем
//        //вывести мах и мин значение из длины/ширины/высоты
//
//
    }
}
