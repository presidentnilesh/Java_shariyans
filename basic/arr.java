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

// import java.util.Arrays;
// import java.util.Scanner ;
// public class arr {
//     public static void main (String[] args){
//         int arr[] =  {2,5,7,9,11,13,15} ;
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();
//         for ( int j = 1 ; j<=(k%(arr.length) ) ; j++){
//             int start = arr[0] ;
//             for (int i = 0 ; i < arr.length-1 ; i++){
//             arr[i] = arr[i+1];
//         }
//         arr[arr.length - 1] = start ;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

        // RIGTH ROTATE 

// import java.util.Arrays;

// public class arr {
//     public static void main (String[] args){
//         int arr[] =  {2,5,7,9,11,13,15} ;

//             int endd = arr[arr.length-1] ;
//             for (int i = arr.length -1 ; i >= 0 ; i--){
//             arr[i] = arr[i+1];
//         }
//         arr[0 ] = endd ;
        
//         System.out.println(Arrays.toString(arr));
//     }
// }


        // sum to dighit in a contiguous sub-set 

// import java.util.ArrayList;
// import java.util.Set;

// public class arr {
//     public static void main (String[] args){
//         int arr[] = {2,4,6,8,11,13,15,12};
//         int count = 0 ;
//         for ( int i = 0 ; i<arr.length ; i++){
//             int sum = 0 ; 
//                 for ( int j=i ; j<arr.length ; j++){
//                     if (sum<12){
//                         sum +=arr[j] ;
//                     }
//                     else if (sum == 12){
//                         count +=1 ;
//                     }
//                 }
//         }
//         System.out.println(count);
//     }
// }


        //leetcode 283 

// import java.util.Arrays ;
// public class arr {
//     public static void main(String[] args) {
//         int arr[]= { 2,0,9,22,12,0,13,9,0,23};
//         int end = arr.length -1 ;
//         int start = 0 ;
//         for ( int i = 0 ; i<end ; i++){
//                 if (arr[i]!=0){
//                         arr[start++]= arr[i];
//                 }else{
//                         arr[end--] = 0 ; 
//                 }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

                // linear search 

// public class arr{
//         public static void main (String[] args){
//                 int arr[]= {5,7,9,1,2,13,15,23};
//                 int target = 20 , ans = -1;
//                 for ( int i = 0 ; i < arr.length ; i++){
//                         if ( arr[i] == target ){
//                                 ans = i ;
//                                 break ;
//                         }
//                 }
//                 System.out.println(ans);
//         }
// }

                //BInary search 

// public class arr{
//         public static void main(String[] args){
//                 int arr[] = { 2,4,5,7,9,11,13,14,45,56,90};
//                 int target = 56 , end = arr.length -1 , start = 0 , ans = -1 ;
        
//                 while ( start<=end ){
//                         int mid = (start + end)/2 ;
//                         if ( target == arr[mid] ){
//                                 ans = mid ;
//                                 break ;
//                         }
//                         else if(target < arr[mid]){
//                                 end = mid - 1 ;
//                         }
//                         else {
//                                 start = mid + 1 ;
//                         }
//                 }
//                 System.out.println(ans);
                
               
//         }
// }


                //BUBBLE SHORTING 

// import java.util.Arrays;

// public class arr{
//         public static void main (String[] args ){
//                 int arr[] = { 0 ,5 ,4,7,3,3 ,2,1};
//                 boolean isSWap = false ;
//                 System.out.println(Arrays.toString(arr));
//                 for ( int i= 0 ; i<arr.length-1 ; i++){
//                         for ( int j =0 ; j<arr.length-1 ; j++){
//                                 if(arr[j]>arr[j+1]){
//                                         int temp= arr[j];
//                                         arr[j]=arr[j+1];
//                                         arr[j+1]= temp ;
//                                 }
//                         }
//                         if ( !isSWap){
//                                 break ;
//                         }
//                 }
                
//         }
// }

                //selectionShort

// import java.util.Arrays;

// public class arr{
//         public static void main (String[] args){
//                 int arr[] = { 0 ,5 ,4,7,3,3 ,2,1};
//                 for ( int i = 0 ; i<arr.length ; i++){
//                         for ( int j = i+1 ; j<arr.length  ; j++){
//                                 if ( arr[i] > arr[j]){
//                                         int temp = arr[i];
//                                         arr[i]=arr[j];
//                                         arr[j]= temp ;
//                                 }
//                         }
//                 }
//                 System.out.println(Arrays.toString(arr));
//         }
// }

// optimmised version of selectionShort 

// import java.util.Arrays;

// public class arr {
//         public static void main (String[] args){
//                 int arr[]= {5,4,3,2,1,0};
//                 for ( int i = 0 ; i < arr.length ; i++){
//                         int min = i ;
//                         for ( int j = i+1 ; j <arr.length ; j++ ){
//                                 if( arr[j]< arr[min]){
//                                         min = j ;
//                                 }
//                         }
//                         if(min != i){
//                                 int temp = arr[ i];
//                                 arr[i]=arr[min];
//                                 arr[min]=temp ;
//                         }
//                 }
//                 System.out.println(Arrays.toString(arr));
//         }
// }

                // 

import java.util.Arrays;

public class arr {
        public static void main (String[] args){
                int arr[] = { 0,5,4,3,2,1,0};
                for ( int i =1 ; i<arr.length ;i++){
                        for ( int j = i; j>0 ; j--){
                                if (arr[j]<arr[j-1]){
                                        int temp = arr[j];
                                        arr[j]= arr[j-1];
                                        arr[j-1]= temp ;
                                }
                                else {
                                        break ;
                                }
                        }
                }
                System.out.println(Arrays.toString(arr));
        }
}

