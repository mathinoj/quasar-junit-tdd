import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {

    //Create a test method that uses assertEquals or assertNotEquals to verify if the String Codeup is the same as CodeUp
    @Test
    public void testIfCodeupIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        String expectedNot = "Kodeup";
        String actualNot = "Giddyup";


        assertEquals(expected, actual);
        assertNotEquals(expectedNot, actualNot);
    }


    //Create a test method that uses assertNotSame to verify that the following ArrayLists are not the same:
    @Test
    public void arrayListsNotSame() {
//        char[] expected =
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        List<String> newLanguage = moreLanguages;

        assertNotSame(languages, moreLanguages);
        assertSame(moreLanguages, newLanguage);
    }

    //Create a test method that uses assertArrayEquals to verify the following arrays are equal.
    @Test
    public void isArrayEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

//Create a test method that uses both assertFalse and assertTrue to verify the following statements:
//

    @Test
    public void isTrueOrFalse() {
        String language = "PHP";
        assertTrue("Character 'H' is in test.", language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
        //IF YOU want to add message that's how you'd do it

    }

    //@Test
    //public void testIfGreaterOrLesserThanWorks() {
    //
    //    boolean learningTDD = true;
    //
    //    assertTrue(learningTDD);
    //    assertTrue("5 is greater than 4", 5 > 4);
    //    assertFalse("5 is not greater than 6", 5 > 6);
    //}nt
}
