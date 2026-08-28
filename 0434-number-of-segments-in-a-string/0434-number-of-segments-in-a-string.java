class Solution {
    public int countSegments(String s) {
        
        s = s.trim();
        int count = 0;

        if (! (s.length() > 0))
            return 0;

        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (s.charAt(i-1) != ' ') 
                    count++;
            }
        }
        count++;
        return count;
    }
}