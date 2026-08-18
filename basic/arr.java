// import java.util.Scanner;

// public class arr {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size of array. ");
//         int size = sc.nextInt();
//         int arr[] = new int[size] ;
//         System.out.println("Enter the "+ size + "elements of the array .");
//         for ( int i=0 ; i<arr.length ; i++){
//             arr[i] = sc.nextInt() ;
//         }
//         for ( int i=0 ; i<arr.length ; i++ ){
//             System.out.println(i + " element of array is : " + arr[i]);
//         }
//     }
// }

                //sum of array 

// public class summ{
//         public static void main(String[] args){
//                 int sum = 0 ;
//                 int arr[] = { 10 , 20 , 30 , 40} ;
//                 for ( int i=0 ; i<arr.length ; i++ ){
//                         sum += arr[i] ;
//                 }
//                 System.out.println(sum);
//         }
// }


                // find max from the list of array

// public class summ{
//         public static void main(String[] args){
//                 int arr[] = {10 , 3 , 7, 11 , 10 , 4 };
//                 int max=arr[0];
//                 int ind = 0 ;
//                 for (int i=0 ; i<arr.length ; i++){
//                         if( arr[i]>max){
//                                 max=arr[i] ;
//                                 ind = i ;
//                         }
//                 }
//                 System.out.println(max);
//                 System.out.println("max integer is : " + ind);
//         }
// }

                // find second greated number 

// public class arr {
//     public static void main(String[] args ){
//         int arr[] = {3,43,6,18,4,34,3,45,23} ;
//         if (arr[0]<arr[1]){
//             int max = arr[1] ;
//             int secMax = arr[0];
//             for (int i=0 ; i<arr.length ; i++){
//                 if ( arr[i]>max){
//                     secMax = max ;
//                     max=arr[i];
//                 }
//             }
//             System.out.println("max = " + max + " SecMax = "+ secMax);
//         }
//     }
// }


            //shorted array 

// public class arr{
//     public static void main(String[] args){
//         int arr[] = {12,23,34,45,56,67};
//         boolean Shorted = true ;
//         for ( int i =0 ; i<arr.length-1 ; i++){
//             if (arr[i]>arr[i+1] ){
//                 Shorted = false ;
//                 break ;
//             }
//         }
//         if(Shorted){
//             System.out.println("Shorted");
//         }
//         else{
//             System.out.println("Non shorted ");
//         }
//         }
// }


        //reverse the array 

// public class arr{
//     public static void main(String[] args){
//         int arr[] = {2,5,23,6,3,34,78,22};
//         int i ;
//         for ( i = arr.length-1 ; i>=1 ; i--){
//             System.out.print(arr[i] + " ");    
//         }
//     }
// }

            // ------OR------

// import java.util.Arrays;
// public class arr{
//     public static void main(String[] args){
//         int arr[] = {2,5,23,6,3,34,78,22};
//         int rev[] = new int[arr.length] ;
//         int j =0;
//         for (int i = arr.length-1 ; i>=0 ; i--){
//             rev[j++] = arr[i];
//         }
//         System.out.println(Arrays.toString(rev));
//     }   
// }


        // ---- improved version --------

// import java.util.Arrays;
// public class arr{
//     public static void main(String[] args){
//         int arr[] = {2,6,8,11,5,23,9,18} ;
//         int start = 0;
//         int end = arr.length -1 ;
//         while(start < end ){
//             int temp = arr[start] ;
//             arr[start] = arr[end] ;
//             arr[end] = temp ;
//             start ++ ;
//             end -- ;
//         }
//         System.out.println(Arrays.toString(arr));
//         }
// }


        // left rotate by one 


// import java.util.Arrays;
// public class arr {
//     public static void main(){
//         int arr[] = {2,5,7,9,11,13};
//         int start = arr[0 ] ;
//         for ( int i = 0 ; i< arr.length-1 ; i++){
//             arr[i] = arr[i+1] ;
//         }
//         arr[arr.length - 1 ] = start ;
//         System.out.println(Arrays.toString(arr));
//     }
// }

        // left rotate by K

import java.util.Arrays;
import java.util.Scanner ;
public class arr {
    public static void main (String[] args){
        int arr[] =  {2,5,7,9,11,13,15} ;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for ( int j = 1 ; j<=(k%(arr.length) ) ; j++){
            int start = arr[0] ;
            for (int i = 0 ; i < arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = start ;
        }
        System.out.println(Arrays.toString(arr));
    }
}

        // 