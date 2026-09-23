class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int product_array [] = new int [nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int product_except_self = 1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i==j) continue;
        //         product_except_self *= nums[j];
        //     }
        //     product_array[i] = product_except_self;
        // }

        // return product_array;

        // i will calculate product of the array as whole 
        // if encountered 0 while caluclating i will skip that index while calculating product
        // then i will create a new array and store the total product / number at the index in original array
        // if there is 0 present in the array then except that index every index will have 0.


        int total_product = 1;
        boolean is_zero_present = false;
        int count_of_zero =2;
        for(int n : nums) {
            if(n != 0) total_product *= n;
            if(n == 0) {
                is_zero_present = true;
                count_of_zero--;
                }
        }

        if(count_of_zero<=0) total_product = 0;

        int [] ans = new int[nums.length];

        for(int i=0;i<ans.length;i++){
            if(!is_zero_present)
            {
                ans[i] = total_product / nums[i];
            }
            else{
                if(nums[i]==0) ans[i] = total_product;
                else ans[i] = 0;
            }

        }

        return ans;


    }
}  
