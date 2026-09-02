class Solution {
    public int subarraySum(int[] arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    map.put(0, 1);

    int currentSum = 0;
    int count = 0;

    for (int i = 0; i < arr.length; i++) {

        // update currentSum
        currentSum += arr[i];

        // calculate needed
        int needed = currentSum - k;

        // check map
        if (map.containsKey(needed)) {
            count += map.get(needed);
        }

        // store currentSum
        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
    }

    return count;
    }
}