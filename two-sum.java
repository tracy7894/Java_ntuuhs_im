class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            sum=nums[i]+nums[j];
            if(sum==target){
                result[0]=i;
                result[1]=j;
                break;
            }
            } 
        }
            return result;
        }
}
