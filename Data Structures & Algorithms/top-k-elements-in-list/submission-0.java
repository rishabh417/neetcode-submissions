class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int [] ans = new int[k];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> max_heap = new PriorityQueue<>(
            (a,b) -> Integer.compare(b.getValue(),a.getValue())
        );

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            max_heap.add(entry);
        }

        for(int i=0;i<k;i++){
            ans[i] = max_heap.poll().getKey();
        }
        
        return ans;
    }
}
