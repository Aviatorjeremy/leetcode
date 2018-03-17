class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1.length+nums2.length)%2==1)
            return findMedian(nums1, 0, nums2, 0, (nums1.length+nums2.length)/2 + 1);
        else
            return (findMedian(nums1, 0, nums2, 0, (nums1.length+nums2.length)/2)
                    + findMedian(nums1, 0, nums2, 0, (nums1.length+nums2.length)/2 + 1)) / 2.0;
    }

    public int findMedian(int[] nums1, int start1, int[] nums2, int start2, int medPos) {
        if (start1 > nums1.length - 1)
            return nums2[start2+medPos-1];
        if (start2 > nums2.length - 1)
            return nums1[start1+medPos-1];
        if (medPos == 1)
            return Math.min(nums1[start1], nums2[start2]);

        int midA = Integer.MAX_VALUE, midB = Integer.MAX_VALUE;
        if (start1 + medPos/2 - 1 < nums1.length)
            midA = nums1[start1 + medPos/2 - 1];
        if (start2 + medPos/2 - 1 < nums2.length)
            midB = nums2[start2 + medPos/2 - 1];
        if (midA < midB) {
            return findMedian(nums1, start1 + medPos/2, nums2, start2, medPos - medPos/2);
        }
        else {
            return findMedian(nums1, start1, nums2, start2 + medPos/2, medPos - medPos/2);
        }
    }

}