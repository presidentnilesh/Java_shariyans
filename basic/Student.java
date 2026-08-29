public class Student{
    String name ;
    int age ;
}

class temp {
    public static void main(String[] args){
        System.out.print("hello baby ");

        Student s1 = new Student();
        s1.name = " Anand" ;
        s1.age = 24 ;

        System.out.println(s1.name + s1.age);
    }
}
