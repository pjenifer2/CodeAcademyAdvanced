/*
Exploring Code Academy Advanced Java Challenges
https://www.codecademy.com/resources/blog/advanced-java-code-challenges/
 */


package com.patrickshobby;

import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //reverse string without reverse string
        String inputString = "Star Wars";
        System.out.println(reverseString(inputString));

        //create method to determine prime
        int[] arr = new int[] {10,11,12,13,14,15,16,17,18,19};
        System.out.println(determinePrime(arr));

        //write a phone number decoder
        String phoneNumber = "800888TEST";
        System.out.println(phoneNumbers(phoneNumber));



    }

    /*
    6. Write a phone number word decoder
    Write a program in Java that’ll accept a phone number
    with letters and convert it to a phone number with
    only digits. For example, if you sent the program a
    phone number like 800888TEST, it should return (800) 888-8378.

    Note that it shouldn’t only convert letters to the digits they
    represent but also format the number correctly with parentheses
    and dashes. And, if you send the program an invalid number,
    it should throw an error.
     */
    private static String phoneNumbers(String phoneNumber) {
        phoneNumber = phoneNumber.toLowerCase(Locale.ROOT);
        char[] phoneDigits = new char[10];
        for (int i = 0; i < phoneNumber.length(); i++){
            char currentNumber = phoneNumber.charAt(i);
            if (Character.isDigit(currentNumber)){
                phoneDigits[i] = currentNumber;
            } else if (currentNumber == 'a' || currentNumber == 'b' || currentNumber == 'c') {
                phoneDigits[i] = '2';
            } else if (currentNumber == 'd' || currentNumber == 'e' || currentNumber == 'f') {
                phoneDigits[i] = '3';
            } else if (currentNumber == 'g' || currentNumber == 'h' || currentNumber == 'i') {
                phoneDigits[i] = '4';
            } else if (currentNumber == 'j' || currentNumber == 'k' || currentNumber == 'l') {
                phoneDigits[i] = '5';
            } else if (currentNumber == 'm' || currentNumber == 'n' || currentNumber == 'o') {
                phoneDigits[i] = '6';
            } else if (currentNumber == 'p' || currentNumber == 'q' || currentNumber == 'r' || currentNumber == 's') {
                phoneDigits[i] = '7';
            } else if (currentNumber == 't' || currentNumber == 'u' || currentNumber == 'v') {
                phoneDigits[i] = '8';
            } else {
                phoneDigits[i] = '9';
            }

        }

        String areaCode = "" + phoneDigits[0] + phoneDigits[1] + phoneDigits[2] + "";
        String firstThree = "" + phoneDigits[3] + phoneDigits[4] + phoneDigits[5] +"";
        String lastFour = "" + phoneDigits[6] + phoneDigits[7] + phoneDigits[8] + phoneDigits[9];
        String digitsToDial = "(" + areaCode + ") " + firstThree + "-" + lastFour;

        return digitsToDial;
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
