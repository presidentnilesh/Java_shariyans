        //pyramid question

// public class pattern {
//     public static void main(String[] args) {
//         int n = 9 ;
//         int Totalcol , c  ;
//         for ( int r=1 ; r<=2*n-1 ; r++){
            
//             if ( r<=n){
//                 Totalcol = r ;
//             } else{
//                 Totalcol = 2*n-r ;
//             }
//             for (int s=1 ; s<=n-Totalcol ; s++){
//                 System.out.print(" ");
//             }
//             for(int p =1 ; p<=Totalcol ; p++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }


            // LEFT BUTTERFLY 

// public class pattern{
//     public static void main (String[] args){
//         int n=5 ;
//         int m = 2*n-1 ;
//         for (int r = 1 ; r<= 2*n-1 ; r++){
//             int totalC ;
//             if( r<=n){
//                  totalC = r ;
//             }
//             else {
//                  totalC = m-r+1;
//             }
//             for( int p=1 ; p<=totalC ;p++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

            // RIGHT BUTTERFLY 

// public class pattern{
//     public static void main (String[] args){
//         int n=4 ;
//         int m = 2*n-1 ;
//         for (int r = 1 ; r<= m ; r++){
//             int totalC ;
//             if( r<=n){
//                  totalC = r ;
//             }
//             else {
//                  totalC = m-r+1;
//             }
//             for( int p=1 ; p<=n-totalC ;p++){
//                 System.out.print(" ");
//             }
//             for( int p=1 ; p<=totalC ;p++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

            //H shape 

// public class pattern{
//     public static void main(String[] args ){
//     int n =4 ;
//     for( int r=1 ; r<=2*n+1 ; r++){
//         if( r==n+1){
//             for( int y=1 ; y<n+2 ; y++){
//                 System.out.print("* ");
//             }
//         }
//         System.out.print("* ");
//         for ( int y= 1 ; y<=n ; y++){
//             System.out.print("  ");
//         }

//         System.out.print("*");
//         System.out.println();
// }
//     }
// }

            // clock pattern 

    // public class pattern {
    //     public static void main(String[] args){
    //         int totalCol , n = 5 ,rows= 2*n -1 ;
    //         for( int r = 1; r<=rows ; r++){
    //             if ( r <=n ){
    //                 totalCol= n-r+1;
    //             }
    //             else{
    //                 totalCol = r-n+1;
    //             }
    //             for( int p = 1 ; p<=n-totalCol ; p++){
    //                 System.out.print(" ");
    //             }
    //             for(int p =1 ; p<=totalCol; p++){
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }

            // ^ sign
            
// public class pattern {
//     public static void main(String[] args){
//         int n = 6 ;
//         for ( int r = 1 ; r<=n+1 ; r++){
//             for( int j = 1 ; j<=n-r ; j++){
//                 System.out.print(" ");
//             }
            
//             System.out.print("* ");
//             for(int j = 1 ; j<=2*r - 3 ; j++){
//                 System.out.print(" ");
//             }   
//             System.out.print("* ");
//             if(r==n+1){
//                 for(int i=1 ; i<=2*n-1 ;i++ ){
//                     System.out.print("*");
//                 }
//             }          
//             System.out.println();
//         }

//     }
// }


// fixed 

// public class pattern {
// public static void main(String[] args){
//         int n = 5 ;
//         for( int r =1 ; r<=n+1 ; r++ ){
//                 if ( r==n+1){
//                         for(int m=1 ; m<=2*n-1 ; m++ ){
//                                 System.out.print("*");
//                         }
//                 }
//                 else {
//                         for ( int j = 1 ; j<= n-r ; j++ ){
//                                 System.out.print(" ");
//                         }
//                         if(r==1 ){
//                                 System.out.print("*");
//                         }
//                         else{
//                                 System.out.print("*");
//                                 for( int j = 1 ;  j<=2*r - 3 ; j++){
//                                         System.out.print(" ");
//                                 }
//                                 System.out.print("* ");
//                         }

//                 }
//                 System.out.println();
//         }
// }
// }

        // X pattern 
// public class pattern{
//         public static void main(String[] args){
//                 int n= 9 ;
//                 int half = n/2+1 ;
//                 for( int r = 1 ;r<=n; r++){
//                         if(r<(n/2)+1){
//                              for(int i = 1 ; i<=r-1 ; i++){
//                                 System.out.print((" "));
//                         }
//                         System.out.print("*");
//                         for( int j=1 ; j<=n-2*r; j++){
//                                 System.out.print(" ");
//                         }
//                         System.out.print("*");
//                         }
//                         else{
//                                 if(r==n/2+1){
//                                         for( int i = 1 ; i<=n/2 ;i++){
//                                                 System.out.print(" ");
//                                         }
//                                         System.out.print("*");
//                                 }
//                                 else{
//                                         for ( int i = 1 ; i<=n-r ; i++){
//                                         System.out.print(" ");
//                                 }
//                                 System.out.print("*");
//                                 for (int j = 1; j <= 2 * r - n - 2; j++) {
//                                         System.out.print(" ");
//                                 }
//                                 System.out.print("* ");
//                                 }
//                         }
//                         System.out.println();
//                 }
//         }
// }


                // number pyramind

// public class pyramid{
//         public static void main(String[] args){
//                 int n = 5 ;
//                 int arr[][]= new int[n][2*n] ;
//                 for( int i = 0 ; i<n ; i++){
//                         for(int j=0 ; j<2*n; j++){
//                                 if (i+j==4 ){
//                                         System.out.println("1");
//                                 }
//                                 else{
                                        
//                                 }

//                         }
//                 }
//         }
// }


          