package sec01.exam04;

public class ScopeTest {

	public static void main(String[] args) {
		int a = 10;
		///int b = 20;
		
		if(a>1) 
		{
			int b = a;
		}
		
		for(int i = 0; i< 10; i++) 
		{
		    int c = a + i;
 			///c = b + i;
		}
		

	}

}
