package net.kiranatos;

public class SandBox {
    
    public static void main(String[] args) {
        int a = 1;
        if (a>0)
            a++;
        a++;
        System.out.println(a);
//        System.out.println(expressionsMatter(2, 10, 3));
//        System.out.println(points(new String[]{"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
        
    }
    
    public static int expressionsMatter(int a, int b, int c)    {
        int[] arr = new int[]{ 
            a+b+c,
            a+b*c,
            a*b+c,
            a*b*c,
            (a+b)*c,
            a*(b+c),
            (a+c)*b};
        java.util.Arrays.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
                
        return arr[arr.length-1];
    }    
    
    public static int points(String[] games) {
        int points = 0;
        for (int i = 0; i < games.length; i++) {
            String[] xy = games[i].split(":");
            int x = Integer.valueOf(xy[0]);
            int y = Integer.valueOf(xy[1]);
            if (x > y) points += 3;
            else if (x == y) points++;                            
        }
        return points;
    }
}
