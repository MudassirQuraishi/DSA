public class DSA_Arrays_15 {
    public static void mergeSort(int[]first, int[]second){
        int length = Math.max(first.length, second.length);
        int sec =0;
        for(int i =0;i<length;i++){
            if(first[i]>second[sec]){
                int temp = first[i];
                first[i]= second[sec++];
                first[i+1]= temp;
            }
            if(first[i]==0){
                first[i]=second[sec++];
            }
        }
        for(int elements :first){
            System.out.println(elements);
        }
    }
    public static void main(String[] args) {
        int [] first ={1,2,3,0,0,0};
        int [] second = {2,5,6};
        mergeSort(first,second);
    }
}
