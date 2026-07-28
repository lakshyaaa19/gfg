class Solution {
    public static void utility(String s) {
        // code here(
       char[] ch= s.toCharArray();
       for(int i=0;i<ch.length;i++){
           if(i%2==0)
           System.out.print(ch[i]);
       }
    }
}