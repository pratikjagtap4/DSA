package basicpatterns;

public class Pattern09_CharacterPattern {

	public static void main(String[] args) {
		
		int chara = 65;
		
		for(int i = 1 ; i <= 5; i++) {
			
			for(int j = 1; j <= i ; j++) {
				
				System.out.print((char)chara);
				
			}
			chara = chara + 1;
			
			System.out.println();
		}

	}

}
