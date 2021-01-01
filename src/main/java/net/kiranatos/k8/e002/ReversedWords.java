package net.kiranatos.k8.e002;

/** Reversed Words https://www.codewars.com/kata/51c8991dee245d7ddf00000e
 * (Autor: jhoffner https://www.codewars.com/users/jhoffner)
 * 
 * Complete the solution so that it reverses all of the words within the string passed in.
 * 
 * Example:
 * ReverseWords.reverseWords("The greatest victory is that which requires no battle");
 * should return "battle no requires which that is victory greatest The"
 */
public class ReversedWords {
    public static String reverseWords(String str){
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length-1; i >= 0; i--) {
            sb.append(s[i]);
            if (i!=0) sb.append(" ");
        }        
        return sb.toString();    
    }
    
    public static void main(String[] args) {
        System.out.println(reverseWords("Contracted by powerful mob syndicates and police alike, the Handymen have to be ready and willing for anything."));        
    }
}
