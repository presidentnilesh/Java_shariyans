import java.util.Arrays;

public class varags {
    public static void main (String[] args){
        int arr[] = { 1,23,4,5,3};
        solve("Anand" , 2,5,7,9,11);        //varags should be in the last parameter to avoid confusion

    }
    
    public static void solve(String name , int ...arr){
        System.out.println(name);
        System.out.println(Arrays.toString(arr));
        
    }
}
