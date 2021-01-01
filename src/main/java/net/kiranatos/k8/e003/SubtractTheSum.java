package net.kiranatos.k8.e003;

import java.util.HashMap;

/* Subtract the sum https://www.codewars.com/kata/56c5847f27be2c3db20009c3
(Autor: aryan-firouzian https://www.codewars.com/users/aryan-firouzian)

Complete the function which get an input number n such that n >= 10 and n < 10000, then:

    Sum all the digits of n.
    Subtract the sum from n, and it is your new n.
    If the new n is in the list below return the associated fruit, otherwise return back to task 1.

Example

n = 325
sum = 3+2+5 = 10
n = 325-10 = 315 (not in the list)
sum = 3+1+5 = 9
n = 315-9 = 306 (not in the list)
sum = 3+0+6 = 9
n =306-9 = 297 (not in the list)
. .
. ...until you find the first n in the list below.

There is no preloaded code to help you. This is not about coding skills; think before you code

1-kiwi
2-pear
3-kiwi
4-banana
5-melon
6-banana
7-melon
8-pineapple
9-apple
10-pineapple
11-cucumber
12-pineapple
13-cucumber
14-orange
15-grape
16-orange
17-grape
18-apple
19-grape
20-cherry
21-pear
22-cherry
23-pear
24-kiwi
25-banana
26-kiwi
27-apple
28-melon
29-banana
30-melon
31-pineapple
32-melon
33-pineapple
34-cucumber
35-orange
36-apple
37-orange
38-grape
39-orange
40-grape
41-cherry
42-pear
43-cherry
44-pear
45-apple
46-pear
47-kiwi
48-banana
49-kiwi
50-banana
51-melon
52-pineapple
53-melon
54-apple
55-cucumber
56-pineapple
57-cucumber
58-orange
59-cucumber
60-orange
61-grape
62-cherry
63-apple
64-cherry
65-pear
66-cherry
67-pear
68-kiwi
69-pear
70-kiwi
71-banana
72-apple
73-banana
74-melon
75-pineapple
76-melon
77-pineapple
78-cucumber
79-pineapple
80-cucumber
81-apple
82-grape
83-orange
84-grape
85-cherry
86-grape
87-cherry
88-pear
89-cherry
90-apple
91-kiwi
92-banana
93-kiwi
94-banana
95-melon
96-banana
97-melon
98-pineapple
99-apple
100-pineapple  */

public class SubtractTheSum {
    
    public static void main(String[] args) {        
        System.out.println(SubtractTheSum.subtractSum(4787));        
        System.out.println(SubtractTheSum.subtractSum(1));
        System.out.println(SubtractTheSum.subtractSum(2));
        System.out.println(SubtractTheSum.subtractSum(10));
        System.out.println(SubtractTheSum.subtractSum(100));
        System.out.println(SubtractTheSum.subtractSum(99));
        System.out.println(SubtractTheSum.subtractSum(325));
        for (int i = 1; i < 1000; i += 11) {            
            System.out.println(i + " : " + SubtractTheSum.subtractSum(i));
        }
    }
    
    public static String subtractSum (int n) {
        //return fruit name like "apple"
        if (!(n > 0)) return "error";
        
        String[] fruits = new String[]{
            "kiwi","pear","kiwi","banana","melon","banana","melon","pineapple",
            "apple","pineapple","cucumber","pineapple","cucumber","orange",
            "grape","orange","grape","apple","grape","cherry","pear","cherry",
            "pear","kiwi","banana","kiwi","apple","melon","banana","melon",
            "pineapple","melon","pineapple","cucumber","orange","apple","orange",
            "grape","orange","grape","cherry","pear","cherry","pear","apple",
            "pear","kiwi","banana","kiwi","banana","melon","pineapple","melon",
            "apple","cucumber","pineapple","cucumber","orange","cucumber",
            "orange","grape","cherry","apple","cherry","pear","cherry","pear",
            "kiwi","pear","kiwi","banana","apple","banana","melon","pineapple",
            "melon","pineapple","cucumber","pineapple","cucumber","apple","grape",
            "orange","grape","cherry","grape","cherry","pear","cherry","apple",
            "kiwi","banana","kiwi","banana","melon","banana","melon","pineapple",
            "apple","pineapple"};
        
        if (9 > n) return fruits[n];
        
        int _sum = 0, _n = n;
        do {
            while (_n > 0){
                _sum += _n % 10;
                _n = _n / 10;
            }
//            System.out.print(n + " - " + _sum + " = ");
            _n = n - _sum;
//            System.out.println(_n);
            n = _n;
            _sum = 0;
        } while (n > fruits.length);
        
//        System.out.print("\n " + (n) + " : ");
        return fruits[n-1];
    }    
    
    public static String subtractSum_NotMy(int n) {
        HashMap<Integer, String> map = new HashMap<Integer, String>() {{
            put(1, "kiwi");
            put(2, "pear");
            put(3, "kiwi");
            put(4, "banana");
            put(5, "melon");
            put(6, "banana");
            put(7, "melon");
            put(8, "pineapple");
            put(9, "apple");
            put(10, "pineapple");
            put(11, "cucumber");
            put(12, "pineapple");
            put(13, "cucumber");
            put(14, "orange");
            put(15, "grape");
            put(16, "orange");
            put(17, "grape");
            put(18, "apple");
            put(19, "grape");
            put(20, "cherry");
            put(21, "pear");
            put(22, "cherry");
            put(23, "pear");
            put(24, "kiwi");
            put(25, "banana");
            put(26, "kiwi");
            put(27, "apple");
            put(28, "melon");
            put(29, "banana");
            put(30, "melon");
            put(31, "pineapple");
            put(32, "melon");
            put(33, "pineapple");
            put(34, "cucumber");
            put(35, "orange");
            put(36, "apple");
            put(37, "orange");
            put(38, "grape");
            put(39, "orange");
            put(40, "grape");
            put(41, "cherry");
            put(42, "pear");
            put(43, "cherry");
            put(44, "pear");
            put(45, "apple");
            put(46, "pear");
            put(47, "kiwi");
            put(48, "banana");
            put(49, "kiwi");
            put(50, "banana");
            put(51, "melon");
            put(52, "pineapple");
            put(53, "melon");
            put(54, "apple");
            put(55, "cucumber");
            put(56, "pineapple");
            put(57, "cucumber");
            put(58, "orange");
            put(59, "cucumber");
            put(60, "orange");
            put(61, "grape");
            put(62, "cherry");
            put(63, "apple");
            put(64, "cherry");
            put(65, "pear");
            put(66, "cherry");
            put(67, "pear");
            put(68, "kiwi");
            put(69, "pear");
            put(70, "kiwi");
            put(71, "banana");
            put(72, "apple");
            put(73, "banana");
            put(74, "melon");
            put(75, "pineapple");
            put(76, "melon");
            put(77, "pineapple");
            put(78, "cucumber");
            put(79, "pineapple");
            put(80, "cucumber");
            put(81, "apple");
            put(82, "grape");
            put(83, "orange");
            put(84, "grape");
            put(85, "cherry");
            put(86, "grape");
            put(87, "cherry");
            put(88, "pear");
            put(89, "cherry");
            put(90, "apple");
            put(91, "kiwi");
            put(92, "banana");
            put(93, "kiwi");
            put(94, "banana");
            put(95, "melon");
            put(96, "banana");
            put(97, "melon");
            put(98, "pineapple");
            put(99, "apple");
            put(100, "pineapple");
        }};

        int value = n;
        String fruit;

        do {
            value = value - String.valueOf(value).chars().map(Character::getNumericValue).sum();
            fruit = map.get(value);
        } while (fruit == null && value > 0 );

        return fruit;
    }
}
