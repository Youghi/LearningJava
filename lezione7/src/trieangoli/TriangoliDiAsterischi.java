package trieangoli;
import java.util.Scanner;
public class TriangoliDiAsterischi {

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		System.out.println("lato?");
		int l = userIn.nextInt();
		int b = l;
		int spaceCounter = 0;
		
		for (int i = 0; i < l-1; i++) {
			System.out.print("*");
			
			if (spaceCounter < b*2) {
				
				for (int j = 0; j < spaceCounter ; j++) {
					System.out.print(" ");
				}
				
				if (spaceCounter>0) {
					System.out.print("*");
				}
				
			} 
			spaceCounter++;
			spaceCounter++;
			System.out.print("\n");
		}
		for (int k = 0; k < b-1; k++) {
			System.out.print("* ");
			
		}
		System.out.print(" *");
	}

}
