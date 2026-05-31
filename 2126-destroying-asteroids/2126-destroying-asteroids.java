class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currmass=mass;
        for(int x:asteroids){
            if(currmass<x) return false;
            currmass+=x;
        }
        return true;
    }
}