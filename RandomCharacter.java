package lab09;

import java.util.*;

public class RandomCharacter {
    Random random = new Random();

    //get randome lower case letter
    public char getRandomLowerCaseLetter(){
        char smallLetter = (char) (random.nextInt(26) + 97);
        return smallLetter;
    }

    //get random upper case letter
    public char getRandomUpperCaseLetter(){
        char bigLetter = (char) (random.nextInt(26) + 65);
        return bigLetter;
    }

    //get random digit from 0-9
    public char getRandomDigitCharacter(){
        return (char) ((Math.random() * (57 - 48)) + 48);
    }

    //get random character
    public char getRandomCharacter(){
        return (char) ((Math.random() * (126 - 33)) + 33);
    }

    //get random prime number from 1 - 1000
    public int getRandomPrimeNo(){
        while(true){
            int value = ((int) (Math.random()*(1000 - 1))) + 1;
            if(checkPrime(value) == true){
                return value;
            }
        }
    }

    //if the number from getRandomPrimeNo is not Prime, do not return.
    public static boolean checkPrime(int value){
        boolean isPrime = true;
        int i = 2;
        while(i <= value/2){
            if (value % i == 0){
                isPrime = false;
                break;
            }
            ++i;
        }
        return isPrime;
    }

    //get random number from 1 - 1000
    public int getRandomValue(){
        return ((int) (Math.random()*(1000 - 1))) + 1;
    }

    //check if the random number is true or false
    public static boolean isPrime(int n) {
    	if (n <= 1) {
    		return false;
    	} else if (n == 2) {
    		return true;
    	} else if (n % 2 == 0) {
    		return false;
    	}
    	for (int i = 3; i <= Math.sqrt(n); i+= 2) {
    		if (n % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static void main(String[] args) {
        
        RandomCharacter newRanChar = new RandomCharacter();
        int runNo = 15;

        System.out.println("Lower Case:  " + " Upper Case:  " + " Random Digit:  " + "Random Character: " + " Random Prime Number: ");
        for (int i=0; i<runNo;i++){
            System.out.print(
                newRanChar.getRandomLowerCaseLetter() 
                + "             " +  
                newRanChar.getRandomUpperCaseLetter() 
                + "             " +    
                newRanChar.getRandomDigitCharacter() 
                + "              " +  
                newRanChar.getRandomCharacter() 
                + "                  " + 
                newRanChar.getRandomPrimeNo()
                + "\n"
                );
        }


        System.out.println();
        System.out.println();

        System.out.println("(Check prime)Random Integers from 0-100: ");
        for (int i=0;i<runNo;i++){
            int x = newRanChar.getRandomValue();
            System.out.print(x + ":  " + isPrime(x) + "\n");
        }

    }
}