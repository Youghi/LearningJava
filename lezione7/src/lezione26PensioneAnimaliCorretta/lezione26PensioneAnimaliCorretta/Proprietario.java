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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setData() {
		System.out.println("inserire nome: ");
		this.name = userIn.next();
		System.out.println("inserire data di nascita(gg.mm.aaaa): ");
		this.dateOfBirth = userIn.next();
	}

	public Animale setDataWithAnimal() {
		Animale animale = new Animale(userIn);
		System.out.println("inserire nome: ");
		this.name = userIn.next();
		System.out.println("inserire data di nascita(gg.mm.aaaa): ");
		this.dateOfBirth = userIn.next();
		animale.setData();
		animaliOfProp.add(animale);
		return animale;
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
	
	public void getOwnerOnly() {
		System.out.println("nome: " + this.name);
		System.out.println("data di nascita: " + this.dateOfBirth);
	}

	public Animale selectAnimal() {
		Animale animale = new Animale(userIn);
		System.out.println("1 - selezionare un animale gia registrato" + "\n" + "2 - registrare un nuovo animale");
		int ind = userIn.nextInt();
		switch (ind) {
		case 1:
			System.out.println("animali per lei registrati:");
			for (int i = 0; i < animaliOfProp.size(); i++) {
				System.out.println("***********");
				System.out.println(i + ":");
				animaliOfProp.get(i).getAnimale();
			}
			System.out.println("inserire numero animale da selezionare:");
			int code = userIn.nextInt();
			animale = animaliOfProp.get(code);
			break;

		case 2:
			animale.setData();
			animaliOfProp.add(animale);
			break;
		}
		return animale;
	}
	
	public void modifyOwner() {
		int ind = 9;
		while (ind != 0) {

			System.out.println("\n" + "premere:" + "\n" + "1 per modificare il nome" + "\n"
					+ "2 per modificare la data di nascita" + "\n" + "0 per uscire" + "\n");
			ind = userIn.nextInt();

			switch (ind) {
			case 1:
				System.out.println("nome  da modificare: " + this.name);
				System.out.println("inserire nuovo nome: ");
				this.name = userIn.next();
				break;

			case 2:
				System.out.println("data di nascita da modificare: " + this.dateOfBirth);
				System.out.println("inserire nuova data di nascita: ");
				this.dateOfBirth = userIn.next();
				break;

			case 0:
				break;
			}
		}
	}
	
}
