package org.example;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static final double TWENTY_PROCENT = 0.2;
    public static final double TEN_PROCENT = 0.1;
    public static final double FIVE_PROCENT = 0.05;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите ваш доход: ");
            int income = sc.nextInt();
            inSalary(income);
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Введите корректное значение.");
        } finally {
            sc.close();
        }
    }
    public static void inSalary(int n){
        double usd10 = (double)n*TEN_PROCENT;
        double otbasyBank = (double)n*TEN_PROCENT;
        double forBrand = (double)n*FIVE_PROCENT;
        double forMommy = (double)n*TWENTY_PROCENT;

        double ostatokMyself = (double)n - usd10 - otbasyBank - forBrand - forMommy;
        System.out.println("Обязательный вклад 10%: " + usd10 +
                "\nНа жилье, отбасы банк: " + otbasyBank +
                "\nНа продукты, маме: " + forMommy +
                "\nДля дальнейших хотелок: " + forBrand + "\n");
        System.out.println("В итоге остается: " +
                "\nДля жизни: " + ostatokMyself);


    }
    public static void saveToFile(String content) {
        try {
            FileWriter writer = new FileWriter("MyFinance.txt");
            writer.write(content);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}