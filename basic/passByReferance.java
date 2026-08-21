import java.util.Arrays;

public class passByReferance {
    public static void main (String[] args){
        int arr[]= {1,2,3};
        System.out.println("Before calling : ");
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println("After Calling : ");
        System.out.println(Arrays.toString(arr));

    }

    public static void change(int arr[]){
        // arr[1] = 100 ;
        arr = new int[3];   // java doesn't support pass by referance 
        arr[1]= 100 ;
    }
}
