package exam03;

public class Main {

	public static void main(String[] args) {
		String str1 = new String("Hi");
		String str2 = new String("Hi");
		
		if(str1 == str2)
			System.out.println("Equal!!");
		else
			System.out.println("Not equal!!");
		
		if(str1.equals(str2))
			System.out.println("Equal!!");
		else
			System.out.println("Not equal!!");	
	}

}