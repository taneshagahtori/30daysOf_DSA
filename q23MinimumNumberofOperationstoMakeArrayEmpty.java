class Solution {
    public int minOperations(int[] nums) {
        int start=0;
        int ans=0;
        Arrays.sort(nums);
        while(startnums.length){
            int end=start;
            while(endnums.length && nums[start]==nums[end]){
                end++;
            }
            int count=end-start;
            if(count==1){
                return -1;
            }
            if(count%3 == 0){
                ans+=(count3);
            }
            else{
                ans+=((count3)+1);
            }
            start=end;
        }
        return ans;
    }
}