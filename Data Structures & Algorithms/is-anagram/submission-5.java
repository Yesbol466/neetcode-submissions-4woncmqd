class Solution {

    HashMap<Character, Integer> hashS;
    HashMap<Character, Integer> hashT;
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        hashS = new HashMap<Character, Integer>();
        hashT = new HashMap<Character, Integer>();

        for(int i = 0; i<s.length(); i++){
            if(hashS.containsKey(s.charAt(i))){
                hashS.put(s.charAt(i), hashS.get(s.charAt(i)) + 1); 
            } else hashS.put(s.charAt(i), 1); 

            if(hashT.containsKey(t.charAt(i))){
                hashT.put(t.charAt(i), hashT.get(t.charAt(i)) + 1); 
            } else hashT.put(t.charAt(i), 1); 
        }

        return hashS.equals(hashT);
    }
}
