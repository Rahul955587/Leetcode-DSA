class Solution {
    public int[] constructRectangle(int area) {
        int c=(int)Math.sqrt(area);
        while(area%c!=0) c--;
        int l=area/c;
        return new int[]{l,c};
    }
}