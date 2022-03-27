package lab09;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RandomCharacterTest {
    RandomCharacter RandomTest;
    
    @Before
    public void setUp() throws Exception {
        RandomTest = new RandomCharacter();
        System.out.println("Set up");
    }

    //lower case letter
    @Test
    public void testGetRandomLowerCaseLetter() {
        char output = RandomTest.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(output));
    }

    //upper case letter
    @Test
    public void testGetRandomUpperCaseLetter() {
        char output = RandomTest.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(output));
    }

    //random digit character
    @Test
    public void testGetRandomDigitCharacter() {
        char output = RandomTest.getRandomDigitCharacter();
        assertTrue(Character.isDigit(output));
    }

    //random character
    @Test
    public void testGetRandomCharacter(){
        char output = RandomTest.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(output));
    }

    //Test Prime number
    @Test
    public void testPrimeNumber(){
        boolean flag = true;
        int output = RandomTest.getRandomPrimeNo();
        if (output <= 1){
            flag = false;
        } else if (output % 2 == 0 && output != 2) {
            flag = false;
        } else {
            for (int i = 3; i <= Math.sqrt(output); i += 2) {
                if (output % i == 0){
                    flag = false;
                }
            }
        }
    }
}



    
    
