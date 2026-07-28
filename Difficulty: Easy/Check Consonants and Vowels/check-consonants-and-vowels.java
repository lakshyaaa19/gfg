class Solution {

    static void checkString(String s) {
        int v = 0;
        int c = 0;

        // code here
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
        v++;
        else
        c++;
        } 
         if(v>c)
         System.out.println("Yes");
         else if(v<c)
         System.out.println("No");
         else
         System.out.println( "Same" );
    }
}