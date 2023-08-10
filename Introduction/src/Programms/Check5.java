package Programms;

import java.util.Scanner;

public class Check5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

        // Input two numbers from user
        System.out.println("Enter any number :");
        int num1 = in.nextInt();

        if (num1%5==0)
        	
        	System.out.println("Great, 5 divides the number u hv entered.");
        else
        	System.out.println("sorry,it'56s not divisible by 5");
	}

}
