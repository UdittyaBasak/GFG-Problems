class Solution {
    public static void utility(int a, int b, int opr) {
        // code here
        if(opr == 1){
            System.out.print(a + b);
        }else if(opr == 2){
            if(a>=b){
                System.out.print(b - a);
            }else{
                System.out.print("-" + (b - a));
            }
        }else if(opr == 3){
            System.out.print(a*b);
        }else{
            System.out.print("Invalid Input");
        }
    }
}