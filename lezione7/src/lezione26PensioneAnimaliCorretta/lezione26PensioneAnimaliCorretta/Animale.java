package lezione26PensioneAnimaliCorretta.lezione26PensioneAnimaliCorretta;

import java.util.Scanner;

public class Animale {

	Scanner userIn;

	private String name = "sconosciuto";
	private String type = "sconosciuto";
	private String favFood = "sconosciuto";
	private Proprietario proprietario = null;

	public Animale(Scanner userIn) {
		this.userIn = userIn;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public void setData() {
		System.out.println("tipo animale?: ");
		this.type = userIn.next();
		System.out.println("nome animale?: ");
		this.name = userIn.next();
		System.out.println("cibo preferito di " + this.name + "?");
		this.favFood = userIn.next();

	}

	public void getAnimale() {
		System.out.println("proprietario:");
		proprietario.getOwnerOnly();
		System.out.println("***********");
		System.out.println("tipo animale: " + type);
		System.out.println("nome animale : " + name);
		System.out.println("cibo preferito " + name + ":  " + favFood);
	}

	public void modifyAnimal() {
		int ind = 9;
		while (ind != 0) {

			System.out.println("\n" + "premere:" + "\n" + "1 per modificare tipo d'animale" + "\n"
					+ "2 per modificare nome dell'animale" + "\n" + "3 per modificare il cibo preferito dell'animale"
					+ "\n" + "0 per uscire" + "\n");
			ind = userIn.nextInt();

			switch (ind) {
			case 1:
				System.out.println("tipo d'animale da modificare: " + this.type);
				System.out.println("inserire nuovo tipo d'animale: ");
				this.type = userIn.next();
				break;

			case 2:
				System.out.println("nome dell'animale da modificare: " + this.name);
				System.out.println("inserire nuovo nome dell'animale: ");
				this.name = userIn.next();
				break;

			case 3:
				System.out.println("cibo preferito dell'animale da modificare: " + this.favFood);
				System.out.println("inserire nuovo cibo preferito dell'animale: ");
				this.favFood = userIn.next();
				break;

			case 0:
				break;
			}
		}

	}

}
