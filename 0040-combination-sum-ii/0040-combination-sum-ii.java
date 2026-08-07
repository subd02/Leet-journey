class Solution {
    public void helper(int[] arr, int target, List<List<Integer>> ans, List<Integer> curr, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (arr[i] > target) {
                break;
            }
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            curr.add(arr[i]);
            helper(arr, target - arr[i], ans, curr, i + 1);
            curr.remove(curr.size() - 1);
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);

        helper(candidates, target, ans, curr, 0);
        return new ArrayList<>(ans);
    }
}