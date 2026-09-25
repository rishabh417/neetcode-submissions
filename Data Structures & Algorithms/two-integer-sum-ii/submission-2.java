class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int start_index = 0;
        int end_index = numbers.length-1;

        while(start_index < end_index){


            if(numbers[start_index] + numbers[end_index]  == target) return new int[]{start_index+1,end_index+1};
            else if(numbers[start_index] + numbers[end_index]  < target) start_index++;
            else end_index--;


        }

        return new int[]{-1,-1};

    }
}
