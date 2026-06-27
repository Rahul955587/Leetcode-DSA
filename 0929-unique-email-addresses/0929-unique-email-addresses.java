class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> st=new HashSet<>();
        for(String s:emails){
            String parts[]=s.split("@");
            String local=parts[0];
            String domain=parts[1];
            int plus=local.indexOf('+');
            if(plus!=-1){
                local=local.substring(0,plus);
            }
            local=local.replace(".","");
            st.add(local+"@"+domain);
        }
        return st.size();
    }
}