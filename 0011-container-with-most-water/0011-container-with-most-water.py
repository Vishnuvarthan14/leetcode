class Solution:
    def maxArea(self, height: List[int]) -> int:
        i=0
        j=(len(height)-1)

        max1=-1

        while(i<j):
            dist=j-i
            length=min(height[i],height[j])
            max1=max(max1,dist*length)
            if(height[i]>height[j]):
                j-=1
            else:
                i+=1
        return max1