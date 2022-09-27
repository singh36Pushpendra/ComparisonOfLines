package com.compare.lines;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 co-ordinate value: ");
        int x1 = scanner.nextInt();

        System.out.print("Enter y1 co-ordinate value: ");
        int y1 = scanner.nextInt();

        System.out.print("Enter x2 co-ordinate value: ");
        int x2 = scanner.nextInt();

        System.out.print("Enter y2 co-ordinate value: ");
        int y2 = scanner.nextInt();

        int xValueDiff = x2 - x1;
        int yValueDiff = y2 - y1;

        double lineLength = Math.sqrt(Math.pow(xValueDiff, 2) + Math.pow(yValueDiff, 2));
        System.out.println("Length of a Line: " + lineLength);
    }

}
