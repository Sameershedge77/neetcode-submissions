class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
    HashMap<String, List<String>> map = new HashMap<>();

    for(int i = 0; i < arr.length; i++) {

        String word = arr[i];

        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);

        if(map.containsKey(key)){
            map.get(key).add(word);
        }else{
            map.put(key, new ArrayList<>());
            map.get(key).add(word);
        }
    }

    return new ArrayList<>(map.values()); 
    }
}
