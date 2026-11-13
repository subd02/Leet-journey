class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                map.get(nums[i]).add(i);
            }
        }
        int count = 0;
        for (List<Integer> list : map.values()) {
            if(list.size()==3 && list.get(2)-list.get(1)==list.get(1)-list.get(0)){
                count++;
            }
        }
        return count;
    }
}