class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        // Find maximum pile
        for(int i=0;i<piles.length;i++){
        if(piles[i]>right){
          right = piles[i];
       }
    }

        int ans = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Calculate hours required
            long hours = calculateHours(piles,mid);
            // Apply Binary Search conditions
           if(hours<=h){
               ans = mid;
               right = mid -1;
            }else{
               left = mid+1;
          }

           

        }

        return ans;
    }

    public long calculateHours(int[] piles, int k) {

        long hours = 0;

        for (int i = 0; i < piles.length; i++) {
            hours += (piles[i] +(long) k - 1) / k;
        }

        return hours;
    }
}