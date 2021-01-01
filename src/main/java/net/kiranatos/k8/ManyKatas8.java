package net.kiranatos.k8;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* прості завдання для тренвання зі Stream API */
//                .peek((e) -> System.out.print("," + e))

public class ManyKatas8 {
    public static void main(String[] args) {
        System.out.println("RUN");
    }
    
    /*####################################################### ЗАДАЧА № 012 ##############################################################*/
    /* Fake Binary
    Given a string of digits, you should replace any digit below 5 with '0' and 
    any digit 5 and above with '1'. Return the resulting string. */
    public static String fakeBin(String numberString) {
        return Arrays.stream(numberString.split(""))
                .map(s -> s.matches("[0-4]") ? "0" : "1")
                .collect(Collectors.joining(""));
    }
    
    /*####################################################### ЗАДАЧА № 011 ##############################################################*/
    /* Is it even?
    In this Kata we are passing a number (n) into a function.
    Your code will determine if the number passed is even (or not).
    The function needs to return either a true or false.
    Numbers may be positive or negative, integers or floats.
    Floats are considered UNeven for this kata.  */
    public static boolean isEven(double n) {
        return Stream.ofNullable(n).anyMatch(k -> (k%2 == 0));
    }
    
    /*####################################################### ЗАДАЧА № 010 ##############################################################*/
    /* Is n divisible by x and y?
    Create a function that checks if a number n is divisible by two numbers 
    x AND y. All inputs are positive, non-zero digits. */
    public static boolean isDivisible(long n, long x, long y) {		
        return Stream.ofNullable(n).anyMatch(k -> ((k%x == 0)&&(k%y) == 0));
        //return Arrays.asList(x, y).stream().allMatch(i -> n % i == 0);
    }
    
    /*####################################################### ЗАДАЧА № 009 ##############################################################*/
    /* All Star Code Challenge #18
    This Kata is intended as a small challenge for my students
    All Star Code Challenge #18
    Create a function called that accepts 2 string arguments and returns an 
    integer of the count of occurrences the 2nd argument is found in the first one.
    If no occurrences can be found, a count of 0 should be returned.        
    Notes:
    The first argument can be an empty string
    The second string argument will always be of length 1 */
    public static int strCount(String str, char letter) {
        return (int)str.chars().filter(x -> letter == x).count();
        //return StringUtils.countMatches(str, letter);  
        //return Collections.frequency(Arrays.asList(str.split("")), ""+letter);
    }
    
    /*####################################################### ЗАДАЧА № 008 ##############################################################*/
    /* altERnaTIng cAsE <=> ALTerNAtiNG CaSe
    Define String.prototype.toAlternatingCase (or a similar function/method such 
    as to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected 
    language; see the initial solution for details) such that each lowercase 
    letter becomes uppercase and each uppercase letter becomes lowercase. 
    For example:
        StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
        StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
        StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
        StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
        StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
        StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
        StringUtils.toAlternativeString("StringUtils.toAlternatingCase") == "sTRINGuTILS.TOaLTERNATINGcASE"
    As usual, your function/method should be pure, i.e. it should not mutate 
    the original string.
    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", StringUtils.toAlternativeString("hello world"));
        assertEquals("hello world", StringUtils.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", StringUtils.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", StringUtils.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", StringUtils.toAlternativeString(StringUtils.toAlternativeString("Hello World")));
        assertEquals("12345", StringUtils.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", StringUtils.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", StringUtils.toAlternativeString("StringUtils.toAlternatingCase"));
    }
    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", StringUtils.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", StringUtils.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", StringUtils.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", StringUtils.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    } */
    public static String toAlternativeString(String string) {
        return string
                .chars()
                .mapToObj(x -> {
                    if (x>96) return String.valueOf((char)Character.toUpperCase(x));
                    else return String.valueOf((char)Character.toLowerCase(x));
                })
                .reduce((acc, x) -> acc + x)
                .get();
//        return string.chars()
//                .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : 
//                        Character.isLowerCase(c) ? Character.toUpperCase(c) : c)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
//        return Arrays.stream(string.split(""))
//                 .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
//                 .collect(Collectors.joining(""));
    }
    
    /*##############################################################################################################################*/
    /* How do I compare numbers?
    What could be easier than comparing integer numbers? However, the given 
    piece of code doesn't recognize some of the special numbers for a reason 
    to be found. Your task is to find the bug and eliminate it.
    @Test
    public void test() throws Exception {
        for (Object[] t: tests)
            assertEquals(t[1], HowDoICompare.whatIs((Integer)t[0]));
    }*/    
    static final Object[][] tests = {
        {0, "nothing"},
        {123, "nothing"},
        {-1, "nothing"},
        {42, "everything"},
        {42 * 42, "everything squared"},
    };
    static final Object[][] specialNumbers = {
        {42, "everything"},
        {42 * 42, "everything squared"},
    };
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (x.equals(p[0]))
                return (String)p[1];
        }
        return "nothing";
        //return Map.of(42, "everything", 1764, "everything squared").getOrDefault(x, "nothing");
    }    
    
    /*##############################################################################################################################*/
    /* Sum of positive
    You get an array of numbers, return the sum of all of the positives ones.
    Example [1,-4,7,12] => 1 + 7 + 12 = 20
    Note: if there is nothing to sum, the sum is default to 0.
        assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5})); */
    public static int sum(int[] arr){
        IntStream stream = Arrays.stream(arr);
        stream = stream.filter(x -> x > 0);        
        return stream.sum();
        //return Arrays.stream(arr).filter(x -> x > 0).sum();
    }
    
    /*##############################################################################################################################*/
    /* You only need one - Beginner
    You will be given an array a and a value x. All you need to do is check 
    whether the provided array contains the value.
    Array can contain numbers or strings. X can be either.
    Return true if the array contains the value, false if not.
        assertEquals(Solution.check(new Object[] {66, 101}, 66),                                true);
        assertEquals(Solution.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45),    true);
        assertEquals(Solution.check(new Object[] {'t', 'e', 's', 't'}, 'e'),                    true);
        assertEquals(Solution.check(new Object[] {"what", "a", "great", "kata"}, "kat"),        false); */
    public static boolean check(Object[] a, Object x) {
        Stream<Object> stream = Arrays.stream(a);
        Stream<String> streamStr = stream.map(y -> {
            if (y instanceof String) return String.valueOf(y);
            else return ""; } );        
        boolean flag = streamStr.anyMatch(m -> m.equals(x));

        return Arrays.stream(a).anyMatch(m -> m.equals(x));
        //return Arrays.asList(a).contains(x);
        //return Arrays.stream(a).filter(obj -> obj == x).findAny().isPresent();
    }
    
    /*##############################################################################################################################*/
    /* Abbreviate a Two Word Name
    Write a function to convert a name into initials. This kata strictly takes 
    two words with one space in between them.
    The output should be two capital letters with a dot separating them.
    It should look like this:
    Sam Harris => S.H
    Patrick Feeney => P.F */
    public static String abbrevName(String name) {
        Stream<String> stream = Arrays.stream(name.split(" "));
        String result = stream.map(str -> str.charAt(0)).map(String::valueOf).map(str -> str.toUpperCase()).collect(Collectors.joining("."));
        return result;
        //return Arrays.stream(name.split(" ")).map(e -> String.valueOf(e.charAt(0)).toUpperCase()).collect(Collectors.joining("."));
    }
    
    /*##############################################################################################################################*/
    /* Array plus array
        assertEquals(21, Sum.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, Sum.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, Sum.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, Sum.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600})); */
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.concat( Arrays.stream(arr1), Arrays.stream(arr2) ).sum();
    }
    
    /*##############################################################################################################################*/
    /* Holiday VIII - Duty Free
    The purpose of this kata is to work out just how many bottles of duty free 
    whiskey you would have to buy such that the saving over the normal high 
    street price would effectively cover the cost of your holiday.
    You will be given the high street price (normPrice), the duty free discount 
    (discount) and the cost of the holiday.
    For example, if a bottle cost £10 normally and the discount in duty free was 
    10%, you would save £1 per bottle. If your holiday cost £500, the answer you 
    should return would be 500.
    All inputs will be integers. Please return an integer. Round down.
         assertEquals(166, Kata.dutyFree(12,50,1000));
         assertEquals(294, Kata.dutyFree(17,10,500));
         assertEquals(357, Kata.dutyFree(24,35,3000));
         assertEquals(20, Kata.dutyFree(1400,35,10000));
         assertEquals(38, Kata.dutyFree(700,26,7000));*/
    private static int dutyFree(int normPrice, int discount, int hol) {   
        OptionalInt num = IntStream.of(normPrice).map(x -> x*discount).map(x -> (hol*100)/x).findAny();        
        return num.getAsInt();
    }
}