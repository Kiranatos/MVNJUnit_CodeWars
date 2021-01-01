package net.kiranatos.k6.e002;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Decode the Morse code https://www.codewars.com/kata/54b724efac3d5402db00065e
(Autor: jolaf https://www.codewars.com/users/jolaf)

Part of Series 1/3
This kata is part of a series on the Morse code. After you solve this kata, you 
may move to the next one.

In this kata you have to write a simple Morse code decoder. 
While the Morse code is now mostly superceded by voice and digital data
communication channels, it still has its use in some applications around the world.

The Morse code encodes every character as a sequence of "dots" and "dashes". 
For example, the letter A is coded as ·−, letter Q is coded as −−·−, and 
digit 1 is coded as ·−−−. The Morse code is case-insensitive, traditionally
capital letters are used. When the message is written in Morse code, a single
space is used to separate the character codes and 3 spaces are used to
separate words. For example, the message HEY JUDE in Morse code 
is ···· · −·−−   ·−−− ··− −·· ·.

NOTE: Extra spaces before or after the code have no meaning and should be ignored.

In addition to letters, digits and some punctuation, there are some special 
service codes, the most notorious of those is the international distress 
signal SOS (that was first issued by Titanic), that is coded as ···−−−···. 
These special codes are treated as single special characters, and usually 
are transmitted as separate words.

Your task is to implement a function decodeMorse(morseCode), that would take 
the morse code as input and return a decoded human-readable string.

For example:    MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
//should return "HEY JUDE"

The Morse code table is preloaded for you as a dictionary, feel free to use it. 
In CoffeeScript, C++, JavaScript, PHP, Python, Ruby and TypeScript, 
the table can be accessed like this: MORSE_CODE['.--'], in Java it is 
MorseCode.get('.--'), in C# it is MorseCode.Get('.--'), in Haskell the codes 
are in a Map String String and can be accessed like this: morseCodes ! ".--", 
in Elixir it is morse_codes variable.

All the test strings would contain valid Morse code, so you may skip checking
for errors and exceptions. In C#, tests will fail if the solution code throws
an exception, please keep that in mind. This is mostly because otherwise 
the engine would simply ignore the tests, resulting in a "valid" solution. */

public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)        
        StringBuilder sb = new StringBuilder();
        String[] words = morseCode.trim().split("   ");
        for (int i = 0; i < words.length; i++) {
            String[] symbols = words[i].split(" ");
            for (int j = 0; j < symbols.length; j++) {
                sb.append( MorseCode.get(symbols[j]) );
            }
            if(i!=words.length-1) sb.append(" ");          
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        //MorseCode m;
        //MorseCode.get('.--');
        //".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
        
    }
}

class MorseCode {
    private static Map<String, String> dic;    
    private static Map<String, String> dicM;
    static {   
        dic = new HashMap<>();
        dic.put("A", ".-");
        dic.put("N", "-.");
  	dic.put("B", "-...");
        dic.put("O", "---");
  	dic.put("C", "-.-.");
        dic.put("P", ".--.");
  	dic.put("D", "-..");
        dic.put("Q", "--.-");
  	dic.put("E", ".");
        dic.put("R", ".-.");
  	dic.put("F", "..-.");
        dic.put("S", "...");
  	dic.put("G", "--.");
        dic.put("T", "-");
  	dic.put("H", "....");
        dic.put("U", "..-");
  	dic.put("I", "..");
        dic.put("V", "...-");
  	dic.put("J", ".---");
        dic.put("W", ".--");
  	dic.put("K", "-.-");
        dic.put("X", "-..-");
  	dic.put("L", ".-..");
        dic.put("Y", "-.--");
  	dic.put("M", "--");
        dic.put("Z", "--..");         
        dicM = new HashMap<>();
        Iterator<Map.Entry<String,String>> it = dic.entrySet().iterator();
        while ( it.hasNext() ) {
            Map.Entry<String,String> pair = it.next();
            dicM.put(pair.getValue(), pair.getKey());            
        }

    };
    public static String get(String code) {
        return dicM.get(code);
    }
    public static String getMorzeCode(String code) {
        return dicM.get(code);
    }
}