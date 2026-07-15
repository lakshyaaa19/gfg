class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum=0;
        int mean;
        int n= arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        mean=sum/n;
        return mean;
    } 
    static{
    Solution.findMean(new int[] {1,3,4,2,6,5,8,7});}
};
