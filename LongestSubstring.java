class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        LinkedList<Character> subset = new LinkedList<Character>();
        int maxlength = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            while (subset.contains(s.charAt(i))) {
                maxlength = Math.max(maxlength, count);
                subset.remove();
                count--;
            }
            subset.add(s.charAt(i));
            count++;
        }
        return Math.max(maxlength, count);
    }
}
