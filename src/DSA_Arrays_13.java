public class DSA_Arrays_13 {
    public static void booleanMatrix(int[][] arr, int r, int c){
        int [] row = new int[r];
        int [] col = new int[c];
        for(int i =0;i<r;i++){
            row[i]=0;
        }
        for(int i =0;i<c;i++){
            col[i]=0;
        }
        for(int i =0;i<r;i++){
            for (int j = 0;j<c;j++){
                if(arr[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=1;
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,0,0},{1,0,0},{1,0,0},{0,0,0}};
        int r = arr.length;
        int c = arr[0].length;
        booleanMatrix(arr,r,c);
    }
}
