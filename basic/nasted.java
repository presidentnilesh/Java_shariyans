//solid rectangle
// public class nasted {
//     public static void main(String[] args ){
//         for ( int i=1 ; i<=5 ; i++){
//             for ( int j= 1 ; j<=5 ;j++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }

        // PYRAMID
// public class nasted {
//     public static void main(String[] args) {
//         int n = 6;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n - i - 1; j++) {         // spaces
//                 System.out.print("  ");
//             }
//             for (int j = 0; j < 2 * i + 1; j++) {        // stars
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

        // RIGHT ANGLED TRIANGLE 
// public class nasted {
//     public static void main (String[] args ){
//         for ( int i= 0 ; i<6 ;i++ ){
//             for ( int j=0 ; j<=i ; j++ ){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }

        // INVERTED RIGHT TRAINGLE
// public class nasted {
// public static void main(String[] args){
//     for ( int i = 0 ; i <6 ; i++){
//         for ( int j = 0 ; j<(6-i) ; j++){
//             System.out.print("* ");
//         }
//         System.out.println(" ");
//     }
// }
// }

        // MIRRORED RIGHT TRIANGLE
// public class nasted {
//     public static void main(String[] args ){
//         for ( int i= 0 ; i<6 ; i++){
//             for ( int j=0 ; j<( 6-i) ; j++){
//                 System.out.print("  ");
//             }
//             for ( int j = 0; j<=i ; j++){                     // this method was used in the video 
//                 // for( int j = ( 6-i) ; j <6 ; j++)        // i wrote this one 
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


        // V star pattern 
// public class nasted {
//     public static void main(String[] args){
//         int n= 5 ;
//         for ( int i=0 ; i<n ; i++){
//             for ( int j=0 ; j<i ; j++){     // for left space
//                 System.out.print(" ");
//             }
//             System.out.print("*");  // left stars
//             for(int j=(i+1) ; j<(2*n - i)-1  ; j++ ){  // middle spaces
//                 System.out.print(" ");
//             }
//             if (i != (n - 1)) {       // right stars
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     } 
//         }

        //OR  
// public class nasted {
//     public static void main (String[] args){
//         int n = 5 ;
//         for ( int i=0 ; i<=n ; i++){
//             for ( int j=0 ; j <= 2*n ;j++){ 
//                 if( i==j || i+j==10){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

        // X-PATTERN
// public class nasted {
//     public static void main(String[] args){
//         int n =4 ;
//         for ( int i=0 ; i<2*n+1 ; i++){
//             for (int j =0 ; j<2*n+1 ; j++){
//                 if (i==j|| i+j==8){
//                     System.out.print("x");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }


                // pyramid pattern
        // still error
// public class nasted{
//         public static void main(String[] args) {
//                 int n = 4 ,  c ;
//                 int r ;
//                 int totalC ;
//                 for ( r= 1 ; r<=2*n-1 ; r++){
//                         totalC = r>n ? 2*n-r :r ;                
//                 for ( c = 1 ; c<=2*n -1 ; c++ ){
//                         for ( int s = 1 ; s<=n-totalC ; s++){
//                                 System.out.println(" ");
//                         }
//                         for ( int st = 1 )
//                 }
//         }
// }
// }


                // pyramid by sir 
// public class nasted {
//         public static void main (String[] args ){
//                 int n =4 ;
//                 for ( int i = 0 ; i<n ; i++){
//                         for (int j = 0 ; j<n-i ; j++){
//                                 System.out.print(" ");
//                         }
//                         for ( int j=0 ;j<i+1;j++ ){
//                                 System.out.print("* ");
//                         }
//                         System.out.println(" ");
//                 }
//         }
// }

                // left butterfly
// public class nasted{
//         public static void main(String[] args){
//                 int n = 3 ;
//                 int c  ;
//                 for ( int i =0 ; i<2*n-1 ; i++){
//                         if ( i <=n){
//                                 c = i ;
//                         }
//                         else{
//                                 c=i-n;
//                         }
//                         for ( int j = 0 ; j<c ;j++){
//                                 System.out.print("* ");
//                         }
//                         System.out.println();
//                 }
//         }
// }
// public class nasted{
//         public static void main(String[] args){
//                 int n = 3 ;
//                 int c  ;
//                 for ( int i =0 ; i<2*n-1 ; i++){
//                         if ( i <=n){
//                                 c = i ;
//                         }
//                         else{
//                                 c=i-n;
//                         }
//                         for ( int j = 0 ; j<c ;j++){
//                                 System.out.print("* ");
//                         }
//                         System.out.println();
//                 }
//         }
// }


                // left butterfly 
// public class nested {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int r = 1; r <= n; r++) {
//             for (int s = 1; s <= r; s++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for (int r = n - 1; r >= 1; r--) {
//             for (int s = 1; s <= r; s++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


                // sum of the diagonal melemnt in the matrix 
public class nasted{
        public static void main(String[] args){
                int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
                int n = arr.length , sum = 0;
                for(int r =0 ; r<n ; r++){
                        for(int j = 0 ; j<arr[0].length ; j++){
                                if(r==j || r+j==2 ){
                                        sum +=arr[r][j];
                                }
                        }
                }
                System.out.println(sum);

        }
}