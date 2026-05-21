class Solution {
    public boolean isAnagram(String s, String t) {
        //     if (s.length() != t.length())
        //         return false;

        //     HashMap<Character, Integer> sMap = new HashMap<>();

        //     for (char c : s.toCharArray()) {
        //         if (sMap.containsKey(c)) {
        //             sMap.put(c, sMap.get(c) + 1);
        //         } else {
        //             sMap.put(c, 1);
        //         }
        //     }
        //     for (char c : t.toCharArray()) {
        //         if (sMap.containsKey(c)) {
        //             sMap.put(c, sMap.get(c) - 1);
        //         }
        //     }

        //     for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
        //         if (entry.getValue() > 0) {
        //             return false;
        //         }
        //     }
        //     return true;
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i : count) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
