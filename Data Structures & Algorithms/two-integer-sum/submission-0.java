class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> checked = new HashMap<>();
        int index = 0;
        checked.put(target - nums[0], 0);
        for (int i=1; i < nums.length; i++){
            if(checked.get(nums[i]) != null){
                return new int[]{checked.get(nums[i]),i};
            }
            checked.put(target - nums[i],i);
            index++;
        }
        return null;
    }
}
