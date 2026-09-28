class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length-1;

        int most_water = Integer.MIN_VALUE;

        while(left < right){

           int temp = Math.min(heights[left],heights[right]);
           int width = right - left;
           most_water = Math.max(most_water,(width * temp));
           if(heights[left] < heights[right]) left++;
           else right--;

        }

        return most_water;
        
    }
}
