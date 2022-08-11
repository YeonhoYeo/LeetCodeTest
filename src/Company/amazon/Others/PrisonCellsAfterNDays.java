package Company.amazon.Others;

import java.util.Arrays;

public class PrisonCellsAfterNDays {

    public static void main(String[] args) {
        int[] cells = {0, 1, 0, 1, 1, 0, 0, 1};
        int n = 7;
        System.out.println(Arrays.toString(prisonAfterNDays(cells, n)));
    }

    public static int[] prisonAfterNDays(int[] cells, int n) {
        System.out.printf(n + " n : ");
        int temp = cells[0];
        for (int i = 1; i < cells.length - 1; i++) {
            if ((temp == 0 && cells[i + 1] == 0) || (temp == 1 && cells[i + 1] == 1)) {
                temp = cells[i];
                cells[i] = 1;
            } else {
                temp = cells[i];
                cells[i] = 0;
            }
        }
        cells[cells.length - 1] = 0;
        System.out.println(Arrays.toString(cells));
        if (n == 1) {
            return cells;
        } else {
            return prisonAfterNDays(cells, n-1);
        }
    }
}
