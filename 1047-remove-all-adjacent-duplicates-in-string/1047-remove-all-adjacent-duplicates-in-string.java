class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty()&& st.peek()==c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        int n=st.size();
        String ss="";
        for(int j=0;j<n;j++){
            ss+=st.pop();
        }
        String ans = new StringBuilder(ss).reverse().toString();
        return ans;
    }
}