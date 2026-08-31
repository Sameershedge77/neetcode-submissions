class Solution {
    public int longestConsecutive(int[] arr) {
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {
        set.add(arr[i]);
    }

    int maxLength = 0;

    for (int num : set) {

        if (!set.contains(num - 1)) {

            int current = num;
            int count = 1;

            while (set.contains(current + 1)) {
                current++;
                count++;
            }

            if (count > maxLength) {
                maxLength = count;
            }
        }
    }

    return maxLength;  
    }
}
