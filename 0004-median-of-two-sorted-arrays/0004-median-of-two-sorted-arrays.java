class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length+nums2.length;
        int arr[]=new int[l];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[j+nums1.length]=nums2[j];
        }
        Arrays.sort(arr);
        if(l%2==0){
            return (arr[l/2 - 1]+arr[l/2])/2.0;
        }
        else{
            return arr[l/2];
        }
    }
}