package org.example;

import jdk.incubator.vector.Vector;

public class Algoritmes {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(serchInt(arr, -1));
    }

    public static boolean serchInt(int[] arr, int n) {
        for (int s : arr) {
            if (s == n) {
                return true;
            }
        }
        return false;
    }
}
