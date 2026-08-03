class Solution {
    public int findMin(int a, int b) {

        int add = a + b;
        int sub = a - b;
        int mul = a * b;

        int min = Math.min(add, Math.min(sub, mul));

        try {
            int div = a / b;
            min = Math.min(min, div);
        }
        catch (ArithmeticException e) {
            // Ignore division by zero
        }

        return min;
    }
}