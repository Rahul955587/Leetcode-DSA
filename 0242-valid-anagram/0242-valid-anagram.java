class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>mp1=freq(s);
        HashMap<Character,Integer>mp2=freq(t);
        return mp1.equals(mp2);
    }
    private HashMap<Character,Integer> freq(String str){
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(!mp.containsKey(ch)) mp.put(ch,1);
            else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        return mp;
    }
}