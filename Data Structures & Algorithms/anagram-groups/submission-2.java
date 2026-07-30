class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> outputMap = new HashMap<>();
        List<List<String>> outputList = new ArrayList<>();
        for (int i = 0; i <= strs.length - 1; i++) {
            int[] arr_hash = new int[26];
            StringBuilder hashKey = new StringBuilder();
            for (int j = 0; j <= strs[i].length() - 1; j++) {
                arr_hash[strs[i].charAt(j) - 'a'] += 1;
            }
            for (int j = 0; j < arr_hash.length; j++) {
                hashKey.append(arr_hash[j]).append("@");
            }
            System.out.println("hash::"+hashKey+"strs[i]::"+strs[i]);
            outputMap.computeIfAbsent(hashKey.toString(), k -> new ArrayList<String>())
                .add(strs[i]);
        }
        outputMap.entrySet().stream().forEach(ele -> outputList.add(ele.getValue()));
        return outputList;
    }

    // private String checkAnagram(String a, String b) {
    //     int[] arr = new int[26];
    //     for (int i = 0; i < a.length(); i++) {
    //         arr[a.charAt(i) - 'a'] = 1;
    //     }
    //     for (int i = 0; i < b.length(); i++) {
    //         if (arr[b.charAt(i) - 'a'] != 1)
    //             return null;
    //     }
    //     return b;
    // }
}
