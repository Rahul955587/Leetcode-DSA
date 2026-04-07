class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(!st.isEmpty()&& st.peek()==curr){
                st.pop();
            }
            else{
                st.push(curr);
            }
        }
        String ss="";
        int n=st.size();
        for(int j=0;j<n;j++){
            ss+=st.pop();
        }
        String ans=new StringBuilder(ss).reverse().toString();
        return ans;
    }
}