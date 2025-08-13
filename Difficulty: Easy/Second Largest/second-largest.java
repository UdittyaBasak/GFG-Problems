class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length<2){
            return -1;
        } else{
            int largest = Integer.MIN_VALUE;
            int secondlargest = Integer.MIN_VALUE;
            
            for(int num : arr){
                if(num > largest){
                    secondlargest = largest;
                    largest = num;
                } else if(num > secondlargest && num != largest){
                    secondlargest = num;
                }
            }
            
            if(secondlargest == Integer.MIN_VALUE){
                return -1;
            } else{
                return secondlargest;
            }
        }
    }
}