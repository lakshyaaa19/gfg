
class Solution {

    public static int product(int arr[], int n) {
        int prd=1;
        for(int i=0;i<n;i++){
            prd*=arr[i];
            
        }
        return prd;
    }
    static{
        int a[]={1,2,3,4,5};
        Solution.product(a,5);
    }
}
