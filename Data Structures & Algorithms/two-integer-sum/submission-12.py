class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        m = {}
        res = []
        for i, num in enumerate(nums):
            comp = target - num
            if comp in m:
                res = [m[comp], i]
                return res
            m[num] = i
        
        return res
        