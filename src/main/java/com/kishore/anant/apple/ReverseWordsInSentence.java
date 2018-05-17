package com.kishore.anant.apple;

public class ReverseWordsInSentence {


    public static void main(String[] args) {

        String sentence = "I am a programmer.";
        for (String word : sentence.split(" ")) {
            System.out.println(reverseWord(word));
        }
    }

    public static char[] reverseWord(String word) {
        char[] strArray = word.toCharArray();
        int len = strArray.length;
        for (int i = 0, j = len - 1; i < j; i++, j--) {

            char temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
        }
        return strArray;
    }
}