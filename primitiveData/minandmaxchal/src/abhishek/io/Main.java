package abhishek.io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int max = 0, min =23000000, i=0;
        char ch;
        Scanner in = new Scanner(System.in);
        while (i!= 5){
            System.out.println("Enter number");
            int c = in.nextInt();
            if (max<c)
                max = c;
            if (min > c)
                min = c;
            i++;
        }
        System.out.println("Max: "+max+" Min: "+min);
    }
}
