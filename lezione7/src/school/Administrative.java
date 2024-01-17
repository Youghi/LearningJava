package school;

import java.util.Scanner;

public class Administrative extends Personal {
	private String type = "sconosciuto";
	private String office = "sconosciuto";
	Scanner userIn;

	public Administrative(Scanner userIn) {
		this.userIn = userIn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	@Override
	public void gatherData() {
		super.gatherData();
		System.out.println("inserire mansione:");
		this.type = userIn.nextLine();
		System.out.println("inserire ufficio assegnato:");
		this.office = userIn.nextLine();
	}

	@Override
	public void getPersonal() {
		super.getPersonal();
		System.out.println("mansione: " + this.type + "\n" + "ufficio assegnato: " + this.office);
	}

	@Override
	public void modifyData() {
		super.modifyData();
		System.out.println("1 - modificare mansione" + "\n" + "2 - modificare ufficio assegnato" + "\n" + "3 - completare");
		int ind = userIn.nextInt();
		switch (ind) {
		case 1:
			System.out.println("mansione da modificare: " + this.type + "\n" + "inserire nuova mansione: ");
			this.type = userIn.nextLine();
			break;

		case 2:
			System.out.println("ufficio assegnato da modificare: " + this.office + "\n" + "inserire nuovo ufficio assegnato: ");
			this.office = userIn.nextLine();
			break;

		case 3:
			break;
		}
	}
	

}
