// Brute Force Approach

class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        for(int i = 0; i < heights.length; i++){
            int j = i + 1;
            while(j <= heights.length - 1){
                int area = 0;
                if(heights[i] <= heights[j]){
                    area = heights[i] * (j - i);
                }
                else {
                    area = heights[j] * (j - i);
                }
                if(max < area){
                    max = area;
                }
                j++;
            }
        }
        return max;
    }
}
