import java.util.Arrays;

class Solution {

    public int mean(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public int median(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 != 0) {
            // Odd number of elements
            return arr[n / 2];
        }
        else {
            // Even number of elements
            return (arr[n / 2 - 1] + arr[n / 2]) / 2;
        }
    }
}