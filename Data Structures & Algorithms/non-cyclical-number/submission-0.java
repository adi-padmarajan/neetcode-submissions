class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true; 
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n != 1 && !list.contains(n)){
            list.add(n);
            int new_num = 0;
            while(n > 0){
                int digit = n % 10;
                new_num += (digit * digit);
                n = n / 10;
            }
            n = new_num;
            if(n == 1){
                return true;
            }
        }
        return false;
    }
}
