import java.util.Stack;
import java.util.Scanner;
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    private Stack<Pair> stack = new Stack<>();

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        int target = pixels[row][column];
        stack.push(new Pair(row, column));
        while (!stack.isEmpty())
        {
            Pair p = stack.pop();
            int r = p.getRow();
            int c = p.getColumn();
            if (r >= 0 && r < SIZE && c >= 0 && c < SIZE &&
                pixels[r][c] == target)
            {
                pixels[r][c] = 9;
                stack.push(new Pair(r - 1, c));
                stack.push(new Pair(r + 1, c));
                stack.push(new Pair(r, c - 1));
                stack.push(new Pair(r, c + 1));
            }
        }
    }

    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%3d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
