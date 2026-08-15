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

//             // spaces
//             for (int j = 0; j < n - i - 1; j++) {
//                 System.out.print("  ");
//             }

//             // stars
//             for (int j = 0; j < 2 * i + 1; j++) {
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

public class nasted {
    public static void main(String[] args ){
        for ( int i= 0 ; i<6 ; i++){
            for ( int j=0 ; j<( 6-i) ; j++){
                System.out.print(" ");
            }
            for ( int j = (6-i); j<6 ; j++){

                System.out.print("*");
            }
            System.out.println(" ");
            
        }
    }
}

