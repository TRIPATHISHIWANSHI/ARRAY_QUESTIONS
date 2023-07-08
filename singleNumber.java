

class Solution {
    public int singleNumber(int[] nums) {

//  APPROACH 1 - BIT
        // int res = 0;
        // for(int i =0;i<nums.length;i++){
        //     res ^= nums[i];
        // }
        // return res;

//  APPROACH 2
        Arrays.sort(nums);
        if(nums.length == 1)return nums[0];
        for(int i = 0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1])return nums[i]; 
        }
        return nums[nums.length-1];
    }
}
