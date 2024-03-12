class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            sum=nums[i]+nums[i+1];
            if(sum==target){
                result[0]=i;
                result[1]=i+1;
                break;
            } 
        }
            return result;
        }
}