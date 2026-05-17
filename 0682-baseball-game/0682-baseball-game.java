class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String str:operations){
            if(str.equals("+")){
                int b=st.pop();
                int a=st.peek();
                st.push(b);
                st.push(a+b);
            }
            else if(str.equals("D")){
                st.push(st.peek()*2);
            }
            else if(str.equals("C"))  st.pop();
            else st.push(Integer.parseInt(str));
        }
        int sum=0;
        for(int num:st){
            sum+=num;
        }
        return sum;
    }
}