class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> indx = new HashMap<>();
          int n = nums.length;
        for(int i=0;i<n;i++){
            indx.put(nums[i],i);
        }
        
      

        for(int i=0;i<n;i++){
            int dif = target - nums[i];

            if(indx.containsKey(dif) && indx.get(dif) != i){
                return new int[]{i,indx.get(dif)};
            }
        }
        return new int[0];
    
    }
}
