class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> checked = new HashMap<>();
        for (int i=0; i < nums.length; i++){
            if(checked.get(nums[i]) != null){
                return new int[]{checked.get(nums[i]),i};
            }
            checked.put(target - nums[i],i);
        }
        return new int[] {};
    }
}
