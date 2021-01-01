package net.kiranatos.k8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ManyKatas8Test {
    
//    @Test
//    public void test_Ex009() {
//        assertEquals(7, 5+2);
//        System.out.println("JUnit test: ЗАДАЧА № : SUCCESS");
//    }
    
    @Test
    public void testFakeBin_Ex012() {        
        assertEquals("000011111", ManyKatas8.fakeBin("123456789"));
        System.out.println("JUnit test: ЗАДАЧА № 12: SUCCESS");
    }
    
    @Test
    public void testIsEven_Ex011() {
        assertEquals(true,  ManyKatas8.isEven(0));
        assertEquals(false, ManyKatas8.isEven(0.5));
        assertEquals(false, ManyKatas8.isEven(1));
        assertEquals(true,  ManyKatas8.isEven(2));
        assertEquals(true,  ManyKatas8.isEven(-4)); 
        System.out.println("JUnit test: ЗАДАЧА № 11: SUCCESS");
    }
    
    @Test
    public void testIsDivisible_Ex010() {
        assertEquals(true,  ManyKatas8.isDivisible(12,4,3));
        assertEquals(false, ManyKatas8.isDivisible(3,3,4));
        assertEquals(true,  ManyKatas8.isDivisible(3,1,3));
        assertEquals(true,  ManyKatas8.isDivisible(12,2,6));
        assertEquals(false, ManyKatas8.isDivisible(100,5,3));
        assertEquals(false, ManyKatas8.isDivisible(12,7,5));
        System.out.println("JUnit test: ЗАДАЧА № 010: SUCCESS");
    }
    
    @Test
    public void testStrCount_Ex009() {        
        assertEquals(1, ManyKatas8.strCount("Hello", 'o'));
        assertEquals(2, ManyKatas8.strCount("Hello", 'l'));
        assertEquals(0, ManyKatas8.strCount("", 'z'));
        System.out.println("JUnit test: ЗАДАЧА № 009: SUCCESS");
    }
}
