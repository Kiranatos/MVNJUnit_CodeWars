package net.kiranatos.k6.e003;

/* Are we alternate? https://www.codewars.com/kata/59325dc15dbb44b2440000af
(Autor: cheeze https://www.codewars.com/users/cheeze)

Create a function isAlt() that accepts a string as an argument and 
validates whether the vowels (a, e, i, o, u) and consonants are in 
alternate order.
isAlt("amazon")     // true
isAlt("apple")      // false
isAlt("banana")     // true
Arguments consist of only lowercase letters. */

public class AreWeAlternate {
    public static boolean isAlt(String word) {         
        boolean  vowel, con, flag = true;
        char[] cWord = word.toCharArray();
        
        if (    (cWord[0]=='a') || (cWord[0]=='e') ||
                (cWord[0]=='i') || (cWord[0]=='o') ||
                (cWord[0]=='u') ) {
            vowel = true;
            con = false;
        } else { con = true; vowel = false; }
        
        for (int i = 1; i < cWord.length; i++) {            
            if ((   (cWord[i]=='a') || (cWord[i]=='e') ||
                    (cWord[i]=='i') || (cWord[i]=='o') ||
                    (cWord[i]=='u') ) && (con) && (!vowel) ) {
                 vowel = true;
                 con = false;
             } 
            else if ((      !(cWord[i]=='a') && !(cWord[i]=='e') &&
                            !(cWord[i]=='i') && !(cWord[i]=='o') &&
                            !(cWord[i]=='u') ) && (vowel) && (!con) ) {   
                con = true; 
                vowel = false;  
            }
            else { flag = false;  break; }            
         }        
        
        return flag;
    }
    
    public static void main(String[] args) {
        System.out.println("amazon " + isAlt("amazon"));
        System.out.println("amazon " + isAlt("amazona"));        
        System.out.println("apple " + isAlt("apple"));
        System.out.println("applelelele " + isAlt("applelelele"));
        System.out.println("applel " + isAlt("applel"));
        System.out.println("applepapapapap " + isAlt("applepapapapap"));
        System.out.println("papapapaapple " + isAlt("papapapaapple"));
        System.out.println("paaaaaaaaaap " + isAlt("paaaaaaap"));
        System.out.println("apppppa " + isAlt("appppppa"));
        System.out.println("pppppppddaaaappppppppp " + isAlt("pppaaaaappppppppppppp"));
        System.out.println("aaaappppaaaa " + isAlt("aaappppaaaaa"));
        System.out.println("pppppppppppppppp " + isAlt("pppppppppppppppp"));        
        System.out.println("aaaaaaaa " + isAlt("aaaaaaaa"));        
        System.out.println("banana " + isAlt("banana"));
        System.out.println("bananan " + isAlt("bananan"));        
    }    
}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertEquals(true, Solution.isAlt("amazon"));
        assertEquals(false, Solution.isAlt("apple"));
        assertEquals(true, Solution.isAlt("banana"));
    }
}
*/