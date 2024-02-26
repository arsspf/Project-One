package org.example;

import java.util.Scanner;

public class AlisaAndCrolick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 3;
        int a = sc.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sumLeft =0;
        int sumRight = 0;
        for(int i =0; i<a; i++){
                sumLeft += arr[i][0]* arr[i][2];
                sumRight +=arr[i][1]* arr[i][2];
        }
        int sumOf = (sumLeft-sumRight)/100;
        System.out.println(sumOf);
    }
}
