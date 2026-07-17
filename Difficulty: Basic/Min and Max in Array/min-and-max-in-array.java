import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max=arr[0], min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        ArrayList<Integer> result=new ArrayList<>();
        result.add(min);
        result.add(max);
        
        return result;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int a[]={1,2,3,4,5};
            s.getMinMax(a);
        }
    }

