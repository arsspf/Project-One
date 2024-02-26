package org.example;

import java.util.Scanner;

public class Chetnoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] stringArray = inputString.split(" ");
        // Создание массива чисел
        int[] numberArray = new int[stringArray.length];
        // Преобразование каждой подстроки в число и добавление в массив чисел
        for (int i = 0; i < stringArray.length; i++) {
            numberArray[i] = Integer.parseInt(stringArray[i]);
        }

        int chet =0;
        int neChet =0;
        for(int i =0; i<numberArray.length; i++){
            if(numberArray[i]%2 ==0){
                chet++;
            }else{
                neChet++;
            }
        }
        sc.close();
        if(chet == neChet){
            System.out.println("equal");
        }else if(neChet>chet){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}
