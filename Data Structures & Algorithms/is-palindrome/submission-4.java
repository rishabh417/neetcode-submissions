class Solution {
    public boolean isPalindrome(String s) {
        
        // String new_concat = "";
        // for(char in : s.toCharArray()){
        //     if(in != ' ' && Character.isLetterOrDigit(in)) new_concat+= Character.toLowerCase(in);
        // }

        // int first = 0;
        // int last = new_concat.length()-1;

        // while(first<last){
        //     if(new_concat.charAt(first)!=new_concat.charAt(last)) return false;
        //     first++;
        //     last--;
        // }

        // return true;

        int first = 0;
        int last = s.length()-1;

        while(first < last){

            while(first<s.length()-1 &&( !Character.isLetterOrDigit(s.charAt(first)) || s.charAt(first) == ' ')) first++;
            while(last > 0 && (!Character.isLetterOrDigit(s.charAt(last)) || s.charAt(last) == ' ')) last--;

            if(last>0 && (Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last)))) return false;
            first++;
            last--;

        }

        return true;

    }
}
