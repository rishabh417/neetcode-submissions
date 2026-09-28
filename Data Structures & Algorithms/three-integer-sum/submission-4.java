class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        // Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        int target = 0;

        for(int i=0;i<nums.length-2;i++){

            if(i>0 && nums[i]==nums[i-1]) continue;

            int temp_target = target - nums[i];



            int start = i+1; 
            int end = nums.length-1;

            while(start < end){
                int total = nums[start] + nums[end];
                
                if(total == temp_target) {
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[start]);
                    ls.add(nums[end]);
                    // if(!set.contains(ls))
                    //    { 
                        // System.out.println(ls);
                        ans.add(ls);
                        // set.add(ls);
                        // break;
                        start++;
                        end--;
                        
                    //    }     
                       while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }

                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }               
                }
                else if(total < temp_target){
                    start++;
                }
                else{
                    end--;
                }
            }

        }
        
        return ans;
    }
}
