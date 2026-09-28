class Solution {
    public int trap(int[] height) {

        // 0 , 2 , 2 , 2 , 3, 3, 3 , 3 , 3 , 3 left greater element
        // 3 , 3 , 3 , 3 , 3, 3, 3 , 2 , 1 , 1 right greater element 
        
        // 2 + 2 + 3 + 2  min(left,right) - min(i) iff this is positive 

        int length_of_array = height.length;

        int [] max_left = new int[length_of_array];
        int [] max_right = new int[length_of_array];

        max_left[0] = height[0]; 
        max_right[length_of_array-1] = height[length_of_array-1]; 

        for(int i=1 ; i<length_of_array ; i++){
            max_left[i] = Math.max(max_left[i-1],height[i]);
        }

         for(int i=length_of_array-2 ; i>=0 ; i--){
            max_right[i] = Math.max(max_right[i+1],height[i]);
        }

        // System.out.println(Arrays.toString(max_left));
        // System.out.println(Arrays.toString(max_right));

        int total_water = 0;

        for(int i=0 ; i<length_of_array; i++){
            
            int calculate_water = Math.min(max_left[i],max_right[i]) - height[i];
            if(calculate_water > 0) total_water += calculate_water;
        }

        return total_water;
    }
}
