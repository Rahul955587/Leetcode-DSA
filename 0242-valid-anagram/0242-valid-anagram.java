class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(!mp.containsKey(ch)) mp.put(ch,1);
            else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        HashMap<Character,Integer>mpp=new HashMap<>();
        for(char ch:t.toCharArray()){
            if(!mpp.containsKey(ch)) mpp.put(ch,1);
            else{
                mpp.put(ch,mpp.get(ch)+1);
            }
        }
        for(char x:mp.keySet()){
            if(!mpp.containsKey(x) || !mp.get(x).equals(mpp.get(x))) return false;
        }
        return true;
    }
}