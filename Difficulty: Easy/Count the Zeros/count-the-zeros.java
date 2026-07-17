class Solution {
    int countZeroes(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Solution s= new Solution();
        int a[]={1,0,0,0,1,2,0,-1};
        s.countZeroes(a);
    }
}
