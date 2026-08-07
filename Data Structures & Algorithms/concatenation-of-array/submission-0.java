class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int index =0;
        int[] ans = new int[2*n];
        for (int i= 0 ; i<=1 ; i++){
            for(int j = 0 ;j<n ; j++){
                ans[index++] = nums[j];
            }   
        }
        return ans;
    }
}