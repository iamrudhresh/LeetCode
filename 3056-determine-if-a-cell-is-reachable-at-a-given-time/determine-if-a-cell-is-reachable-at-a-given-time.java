public class Solution {
    public boolean isReachableAtTime(int startX, int startY, int targetX, int targetY, int time) {
        // Check if the starting point is the same as the target point.
        if (startX == targetX && startY == targetY) {
            // If they are the same, check if time is 1, and return false (impossible to stay at the same cell for 1 second).
            if (time == 1) {
                return false;
            }
        }
        // Calculate the absolute differences in x and y coordinates between the starting and target points.
        int xDifference = startX - targetX;
        int yDifference = startY - targetY;
        
        // Ensure that xDifference and yDifference are non-negative.
        if (xDifference < 0) {
            xDifference = -xDifference;
        }
        if (yDifference < 0) {
            yDifference = -yDifference;
        }
        
        // Calculate the maximum difference between xDifference and yDifference.
        int maxDifference = Math.max(xDifference, yDifference);
        
        // Check if the maximum difference is less than or equal to the given time.
        if (maxDifference <= time) {
            return true; // It's possible to reach the target within the specified time.
        }
        
        // If the maximum difference is greater than the given time, return false.
        return false;
    }
}