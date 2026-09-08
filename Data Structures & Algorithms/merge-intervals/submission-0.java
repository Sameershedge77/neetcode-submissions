class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

    List<int[]> result = new ArrayList<>();

    int start = intervals[0][0];
    int end = intervals[0][1];

    for (int i = 1; i < intervals.length; i++) {

        int nextStart = intervals[i][0];
        int nextEnd = intervals[i][1];

        // Overlapping
        if (nextStart <= end) {

            end = Math.max(end, nextEnd);

        } else {

            // No overlap → save current interval
            result.add(new int[]{start, end});

            // Move to next interval
            start = nextStart;
            end = nextEnd;
        }
    }

    // Add final interval
    result.add(new int[]{start, end});

    return result.toArray(new int[result.size()][]); 
    }
}
