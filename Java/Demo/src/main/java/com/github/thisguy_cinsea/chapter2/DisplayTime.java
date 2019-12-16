package com.github.thisguy_cinsea.chapter2;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer for seconds: ");
//        int seconds = input.nextInt();
        int seconds = 65;

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes
            + " minutes and " + remainingSeconds + " seconds");
        System.out.println(100%7);
        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);

        System.out.println(0B1111); // Displays 15
        System.out.println(07777); // Displays 4095
        System.out.println(0XFFFF); // Displays 65535
        System.out.println("1.0 / 3.0 is " + 1.0 / 3.0);
        System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F);
        long ssn = 232_45_4519;
        long creditCardNumber = 2324_4545_4519_3415L;
        System.out.println(ssn);
        System.out.println(creditCardNumber);
        System.out.println(System.currentTimeMillis());

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is " + currentHour + ":"
            + currentMinute + ":" + currentSecond + " GMT");

        double a = 6.5;
        a += a + 1;
        System.out.println("huh " + a);
        a = 6;
        a /= 2;
        System.out.println(a);
        int x = 6;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        x = 6;
        y = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(1D/2);

        int sum = 0;
        sum += 4.5;
        System.out.println(sum);
        sum = (int)(sum + 4.5);
        System.out.println(sum);
    }
}
