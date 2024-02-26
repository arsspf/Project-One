package org.example;

import java.util.Scanner;

public class LevelHappiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] num = nums.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] numbers = new int[num.length];
        for(int i =0; i<num.length; i++){
            numbers[i] = Integer.parseInt(num[i]);
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }
        double procent = ((double)min/max)*100;
        System.out.println((int) procent);
    }
}
