    // pyramid 
// import java.util.Scanner;
// public class iop {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n :");
//         int n = sc.nextInt();
//         for(int i = 0 ; i<n ;i++){
//             for( int j =0 ; j<n-i-1 ; j++){
//                 System.out.print(" ");
//             }
//             for (int j=0 ; j<i+1 ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         }
// }


// Right triagle 
// public class iop {
//     public static void main(String[] args){
//         int n = 6 ;
//         for (int i=0 ; i<n ; i++){
//             for( int j =0 ; j<=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Left triangle 
// public class iop {
//     public static void main(String[] args){
//         int n = 6 ;
//         for (int i=0 ; i<n ; i++){
//             for( int j =0 ; j<n-i ; j++){
//                 System.out.print(" ");
//             }
//             for( int j =0 ;  j<=i; j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// diamond 
// public class iop {
//     public static void main(String[] args){
//         int n = 10 ;
//         for ( int i =0 ; i<(n)  ; i++){
//             for( int j =0 ; j<n-i ; j++){
//                 System.out.print(" ");
//             }
//             for( int j =0 ; j<=i ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for ( int i =0 ; i<(n)  ; i++){
//             for( int j =0 ; j<=i ; j++){
//                 System.out.print(" ");
//             }
//             for( int j =0 ; j<(n/2)-i ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



public class iop {
    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}