class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length<=1) return nums.length;
        
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            if(!set.contains(n))
               { min_heap.add(n);
                set.add(n);}
        }

        int length_of_max_sequence = 1;
        int current_length = 1;
        int candidate_number = min_heap.poll();

        System.out.println(min_heap);

        while(!min_heap.isEmpty()){
            int next_number = min_heap.poll();
            if(candidate_number + 1 == next_number){                
                current_length++;
            }
            else{
                length_of_max_sequence = Math.max(current_length,length_of_max_sequence);
                current_length = 1;
            }
            candidate_number = next_number;

        }

        return Math.max(current_length,length_of_max_sequence);

    }
}
