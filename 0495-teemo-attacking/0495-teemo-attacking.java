class Solution {
    public int findPoisonedDuration(int[] A, int d) {
        int n = A.length;
        int res = n * d;
        
        for(int i = 0; i < n - 1; ++i) {
            if(A[i] + d - 1 >= A[i + 1]) {
                res -= A[i] + d - A[i + 1];
            }
        }
        
        return res;
    }
}