package school;

import java.util.Scanner;

public abstract class Personal {

	private String name = "sconosciuto";
	private String dateOfBirth = "sconosciuto";

	Scanner userIn = new Scanner(System.in);

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

	public void gatherData() {
		System.out.println("inserire nome:");
		this.name = userIn.nextLine();
		System.out.println("inserire data di nascita:");
		this.dateOfBirth = userIn.nextLine();
	}

	public void getPersonal() {
		System.out.println("nome: " + this.name + "\n" + "data di nascita: " + this.dateOfBirth);
	}

	public void modifyData() {
		System.out.println("1 - modificare nome" + "\n" + "2 - modificare data di nascita" + "\n" + "3 - proseguire");
		int ind = userIn.nextInt();
		switch (ind) {
		case 1:
			System.out.println("nome da modificare: " + this.name + "\n" + "inserire nuovo nome: ");
			this.name = userIn.nextLine();
			break;

		case 2:
			System.out.println("data di nascita da modificare: " + this.dateOfBirth + "\n" + "inserire nuova data di nascita: ");
			this.dateOfBirth = userIn.nextLine();
			break;

		case 3:
			break;
		}
	}
}
