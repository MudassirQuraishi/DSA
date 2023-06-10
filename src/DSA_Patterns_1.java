public class DSA_Patterns_1 {
    public static void hollow_square(int n){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i==0 || j==0|| i== n -1|| j== n -1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void fill_square(int n){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void right_triangle(int n){
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void right_down_triangle(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=6-i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void left_triangle(int n){
        for(int i =1;i<=n;i++){
            for(int j=0;j<6-i;j++){
                System.out.print("-");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void left_down_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<i;j++){
                System.out.print("-");
            }
            for (int j =1;j<=6-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void k_pyramid(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =2;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        hollow_square(5)
//        fill_square(5);
//        right_triangle(5);
//        right_down_triangle(5);
//        left_triangle(5);
//        left_down_triangle(5);
//        k_pyramid(4);
    }
}
