class Solution {
    public static String reverseString(String s) {
        // code here
        String s1="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            s1+=ch;
        
        }
        return s1;
    }
}