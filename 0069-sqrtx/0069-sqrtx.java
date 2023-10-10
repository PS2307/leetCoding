class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int first=1,last=x;
        while(first<=last){
            int mid=first+(last-first)/2;
            // int sq=mid*mid;
            if(mid==x/mid) return mid;
            else if(x/mid<mid) last=mid-1;
            else first=mid+1; 
        }return last;
        
    }
}