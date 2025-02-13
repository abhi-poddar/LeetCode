class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1+n2];
        int i=0, j=0, k=0;
        while(i<nums1.length){
            arr[k++]=nums1[i++];
        }
        while(j<nums2.length){
            arr[k++]=nums2[j++];
        }
        Arrays.sort(arr);
        int mid = (n1+n2)/2;
        if((n1+n2)%2==0){
            return (double)(arr[mid] + arr[mid-1])/2;
        }
       return (double)arr[mid];
    }
}