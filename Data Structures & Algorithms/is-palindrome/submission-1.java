class Solution {
    public boolean isPalindrome(String s) {
        
        String new_concat = "";
        for(char in : s.toCharArray()){
            if(in != ' ' && Character.isLetterOrDigit(in)) new_concat+= Character.toLowerCase(in);
        }

        int first = 0;
        int last = new_concat.length()-1;

System.out.println(new_concat);

        while(first<last){
            if(new_concat.charAt(first)!=new_concat.charAt(last)) return false;
            first++;
            last--;
        }

        return true;
    }
}
