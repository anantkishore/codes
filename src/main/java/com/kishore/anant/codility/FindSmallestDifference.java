package com.kishore.anant.codility;


import java.util.Arrays;

public class FindSmallestDifference {

    public static void main(String[] args) {

        int[] arr = {8, 24, 3, 20, 1, 17};

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < minDiff)
                minDiff = Math.abs(arr[i] - arr[i - 1]);
        }

        System.out.println(minDiff);
    }
}
