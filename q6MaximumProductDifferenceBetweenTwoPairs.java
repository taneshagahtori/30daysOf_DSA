class Solution {
    public int maxProductDifference(int[] nums) {
        int l1=0,l2=0;
        int s1=Integer.MAX_VALUE, s2=Integer.MAX_VALUE;
        for (int num: nums) {
            if (num>=l1) {
                l2=l1;
                l1=num;
            }
            else if (num>l2) {
                l2=num;
            }
            if (num<=s1) {
                s2=s1;
                s1=num;
            }
            else if(num<s2) {
                s2=num;
            }
        }
        return l1*l2-s1*s2;
    }
}


// class Solution {
//     public int maxProductDifference(int[] nums) {
//         Arrays.sort(nums);
//         int n= nums.length-1;
//         return nums[n]*nums[n-1]-nums[0]*nums[1]
//     }    
// }