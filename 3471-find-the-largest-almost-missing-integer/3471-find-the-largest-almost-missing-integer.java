class Solution {
    public int largestInteger(int[] nums, int k) {
        // Intuition: for every window, mark which values occur, then tally across windows
        int n = nums.length;
        int[] appearCount = new int[51];
        for (int i = 0; i + k <= n; i++) {
            boolean[] seen = new boolean[51];
            for (int j = i; j < i + k; j++) {
                seen[nums[j]] = true;
            }
            for (int v = 0; v <= 50; v++) {
                if (seen[v]) appearCount[v]++;
            }
        }
        for (int v = 50; v >= 0; v--) {
            if (appearCount[v] == 1) return v;
        }
        return -1;
    }
}