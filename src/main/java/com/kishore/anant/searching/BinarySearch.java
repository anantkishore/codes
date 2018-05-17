package com.kishore.anant.searching;

public class BinarySearch {


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(arr, 2, 0, 10));

    }

    public static int binarySearch(int[] arr, int x, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                binarySearch(arr, x, left, mid - 1);
            else
                binarySearch(arr, x, mid + 1, right);
            return -1;
        }
        return -1;
    }

}
