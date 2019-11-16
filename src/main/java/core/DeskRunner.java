package core;

public class DeskRunner {       //точка входа в программу
    public static void main(String[] args) {
        Desk studentDesk = new Desk ("wood", 1.75, 0.5, 0.7);
        System.out.println(studentDesk.getColor());
        System.out.println(studentDesk.toString());
//        studentDesk.color = "red";
        System.out.println(studentDesk.toString());
//        studentDesk.hashCode();

    }





}
