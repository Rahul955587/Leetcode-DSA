class Solution {
    public int totalMoney(int n) {
        int fullWeeks = n / 7;
        int extraDays = n % 7;
        int money = 0;
        for (int i = 0; i < fullWeeks; i++) {
            int start = i + 1;
            for (int j = 0; j < 7; j++) {
                money += start + j;
            }
        }
        int start = fullWeeks + 1;
        for (int i = 0; i < extraDays; i++) {
            money += start + i;
        }
        return money;
    }
}