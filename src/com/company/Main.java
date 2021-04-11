package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle sq = new Rectangle(5);
        Rectangle req = new Rectangle(3, 5);
        Rectangle req2 = new Rectangle(4, 5);

        System.out.println(sq.calculateArea());
        System.out.println(req.calculateArea());
        System.out.println(req2.calculateArea());
        System.out.println("---------------");
        sq.printArea();
        req.printArea();
        req2.printArea();
        System.out.println("---------------");
        sq.printRectangleKind();
        req.printRectangleKind();
        req2.printRectangleKind();
        System.out.println("---------------");

        if (req.isTheSameRectangle(sq)==true){
            System.out.println("true");
        }else System.out.println("false");
      }
}
