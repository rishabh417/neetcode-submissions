class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        /*
            zxyzaxyz
            zxy zaxy z

            3
            zxy
            xyz
            xyza
            xzay
            xayz

        */

        HashSet<Character> set = new LinkedHashSet<>();

        int lenght_of_substring = 0;
        int left = 0;
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            // System.out.println(temp);
            if(set.contains(temp)){
                lenght_of_substring = Math.max(lenght_of_substring,set.size());
                
                while(set.contains(temp)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(temp);
            }
            else{
                set.add(temp);
            }
        }

        lenght_of_substring = Math.max(lenght_of_substring,set.size());

        return lenght_of_substring;
    }
}
