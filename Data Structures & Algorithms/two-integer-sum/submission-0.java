class Solution {
    public int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        map.put(nums[i],i);
    }
    for(int j=0;j<nums.length;j++)
    {
        int temp = nums[j];
        if(map.containsKey(target-temp) && map.get(target-temp)!=j)
            return new int[]{j,map.get(target-temp)};
    }
    
    return new int[0];
    }
   
}
