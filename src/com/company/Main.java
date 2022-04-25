package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfWeek;

        System.out.print("введите номер дня недели: ");
        dayOfWeek = scanner.nextInt();

        /*if (dayOfWeek == 1) {
            System.out.println("пн");
        } else if (dayOfWeek == 2) {
            System.out.println("вт");
        } else if (dayOfWeek == 3) {
            System.out.println("ср");
        } else if (dayOfWeek == 4) {
            System.out.println("чт");
        } else if (dayOfWeek == 5) {
            System.out.println("пт");
        } else if (dayOfWeek == 6) {
            System.out.println("сб");
        } else if (dayOfWeek == 7) {
            System.out.println("вск");
        } else {
            System.out.println("день не найден");
        }*/

        switch (dayOfWeek) {
            case 1:
                System.out.println("пн");
                break;
            case 2:
                System.out.println("вт");
                break;
            case 3:
                System.out.println("ср");
                break;
            case 4:
                System.out.println("чт");
                break;
            case 5:
                System.out.println("пт");
                break;
            case 6:
                System.out.println("сб");
                break;
            case 7:
                System.out.println("вск");
                break;
            default:
                System.out.println("день не найден");
                break;
        }
    }
}
