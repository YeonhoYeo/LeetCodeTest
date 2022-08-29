package Company.amazon.TreesandGraphs;

import java.util.*;

public class CutOffTreesforGolfEvent {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {

        List<List<Integer>> forest = new ArrayList();
        forest.add(List.of(new Integer[]{4, 2, 3}));
        forest.add(List.of(new Integer[]{0, 0, 1}));
        forest.add(List.of(new Integer[]{7, 6, 5}));
        System.out.println(cutOffTree(forest));
    }

    public static int dist(List<List<Integer>> forest, int startRow, int startCol, int targetRow, int targetCol) {
        int rowSize = forest.size();
        int colSize = forest.get(0).size();
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>((a, b) -> Integer.compare(a[0], b[0]));
        heap.offer(new int[]{0, 0, startRow, startCol});

        HashMap<Integer, Integer> cost = new HashMap();
        cost.put(startRow * colSize + startCol, 0);

        while (!heap.isEmpty()) {
            int[] cur = heap.poll();
            int g = cur[1];
            int startR = cur[2];
            int startC = cur[3];
            if (startR == targetRow && startC == targetCol) return g;
            for (int dindex = 0; dindex < 4; ++dindex) {
                int nr = startR + dr[dindex];
                int nc = startC + dc[dindex];
                if (0 <= nr &&
                        nr < rowSize &&
                        0 <= nc &&
                        nc < colSize &&
                        forest.get(nr).get(nc) > 0) {
                    int ncost = g + 1 + Math.abs(nr - targetRow) + Math.abs(nc - targetRow);
                    System.out.println("ncost = " + ncost);
                    if (ncost < cost.getOrDefault(nr * colSize + nc, rowSize * colSize)) {
                        cost.put(nr * colSize + nc, ncost);
                        heap.offer(new int[]{ncost, g + 1, nr, nc});
                    }
                }
            }
        }
        return -1;
    }

    public static int cutOffTree(List<List<Integer>> forest) {
        System.out.println("forest = " + forest);

        List<List<Integer>> trees = new LinkedList<>();
        for (int row = 0; row < forest.size(); row++) {
            for (int col = 0; col < forest.get(row).size(); col++) {
                if (forest.get(row).get(col) > 1) {
                    trees.add(List.of(new Integer[]{forest.get(row).get(col), row, col}));
                }
            }
        }

        Collections.sort(trees, (o1, o2) -> {
            if (Integer.compare(o1.get(0), o2.get(0)) >= 0) return 1;
            else return -1;
        });

        System.out.println("trees = " + trees);
        int ans = 0;
        int startRow = 0;
        int startCol = 0;
        for (List<Integer> tree : trees) {
            int d = dist(forest, startRow, startCol, tree.get(1), tree.get(2));
            System.out.println("d = " + d);
            if (d < 0) return -1;
            ans += d;
            startRow = tree.get(1);
            startCol = tree.get(2);
        }

        return ans;


    }
}
