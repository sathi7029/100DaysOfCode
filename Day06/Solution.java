package Day06;
public class Solution {
    public static int[] Sort0s1s2s(int [] arr){
        int zero=0,one=0,two=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }
        int i=0;
        while(zero!=0){
            arr[i]=0;
            i++;
            zero--;
        }
        while(one!=0){
            arr[i]=1;
            i++;
            one--;
        }
        while(two!=0){
            arr[i]=2;
            i++;
            two--;
        }
        return arr;
    }
}
