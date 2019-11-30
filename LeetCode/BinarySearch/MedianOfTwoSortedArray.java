/** 
    =====Question=====

    There are two sorted arrays nums1 and nums2 of size m and n respectively.

    Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

    You may assume nums1 and nums2 cannot be both empty.

    Example 1:

    nums1 = [1, 3]
    nums2 = [2]

    The median is 2.0
    Example 2:

    nums1 = [1, 2]
    nums2 = [3, 4]

    The median is (2 + 3)/2 = 2.5
*/

/**
    ====Solution====
*/
class Solution {

    int[] merge(int[] nums1, int[] nums2) {
        int nums1Size = nums1.length-1;
        int nums2Size = nums2.length-1;

        int arr[] = new int[nums1Size+nums2Size+2];
        int i=0, j=0, k=0;
        while (i<=nums1Size && j<=nums2Size) {
            if (nums1[i] <= nums2[j]) {
               arr[k] = nums1[i];
                k++;
                i++;
            } else {
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }
        
        while(i <= nums1Size) {
            arr[k] = nums1[i];
            k += 1; i += 1;
        }
    
        while(j <= nums2Size) {
            arr[k] = nums2[j];
            k += 1; j += 1;
        }
        return arr;
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = merge(nums1, nums2);
        int size = arr.length;
        int mid = size/2;
        double median;
        if (size%2 == 0) {
            median = ((double)arr[mid] + (double)arr[mid-1])/2;
        } else {
            median = arr[mid];
        }
        return median;
    }
}
