
class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int rows = moveTime.length;
        int cols = moveTime[0].length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int[][] time = new int[rows][cols];
        
        for (int[] row : time) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        minHeap.offer(new int[]{0, 0, 0}); // time, x, y
        time[0][0] = 0;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int currentTime = current[0], x = current[1], y = current[2];

            if (x == rows - 1 && y == cols - 1) {
                return currentTime;
            }

            for (int[] dir : directions) {
                int newX = x + dir[0], newY = y + dir[1];

                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols) {
                    int waitTime = Math.max(moveTime[newX][newY] - currentTime, 0);
                    int newTime = currentTime + 1 + waitTime;

                    if (newTime < time[newX][newY]) {
                        time[newX][newY] = newTime;
                        minHeap.offer(new int[]{newTime, newX, newY});
                    }
                }
            }
        }

        return -1; // unreachable
    }
}