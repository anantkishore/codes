package com.kishore.anant.searching;

public class FindKthMaxQuickSelect {

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(quickSelect(arr, 5, 0, arr.length-1));

    }

    public static int quickSelect(int[] arr, int index, int left, int right)
    {
        int mid = left + (right-left)/2;
        int pIndex = quickPartition(arr, left, right);
        if(pIndex > index)
            quickSelect(arr, index, left, pIndex-1);
        else if (pIndex < index)
            quickSelect(arr, index, pIndex+1, right);
        else
            return arr[pIndex];

    }

    public static int quickPartition(int[] arr, int left, int right)
    {
        int pivot = arr[right];

        int i = left;
        int pIndex = left;

        while(i < right)
        {
            if(arr[i] < pivot)
                swap(arr, pIndex, i); pIndex++;

        }
        swap(arr, pIndex, right);
        return pIndex;
    }

    public static void swap(int[] arr, int pIndex, int right)
    {
        int temp = arr[pIndex];
        arr[pIndex] = arr[right];
        arr[right] = temp;
    }




}
