class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>mp = new HashMap<>();
        for(String s:strs){
            char[] stringArray = s.toCharArray();
            Arrays.sort(stringArray);

            String sortedString = new String(stringArray);

            if(!mp.containsKey(sortedString)){
                mp.put(sortedString,new ArrayList<>());
            }
            mp.get(sortedString).add(s);
        }
        return new ArrayList<>(mp.values());
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c) - 1);
            } else {
                return false;
            }
        }

        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
