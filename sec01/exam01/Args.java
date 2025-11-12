package sec01.exam01;

public class Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 2) {
			System.out.println("값이 부족함");
			System.exit(0);
		}
		
		String str1 = args[0];
		String str2 = args[1];
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int result = num1 + num2;
		
		System.out.print(result);
	}

}