package abhishek.io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = scanner.nextLine();
        System.out.println("Enter rollnumber ");
        String roll = scanner.nextLine();
        scanner.close();
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);*/

        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        in.nextLine();
        String name = in.nextLine();
        System.out.println("Age: "+age+"Name: "+name);
        in.close();
    }
}
