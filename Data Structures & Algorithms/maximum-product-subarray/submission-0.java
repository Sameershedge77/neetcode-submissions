class Solution {
    public int maxProduct(int[] nums) {
        int currentMax = nums[0];
    int currentMin = nums[0];
    int maxProduct = nums[0];

    for (int i = 1; i < nums.length; i++) {

        int num = nums[i];

        int product1 = num;
        int product2 = currentMax * num;
        int product3 = currentMin * num;

        int newMax = Math.max(product1,
                       Math.max(product2, product3));

        int newMin = Math.min(product1,
                       Math.min(product2, product3));

        currentMax = newMax;
        currentMin = newMin;

        maxProduct = Math.max(maxProduct, currentMax);
    }

    return maxProduct;
    }
}
