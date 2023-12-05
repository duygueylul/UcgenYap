package UcgenYap;

public class Ucgen {

	public static void main(String[] args) {
		int x = 6;
		
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <=(x - i); j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
