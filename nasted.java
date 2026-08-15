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


public class nasted {
    public static void main(String[] args ){
        int n = 6 ;
         for ( int i=0 ; i<=n ; i++){
            for ( int j=(n/2)-1 ; j<=(n/2)+i ;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
