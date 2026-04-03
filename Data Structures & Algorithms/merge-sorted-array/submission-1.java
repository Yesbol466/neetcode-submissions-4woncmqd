class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i<n; i++){
            nums1[i+m] = nums2[i];
        }

        sort(nums1);
    }

    public void sort(int[] a){
        for(int i = 1; i<a.length; i++){
            if(a[i-1] > a[i]){
                for(int j = i; j > 0; j--){
                    if(a[j-1] > a[j]){
                        int temp = a[j-1];
                        a[j-1] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
    }
}