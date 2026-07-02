class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 2) {
                ans.append(word);
            } else {
                ans.append(Character.toUpperCase(word.charAt(0)));
                ans.append(word.substring(1));
            }
            if (i != words.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}