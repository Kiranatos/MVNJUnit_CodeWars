package net.kiranatos.k7.e001;

/* Two to One (Autor: g964 https://www.codewars.com/users/g964)

Take 2 strings s1 and s2 including only letters from a to z. 
Return a new sorted string, the longest possible, containing distinct letters,
each taken only once - coming from s1 or s2. 
#Examples: ``` a = "xyaabbbccccdefww" b = "xxxxyyyyabklmopq" 
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz" 
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"  */

public class TwoToOne {
    public static String longest (String s1, String s2) {
        StringBuilder str = new StringBuilder();
        char[] c = new char[s1.length()+s2.length()];
        for (int i = 0; i < s1.length(); i++)
            c[i] = s1.charAt(i);
        for (int i = 0; i < s2.length(); i++)
            c[s1.length() + i] = s2.charAt(i);
        
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i]<c[j]) {
                    char b = c[i];
                    c[i] = c[j];
                    c[j] = b;
                }
            }            
        }
        
        str.append(c[0]);
        for (int i = 1; i < c.length; i++) {
            if (c[i-1]!=c[i]) str.append(c[i]);
        }
        return str.toString();
    } 
    
    public static void main(String[] args) {
        System.out.println(TwoToOne.longest("aretheyhere", "yestheyarehere"));
    }
}
