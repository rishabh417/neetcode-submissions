class Solution {
    public int characterReplacement(String s, int k) {

        /*
            requirement = window_length - frequency_of_repeating_characters
            accepted criteria : requirement <= k 
            i will take two pointer approach start_index : 0 , last_index : k , this would be initial window size
            if k==0 then just return the longest substring containing repeating characters.

            A A A B B A B B , k = 1 : 
            A A B B C B B B A A C B B , k = 2 : 
        */

        int n = s.length();

        int window_length = k;
        int max_length = 0;
        int left = 0;
        int max_frequency = 0;
        int answer = 0;

        HashMap<Character,Integer> map = new HashMap<>();
        for(int right = 0; right < n; right++){
            
            int freq = map.getOrDefault(s.charAt(right),0)+1;
            map.put(s.charAt(right),freq);
            
            max_frequency = Math.max(freq,max_frequency);
            int requirement = (right - left + 1) - max_frequency;
            while(requirement > k){

                freq = map.getOrDefault(s.charAt(left),0)-1;
                if(freq == 0) map.remove(s.charAt(left));
                else map.put(s.charAt(left),freq);
                left++;
                requirement = (right - left + 1) - max_frequency;

            }

            answer = Math.max(answer,(right - left + 1));

        }
       
        
        return answer;
    }
}
