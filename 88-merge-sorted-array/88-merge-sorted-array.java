class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0, j=0, k=-1;
        int[] res = new int[m+n];
        
        while(i<m && j<n) {
            
            if(nums1[i]<nums2[j]) {
                res[++k] = nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]) {
                res[++k] = nums2[j];
                j++;
            }
            else {
                res[++k] = nums1[i];
                res[++k] = nums1[i];
                i++;
                j++;
            }
        }
        
        while(i<m) {
            // if(i>n-1 && nums1[i]==0) {
            //     i++;
            //     continue;
            // } else {
            //     res[++k] = nums1[i];
            // }
            res[++k] = nums1[i];
            i++;
        }
        
        while(j<n) {
            res[++k] = nums2[j];
            j++;
        }
        
        
        for(i=0; i<m+n; i++) {
            nums1[i] = res[i];
        }
    }
}