class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> dictionary1 = new HashMap<>();
        HashMap<Character,Integer> dictionary2 = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);
            char charT = t.charAt(i);

            dictionary1.put(charS, dictionary1.getOrDefault(charS, 0) + 1);
            dictionary2.put(charT, dictionary2.getOrDefault(charT, 0) + 1);
        }

        if (dictionary1.equals(dictionary2)) return true;

        return false;


    }
}
