class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isanagram =false;
        if(s.length() == t.length()){
            
            char[] charArrays = s.toCharArray();
            char[] charArrayt = t.toCharArray();
            Arrays.sort(charArrays);
            Arrays.sort(charArrayt);
            if(Arrays.equals(charArrays, charArrayt)){
                isanagram =true;
            }
            return isanagram;
        }
        else{
            return false;
        }
        }
    }

