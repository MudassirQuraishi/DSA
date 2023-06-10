import java.util.ArrayList;
public class DSA_Arrays_6 {
    public static ArrayList<Integer> decToBin(int decimal) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (decimal > 0) {
            int add = decimal % 2;
            arr.add(add);
            decimal = decimal / 2;
        }
        return arr;
    }
    public static ArrayList<Integer> binarySort(ArrayList<Integer> num){
        int count=0;
        for(int i =0;i<num.size();i++){
            if(num.get(i)==0){
                count++;
            }
        }
        for(int i =0;i<count;i++){
            num.set(i,0);
        }
        for(int i =count;i<num .size();i++){
            num.set(i,1);
        }
        return num;
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(decToBin(num));
        ArrayList <Integer> n;
        n = decToBin(num);
        System.out.println(binarySort(n));
    }
}
