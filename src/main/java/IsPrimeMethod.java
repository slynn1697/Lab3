/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author stephenlynn
 */
public class IsPrimeMethod {

public class IsPrime {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number you'd like to check");
        int primeToCheck = keyboard.nextInt();
        int isItPrime = isPrime(primeToCheck);
        if (isItPrime == 0) {
            System.out.println("The number you have chosen: " + primeToCheck + " is a not prime number");
        } else {
            System.out.println("The number you have chosen: " + primeToCheck + " is a prime number");
        }
    }

    /**
     *
     * @param primeToCheck
     * @return
     */
    public static int isPrime(int primeToCheck) {
        int itIsPrime = 0;
        for (int i = 2; i < primeToCheck; i++) {
            itIsPrime = primeToCheck % i;
            if (itIsPrime == 0) {
                break;
            }
        }
        return itIsPrime;
    }
}

}
