import numpy as np
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
         nums1.extend(nums2)
         return np.median(nums1)