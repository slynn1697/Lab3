/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author stephenlynn
 */
public class EvenOddCounter {

    public static void main(String[] args) {
        Random numberToCheck = new Random();
        int numbersThatAreEven = 0;
        for (int i = 0; i <= 100; i++) {
            int randomNumber = numberToCheck.nextInt();
            numbersThatAreEven += isEven(randomNumber);
        }
        int numbersThatAreOdd = 100 - numbersThatAreEven;
        System.out.println("There are a total of: " + numbersThatAreEven + " even numbers that were generated.");
        System.out.println("There are a total of: " + numbersThatAreOdd + " odd numbers that were generated.");

    }

    public static int isEven(int numberToCheckFor) {
        if ((numberToCheckFor % 2) == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
