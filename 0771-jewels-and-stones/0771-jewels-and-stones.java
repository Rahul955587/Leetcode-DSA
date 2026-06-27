class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:stones.toCharArray()){
            if(mp.containsKey(ch)) mp.put(ch,mp.get(ch)+1);
            else mp.put(ch,1);
        }
        int count=0;
        for(char c:jewels.toCharArray()){
            if(mp.containsKey(c)) count+=mp.get(c);
        }
        return count;
    }
}