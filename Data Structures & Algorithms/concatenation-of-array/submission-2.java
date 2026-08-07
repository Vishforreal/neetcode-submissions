class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int index = 0;
        int[] ans = new int[2*n];
        for (int i= 0 ; i<2 ; i++){
            for(int num:nums){
                ans[index++]= num;
            }
        }
        return ans;
    }
}