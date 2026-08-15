import java.util.Scanner ;
public class if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter. days in integer form");
        int days =sc.nextInt();    
        String day ;
           switch(days){
            case(1):
            day = ("It's MOnday");
            break ;

            case(2):
                day = ("It's. tuesday ");
            break ;

            case(3):
            day = ("It's WednessDay ");
            break ;

            case(4):
            day = ("It's Thruday");
            break ;
            case(5):
            day = ("It's Friday");
            break ;
            case(6):
            day = ("It's Saturday");
            break ;
            case(7):
            day = ("It's Sunday");
            break ;
            default :
            day = "Invalid input " ;
           }
        System.out.println(day);
        sc.close();
    }
}
