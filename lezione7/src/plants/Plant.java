package plants;

import java.util.Scanner;

public class Plant {
	private String type;
	private String owner;
	private int position;
	private String buyer;
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

	public void setPosition(int position) {
		this.position = position;
	}

	public void getPlant() {
		System.out.println("\n" + "tipo pianta: " + this.type + "\n" + "proprietario: " + this.owner + "\n"
				+ "posizione nella mostra:" + this.position);
	}

	public void getData() {
		System.out.println("\n" + "interire tipo pianta: ");
		this.type = userIn.next();
		System.out.println("\n" + "interire proprietario: ");
		this.owner= userIn.next();
		System.out.println("\n" + "interire posizione nella mostra: ");
		this.position = userIn.nextInt();
	}

}
