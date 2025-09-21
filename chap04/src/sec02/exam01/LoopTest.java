package sec02.exam01;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		
		do{	
		System.out.println("=============");
		System.out.println(" Play Game : 1");
		System.out.println(" Quit Game : 3");
		System.out.println("=============");
		
		choice = scan.nextInt();
	}while(choice != 1 && choice != 3);	

		

	}

}
