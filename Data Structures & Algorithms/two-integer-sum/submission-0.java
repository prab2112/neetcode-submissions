class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                result[0] = map.get(compliment);
                result[1] = i;
                break;
            } else {
                map.put(nums[i],i);
            }
        }
        System.out.println(map);
        return result;
        
    }
}
