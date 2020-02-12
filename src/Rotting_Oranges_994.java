import java.util.ArrayDeque;
import java.util.Deque;

public class Rotting_Oranges_994 {

        private static final int[][] dirs = new int[][]{
                {0, 1}, // east
                {1, 0}, // south
                {0, -1}, // west
                {-1, 0} // north
        };

        public static int orangesRotting(int[][] grid) {
            int R = grid.length, C = grid[0].length;

            Deque<Pos> queue = new ArrayDeque<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 2) {
                        queue.add(new Pos(i, j));
                    }
                }
            }

            int level = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int k = 0; k < size; k++) {
                    Pos cur = queue.remove();
                    for (int[] dir : dirs) {
                        int ii = cur.x + dir[0];
                        int jj = cur.y + dir[1];

                        if (ii >= 0 && jj >= 0 && ii < grid.length && jj < grid[0].length && grid[ii][jj] == 1) {
                            grid[ii][jj] = 2;
                            queue.add(new Pos(ii, jj));
                        }
                    }
                }

                if (queue.size() == 0) break;
                level++;
            }

            for (int[] row : grid)
                for (int v : row)
                    if (v == 1) return -1;
            return level;

        }
        public static void main(String[] args){
            System.out.println("" + orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        }
}

class Pos {
    int x;
    int y;

    Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
