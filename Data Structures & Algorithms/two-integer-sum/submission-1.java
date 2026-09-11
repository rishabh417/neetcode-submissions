class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        int [] ans = new int[2];

        for(int i=0;i<nums.length;i++){

            int toSearch = target - nums[i];

            if(map.containsKey(toSearch)){
                ans[0] = map.get(toSearch);
                ans[1] = i;
                return ans;
            }

            map.put(nums[i],i);
        
        
        }

        return ans;

    }
}
