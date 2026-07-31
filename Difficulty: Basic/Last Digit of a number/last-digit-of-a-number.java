import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
         int last=n%10;
         if(last<0)
         last=last*(-1);
         System.out.print(last);
    }
}