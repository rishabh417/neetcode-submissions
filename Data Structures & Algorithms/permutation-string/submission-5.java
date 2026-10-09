class Solution {
    public boolean checkInclusion(String s1, String s2) {        
        
        int s1_pointer = 0;
        int s2_pointer = 0;
        int windowSize = s1.length();
        boolean answer = false;

       HashMap<Character,Integer> map = new HashMap<>();

       for(int i=0;i<s1.length();i++) map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);

       for(int i=0;i<=s2.length()-s1.length();i++){

            HashMap<Character,Integer> temp_map = new HashMap<>(map);
            windowSize = s1.length();

            for(int j=i;j<s1.length()+i;j++){

                if(temp_map.containsKey(s2.charAt(j))){
                    if(temp_map.get(s2.charAt(j)) > 0) 
                        windowSize--;
                    temp_map.put(s2.charAt(j),temp_map.getOrDefault(s2.charAt(j),0)-1);
                }

            }

            if(windowSize==0) return true;
           
       }

        return false;
    }

}
