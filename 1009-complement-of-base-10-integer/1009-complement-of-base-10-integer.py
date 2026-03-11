class Solution:
    def bitwiseComplement(self, n: int) -> int:
        if(n==0):
            return 1
        len=0
        temp=n
        while(n>0):
            len+=1
            n=n>>1
        
        n=temp
        for i in range(len):
            p = 1<<i
            n=n^p

        return n
        