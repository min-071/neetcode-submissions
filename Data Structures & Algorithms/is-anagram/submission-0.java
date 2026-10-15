class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars_s = s.toCharArray();
        char[] chars_t = t.toCharArray();
        Arrays.sort(chars_s);
        Arrays.sort(chars_t);
        if(Arrays.equals(chars_s, chars_t))
            return true;
        return false;
    }
}
