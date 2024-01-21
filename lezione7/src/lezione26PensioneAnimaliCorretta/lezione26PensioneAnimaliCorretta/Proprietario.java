package lezione26PensioneAnimaliCorretta.lezione26PensioneAnimaliCorretta;

import java.util.ArrayList;
import java.util.Scanner;

public class Proprietario {
	
	Scanner userIn;
	private ArrayList<Animale> animaliOfProp = new ArrayList<Animale>();
	private String name;
	private String dateOfBirth;

	public Proprietario(Scanner userIn) {
		this.userIn = userIn;
	}



	public void getOwner() {
		System.out.println("***********");
		System.out.println("nome: " + this.name);
		System.out.println("data di nascita: " + this.dateOfBirth);
		System.out.println("animali registrati:");
		for (Animale animale : animaliOfProp) {
			animale.getAnimale();
		}
	}
	
	public Animale selectAnimal() {
		System.out.println("animali per lei registrati:");
		for (int i = 0; i < animaliOfProp.size(); i++) {
			System.out.println("***********");
			System.out.println(i + ":");
			animaliOfProp.get(i).getAnimale();
		}
		System.out.println("inserire numero animale da selezionare:");
		int ind = userIn.nextInt();
		return animaliOfProp.get(ind);
	}
	
	
	
}
