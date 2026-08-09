class Solution {
    public boolean makeZero(int[] arr) {
        // code here
        
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        if (xor == 0) {
            return false;
        }

        if (arr.length % 2 == 1) {
            return true;
        }

        return false;
    }
}

