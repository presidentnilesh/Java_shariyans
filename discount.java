import java.util.Scanner ;

public class discount {
    public static void main(String[] args ){
        System.out.println("Enter your bill amount : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if (amount <5000){
            System.out.println("Your payable amount is : " + amount );
        }
        else if (amount<10000 && amount>=5000){
            System.out.println("Your payable amount is : " + (amount - (0.05*amount)) );
        }
        else if (amount>5000 && amount <=10000){
            System.out.println("Your payable amount is : " + (amount - (0.1*amount)) );
        }
        else if (amount>10000 && amount <=20000){
            System.out.println("Your payable amount is : " + (amount - (0.2*amount)) );
        }
        else if (amount>20000 && amount <=50000){
            System.out.println("Your payable amount is : " + (amount - (0.4*amount)) );
        }
        
    }
    
}
