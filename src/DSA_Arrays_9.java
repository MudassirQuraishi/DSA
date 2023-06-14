import java.util.Arrays;

public class DSA_Arrays_9{
    public static void alternateArray(int[] arr, int n){
        Arrays.sort(arr);
        int [] temp = arr.clone();
        int check =1;
        int max = n-1;
        int min = 0;
        for(int i=0;i<n;i++){
            if (check==1){
                arr[i]= temp[max--];
                check = 0;
            }
            else{
                arr[i]= temp[min++];
                check = 1;
            }

        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,5,4,6};
        int n = arr.length;
        alternateArray(arr, n);
    }
}
