package net.kiranatos.k3.e001.junk;

/*  Line Safari - Is that a line?

Kata Task:
    You are given a "grid", which always includes exactly two end-points indicated by "X"
You simply need to return true/false if you can detect a one and only one "valid" line joining those points.
A line can have the following characters :
    " - " = left / right
    " | " = up / down
    " + " = corner
Rules for valid lines
    The most basic kind of valid line is when the end-points are already adjacent
                            X
                            X
or :
    XX

    - The corner character (+) must be used for all corners (but only for corners).
    - It must be possible to follow the line with no ambiguity (lookahead of just one step).
    - The line may take any path between the two points.
    - Sometimes a line may be valid in one direction but not the other. Such a line is still considered valid.
    - Every line "character" found in the grid must be part of the line. If extras are found then the line is not valid.

Examples:
    Good lines:
1) X---------X
2)      X
        |
        |
        X
3)
   +--------+
X--+        +--+
               |
               X
4)
   +-------------+
   |             |
X--+      X------+
5)
   +-------+
   |      +++---+
X--+      +-+   X

    Bad lines:
1) X-----|----X

2)      X
        |
        +
        X
3)
   |--------+
X---        ---+
               |
               X
4)
   +------ 
   |       
X--+      X

5)
      +------+
      |      |
X-----+------+
      |
      X

    Hint: Imagine yourself walking a path where you can only see your 
very next step. Can you know which step you must take, or not? 
*/
public class Kata30001_Dinglemouse2 {
    
//    private static char [][] gr;
//    private static boolean flag = true;
//    private static int 
//            countX = 0, 
//            xP1 = -1, 
//            yP1 = -1,
//            xP2 = -1, 
//            yP2 = -1,
//            countLeftRight = 0,
//            countUpDown = 0,
//            countCorner = 0;
//    
//    private static int[][] coords = new int[2][];
//    private static int[] countOfWays;
//    private static int indexOfCountOfWays=0;
//    
//    private class Arrow {
//        boolean UP, DOWN, LEFT, RIGHT;
//        int x, y, last_x, last_y, next_x, next_y, countWays;        
//
//        public Arrow() {
//        }
//        
//    }
//
//    public static boolean line(final char [][] grid) {
//        countOfWays = new int[grid.length * grid[0].length];
//        gr = grid;
//        count();
//        if (countX!=2) return false;
//        
//        
//        
//        //step(xP,yP);
//        //step(0,3);
//        //step(0, 3, true, true, true, true);
//        
//        
//        
//         return false;
//    }
//    
//    
//    
//
//    
//    
//    private static void count(){
//        for (int i = 0; i < gr.length; i++) {
//            for (int j = 0; j < gr[i].length; j++) {
//                //System.out.print("["+i+":"+j+"]");
//                switch (gr[i][j]) {
//                    case '-' : countLeftRight++;    break;
//                    case '|' : countUpDown++;       break;
//                    case '+' : countCorner++;       break;
//                    case 'X' : { 
//                        countX++;
//                        if ((xP1<0)&&(xP1<0)) {
//                            xP1 = j;
//                            yP1 = i;
//                        } else {
//                            xP2 = j;
//                            yP2 = i;                        
//                        }
//                        System.out.println(" ["+j+":"+i+"]");
//                        break;
//                    } 
//                }                
//            }        
//        }        
//        
//        System.out.println("Total:\n'X' = " + countX);
//        System.out.println("'-' = " + countLeftRight);
//        System.out.println("'|' = " + countUpDown);
//        System.out.println("'+' = " + countCorner);  
//        System.out.println("x max= " + gr[0].length);
//        System.out.println("y max= " + gr.length);
//        System.out.println("");
//    }
//    
//    private static boolean[] getWay(int x, int y, boolean[] lastDirection){
//        
//        
//        if (gr[y][x] == '-') { 
//            if (lastDirection[0])       return new boolean[]{true, false, false, false};                 
//            else if (lastDirection[2])  return new boolean[]{false, false, true, false}; 
//            else System.out.println("Error 1");
//        } 
//        else if (gr[y][x] == '|') { 
//            if (lastDirection[3])       return new boolean[]{false, false, false, true};                 
//            else if (lastDirection[1])  return new boolean[]{false, true, false, false}; 
//            else System.out.println("Error 2");
//        }
//        else if (gr[y][x] == '+') { 
//            if (lastDirection[0])       return new boolean[]{false, true,  false, true};
//            else if (lastDirection[1])  return new boolean[]{true,  false, true,  false}; 
//            else if (lastDirection[2])  return new boolean[]{false, true,  false, true};
//            else if (lastDirection[3])  return new boolean[]{true,  false, true,  false}; 
//            else System.out.println("Error 3");
//        }
//        else if (gr[y][x] == 'X') {
//            if (gr[y][x+1] != ' ') {
//                if (gr[y][x+1] != '-') {}
//            }
//            if (gr[y+1][x] != ' ') {}
//            if (gr[y][x-1] != ' ') {}
//            if (gr[y-1][x] != ' ') {}
//        }
//        
//        
//        return null;
//    }
//        
//    public static void main(String[] args) {
//        char grid[][] = Preloaded.makeGrid(new String[] {
//            "                      ",    
//            "   +-------+          ",
//            "   |      +++---+     ",
//            "X--+      +-+   X      "
//        });
//        Preloaded.showGrid(grid);
//        
//        line(grid);
//    }  
}

