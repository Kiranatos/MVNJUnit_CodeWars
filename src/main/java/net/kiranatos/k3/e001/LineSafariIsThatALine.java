package net.kiranatos.k3.e001;

/*  Autor: dinglemouse https://www.codewars.com/users/dinglemouse

Line Safari - Is that a line?

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

public class LineSafariIsThatALine {    
    private static char [][] gr;
    private static boolean flag = true;
    private static int 
            countX = 0, 
            xP1 = -1, 
            yP1 = -1,
            xP2 = -1, 
            yP2 = -1,
            countLeftRight = 0,
            countUpDown = 0,
            countCorner = 0;
    
    private static int[][] coords = new int[2][];
    private static int[] countOfWays;
    private static int indexOfCountOfWays=0;
        
    public static void main(String[] args) {
        char grid[][] = Preloaded.makeGrid(new String[] {
            "                      ",    
            "   +-------+          ",
            "   |      +++---+     ",
            "X--+      +-+   X      "
        });
        Preloaded.showGrid(grid);
        
        System.out.println("Is that a line? " + line(grid));
    } 

    public static boolean line(final char [][] grid) {
        countOfWays = new int[grid.length * grid[0].length];
        gr = grid;
        count();
        if (countX!=2) return false;
        
        
        
        //step(xP,yP);
        //step(0,3);
        //step(0, 3, true, true, true, true);
        
        
        
         return false;
    }
    
    /**
     * подсчитывает количество символов в матрице и находит координаты начальной и конечной точки.
     */
    private static void count(){
        for (int i = 0; i < gr.length; i++) {
            for (int j = 0; j < gr[i].length; j++) {
                //System.out.print("["+i+":"+j+"]");
                switch (gr[i][j]) {
                    case '-' : countLeftRight++;    break;
                    case '|' : countUpDown++;       break;
                    case '+' : countCorner++;       break;
                    case 'X' : {
                        countX++;
                        if ((xP1<0)&&(yP1<0)) {
                            xP1 = j;
                            yP1 = i;
                        } else {
                            xP2 = j;
                            yP2 = i;                        
                        }
                        System.out.println("X ["+j+":"+i+"]");
                        break;
                    } 
                }                
            }        
        }        
        
        System.out.println("Total:\n'X' = " + countX);
        System.out.println("'-' = " + countLeftRight);
        System.out.println("'|' = " + countUpDown);
        System.out.println("'+' = " + countCorner);  
        System.out.println("x max= " + gr[0].length);
        System.out.println("y max= " + gr.length);
        System.out.println("");
    } // end of count method
    
    private static boolean[] getWay(int x, int y, boolean[] lastDirection){
        
        
        if (gr[y][x] == '-') { 
            if (lastDirection[0])       return new boolean[]{true, false, false, false};                 
            else if (lastDirection[2])  return new boolean[]{false, false, true, false}; 
            else System.out.println("Error 1");
        } 
        else if (gr[y][x] == '|') { 
            if (lastDirection[3])       return new boolean[]{false, false, false, true};                 
            else if (lastDirection[1])  return new boolean[]{false, true, false, false}; 
            else System.out.println("Error 2");
        }
        else if (gr[y][x] == '+') { 
            if (lastDirection[0])       return new boolean[]{false, true,  false, true};
            else if (lastDirection[1])  return new boolean[]{true,  false, true,  false}; 
            else if (lastDirection[2])  return new boolean[]{false, true,  false, true};
            else if (lastDirection[3])  return new boolean[]{true,  false, true,  false}; 
            else System.out.println("Error 3");
        }
        else if (gr[y][x] == 'X') {
            if (gr[y][x+1] != ' ') {
                if (gr[y][x+1] != '-') {}
            }
            if (gr[y+1][x] != ' ') {}
            if (gr[y][x-1] != ' ') {}
            if (gr[y-1][x] != ' ') {}
        }
        
        
        return null;
    }
        
        
        
    

    private static int[] step(int x, int y, boolean east, boolean south, boolean west, boolean nourth){
        int x1, y1;
        int[] coord = new int[]{-1,-1};
        System.out.println("..... metod step got coords: " + x + " : " + y);
        
        // ------------- EAST
        if ((x+1<gr[y].length) && (gr[y][x+1]!=' '))  {
            System.out.println("EAST: " + gr[y][x+1] + " [y" + y +" : x"+ (x+1) + "] ");
            
            if (gr[y][x+1]=='|')    return new int[]{-1,-1}; // вертикаль на горизонтале
            if (!east)              return new int[]{-1,-1};  // нельзя двигаться дальше вправо
            if (gr[y][x+1]=='-') { 
                gr[y][x] = ' ';
                coord = step(x+1, y, true, false, false, false);
            }
            if (gr[y][x+1]=='+') {
                gr[y][x] = ' ';
                coord = step(x+1, y, false, true, false, true);            
            }
            if (gr[y][x+1]=='X') return new int[]{x+1,y}; //конец пути
            
            
        }
        
        // ------------- WEST
        if ((x-1>=0)&&(gr[y][x-1])!=' ')            { 
            if (gr[y][x-1]=='|')  return new int[]{-1,-1};
            System.out.println("WEST " + gr[y][x-1]);
        }
        
        // ------------- SOUTH
        if ((y+1<gr.length)&&(gr[y+1][x])!=' ')     { 
            System.out.println("SOUTH: " + gr[y+1][x] + " [y" + (y+1) +" : x"+ x + "] ");
            
            if (gr[y+1][x]=='-')    return new int[]{-1,-1}; // вертикаль на горизонтале
            if (!south)              return new int[]{-1,-1};  // нельзя двигаться дальше вниз
            if (gr[y+1][x]=='|') { 
                gr[y][x] = ' '; // стираем
                coord = step(x, y+1, false, true, false, false);
            }
            if (gr[y+1][x]=='+') {
                gr[y][x] = ' '; // стираем
                coord = step(x, y+1, true, false, true, false);
            }
            if (gr[y+1][x]=='X') return new int[]{x,y+1}; //конец пути            
        }
        
        // ------------- NOUTH
        if ((y-1>=0)&&(gr[y-1][x])!=' ')            { 
            
            System.out.println("NORTH: " + gr[y-1][x] + " [y" + (y-1) +" : x"+ x + "] ");
            
            if (gr[y-1][x]=='-')    return new int[]{-1,-1}; // горизонталь на вертикале
            if (!nourth)              return new int[]{-1,-1};  // нельзя двигаться дальше вверх
            if (gr[y-1][x]=='|') { 
                gr[y][x] = ' ';
                coord = step(x, y-1, false, false, false, true);
            }
            if (gr[y-1][x]=='+') {
                gr[y][x] = ' ';
                coord = step(x, y-1, true, false, true, false);            
            }
            if (gr[y-1][x]=='X') return new int[]{x,y-1}; //конец пути            
        }
        
         return coord;        
    }
}