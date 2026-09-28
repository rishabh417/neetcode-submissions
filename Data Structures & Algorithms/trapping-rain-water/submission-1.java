class Solution {
    public int trap(int[] height) {

        // 0 , 2 , 2 , 2 , 3, 3, 3 , 3 , 3 , 3 left greater element
        // 3 , 3 , 3 , 3 , 3, 3, 3 , 2 , 1 , 1 right greater element 
        
        // 2 + 2 + 3 + 2  min(left,right) - min(i) iff this is positive 

        int [] max_left = new int[height.length];
        int [] max_right = new int[height.length];

        max_left[0] = height[0]; 
        max_right[height.length-1] = height[height.length-1]; 

        for(int i=1 ; i<height.length ; i++){
            max_left[i] = Math.max(max_left[i-1],height[i]);
        }

         for(int i=height.length-2 ; i>=0 ; i--){
            max_right[i] = Math.max(max_right[i+1],height[i]);
        }

        // System.out.println(Arrays.toString(max_left));
        // System.out.println(Arrays.toString(max_right));

        int total_water = 0;

        for(int i=0 ; i<height.length; i++){
            
            int calculate = Math.min(max_left[i],max_right[i]) - height[i];
            if(calculate > 0) total_water += calculate;
        }

        return total_water;
    }
}
