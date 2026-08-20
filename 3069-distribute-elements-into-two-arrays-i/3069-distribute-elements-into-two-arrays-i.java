class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int lastIdx1 = 0;
        int lastIdx2 = 0;
        for (int i = 2; i < n; i++) {
            if (arr1[lastIdx1] > arr2[lastIdx2]) {
                arr1[++lastIdx1] = nums[i];
            } else {
                arr2[++lastIdx2] = nums[i];
            }
        }
        int idx=0;
        for (int i = idx; i <= lastIdx1; i++) {
            nums[idx++] = arr1[i];
        }
        for (int i = 0; i <= lastIdx2; i++) {
            nums[idx++] = arr2[i];
        }
        return nums;
    }
}