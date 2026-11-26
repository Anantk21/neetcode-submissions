class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int n = nums.length;
        // int[] arr = new int[n];
        // ArrayList<Integer> arr = new ArrayList<>();
        // int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}