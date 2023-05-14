package Day03;
public class MaximumSubarray {
    static int getMaxSubArray(int array[]){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int index=0;index<array.length;index++){
            sum+=array[index];
            maxi=Math.max(sum,maxi);
             if(sum<0)sum=0;
        }
        return maxi;
    }
    public static void main(String[] args) {
        int array[]={2,3,-5,9,8,-1};
        System.out.println("maximum sum of subarray is:"+getMaxSubArray(array));
    }
}
