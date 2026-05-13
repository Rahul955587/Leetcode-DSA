class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int counter=0;
        for(String x:events){
            if(counter==10) break;
            if(x.equals("W")) counter++;
            else if(x.equals("WD")||x.equals("NB")) score++;
            else score+=Integer.parseInt(x);
        }
        return new int[]{score,counter};
    }
}