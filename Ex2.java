package com.company;

import java.awt.*;
import java.util.Scanner;

public class Ex2 {
    public static void main() {
        Scanner s =new Scanner(System.in);
        Point a = new Point(s.nextInt(),s.nextInt());
    }
    public static int func1(Point a,Point b) {
        try {
            return (a.y - b.y) / (a.x - b.x);
        }catch (ArithmeticException e1){
            System.out.println("can't divide by zero");
            return -999999999;
        }catch (NullPointerException e2){
            System.out.println("please enter a valid value");
            return -999999999;
        }
    }

}
