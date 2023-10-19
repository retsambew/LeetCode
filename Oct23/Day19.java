class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = 0;
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(t);

        while(i<s1.length()){
            if(s1.charAt(i)=='#' && i==0) s1.delete(0,1);
            else if(s1.charAt(i)=='#'){
                s1.delete(i-1,i+1);
                i--;
            }
            else i++;
        }
        i=0;
        while(i<s2.length()){
            if(s2.charAt(i)=='#' && i==0) s2.delete(0,1);
            else if(s2.charAt(i)=='#'){
                s2.delete(i-1,i+1);
                i--;
            }
            else i++;
        }

        return s1.toString().equals(s2.toString());
    }
}