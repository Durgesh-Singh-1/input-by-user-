import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter marks of three subject :- ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int  totalMarks = sub1 + sub2 + sub3;
        float marks=totalMarks/3;
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("marks = " + marks + "%");
    }
}
