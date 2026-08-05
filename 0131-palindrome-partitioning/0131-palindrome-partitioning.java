class Solution {
    public boolean isPalindrome(String part) {
        return part.equals(new StringBuilder(part).reverse().toString());
    }

    public void getParts(String s, List<List<String>> ans, List<String> sub) {
        if (s.length() == 0) {
            ans.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String part = s.substring(0, i + 1);
            if (isPalindrome(part)) {
                sub.add(part);
                getParts(s.substring(i + 1), ans, sub);
                sub.remove(sub.size() - 1);
            }
        }

    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        List<String> sub= new ArrayList<>();

        getParts(s, ans, sub);
        return ans;
    }
}