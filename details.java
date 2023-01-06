import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details like name, roll-number and interest:-");
        String name=sc.nextLine();
        int rollNumber = sc.nextInt();
        String interest=sc.next();
        System.out.println("Name :- " + name);
        System.out.println("Roll Number :- " + rollNumber);
        System.out.println("Interest :- " + interest);

    }
}
