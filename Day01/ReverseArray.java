package Day01;
public class ReverseArray {
    //method-01
    public static void reverse1(int a[]){
        int n=a.length;
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
    }
    //method-02
    public static int []reverse2(int a[]){
        int n=a.length;
        int res[]=new int [n];
        for(int i=0;i<n;i++){
            res[i]=a[n-1-i];
        }
        return res;
    }
    public static void main(String[] args) {
        int a1[]={5,4,3,2,1};
        int a2[]={5,4,3,2,1};
        reverse1(a1);
        for(int val1:a1){
            System.out.print(val1+" ");
        }
        System.out.println();
        a2=reverse2(a2);
        for(int val2:a2){
            System.out.print(val2+" ");
        }
        
    }
}
