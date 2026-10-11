class Solution {
    private void permu(int arr[],List<List<Integer>>ans,List<Integer>temp){
        if(temp.size()==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int x:arr){
            if(temp.contains(x)) continue;
            temp.add(x);
            permu(arr,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        permu(nums,ans,new ArrayList<>());
        return ans;
    }
}