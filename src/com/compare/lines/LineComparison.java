package com.compare.lines;

import java.util.Scanner;

public class LineComparison {

    private static int x1, y1, x2, y2, xValueDiff, yValueDiff;
    
    private static double findLineLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter co-ordinates for two points:");

        System.out.print("Enter x1 co-ordinate value: ");
        x1 = scanner.nextInt();

        System.out.print("Enter y1 co-ordinate value: ");
        y1 = scanner.nextInt();

        System.out.print("Enter x2 co-ordinate value: ");
        x2 = scanner.nextInt();

        System.out.print("Enter y2 co-ordinate value: ");
        y2 = scanner.nextInt();

        xValueDiff = x2 - x1;
        yValueDiff = y2 - y1;

        double lineLength = Math.sqrt(Math.pow(xValueDiff, 2) + Math.pow(yValueDiff, 2));
        System.out.println("Length of a Line: " + lineLength);
        return Math.sqrt(Math.pow(xValueDiff, 2) + Math.pow(yValueDiff, 2));

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program!");
        double line1Length = findLineLength();
        double line2Length = findLineLength();

        if (line1Length == line2Length) {
            System.out.println("Two lines are equal!");
        } else if (line1Length > line2Length) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 2 is greater than Line 1");
        }
        
        System.out.println("Length of a Line 1: " + line1Length);
        System.out.println("Length of a Line 2: " + line2Length);
        
        Integer line1 = (int)line1Length;
        Integer line2 = (int)line2Length;
        int offset = line1.compareTo(line2);
        
        System.out.println(offset);
        
        if (offset == 0)
            System.out.println("Two lines are equal in length!");
        else if (offset > 0)
            System.out.println("Line1 is greater than Line2 in length!");
        else
            System.out.println("Line2 is greater than Line1 in length!");
    }
}
