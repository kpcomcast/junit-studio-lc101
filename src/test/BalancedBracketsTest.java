package test;

import org.junit.Test;
import main.*;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); }

    @Test
    public void testFalse1() { assertEquals(false, BalancedBrackets.hasBalancedBrackets("][")); }

    @Test
    public void testFalse2() { assertEquals(false, BalancedBrackets.hasBalancedBrackets("LAUNCH][")); }

}
