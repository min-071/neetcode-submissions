class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;
        char[] chars_s = s.toCharArray();
        char[] chars_t = t.toCharArray();
        Arrays.sort(chars_s);
        Arrays.sort(chars_t);
        return Arrays.equals(chars_s, chars_t);
      
    }
}
