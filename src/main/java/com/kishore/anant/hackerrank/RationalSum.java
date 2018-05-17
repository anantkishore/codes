package com.kishore.anant.hackerrank;

import java.util.Scanner;

public class RationalSum {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] numArr = new int[size];
        int[] denArr = new int[size];

        for (int i = 0; i < size; i++) {

            numArr[i] = scanner.nextInt();
            denArr[i] = scanner.nextInt();

        }

        int lcm = 1;
        for (int i = 0; i < size; i++) {

            lcm = LCM(lcm, denArr[i]);
        }

        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {

            int mul = lcm / denArr[i];
            sum += mul * numArr[i];
        }

        for (int i = 2; i < lcm; i++) {
            while (lcm % i == 0 && sum % i == 0) {
                lcm = lcm / i;
                sum = sum / i;
            }
        }

        System.out.println(sum + " " + lcm);
    }

    public static int LCM(int res, int i) {
        return (i * res) / GCD(res, i);

    }

    public static int GCD(int res, int i) {

        if (res == i)
            return res;
        if (res > i)
            return GCD(res - i, i);
        else
            return GCD(res, i - res);
    }
}
