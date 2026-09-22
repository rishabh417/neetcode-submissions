class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // first i will create a copy of strs array and sort characters of the string in it
        // then i will create a hashmap which will store (string,list of indices of anagrams of string)
        // then i will create list and replace indices with real value from the original string 

        HashMap<String,List<String>> map = new LinkedHashMap<>();

        List<List<String>> ans = new ArrayList<>();

        for(String s : strs){

            char [] charArs = s.toCharArray();
            Arrays.sort(charArs);
            String sortedKey = new String(charArs);

            if(map.containsKey(sortedKey)){
                map.get(sortedKey).add(s);
            }
            else{
                List<String> ls = new ArrayList<>();
                ls.add(s);
                map.put(sortedKey,ls);
            }

        }

        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        
        return ans;
    }
}
