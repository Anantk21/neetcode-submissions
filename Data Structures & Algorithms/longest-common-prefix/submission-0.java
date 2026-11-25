class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        int j=0;
        String fr = strs[0];
        int n = strs.length-1;
        String la = strs[n];

        while(j<fr.length()){
            if(fr.charAt(j)==la.charAt(j)){
                j++;
            }
            else{
                break;
            }
        }
        return fr.substring(0,j);
    }
}