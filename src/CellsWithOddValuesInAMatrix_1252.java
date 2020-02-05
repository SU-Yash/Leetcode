public class CellsWithOddValuesInAMatrix_1252 {
    public static int oddCells(int n, int m, int[][] ind) {
        int[][] a = new int[n][m];
        for(int[] c : ind){
            for(int j=0; j < m; j++)
                a[c[0]][j]++;
            for(int i=0; i < n; i++)
                a[i][c[1]]++;
        }
        int count = 0;
        for(int i=0; i < n; i++)
            for(int j=0; j < m; j++)
                if(a[i][j] % 2 != 0)
                    ++count;
        return count;
    }
    public static void main(String[] args){
        System.out.println(oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
    }
}
