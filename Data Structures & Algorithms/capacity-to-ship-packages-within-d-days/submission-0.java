class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        for (int i = 0; i < weights.length; i++) {
            left = Math.max(left, weights[i]);
            right += weights[i];
        }

        int ans = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int daysNeeded = calculateDays(weights, mid);

            if (daysNeeded <= days) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public int calculateDays(int[] weights, int capacity) {

        int days = 1;
        int currentLoad = 0;

        for (int i = 0; i < weights.length; i++) {

            if (currentLoad + weights[i] > capacity) {
                days++;
                currentLoad = 0;
            }

            currentLoad += weights[i];
        }

        return days;
    }
}