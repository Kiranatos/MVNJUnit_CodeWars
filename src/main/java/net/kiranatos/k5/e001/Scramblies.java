package net.kiranatos.k5.e001;

/* Scramblies https://www.codewars.com/kata/55c04b4cc56a697bb0000048
(Autor: joh_pot https://www.codewars.com/users/joh_pot)

Write function scramble(str1,str2) that returns true if a portion of str1 
characters can be rearranged to match str2, otherwise returns false.

For example:
str1 is 'rkqodlw' and str2 is 'world' the output should return true.
str1 is 'cedewaraaossoqqyt' and str2 is 'codewars' should return true.
str1 is 'katas' and str2 is 'steak' should return false.

Only lower case letters will be used (a-z). No punctuation or digits will be included.
Performance needs to be considered */

public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
        char[] cstr1 = str1.toCharArray();
        char[] cstr2 = str2.toCharArray();
        boolean scrambleMainFlag = true;
        
        for (int i = 0; i < cstr2.length; i++) {
            boolean litera = false;
            
            for (int j = 0; j < cstr1.length; j++) {
                if (cstr1[j] == cstr2[i]) {
                    cstr1[j] = 0;
                    litera = true;
                    break;
                }                
            }
            
            if (!litera) {
                scrambleMainFlag = false;
                break;
            }
        }
    
        return scrambleMainFlag;
    }
    
    public static void main(String[] args) {
        System.out.println( scramble("rkqodlw", "world") );
        System.out.println( scramble("cedewaraaossoqqyt", "codewars") );
        System.out.println( scramble("katas", "steak") );
    }
}