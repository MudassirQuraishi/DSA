import java.util.Arrays;
class pair{
    int r;
    int m;
    public pair(int repeat,int missing){
        r = repeat;
        m = missing;
    }
}
public class DSA_Arrays_8 {
    public static pair missRepeat(int [] arr, int n){
        int repeat = 0;
        int missing = 0;
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
            if(arr[i]!=i+1){
                repeat= arr[i];
                missing = i+1;
            }
        }
        return new pair(repeat, missing);
    }
    public static void main(String[] args) {
        int [] arr ={2,2,4,3,7,5,6};
        int n = arr.length;
        pair result = missRepeat(arr,n);
        System.out.println(result.r);
        System.out.println(result.m);
    }
}
