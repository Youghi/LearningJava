package lezione26PensioneAnimaliCorretta;

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
		System.out.println("tipo animale: " + type);
		System.out.println("nome animale : " + name);
		System.out.println("cibo preferito " + name + ":  " + favFood);
	}
	
	
	
	
	
	
	
	
	
	

}
