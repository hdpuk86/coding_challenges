package main.java.SquareOfSquares;

//Task
//Given an integral number, determine if it's a square number

public class Square {
    public static boolean isSquare(int n) {
        double root = Math.sqrt(n);
        int x = (int) root;
        return Math.pow(root, 2) == Math.pow(x, 2);
    }
}
