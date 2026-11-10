class Solution {
    public boolean threeFibonacciSum(int n) {
        if (n % 2 != 0) return false;
        long x = (long) n / 2;
        
        return isPerfectSquare(multiplyAndAdd(x, x, 5, 4)) || 
               isPerfectSquare(multiplyAndAdd(x, x, 5, -4));
    }
    private boolean isPerfectSquare(java.math.BigInteger num) {
        if (num.signum() < 0) return false;
        java.math.BigInteger sqrt = num.sqrt();
        return sqrt.multiply(sqrt).equals(num);
    }
    private java.math.BigInteger multiplyAndAdd(long a, long b, long multiplier, long addend) {
        java.math.BigInteger val1 = java.math.BigInteger.valueOf(a);
        java.math.BigInteger val2 = java.math.BigInteger.valueOf(b);
        java.math.BigInteger mult = java.math.BigInteger.valueOf(multiplier);
        java.math.BigInteger add = java.math.BigInteger.valueOf(addend);
        
        return val1.multiply(val2).multiply(mult).add(add);
    }
}