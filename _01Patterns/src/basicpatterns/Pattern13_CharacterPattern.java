package basicpatterns;

public class Pattern13_CharacterPattern {

	public static void main(String[] args) {
	
		for(int i = 1 ; i <= 5 ; i++) {
			int chara = 70 - i;
			for(int j = 1 ; j <= i ; j++) {
				
				System.out.print((char)chara + " ");
				chara++;
			}	
			
			System.out.println();
			
		}

	}

}
