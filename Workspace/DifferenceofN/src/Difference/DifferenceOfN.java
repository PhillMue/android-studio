package Difference;

public class DifferenceOfN {

    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3};
      System.out.println(number(nums,2));
    }
    public static int number(int[] num, int n){
        int count=0;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                if(j==i){
                    continue;
                }
                 else{
                     if(Math.abs(num[i]-num[j])==n){
                         count++;
                     }
                 }

            }
        }
        return count;
    }

}