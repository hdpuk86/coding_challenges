package main.java;

import main.java.SquareOfSquares.Square;

public class main {

    public static void main(String[] args) {
        int n = 25;
        int k = 11;
        Boolean a1 = Square.isSquare(n);
        Boolean a2 = Square.isSquare(k);
        System.out.println(a1);
        System.out.println(a2);
    }

}
