import java.util.Arrays;
import java.util.Scanner;

public class DSA_Arrays_2 {
    public static boolean equalArray(int [] A, int [] B,int n){
        Arrays.sort(A);
        Arrays.sort(B);
        int i =0;
        while(i<=n-1){
            if(A[i]==B[i]){
                i++;
            }
            else{
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] A = new int[n];
        for (int i =0;i< A.length;i++){
            A[i]= sc.nextInt();
        }
        int [] B = new int[n];
        for (int i =0;i< B.length;i++) {
            B[i] = sc.nextInt();
        }
        boolean result = equalArray(A,B,n);
        System.out.println(result);

    }
}
