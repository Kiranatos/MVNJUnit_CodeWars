package net.kiranatos.k6.e001;

/* Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!! https://www.codewars.com/kata/5626b561280a42ecc50000d1
(Autor: raulbc777 https://www.codewars.com/users/raulbc777)

The number 89 is the first integer with more than one digit that fulfills the 
property partially introduced in the title of this kata. What's the use of 
saying "Eureka"? Because this sum gives the same number.
In effect: 89 = 8^1 + 9^2

The next number in having this property is 135.
See this property again: 135 = 1^1 + 3^2 + 5^3

We need a function to collect these numbers, that may receive two integers 
a, b that defines the range [a, b] (inclusive) and outputs a list of the 
sorted numbers in the range that fulfills the property described above.

Let's see some cases:
sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]
sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
If there are no numbers of this kind in the range [a, b] the function should 
output an empty list.
sum_dig_pow(90, 100) == []
Enjoy it!! */

import java.util.ArrayList;
import java.util.List;

public class Eureka {    
    private static boolean numSplit(long num){        
        long newNum = 0, n = num;
        int last, index = 0;
        while (n > 0) {
            index++;
            n = n / 10;            
        }
        
        n = num;        
        while (n > 0) {            
            last = (int)n % 10;
            n = n / 10;
            newNum += (long)Math.pow(last, index);
        
            index--;            
        }        
        return (newNum == num) ? true : false;
    }
    
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> list = new ArrayList<>();
        
        for (long i = a; i <= b; i++) {
            if (numSplit(i)) list.add(i);            
        }
        
        return list;
    }    
    
    public static void main(String[] args) {
        System.out.print("[1;10] = ");
        List<Long> list1 = Eureka.sumDigPow(1, 10);
        for (Long k : list1) { System.out.print( k + " "); }        
        
        System.out.print("\n[1;100] = ");
        list1 = Eureka.sumDigPow(1, 100);
        for (Long k : list1) { System.out.print( k + " "); }
        
        System.out.print("\n[10;100] = ");
        list1 = Eureka.sumDigPow(10, 100);
        for (Long k : list1) { System.out.print( k + " "); }
        
        System.out.print("\n[90;100] = ");
        list1 = Eureka.sumDigPow(90, 100);
        for (Long k : list1) { System.out.print( k + " "); }
        
        System.out.print("\n[90;150] = ");
        list1 = Eureka.sumDigPow(90, 150);
        for (Long k : list1) { System.out.print( k + " "); }
        
        System.out.print("\n[50;150] = ");
        list1 = Eureka.sumDigPow(50, 150);
        for (Long k : list1) { System.out.print( k + " "); }
        
        System.out.print("\n[10;150] = ");
        list1 = Eureka.sumDigPow(10, 150);
        for (Long k : list1) { System.out.print( k + " "); }        
    }
}
