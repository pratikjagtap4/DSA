package basicpatterns;

public class Pattern07_numberTriangle {
	
	public static void main(String [] args) {
		
		for(int i = 1 ; i <= 5 ; i++) {
			
			int count = i;
			
			for(int j = 1 ; j <= i ; j++) {
				
				 System.out.print(count + " ");
				 count = count + 1;
				
			}
			
			System.out.println();
			
		}
		
	}
}

