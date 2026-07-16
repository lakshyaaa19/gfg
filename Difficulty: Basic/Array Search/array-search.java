class Solution {
    public int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
            return i;
            
        }
       return -1; 
    } 
    public static void main(String args[]){
        Solution obj=new Solution();
        int a[]={1,2,3,4,5};
        obj.search(a,6);
    }
}
