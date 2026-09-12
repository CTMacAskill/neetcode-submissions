class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums)
                           .mapToObj(ele -> ele - 2)
                           .collect(Collectors.toSet());
        if (numsSet.size() == nums.length){
            return false;
        }
        return true;
    }
}