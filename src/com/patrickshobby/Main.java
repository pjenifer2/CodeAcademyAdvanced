/*
Exploring Code Academy Advanced Java Challenges
https://www.codecademy.com/resources/blog/advanced-java-code-challenges/
 */


package com.patrickshobby;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //reverse string without reverse string
        String inputString = "Star Wars";
        System.out.println(reverseString(inputString));

        //create method to determine prime
        int[] arr = new int[] {10,11,12,13,14,15,16,17,18,19};
        System.out.println(determinePrime(arr));



    }

    /*
    1. Write a Java program to reverse a string without using
    the reverse method of Java's String class; This exercise
    will teach you about how Java handles strings. First,
    you should create a class with a main method that accepts
    a string and then returns a string where the characters
    are in reverse order. But, you can't use the
    reverse method of the String class because that’d be cheating.
     */

    private static String reverseString(String inputString) {
        char[] reversedCharacters = new char[inputString.length()];
        int charLocation = 0;
        for (int i = (inputString.length()-1); i >= 0; i--){
            reversedCharacters[charLocation] = inputString.charAt(i);
            charLocation++;
        }
        String reversedString = String.valueOf(reversedCharacters).toLowerCase();

        return reversedString;
    }

    /*
    2. Write a Java program to determine whether a number is prime or not
    This program should accept an array of numbers. It should iterate through
    the array of numbers and determine if each is prime or not. Once it’s done
    processing, it should return only those numbers that are prime in an array.
     */
    private static ArrayList<Integer> determinePrime(int[] arr) {
        ArrayList<Integer> primeArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            int countNoRemainders = 0;
            for (int j = 1; j < arr[i]; j++ ){
                if (arr[i] % j == 0) {
                    countNoRemainders++;
                }

            }
            if (countNoRemainders < 2) {
                primeArray.add(arr[i]);
            }
        }
        return primeArray;

    }


}
