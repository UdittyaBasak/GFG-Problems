class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;
        long totalsum = (long)n*(n+1)/2;
        long actualSum = 0;
        
        for(int i : arr){
            actualSum += i;
        }
        
        // int missing = totalSum - actualSum;
        return (int)(totalsum - actualSum);
        
        
        
    }
}