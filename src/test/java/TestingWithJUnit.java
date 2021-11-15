import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestingWithJUnit {

    private List<String> names;

    @Test
    public void testHelloWorld(){
        System.out.println("Hello World");
    }

    //Assertequals tests if two values are equal to each other
    @Test
    public void testIfCompanyNameIsEquals(){
        String expected = "Codeup";
        String actual = "Codeup";
//        String actual = "Codedown";
        //when you run this it will show that the test has failed

        assertEquals(expected, actual);
        //not the same
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
        //IF YOU use numbers with decimal point then you have to use 'delta:'
        //ALSO if one assertion fails, they all fail. If first assertion fails then it won't run any other
        //TRY to assert one thing for each test
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
//        assertTrue("5 is not greater than 6", 5 > 6);
        //WITH this last one the test will fail cuz it's not true
    }

    @Test
    public void testIfInstanceIsNull() {
        //CHANGED to 'Object', was originally set as 'device'
        Object phone = new Object();
        Object laptop = null;
        assertNull(null);
        assertNotNull(phone);
        assertNull(laptop); //WE ADDED this with Doug
    }

    @Before
    public void runThisBefore(){
        this.names = new ArrayList<>();
        this.names.add("Kenneth");
    }
    //WITHOUT THIS the test below would fail

    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }


    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size());
        assertSame("Kenneth", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }
}
