package org.example;

import java.util.Scanner;

public class Gradusnick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp > 24) System.out.println("жара");
        else if (temp > 0 && 25 > temp) System.out.println("тепло");
        else if (temp > -1 && temp < 10) {
            System.out.println("прохладно");
        } else if (temp > -26 && temp < 0) System.out.println("холодно");
        else {
            System.out.println("жутко холодно");
        }
    }
}
