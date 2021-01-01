package net.kiranatos.k3.e001;

/**
 * Этого класса нету на сайте, вероятнее всего он скрыт. Поэтому я его дописал и реализовал сам.
 */
public class Preloaded {    
    /**
     * Выводит на экран 2D матрицу
     * @param grid char-матрица
     */
    public static void showGrid(char[][] grid){
        System.out.println("\n Showing Grid in char matrix");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);                
            }
            System.out.println();
        }
        System.out.println();
    }
    
    /**
     * Преобразовывает 1D матрицу строк в 2D матрицу символов
     * @param matrix 1D матрица строк
     * @return 2D матрица символов
     */
    public static char[][] makeGrid(String[] matrix){        
        char[][] cM = new char[matrix.length][];        
        for (int i = 0; i < matrix.length; i++) {
            cM[i] = matrix[i].toCharArray();
        }        
        return cM;
    }    
}