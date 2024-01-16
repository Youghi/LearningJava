package plants;

import java.util.Scanner;

public class Plant {
	private String type;
	private String owner;
	private int position;
	private Boolean forSale;
	private int price;

	Scanner userIn = new Scanner(System.in);

	public Plant() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPosition() {
		return position;
	}

	public Boolean getForSale() {
		return forSale;
	}

	public void setForSale(Boolean forSale) {
		this.forSale = forSale;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void getPlant() {
		System.out.println("\n" + "tipo pianta: " + this.type + "\n" + "proprietario: " + this.owner + "\n"
				+ "posizione nella mostra:" + this.position + "\n" + "disponibile per la vendita: ");
		System.out.println(this.forSale == true ? "si" : "no");
		System.out.println(this.forSale == true ? "prezzo: " + price + " $" : "");
	}

	public void getData() {
		System.out.println("\n" + "inserire tipo pianta: ");
		this.type = userIn.next();
		System.out.println("\n" + "inserire proprietario: ");
		this.owner= userIn.next();
		System.out.println("\n" + "inserire posizione nella mostra: ");
		this.position = userIn.nextInt();
		System.out.println("\n" + "disponibile per la vendita? Y/N: ");
		this.forSale = userIn.next().contentEquals("Y") ? true : false;
		if (this.forSale == true) {
			System.out.println("\n" + "inserire prezzo:__$");
			this.price = userIn.nextInt();
		}
	}

}
