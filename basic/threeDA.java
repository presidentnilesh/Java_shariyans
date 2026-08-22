// import java.util.Arrays;

// public class threeDArray {
//     public static void main (String[] args){
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         for ( int i= 0 ; i<arr.length ; i++){
//             for ( int j=0 ;j<arr[0].length ; j++){
//                 System.out.print((arr[i][j])+ " " );
//             }
//             System.out.println();
//         }
//     }
// }


        // another method , to take arry from the user only and then printing .
import java.util.Arrays;
import java.util.Scanner ;
public class threeDA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of column : ");
        int c = sc.nextInt();
        int arr[][]= new int[r][c];

        for(int i =0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                System.out.println("Enter the arr : ["+i+"]["+j+"]");
                arr[i][j] = sc.nextInt();
            }
        }
         for(int i =0 ; i<r ; i++){
                System.out.print(Arrays.toString(arr[i]) + " ");
                System.out.println();
            }
        }
}