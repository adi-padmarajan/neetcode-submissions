class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        if(n >= 0){
            for(int i = 1; i <= n; i++){
                result = result * x;
            }
        }
        else {
            for(int i = 1; i <= -n; i++){
                result = result * x;
            }
            result = 1/result;
        }
        return result;
    }
}
