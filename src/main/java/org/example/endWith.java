package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class endWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = separateDigits(n);
        for(int i= 0; i<list.size() ; i++){
            int count =0;
            for(int j=i ; j<list.size(); j++){
                if(list.get(i) == list.get(j)){
                    count++;
                }

            }
            System.out.print(count + " " +list.get(i) + " ");
        }

    }
    static ArrayList<Integer> separateDigits(int num) {
        ArrayList<Integer> result = new ArrayList<>();

        String numStr = Integer.toString(num);

        for (int i = 0; i < numStr.length(); i++) {
            char digitChar = numStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            result.add(digit);
        }

        return result;
    }
}
